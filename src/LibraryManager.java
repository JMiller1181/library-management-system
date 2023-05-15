import java.util.ArrayList;
public class LibraryManager <T extends LibraryItem> implements LibraryOperations<T> {
    private ArrayList<T> libraryStock;
    public LibraryManager(){
        libraryStock = new ArrayList<>();
    }
    @Override
    public void addItem(T item) {
        libraryStock.add(item);
    }

    @Override
    public void removeItem(T item) {
        libraryStock.remove(item);
    }

    public void displayItems() {
        for (T item: libraryStock){
            System.out.println(item.getItemDetails());

        }
    }
}
