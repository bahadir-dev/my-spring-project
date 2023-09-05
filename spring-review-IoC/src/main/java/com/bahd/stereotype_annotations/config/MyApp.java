package com.bahd.stereotype_annotations.config;

import com.bahd.stereotype_annotations.model.DataStructure;
import com.bahd.stereotype_annotations.model.DevOps;
import com.bahd.stereotype_annotations.model.Microservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class MyApp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCourse.class);
        DataStructure ds = container.getBean(DataStructure.class);
        ds.getTotalHours();

        Microservice ms = container.getBean(Microservice.class);
        ms.getTotalHours();

    }
}
