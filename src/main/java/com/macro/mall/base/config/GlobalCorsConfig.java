package com.macro.mall.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.concurrent.Executor;

/**
 * 全局跨域配置
 * Created by macro on 2019/7/27.
 */
@Configuration
@EnableAsync
public class GlobalCorsConfig {

    /**
     * 允许跨域调用的过滤器
     */
    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        //允许所有域名进行跨域调用
        config.addAllowedOrigin("*");
        //允许跨越发送cookie
        config.setAllowCredentials(true);
        //放行全部原始头信息
        config.addAllowedHeader("*");
        //允许所有请求方法跨域调用
        config.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }

    @Bean
    public Executor asyncServiceExecutor(){
        ThreadPoolTaskExecutor pushThreadPool  = new ThreadPoolTaskExecutor();
        pushThreadPool.setMaxPoolSize(50);//线程池维护的最大线程数
        pushThreadPool.setKeepAliveSeconds(256);//允许空闲时间
        pushThreadPool.setCorePoolSize(10);//线程池维护线程池最少数量
        pushThreadPool.setQueueCapacity(100000);//缓存队列
        pushThreadPool.setThreadNamePrefix("async-service-");
        pushThreadPool.initialize();
        return pushThreadPool;

    }

}
