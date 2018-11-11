package factorymethod2.armor;

import lombok.Getter;
import lombok.Setter;

public abstract class Armor {

    @Getter
    @Setter
    Integer armorValue;


    @Getter
    @Setter
    ArmorType armorType;
}
