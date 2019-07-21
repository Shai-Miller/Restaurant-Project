package Tables;

public class Table {
    private int id;
    private int capacity;
    private int seated;
    private String description;
    private boolean occupired;

    public Table (int id, int capacity,int seated, String description) {
        this.id = id;
        this.capacity = capacity;
        this.seated = seated;
        if (description != null && description.compareTo("")!=0)
            this.description = description;
        this.occupired = false;
    }
}
