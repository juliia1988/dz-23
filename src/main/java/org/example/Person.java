package org.example;

import io.qameta.allure.Step;

public class Person {
    String firstName;
    String lastName;
    int age;
    String partner;

    public Person(String firstName, String lastName, int age, String partner){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public int[] setAge(int age) {
        this.age = age;
        return new int[0];
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public void printPersone(){
        System.out.println(firstName + " " + lastName + " " + age + " " + partner);
    }

    @Step("Fill the age data to check if its valid")
    public boolean ageIsValid(int num1, int num2){
        if ( 0 < num1 && num2 < 130){
            System.out.println("Age is valid");
            return true;
        }
        System.out.println("Age is not valid");
        return false;
    }

}

