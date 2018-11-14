package command;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Light {

    boolean on = false;

    BrightnessLevel brightnessLevel;

}
