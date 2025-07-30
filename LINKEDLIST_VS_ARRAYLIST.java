import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist_vs_arraylist {
    public static void main(String[] args){
        LinkedList<Integer> linkedlist = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        //assigning values
        for(int i = 0; i < 1000000; i++)
        {
            linkedlist.add(i);
            arrayList.add(i);
        }


        // linked list
        long startTime1 = System.nanoTime();

        //linkedlist.get(100000); slower than arraylist for retriving elements
        linkedlist.remove(0);// faster than removing elements than arraylist near the ends of the linkedlist

        long endTime1 = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;

        System.out.println("time taken by linkedlist : " + totalTime1 + "ns");

        //arraylist
        long startTime2 = System.nanoTime();

        //arrayList.get(100000);
        arrayList.remove(0);

        long endTime2 = System.nanoTime();
        long totalTime2 = endTime2 - startTime2;

        System.out.println("time taken by arraylist : " + totalTime2 + "ns");

    }

}
