package command;

import command.commands.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RemoteController implements LightController {

    private final Command on;
    private final Command off;
    private final Command darker;
    private final Command brighter;

    public void turnOnLight() {
        this.on.execute();
    }

    @Override
    public void turnOffLight() {
        this.off.execute();
    }

    public void rollbackTurnOn() {
        this.on.rollback();
    }

    @Override
    public void rollbackTurnOff() {
        this.off.rollback();
    }

    public void makeDarker() {
        this.darker.execute();
    }

    public void rollbackMakeDarker() {
        this.darker.rollback();
    }

    public void makeBrighter() {
        this.brighter.execute();
    }

    public void rollbackMakeBrighter() {
        this.brighter.execute();
    }
}
