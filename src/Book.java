public class Book extends LibraryItem{
    private String author;
    private String ISBN;

    public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    String getItemType() {
        return "Book";
    }

    @Override
    String getItemDetails() {
        return "The title is: " + title +
                "\nIt was released in: " + releaseYear +
                "\nThe director is: " + author +
                "\nIts ISBN is: " + ISBN + ".";
    }
}
