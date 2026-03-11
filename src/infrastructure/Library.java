package infrastructure;

public class Library {
    private String name;
    private int bookCount;

    public Library(String name, int books) {
        this.name = name;
        this.bookCount = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int b) {
        this.bookCount = b;
    }
}