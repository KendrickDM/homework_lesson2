package com.homework.lesson2.EntityMan;

import com.homework.lesson2.EntityHouse.HouseEntity;
import com.homework.lesson2.EntityPerson.PersonEntity;
import com.homework.lesson2.EntityRoom.RoomEntity;

import java.util.Scanner;

public class ManEntity extends PersonEntity implements ManInterface {

    private Double weight; // вес человека
    private Double height; // рост человека
    private String company; // компания в которой человек работает
    private String post; // должность человека
    private Integer salary; // зарплата человека
    private String numberPhone; // номер телефона человека
    private String passportDetails; // паспортные данные человека

    public ManEntity(){}

    public ManEntity(String name, String lastName, String gender, Integer age, String city, String address, Double weight,
               Double height, String company, String post, Integer salary, String numberPhone, String passportDetails) {
        super(name, lastName, gender, age, city, address);
        this.weight = weight;
        this.height = height;
        this.company = company;
        this.post = post;
        this.salary = salary;
        this.numberPhone = numberPhone;
        this.passportDetails = passportDetails;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getPassportDetails() {
        return passportDetails;
    }

    public void setPassportDetails(String passportDetails) {
        this.passportDetails = passportDetails;
    }

    @Override
    public void chooseActionMan(Scanner scanner, ManEntity manEntity, HouseEntity houseEntity, RoomEntity roomEntity) {
        System.out.println("1: Посмотреть дом");
        System.out.println("2: Поесть");
        System.out.println("3: Поспать");
        System.out.println("4: Погладить");
        System.out.println("5: Покормить");
        System.out.println("6: Посмотреть информацию о мужчине");
        System.out.println("7: Посмотреть должность и место работы мужчины");

        int numAction = scanner.nextInt();
        switch (numAction){
            case 1:
                chooseHouse(scanner, houseEntity, roomEntity);
                break;
            case 2:
                eat();
                break;
            case 3:
                sleep();
                break;
            case 4:
                pat(scanner);
                break;
            case 5:
                feed(scanner);
                break;
            case 6:
                viewInformation(manEntity);
                break;
            case 7:
                printUniqueInf();
                break;
            default:
                System.out.println("Повторите попытку!");

        }
    }

    @Override
    public void printUniqueInf() {
        System.out.println("Этого мужчину зовут " + getName() + " " + getLastName() + "." + " Занимает должность " + getPost() +
                " в компании " + getCompany() + ". " + getName() + " получает зарплату в размере " + getSalary() + " рублей." );
    }

    @Override
    public String toString() {
        return super.toString() +
                "Вес(кг) " + weight + "\n" +
                "Рост(м): " + height + "\n" +
                "Компания: " + company + "\n" +
                "Должность: " + post + "\n" +
                "Зарплата(рубли): " + salary + "\n" +
                "Номер телефона: " + numberPhone + "\n" +
                "Паспортные данные: " + passportDetails;
    }

}
