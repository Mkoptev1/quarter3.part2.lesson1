package ru.geekbrains.spring.ann.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigAnn.class);

        Camera camera = context.getBean("camera", Camera.class);
        // Фотографируем
        camera.doPhotograph();
    }
}