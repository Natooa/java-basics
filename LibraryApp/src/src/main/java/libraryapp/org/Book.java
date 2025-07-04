package libraryapp.org;

import java.security.Principal;

public class Book extends PrintedMaterial {
    int count_of_page;

    public Book(String name_of_material, String author, String genre_of_material, String description,  int count_of_page) {
        super(name_of_material, author, genre_of_material, description);
        this.count_of_page = count_of_page;
    }

    public int getCount_of_page() {
        return count_of_page;
    }

    @Override
    public String toString() {
        return "Book" + "\nName: " + getName_of_material() + "\nGenre: " + getGenre_of_material() + "\nAuthor: " + getAuthor() + "\nDescription: " + getDescription() + "\nPage: " + getCount_of_page();
    }
}
