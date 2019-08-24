package ru.geekbrains.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Camera camera = context.getBean("camera", Camera.class);
        // Првоерка фотоаппарата
        camera.cameraTest();

        CameraRoll cameraRoll = context.getBean("cameraRoll", CameraRoll.class);
        // Проверка пленки
        cameraRoll.cameraRollTest();

        // Фотографируем.
        camera.doPhotograph();
    }
}