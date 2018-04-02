package ee.khk.ikt;

public class  MyLinkedList implements ElementList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root = null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison - currentItem.compareTo(newItem);
            if(comparison < 0) {
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > null) {
                if(currentItem.next() != null) {
                    currentItem = currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());

                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    newItem.setNext(this.root).setPrevious(newItem);
                }
            }   return true;
        } else{
            System.out.println(newItem.getValue()) + "is already in list";
            return false;
            }
        }return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void showItems(ListItem root) {

    }
}
