public class Task {
    public final Long id;
    public final String name;
    public final String description;

    public Task(String name, String description) {
        this.id = nextId();
        this.name = name;
        this.description = name;
    }
}