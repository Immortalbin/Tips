package abstractfactory;

import abstractfactory.bodies.BMWBody;
import abstractfactory.bodies.Body;
import abstractfactory.engines.BMWEngine;
import abstractfactory.engines.Engine;
import abstractfactory.wheels.BMWWheel;
import abstractfactory.wheels.Wheel;

import java.util.ArrayList;
import java.util.List;

public class BMWFactory implements AbstractCarFactory {

    @Override
    public List<Wheel> createWheels() {
        List<Wheel> wheels = new ArrayList<>();
        // 1 additional wheels
        for(int i = 0; i < 5; i++){
            wheels.add(new BMWWheel());
        }
        return wheels;
    }

    @Override
    public Engine createEngine() {
        return new BMWEngine();
    }

    @Override
    public Body createBody() {
        return new BMWBody();
    }
}
