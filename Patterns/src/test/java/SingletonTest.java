import org.testng.annotations.Test;
import singleton.MainApplicationConfig;

import static org.testng.Assert.assertEquals;

@Test
public class SingletonTest {


    public void testSingleton(){
        MainApplicationConfig config1 = MainApplicationConfig.getInstance();
        MainApplicationConfig config2 = MainApplicationConfig.getInstance();
        assertEquals(config1, config2);


    }
}
