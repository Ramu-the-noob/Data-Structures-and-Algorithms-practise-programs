import java.util.LinkedList;

public class LINKED_LIST {
    public static void main(String[] args){
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.offerFirst(1);
        linkedlist.push(2);
        linkedlist.offerFirst(3);
        linkedlist.offerFirst(4);
        linkedlist.offerLast(5);

        linkedlist.add(4,4);
        System.out.println(linkedlist.indexOf(4));

        linkedlist.poll();
        linkedlist.pollLast();


        System.out.println(linkedlist);
    }
}
