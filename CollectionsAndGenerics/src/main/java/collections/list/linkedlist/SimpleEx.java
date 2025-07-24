package collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SimpleEx {
    public static void main(String[] args) {
        LinkedList<String> nameLinkedList = new LinkedList<>(List.of("Nurdiyar", "Zhasmin", "Aliya", "Ailuna", "Abilkhan"));
        for(String name : nameLinkedList){
            System.out.print(name + " ");
        }
        System.out.println();

        LinkedList<String> nameLinkedList1 = new LinkedList<>();
        nameLinkedList1.add("Bolatzhan");
        nameLinkedList1.addAll(nameLinkedList);

        for(String name : nameLinkedList1){
            System.out.print(name + " ");
        }
        System.out.println();

        nameLinkedList1.addFirst("Safi");
        nameLinkedList1.addLast("Ameli");

        for(String name : nameLinkedList1){
            System.out.print(name + " ");
        }
        System.out.println();

        nameLinkedList1.removeLast();
        nameLinkedList1.removeFirst();

        for(String name : nameLinkedList1){
            System.out.print(name + " ");
        }
        System.out.println();

        System.out.println(nameLinkedList1.contains("Nurdiyar"));

        Iterator<String> iteratorLinkedList1 = nameLinkedList1.iterator();
        while(iteratorLinkedList1.hasNext()){
            System.out.print(iteratorLinkedList1.next() + " ");
        }
    }
}
