package observer;

import org.testng.annotations.Test;

@Test
public class ObserverTest {

    private Server server = new Server();

    public void testObserver() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            IObserver client = new Client(server, String.valueOf(i));
            server.register(client);
        }
        int timesToNotify = 5;
        for(int i = 0; i < timesToNotify; i++){
            server.notifyObservers();
            Thread.sleep(1000);
        }

    }

}
