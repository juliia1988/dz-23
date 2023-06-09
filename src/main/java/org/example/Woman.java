package org.example;

public class Woman extends Person {

    public Woman(String firstName, String lastName, int age, String partner) {
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

    public void registerPartnership(String newLastName){
        super.getPartner();
        lastName = newLastName;
        System.out.println(firstName + " " +  lastName);
    }

    public boolean isRetired(int age){
        if (age >= 60){
            System.out.println("Na pensyi: " + getFirstName());
            return true;
        }
        System.out.println("Ne na pensyi: " + getFirstName());
        return false;
    }

    public void printPersone(){
        super.printPersone();
    }

    public String deregisterPartnership(String newLastName){
        super.getPartner();
        if(partner.equals("Yes")){
            System.out.println("New Lastname: " + newLastName);
            return newLastName;
        }
        System.out.println("Old Lastname: " + getLastName());
        return lastName;
    }

}
