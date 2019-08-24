package ru.geekbrains.spring.ann.javaconfig;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CameraRoll {
    public void processing() {
        System.out.println("-1 кадр");
    }

    public void cameraRollTest() {
        System.out.println("Годная пленка");
    }

    // Првоерка пленки.
    @PostConstruct
    public void cameraRollReady() {
        System.out.println("Пленка готова к использованию!");
    }
}