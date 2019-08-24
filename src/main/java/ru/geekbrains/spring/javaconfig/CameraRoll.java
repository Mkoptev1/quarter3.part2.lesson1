package ru.geekbrains.spring.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class CameraRoll {
    public void processing() {
        System.out.println("-1 кадр");
    }

    public void cameraRollTest() {
        System.out.println("Годная пленка");
    }
}