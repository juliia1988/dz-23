package org.example;

public class Man extends Person {

    public Man(String firstName, String lastName, int age, String partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int[] setAge(int age) {
        super.setAge(age);
        return new int[0];
    }

    public boolean isRetired(int age){
        if (age >= 65){
            System.out.println("Na pensyi: " + getFirstName());
            return true;
        }
        System.out.println("Ne na pensyi: " + getFirstName());
        return false;
    }

    public void printPersone(){
        super.printPersone();
    }

}
