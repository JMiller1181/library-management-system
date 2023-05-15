public abstract class LibraryItem {
     protected String title;
     protected int releaseYear;

    public LibraryItem (String title, int releaseYear){
        this.title = title;
        this.releaseYear = releaseYear;
    }
    /**
     *
     * @return whether the item is a DVD or Book item
     */
    abstract String getItemType();

    /**
     *
     * @return the details of the item
     */
    abstract String getItemDetails();

}
