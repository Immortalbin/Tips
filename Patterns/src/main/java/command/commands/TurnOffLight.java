package command.commands;

import command.BrightnessLevel;
import command.Light;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TurnOffLight implements Command{

    private final Light light;

    private BrightnessLevel previousBrightnessLevel;


    @Override
    public void execute() {
        if(!light.isOn()){
            throw new IllegalStateException("Light is already turned off");
        }
        previousBrightnessLevel = light.getBrightnessLevel();
        light.setOn(false);
        light.setBrightnessLevel(null);
    }

    @Override
    public void rollback() {
        light.setOn(false);
        light.setBrightnessLevel(previousBrightnessLevel);
    }
}
