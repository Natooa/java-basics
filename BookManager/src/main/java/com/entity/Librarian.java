package com.entity;

public class Librarian extends User{
    private int yearOfWork;
    private String specialization;

    public Librarian(String name, String surname, int age, String gender, int yearOfWork, String specialization) {
        super(name, surname, age, gender);
        if(yearOfWork < 0 || yearOfWork > 70){
            throw new IllegalArgumentException("yearOfWork must be between 0 and 70");
        }
        this.yearOfWork = yearOfWork;


        if(specialization == null || specialization.isEmpty()){
            throw new IllegalArgumentException("specialization cannot be empty");
        }
        this.specialization = specialization;
    }

    public int getYearOfWork() {
        return yearOfWork;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", year of work='" + yearOfWork + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
