package libraryapp.org;

public class Main {
    public static void main(String[] args) {
        Book book_Clean_Code = new Book("Clean Code", "Nurdiyar S.", "programming", "How to write really clean code", 359);
        Magazine magazine_Forbes = new Magazine("Top 10 of riches people in KZ", "Genry Trider", "Article", "About riches people", "Forbes");
        Book book_Little_Prince = new Book("Little Prince", "Zhasmin M.", "Story", "About trip of little prince", 200);
        Magazine magazine_Zebra = new Magazine("Franshize of Zebra", "Serik L.", "Buisness", "How much money you can earn from franshize", "ER21");


        Library library = new Library();
        library.addMaterial(book_Clean_Code);
        library.addMaterial(magazine_Forbes);
        library.addMaterial(book_Little_Prince);
        library.addMaterial(magazine_Zebra);

        library.getAllMaterials();
    }
}
