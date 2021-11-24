package hw.tuan3.hw2.book3;

public class Author {

    private final String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author[name = " + getName() + ", email = " + getEmail() + "]";
    }
}
