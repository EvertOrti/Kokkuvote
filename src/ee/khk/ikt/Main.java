package ee.khk.ikt;


public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(root null);
        System.out.println(myLinkedList);
        String s = "1 2 3 4 5 6";
        String[] list = str.split("");
        for(String s: list) {
            myLinkedList.addItem(new Element(s));
        }
        
    }
}
