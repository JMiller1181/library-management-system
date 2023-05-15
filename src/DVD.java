public class DVD extends LibraryItem{
    private String director;
    private int duration;

    public DVD(String title, int releaseYear, String director, int duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }

    @Override
    String getItemType() {
        return "DVD";
    }

    @Override
    String getItemDetails() {
        return "The title is: " + title +
                "\nIt was released in: " + releaseYear +
                "\nThe director is: " + director +
                "\nIt is " + duration + " minutes long.";
    }
}
