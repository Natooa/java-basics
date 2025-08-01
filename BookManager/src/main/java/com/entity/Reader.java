package com.entity;

public class Reader extends User{
    private int countOfVisits = 0;

    public Reader(String name, String surname, int age, String gender) {
        super(name, surname, age, gender);
        ++countOfVisits;
    }

    public int getCountOfVisits() {
        return countOfVisits;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", count of visits='" + countOfVisits + '\'' +
                '}';
    }
}
