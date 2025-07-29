package collections.list.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19));
//        Collections.sort(arrayList);
//        int index1 = Collections.binarySearch(arrayList, 100);
//        System.out.println(index1);

        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);


//        Employee emp1 = new Employee(100, "Zaur", 12345);
//        Employee emp2 = new Employee(15, "Ivan", 6542);
//        Employee emp3 = new Employee(123, "Petr", 8542);
//        Employee emp4 = new Employee(15, "Mariya", 5678);
//        Employee emp5 = new Employee(182, "Kolya", 125);
//        Employee emp6 = new Employee(15, "Sasha", 9874);
//        Employee emp7 = new Employee(250, "Elena", 1579);
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        employeeList.add(emp3);
//        employeeList.add(emp4);
//        employeeList.add(emp5);
//        employeeList.add(emp6);
//        employeeList.add(emp7);
//        System.out.println(employeeList);
//
//        Collections.sort(employeeList);
//        System.out.println(employeeList);
//
//        int index2 = Collections.binarySearch(employeeList, new Employee(182, "Kolya", 125));
//        System.out.println(index2);

//        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index3 = Arrays.binarySearch(array, 150);
//        System.out.println(index3);
    }
}

class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int salary;
    private int number;

    public Employee(int id, String name, int salary) {
        if(id < 0 || name == null || name.isEmpty() || salary < 0){
            throw new IllegalArgumentException("Incorrect data input");
        }
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.number = count++;
    }

    private static int count = 0;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" +  id +
                ", name=" + name + '\'' +
                ", salary=" + salary +
                ", number=" + number +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if(result == 0){
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}
