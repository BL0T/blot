package game;

public class Client {

    private static int nextId = 10000;

    private final int id;
    private String name;

    public Client(String name) {
        this.id = ++nextId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
