package hw.tuan3.hw2.book1;

public class TestAuthor {

    public void run() {

        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');

        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }
}
