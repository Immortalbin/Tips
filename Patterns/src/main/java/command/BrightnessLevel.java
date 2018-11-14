package command;

import com.google.common.collect.BiMap;
import com.google.common.collect.EnumBiMap;
import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public enum BrightnessLevel {
    DARKEST,
    DARK,
    AVERAGE,
    BRIGHT,
    BRIGHTEST;

    private static BiMap<BrightnessLevel, BrightnessLevel> transitionMap;

    static {
        transitionMap = EnumBiMap.create(
                new HashMap<BrightnessLevel, BrightnessLevel>() {{
                    put(DARKEST, DARK);
                    put(DARK, AVERAGE);
                    put(AVERAGE, BRIGHT);
                    put(BRIGHT, BRIGHTEST);
                }}
        );
    }

    public BrightnessLevel getBrighterLevel() {
        if (BRIGHTEST.equals(this)) {
            return BRIGHTEST;
        }
        return transitionMap.get(this);
    }

    public BrightnessLevel getDarkerLevel() {
        if (DARKEST.equals(this)) {
            return DARKEST;
        }
        return transitionMap.inverse().get(this);
    }

}