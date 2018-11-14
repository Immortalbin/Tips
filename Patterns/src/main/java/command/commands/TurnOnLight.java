package command.commands;

import command.BrightnessLevel;
import command.Light;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TurnOnLight implements Command {

    private final Light light;

    @Override
    public void execute() {
        if(light.isOn()) {
            throw new IllegalStateException("Light is already turned on");
        }
        light.setOn(true);
        light.setBrightnessLevel(BrightnessLevel.AVERAGE);
    }

    @Override
    public void rollback() {
        light.setOn(false);
        light.setBrightnessLevel(null);
    }
}
