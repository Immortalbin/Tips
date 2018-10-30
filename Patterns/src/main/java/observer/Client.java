package observer;

import static java.lang.String.format;

public class Client implements IObserver {

    private Server publisher;

    private String name;

    Client(Server publisher, String clientName){
        this.publisher = publisher;
        this.name = clientName;
    }

    @Override
    public void update() {
        System.out.println(format("Client %s has received notification from server: %s", this.name, this.publisher.getMsg()));
    }

}
