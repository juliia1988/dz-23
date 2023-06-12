package org.example;

public class Main {
    public static void main(String[] args) {

        Man man = new Man("Oleg","Popov", 66, "Yes");
        Woman woman = new Woman("Olga","Petrova", 25, "Yes");

        System.out.println("Завдання 1: створити екземпляри классів ");


        man.printPersone();
        woman.printPersone();

        System.out.println("Завдання 2: матод на виявлення пенсійного віку для різних классів");

        woman.isRetired(25);
        man.isRetired(66);

        System.out.println("Завдання 3: змінити прізвище для класу мен ");

        man.setLastName("Vasytin");
        man.printPersone();

        System.out.println("Завдання 4: змінити прізвище для класу вумен при одруженні ");

        woman.registerPartnership("Kozlova");

        System.out.println("Завдання 5: змінювати прізвище для класу вумен в залежності від умови Yes/No ");

        woman.deregisterPartnership("Ignatyk");


    }
}