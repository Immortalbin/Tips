package abstractfactory.bodies;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Body {

    @Getter
    private String label;

    @Getter
    private String style;
}
