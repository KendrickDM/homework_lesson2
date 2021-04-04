package com.homework.lesson2.EntityWoman;

import com.homework.lesson2.EntityMan.ManEntity;
import com.homework.lesson2.EntityPerson.PersonEntity;

import java.util.Scanner;

public class WomanEntity extends PersonEntity implements WomanInterface{

    private Double weight; // вес человека
    private Double height; // рост человека
    private String company; // компания в которой человек работает
    private String post; // должность человека
    private Integer salary; // зарплата человека
    private String numberPhone; // номер телефона человека
    private String passportDetails; // паспортные данные человека

    public WomanEntity(){}

    public WomanEntity(String name, String lastName, String gender, Integer age, String city, String address, Double weight,
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
    public void chooseAction(Scanner scanner, WomanEntity womanEntity) {
        System.out.println("1: Выбрать дом");
        System.out.println("2: Поесть");
        System.out.println("3: Поспать");
        System.out.println("4: Поговорить");
        System.out.println("5: Погладить");
        System.out.println("6: Покормить");
        System.out.println("7: Посмотреть информацию о женщине");

        int numAction = scanner.nextInt();
        switch (numAction){
            case 1:
                chooseHouse(new Scanner(System.in));
                break;
            case 2:
                eat();
                break;
            case 3:
                sleep();
                break;
            case 4:
                talk(new Scanner(System.in));
                break;
            case 5:
                pat(new Scanner(System.in));
                break;
            case 6:
                feed(new Scanner(System.in));
                break;
            case 7:
                viewInformation(womanEntity);
                break;
            default:
                System.out.println("Повторите попытку!");

        }
    }

    @Override
    public void chooseRoom(Scanner scanner) {
        System.out.println("Выберите комнату, которую хотите посмотреть");
        System.out.println("1: Комната - 1");
        System.out.println("2: Комната - 2");
        System.out.println("3: Комната - 3");
        System.out.println("4: Комната - 4");

        int numRoom = scanner.nextInt();

        switch (numRoom){
            case 1:
                System.out.println("Вы посмотрели комнату - 1");
                break;
            case 2:
                System.out.println("Вы посмотрели комнату - 2");
                break;
            case 3:
                System.out.println("Вы посмотрели комнату - 3");
                break;
            case 4:
                System.out.println("Вы посмотрели комнату - 4");
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void chooseHouse(Scanner scanner) {
        System.out.println("Выберите дом, который хотите посмотреть");
        System.out.println("1: Дом - 1 ");
        System.out.println("2: Дом - 2 ");
        System.out.println("3: Дом - 3 ");
        System.out.println("4: Дом - 4 ");

        int numHouse = scanner.nextInt();

        switch (numHouse){
            case 1:
                viewHouse(numHouse);
                System.out.println();
                System.out.println("Выберите комнату, которую хотите посмотреть в доме - 1");
                System.out.println();
                chooseRoom(new Scanner(System.in));
                break;
            case 2:
                viewHouse(numHouse);
                System.out.println();
                System.out.println("Выберите комнату, которую хотите посмотреть в доме - 2");
                System.out.println();
                chooseRoom(new Scanner(System.in));
                break;
            case 3:
                viewHouse(numHouse);
                System.out.println();
                System.out.println("Выберите комнату, которую хотите посмотреть в доме - 3");
                System.out.println();
                chooseRoom(new Scanner(System.in));
                break;
            case 4:
                viewHouse(numHouse);
                System.out.println();
                System.out.println("Выберите комнату, которую хотите посмотреть в доме - 4");
                System.out.println();
                chooseRoom(new Scanner(System.in));
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void viewHouse(int numHouse) {
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
    public void eat() {
        System.out.println("Вы поели");
    }

    @Override
    public void sleep() {
        System.out.println("Вы поспали");
    }

    @Override
    public void talk(Scanner scanner) {
        System.out.println("Выберите с кем хотите поговорить");
        System.out.println("1: Мужчина");
        System.out.println("2: Жираф");

        int numTalk = scanner.nextInt();

        switch (numTalk){
            case 1:
                System.out.println("Вы поговорили с мужчиной");
                break;
            case 2:
                System.out.println("С жирафом нельзя поговорить, но зато его можно погладить и покормить");
                actionWithAnimals(new Scanner(System.in));
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
        System.out.println("Выберите человека, которого вы хотите погладить");
        System.out.println("1: Мужчина");

        int numPerson = scanner.nextInt();

        switch (numPerson){
            case 1:
                System.out.println("Вы погладили мужчину");
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
                patPerson(new Scanner(System.in));
                break;
            case 2:
                patAnimal(new Scanner(System.in));
                break;
            default:
                System.out.println("Повторите попытку");
        }
    }

    @Override
    public void feedAnimal(Scanner scanner) {
        System.out.println("Выберите животное, которое хотите покормить");
        System.out.println("1: Жираф");

        int numAnimal = scanner.nextInt();

        switch (numAnimal){
            case 1:
                System.out.println("Вы покормили жирафа ");
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void feedPerson(Scanner scanner){

        System.out.println("Выберите человека, которого хотите покормить");
        System.out.println("1: Мужчина");

        int numPerson = scanner.nextInt();

        switch (numPerson){
            case 1:
                System.out.println("Вы покормили мужчину");
                break;
            default:
                System.out.println("Повторите попытку!");
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
                feedPerson(new Scanner(System.in));
                break;
            case 2:
                feedAnimal(new Scanner(System.in));
        }
    }

    @Override
    public void actionWithAnimals(Scanner scanner) {
        System.out.println("1: Погладить");
        System.out.println("2: Покормить");

        int numAnimal = scanner.nextInt();
        switch (numAnimal){
            case 1:
                System.out.println("Вы погладили жирафа");
                break;
            case 2:
                System.out.println("Вы покормили жирафа");
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void viewInformation(WomanEntity womanEntity) {
        System.out.println("Информация о женщине: ");
        System.out.println(womanEntity.toString());
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

