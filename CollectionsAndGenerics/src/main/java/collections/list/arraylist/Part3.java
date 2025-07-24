package collections.list.arraylist;

import com.sun.jdi.event.StepEvent;

import java.util.Arrays;
import java.util.List;

public class Part3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] arrayStringBuilder1 = new StringBuilder[]{sb1,  sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(arrayStringBuilder1);
        System.out.println(list);
//        arrayStringBuilder1[0].append("!!!");
        arrayStringBuilder1[0] = new StringBuilder("F");
        System.out.println(list);

    }
}
