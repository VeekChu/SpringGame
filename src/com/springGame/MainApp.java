package com.springGame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HWorld hWorld = (HWorld)context.getBean("HWorld");
        System.out.println(hWorld.getMessage());
    }
}
