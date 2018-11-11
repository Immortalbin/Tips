package abstractfactory;

import abstractfactory.bodies.Body;
import abstractfactory.bodies.PeugeotBody;
import abstractfactory.engines.Engine;
import abstractfactory.engines.PeugeotEngine;
import abstractfactory.wheels.PeugeotWheel;
import abstractfactory.wheels.Wheel;

import java.util.ArrayList;
import java.util.List;

public class PeugeotFactory implements AbstractCarFactory {
    @Override
    public List<Wheel> createWheels() {
        List<Wheel> wheels = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            wheels.add(new PeugeotWheel());
        }
        return wheels;
    }

    @Override
    public Engine createEngine() {
        return new PeugeotEngine();
    }

    @Override
    public Body createBody() {
        return new PeugeotBody();
    }
}
