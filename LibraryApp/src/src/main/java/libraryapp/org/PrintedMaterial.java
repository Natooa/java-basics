package libraryapp.org;

public abstract class PrintedMaterial {
    private String name_of_material;
    private String author;
    private String genre_of_material;
    private String description;

    public PrintedMaterial(String name_of_material, String author, String genre_of_material, String description) {
        this.name_of_material = name_of_material;
        this.author = author;
        this.genre_of_material = genre_of_material;
        this.description = description;
    }

    public String getName_of_material() {
        return name_of_material;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre_of_material() {
        return genre_of_material;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public abstract String toString();
}
