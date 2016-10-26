//package com.menuorder.admin.api.common.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//
//import com.menuorder.api.common.config.PersistenceConfig;
//
//// Replavement for dispatcher servlet
//
//@Configuration 
//@EnableWebMvc   
//@Import(PersistenceConfig.class)
//public class AppConfig {  
//    @Bean  
//    public InternalResourceViewResolver setupViewResolver() {  
//    	InternalResourceViewResolver resolver = new InternalResourceViewResolver();  
//        resolver.setPrefix("/WEB-INF/views/");  
//        resolver.setSuffix(".jsp");  
////        resolver.setViewClass(JstlView.class);  
//        return resolver;  
//    }
//} 
