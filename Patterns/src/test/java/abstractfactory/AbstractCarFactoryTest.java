package abstractfactory;

import abstractfactory.bodies.Body;
import abstractfactory.engines.Engine;
import abstractfactory.wheels.Wheel;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

@Test
public class AbstractCarFactoryTest {

    private AbstractCarFactory carFactory;

    private List<Wheel> wheels;
    private Body body;
    private Engine engine;


    public void testBWMFactory(){
        carFactory = new BMWFactory();
        wheels = carFactory.createWheels();
        body = carFactory.createBody();
        engine = carFactory.createEngine();
        assertEquals(wheels.size(), 5);
        wheels.forEach(wheel -> assertEquals(wheel.getWidth(), 25.3));
        assertEquals(body.getLabel(), "BMW");
        assertEquals(body.getStyle(), "Business");
        assertEquals(engine.getPower(), 300.0);
    }

    public void testToyotaFactory(){
        carFactory = new ToyotaFactory();
        wheels = carFactory.createWheels();
        body = carFactory.createBody();
        engine = carFactory.createEngine();
        assertEquals(wheels.size(), 4);
        wheels.forEach(wheel -> assertEquals(wheel.getWidth(), 24.0));
        assertEquals(body.getLabel(), "Toyota");
        assertEquals(body.getStyle(), "Classic");
        assertEquals(engine.getPower(), 250.0);
    }

    public void testPeugeotFactory(){
        carFactory = new PeugeotFactory();
        wheels = carFactory.createWheels();
        body = carFactory.createBody();
        engine = carFactory.createEngine();
        assertEquals(wheels.size(), 4);
        wheels.forEach(wheel -> assertEquals(wheel.getWidth(), 22.0));
        assertEquals(body.getLabel(), "Peugeot");
        assertEquals(body.getStyle(), "Economy");
        assertEquals(engine.getPower(), 150.0);
    }
}
