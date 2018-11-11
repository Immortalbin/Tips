package singleton;

import lombok.Getter;

public class MainApplicationConfig {

    private static MainApplicationConfig INSTANCE;

    @Getter
    private String name = "config name";

    private  MainApplicationConfig(){}

    public static MainApplicationConfig getInstance() {
        if(INSTANCE == null){
            synchronized (MainApplicationConfig.class){
                if(INSTANCE == null){
                    INSTANCE = new MainApplicationConfig();
                }
            }
        }
        return INSTANCE;
    }

    void sayHi(){
        System.out.println("Hello from main application config!");
    }
}
