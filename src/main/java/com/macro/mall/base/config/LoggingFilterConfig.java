package com.macro.mall.base.config;

import com.macro.mall.util.MLog;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;
import org.springframework.web.util.WebUtils;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;

@Configuration
public class LoggingFilterConfig extends OncePerRequestFilter implements Ordered {

    @Bean
    public FilterRegistrationBean registrationBean() {
        FilterRegistrationBean filter = new FilterRegistrationBean(new LoggingFilterConfig());
        filter.addUrlPatterns("/*");
        filter.setOrder(FilterRegistrationBean.HIGHEST_PRECEDENCE);
        return filter;
    }

    private int order = Ordered.LOWEST_PRECEDENCE - 8;
    public static final String SPLIT_STRING_M = "=";
    public static final String SPLIT_STRING_DOT = ", ";

    @Override
    public int getOrder() {
        return order;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        ContentCachingRequestWrapper wrapperRequest = new ContentCachingRequestWrapper(request);
        ContentCachingResponseWrapper wrapperResponse = new ContentCachingResponseWrapper(response);
        filterChain.doFilter(wrapperRequest, wrapperResponse);
        if (!"OPTIONS".equals(request.getMethod())) {
            MLog.info("■ ===>  [" + request.getMethod() + "] " + request.getRequestURL() + getRequestParams(wrapperRequest) + getRequestBody(wrapperRequest) + " \n ■■ ResponseBody:" + getResponseBody(wrapperResponse) + " <=== ■");
        }
        wrapperResponse.copyBodyToResponse();
    }

    @Override
    public void destroy() {

    }

    /**
     * 打印请求参数
     *
     * @param request
     */
    private String getRequestBody(ContentCachingRequestWrapper request) {
        ContentCachingRequestWrapper wrapper = WebUtils.getNativeRequest(request, ContentCachingRequestWrapper.class);
        if (wrapper != null) {
            byte[] buf = wrapper.getContentAsByteArray();
            if (buf.length > 0) {
                String payload = "";
                try {
                    payload = new String(buf, 0, buf.length, wrapper.getCharacterEncoding());
                } catch (UnsupportedEncodingException e) {
                }
                if (!StringUtils.isEmpty(payload)) {
                    payload = " ■ request body:[" + payload + "] ";
                }
                return payload.replaceAll("\\n", "");
            }
        }
        return "";
    }

    /**
     * 打印返回参数
     *
     * @param response
     */
    private String getResponseBody(ContentCachingResponseWrapper response) {
        if (StringUtils.isEmpty(response.getContentType())) {
            return "[unknown Content Type]";
        }else if (response.getContentType().startsWith("application/json")) {
            ContentCachingResponseWrapper wrapper = WebUtils.getNativeResponse(response, ContentCachingResponseWrapper.class);
            if (wrapper != null) {
                byte[] buf = wrapper.getContentAsByteArray();
                if (buf.length > 0) {
                    String payload = null;
                    try {
                        payload = new String(buf, 0, buf.length, wrapper.getCharacterEncoding());
                    } catch (UnsupportedEncodingException e) {
                        payload = "[unknown]";
                    }
                    return payload;
                }
            }
        }
        return response.getContentType();
    }

    /**
     * 获取请求地址上的参数
     *
     * @param request
     * @return
     */
    public static String getRequestParams(HttpServletRequest request) {
        StringBuilder sb = new StringBuilder();
        Enumeration<String> enu = request.getParameterNames();
        //获取请求参数
        while (enu.hasMoreElements()) {
            String name = enu.nextElement();
            sb.append(name + SPLIT_STRING_M).append(request.getParameter(name));
            if (enu.hasMoreElements()) {
                sb.append(SPLIT_STRING_DOT);
            }
        }
        String s = sb.toString();
        if (!StringUtils.isEmpty(s)) {
            return " ■ urlParams:[ " + s + "] ";
        } else {
            return "";
        }
    }
}