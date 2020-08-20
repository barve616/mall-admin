package com.macro.mall;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 应用启动入口
 * Created by macro on 2018/4/26.
 */
@SpringBootApplication(scanBasePackages = "com.macro.mall")
public class MallAdminApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MallAdminApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(MallAdminApplication.class, args);
    }
}
