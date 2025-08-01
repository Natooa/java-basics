package com.entity;

import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private final Integer ID;
    private static Integer countID = 1;

    public User(String name, String surname, int age, String gender) {
        if((name == null || name.trim().isEmpty())) {
            throw new IllegalArgumentException("Incorrect parameters");
        }
        this.name=name;


        if((surname == null || surname.trim().isEmpty())) {
            throw new IllegalArgumentException("Incorrect parameters");
        }
        this.surname=surname;


        if((gender == null || gender.trim().isEmpty())) {
            throw new IllegalArgumentException("Incorrect parameters");
        } else if(gender.trim().equalsIgnoreCase("male")) {
            this.gender = "male";
        } else if(gender.trim().equalsIgnoreCase("female")) {
            this.gender = "female";
        }


        if(age < 0 || age > 100) {
            throw new IllegalArgumentException("Incorrect parameters");
        }
        this.age=age;

        ID = countID++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Integer getID() {
        return ID;
    }

    public Integer getCountOfId() {
        return countID;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(ID, user.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
