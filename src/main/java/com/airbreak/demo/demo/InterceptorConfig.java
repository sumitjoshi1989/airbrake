package com.airbreak.demo.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    RecordTimeController recordTimeController;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(recordTimeController);
    }
}
