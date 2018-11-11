package abstractfactory;

import abstractfactory.bodies.Body;
import abstractfactory.bodies.ToyotaBody;
import abstractfactory.engines.Engine;
import abstractfactory.engines.ToyotaEngine;
import abstractfactory.wheels.ToyotaWheel;
import abstractfactory.wheels.Wheel;

import java.util.ArrayList;
import java.util.List;

public class ToyotaFactory implements AbstractCarFactory {
    @Override
    public List<Wheel> createWheels() {
        List<Wheel> wheels = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            wheels.add(new ToyotaWheel());
        }
        return wheels;
    }

    @Override
    public Engine createEngine() {
        return new ToyotaEngine();
    }

    @Override
    public Body createBody() {
        return new ToyotaBody();
    }
}
