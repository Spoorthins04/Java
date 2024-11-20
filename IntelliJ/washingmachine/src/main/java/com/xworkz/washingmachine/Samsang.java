package com.xworkz.washingmachine;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class Samsang extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    @Override

    protected Class<?>[] getRootConfigClasses() {

        return new Class[0];

    }
    @Override

    protected Class<?>[] getServletConfigClasses() {

        return new Class[0];

    }



    @Override

    protected String[] getServletMappings() {

        System.out.println("cloths");

        String[] urls={"/"};

        return urls ;

    }



    @Override

    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

        WebMvcConfigurer.super.configureDefaultServletHandling(configurer);

        configurer.enable();

    }
}
