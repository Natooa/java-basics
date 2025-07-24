package collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class MediumEx {
    public static void main(String[] args) {
        LinkedList<String> linkedListName = new LinkedList<>();
        linkedListName.add("Nurdiyar");
        linkedListName.add("Zhasmin");
        linkedListName.add("Karan");
        linkedListName.add("Aliya");
        linkedListName.add("Ailuna");

        Iterator<String> iteratorLinkedListName = linkedListName.iterator();
        while(iteratorLinkedListName.hasNext()) {
            System.out.print(iteratorLinkedListName.next() + " ");
        }

        System.out.println();

        linkedListName.add(linkedListName.size() / 2,"Bolatzhan");

        for(String name : linkedListName) {
            System.out.print(name + " ");
        }

        
    }
}
