package com.olaniyi;

import com.olaniyi.Service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
        shapeService.getCircle().setName("Olaniyi Emmanuel");
        System.out.println(shapeService.getCircle().getName());
    }
}
