package com.homework.lesson2.EntityPerson;

import com.homework.lesson2.EntityMan.ManEntity;
import com.homework.lesson2.EntityWoman.WomanEntity;

import java.util.Scanner;

public class PersonEntity implements PersonInterface {

    private String name; // имя человека
    private String lastName; // фамилия человека
    private String gender; // пол человека
    private Integer age; // количество лет человека
    private String city; // город в котором живет человек
    private String address; // адрес по которому проживает человек

    public PersonEntity(){}

    public PersonEntity(String name, String lastName, String gender, Integer age, String city, String address) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.city = city;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void choosePerson(Scanner scanner, ManEntity manEntity, WomanEntity womanEntity) {
        System.out.println("Выберите человека, которого хотите посмотреть");
        System.out.println("1: Мужчина");
        System.out.println("2: Женщина");

        int numPerson = scanner.nextInt();

        switch (numPerson){
            case 1:
                System.out.println("Выберите действие");
                manEntity.chooseAction(new Scanner(System.in));
                break;
            case 2:
                System.out.println("Выберите действие");
                womanEntity.chooseAction(new Scanner(System.in));
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n" +
                "Фамилия: " + lastName + "\n" +
                "Пол: " + gender + "\n" +
                "Возраст(лет): " + age + "\n" +
                "Город: " + city + "\n" +
                "Адрес: " + address + "\n";

    }
}
