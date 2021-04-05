package com.homework.lesson2.EntityPerson;

import com.homework.lesson2.EntityGiraffe.GiraffeEntity;
import com.homework.lesson2.EntityMan.ManEntity;
import com.homework.lesson2.EntityRoom.RoomEntity;
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
    public void choosePerson(Scanner scanner, ManEntity manEntity, WomanEntity womanEntity, GiraffeEntity giraffeEntity, RoomEntity roomEntity) {
        System.out.println("Выберите человека, которого хотите посмотреть");
        System.out.println("1: Мужчина");
        System.out.println("2: Женщина");

        int numPerson = scanner.nextInt();

        switch (numPerson){
            case 1:
                System.out.println("Выберите действие");
                manEntity.chooseAction(scanner, manEntity, roomEntity );
                break;
            case 2:
                System.out.println("Выберите действие");
                womanEntity.chooseAction(scanner, womanEntity, roomEntity);
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void eat() {
        System.out.println("Вы поели");
    }

    @Override
    public void sleep() {
        System.out.println("Вы поспали");
    }

    @Override
    public void viewInformation(PersonEntity personEntity) {
        System.out.println("Информация о " + personEntity.getGender() + ":");
        System.out.println(personEntity.toString());
    }
    @Override
    public void chooseRoom(Scanner scanner, RoomEntity roomEntity) {
        System.out.println("Выберите комнату, которую хотите посмотреть");
        System.out.println("1: Комната - 1");

        Integer numRoom = scanner.nextInt();

        switch (numRoom){
            case 1:
                System.out.println("Вы посмотрели комнату - 1");
                roomEntity.viewInformationRoom(numRoom, roomEntity);
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void chooseHouse(Scanner scanner, RoomEntity roomEntity) {
        System.out.println("Выберите дом, который хотите посмотреть");
        System.out.println("1: Дом - 1 ");

        int numHouse = scanner.nextInt();

        switch (numHouse){
            case 1:
                viewHouse(numHouse);
                System.out.println();
                System.out.println("Выберите комнату, которую хотите посмотреть в доме - 1");
                System.out.println();
                chooseRoom(scanner, roomEntity);
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void viewHouse(Integer numHouse) {
        switch (numHouse){
            case 1:
                System.out.println("Вы посмотрели дом - 1");
                break;
            case 2:
                System.out.println("Вы посмотрели дом - 2");
                break;
            case 3:
                System.out.println("Вы посмотрели дом - 3");
                break;
            case 4:
                System.out.println("Вы посмотрели дом - 4");
                break;
            default:
                System.out.println("Повторите попытку!");

        }
    }


    @Override
    public void patAnimal(Scanner scanner) {
        System.out.println("Выберите животное, которое хотите погладить");
        System.out.println("1: Жираф");

        int numAnimal = scanner.nextInt();

        switch (numAnimal){
            case 1:
                System.out.println("Вы погладили жирафа ");
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void patPerson(Scanner scanner) {
        System.out.println("Выберите человека, которого хотите погладить");
        System.out.println("1: Женщина");
        int numPerson = scanner.nextInt();

        switch (numPerson) {
            case 1:
                System.out.println("Вы погладили женщину");
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void pat(Scanner scanner) {
        System.out.println("Выберите кого хотите погладить");
        System.out.println("1: Человек");
        System.out.println("2: Животное");

        int numEntity = scanner.nextInt();

        switch (numEntity) {
            case 1:
                patPerson(scanner);
                break;
            case 2:
                patAnimal(scanner);
                break;
            default:
                System.out.println("Повторите попытку");
        }
    }

    @Override
    public void feed(Scanner scanner) {
        System.out.println("Выберите кого вы хотите покормить");
        System.out.println("1:Человек");
        System.out.println("2:Животное");

        int numEntity = scanner.nextInt();

        switch (numEntity) {
            case 1:
                feedPerson(scanner);
                break;
            case 2:
                feedAnimal(scanner);
        }
    }

    @Override
    public void feedPerson(Scanner scanner) {
        System.out.println("Выберите человека, которого хотите покормить");
        System.out.println("1: Женщина");

        int numPerson = scanner.nextInt();

        switch (numPerson){
            case 1:
                System.out.println("Вы покормили женщину");
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void feedAnimal(Scanner scanner) {
        System.out.println("Выберите животное, которое хотите покормить");
        System.out.println("1: Жираф");

        int numAnimal = scanner.nextInt();

        switch (numAnimal){
            case 1:
                System.out.println("Вы покормили Жирафа");
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
