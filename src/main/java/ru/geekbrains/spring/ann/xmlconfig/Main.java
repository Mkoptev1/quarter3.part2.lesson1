package ru.geekbrains.spring.ann.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appXmlConfigAnnContext.xml");

        Camera camera = context.getBean("camera", Camera.class);
        // Првоерка фотоаппарата
        camera.cameraTest();

        CameraRoll cameraRoll = context.getBean("cameraRoll", CameraRoll.class);
        // Проверка пленки
        cameraRoll.cameraRollTest();

        // Фотографируем
        camera.doPhotograph();

        context.close();
    }
}