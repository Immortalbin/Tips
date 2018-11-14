package command;

public interface LightController {

    void turnOnLight();

    void turnOffLight();

    void rollbackTurnOn();

    void rollbackTurnOff();

    void makeDarker();

    void rollbackMakeDarker();

    void makeBrighter();

    void rollbackMakeBrighter();

}
