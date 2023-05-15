public class LibraryApp {
    public static void main(String[] args){
        Book book = new Book("Frankenstein", 1818, "Mary Shelley", "9780582541542");
        DVD movie = new DVD("Moulin Rouge", 2001, "Baz Luhrmann", 126);
        System.out.println(book.getItemType());
        System.out.println(movie.getItemType());
        LibraryManager libraryItems = new LibraryManager<>();
        libraryItems.addItem(book);
        libraryItems.addItem(movie);
        libraryItems.displayItems();
        libraryItems.removeItem(book);
        libraryItems.displayItems();

    }
}
