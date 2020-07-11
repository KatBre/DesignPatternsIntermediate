package singleton;

public class Generated {
    private static Generated ourInstance = new Generated();

    public static Generated getInstance() {
        return ourInstance;
    }

    private Generated() {
    }
}
