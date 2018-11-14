package command.commands;

import command.Light;
import lombok.RequiredArgsConstructor;

import static command.BrightnessLevel.DARKEST;

@RequiredArgsConstructor
public class MakeLightDarker implements Command {

    private final Light light;

    @Override
    public void execute() {
        if(DARKEST.equals(light.getBrightnessLevel())){
            light.setOn(false);
            light.setBrightnessLevel(null);
        } else {
            light.setBrightnessLevel(light.getBrightnessLevel().getDarkerLevel());
        }
    }

    @Override
    public void rollback() {
        light.setBrightnessLevel(light.getBrightnessLevel().getBrighterLevel());
    }
}
