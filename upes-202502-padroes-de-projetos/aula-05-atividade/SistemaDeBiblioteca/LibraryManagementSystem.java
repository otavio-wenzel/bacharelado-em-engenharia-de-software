public class LibraryManagementSystem {

    public static void main(String[] args) {
        
        Book book = new Book("Criança", "Januzs", 1954, "Fantasia");

        Magazine magazine = new Magazine("Placar","Editora Abril", 2023, 100);

        DigitalMedia digitalMedia = new DigitalMedia("Excel Basico","Jajá", 2022, "PDF");

        LibraryItem[] items = {book, magazine, digitalMedia};

        for (LibraryItem item : items) {
            item.displayInfo();
            item.borrow();
            item.returnItem();
        }

        System.out.println("\n----------------------------------------\n");

        book.readSample();
        magazine.flipPages();
        digitalMedia.play();
    }
    
}
