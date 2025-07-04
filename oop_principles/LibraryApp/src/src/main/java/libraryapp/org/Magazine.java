package libraryapp.org;

import java.security.Principal;

public class Magazine extends PrintedMaterial {
    private String name_Of_Publisher;

    public Magazine(String name_of_material, String author, String genre_of_material, String description, String name_Of_Publisher) {
        super(name_of_material, author, genre_of_material, description);
        this.name_Of_Publisher = name_Of_Publisher;
    }

    public String getName_Of_Publisher() {
        return name_Of_Publisher;
    }

    @Override
    public String toString() {
        return "Magazine" +"\nName of Publisher" + getName_Of_Publisher() + "\nName: " + getName_of_material() + "\nGenre: " + getGenre_of_material() + "\nAuthor: " + getAuthor() + "\nDescription: " + getDescription();
    }
}
