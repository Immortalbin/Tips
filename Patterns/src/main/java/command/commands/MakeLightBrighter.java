package command.commands;

import command.BrightnessLevel;
import command.Light;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MakeLightBrighter implements Command {

    private final Light light;

    @Override
    public void execute() {
        if(!light.isOn()){
            light.setOn(true);
            light.setBrightnessLevel(BrightnessLevel.DARKEST);
        } else {
            light.setBrightnessLevel(light.getBrightnessLevel().getBrighterLevel());
        }
    }

    @Override
    public void rollback() {
        light.setBrightnessLevel(light.getBrightnessLevel().getDarkerLevel());
    }
}
