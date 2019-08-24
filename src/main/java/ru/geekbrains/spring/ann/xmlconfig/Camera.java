package ru.geekbrains.spring.ann.xmlconfig;

public class Camera {
    private CameraRoll cameraRoll;

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
}