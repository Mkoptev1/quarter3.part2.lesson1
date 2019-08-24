package ru.geekbrains.spring.ann.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Camera {
    private CameraRoll cameraRoll;

    @Autowired
    public void setCameraRoll(CameraRoll _cameraRoll) {
        this.cameraRoll = _cameraRoll;
    }

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Щелк!");
        cameraRoll.processing();
    }

    public void cameraTest() {
        System.out.println("Годный фотоаппарат");
    }

    // Првоерка фотоаппарата
    @PostConstruct
    public void cameraReady() {
        System.out.println("Фотоаппарат готов к использованию!");
    }
}