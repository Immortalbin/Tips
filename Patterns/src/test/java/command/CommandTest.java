package command;

import command.commands.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class CommandTest {

    private Light light;
    private LightController controller;

    @BeforeTest
    void setUpCommands(){
        light = new Light();
        Command on = new TurnOnLight(light);
        Command off = new TurnOffLight(light);
        Command darker = new MakeLightDarker(light);
        Command brighter = new MakeLightBrighter(light);
        controller = new RemoteController(on, off, darker, brighter);

    }

    public void testTurnOnTheLight() {
        light.setOn(false);
        controller.turnOnLight();
        assertTrue(light.isOn());
    }

    public void testRollbackTurningOn(){
        controller.turnOnLight();
        assertTrue(light.isOn());
        controller.rollbackTurnOn();
        assertFalse(light.isOn());
    }

    public void testTurnOffTheLight() {
        light.setOn(true);
        controller.turnOffLight();
        assertFalse(light.isOn());
    }

    public void testRollbackTurningOff(){
        light.setOn(true);
        light.setBrightnessLevel(BrightnessLevel.BRIGHTEST);
        controller.turnOffLight();
        controller.rollbackTurnOff();
        assertFalse(light.isOn());
        assertEquals(light.getBrightnessLevel(), BrightnessLevel.BRIGHTEST);
    }

    public void testMakingDarkerTurnedOnLightAndThenTurningLightOff(){
        light.setOn(false);
        controller.turnOnLight();
        assertTrue(light.isOn());
        assertEquals(light.getBrightnessLevel(), BrightnessLevel.AVERAGE);
        controller.makeDarker();
        assertEquals(light.getBrightnessLevel(), BrightnessLevel.DARK);
        controller.makeDarker();
        assertEquals(light.getBrightnessLevel(), BrightnessLevel.DARKEST);
        controller.makeDarker();
        assertFalse(light.isOn());
        assertNull(light.getBrightnessLevel());
    }

    public void testMakingBrighterFromTurnedOffLightToTheBrightestLevel(){
        light.setOn(false);
        controller.makeBrighter();
        assertTrue(light.isOn());
        assertEquals(light.getBrightnessLevel(), BrightnessLevel.DARKEST);
        controller.makeBrighter();
        assertEquals(light.getBrightnessLevel(), BrightnessLevel.DARK);
        controller.makeBrighter();
        assertEquals(light.getBrightnessLevel(), BrightnessLevel.AVERAGE);
        controller.makeBrighter();
        assertEquals(light.getBrightnessLevel(), BrightnessLevel.BRIGHT);
        controller.makeBrighter();
        assertEquals(light.getBrightnessLevel(), BrightnessLevel.BRIGHTEST);
    }


}

