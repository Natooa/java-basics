package org.exception;

public class Exception6 {
    public static void main(String[] args) {
        //unchecked Exception (Runtime exception) = ошибка в работе программы

//        int a = 1 / 0;

//        String name = null;
//        name.length();

        try{
            int[] arr = new int[2];
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(arr[2]);
    }
}
