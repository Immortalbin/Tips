package abstractfactory;

import abstractfactory.bodies.Body;
import abstractfactory.engines.Engine;
import abstractfactory.wheels.Wheel;

import java.util.List;

public interface AbstractCarFactory {

    List<Wheel> createWheels();

    Engine createEngine();

    Body createBody();
}
