package ee.khk.ikt;

public interface ElementList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void showItems(ListItem root);
}
