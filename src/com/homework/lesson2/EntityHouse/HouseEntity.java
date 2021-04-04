package com.homework.lesson2.EntityHouse;

import com.homework.lesson2.EntityRoom.RoomEntity;

import java.util.Scanner;

public class HouseEntity implements HouseInterface{

    private String city; // город в котором находится дом
    private String address; // адрес по которому находится дом
    private Integer numberOfHouse; // номер дома
    private Integer sizeOfHouse; // размер дома в кв м
    private Integer quantityOfFloors; // количество этажей
    private Integer quantityOfRooms; // количество комнат

    public HouseEntity(){

    }

    public HouseEntity(String city, String address, Integer numberOfHouse, Integer sizeOfHouse, Integer quantityOfFloors, Integer quantityOfRooms) {
        this.city = city;
        this.address = address;
        this.numberOfHouse = numberOfHouse;
        this.sizeOfHouse = sizeOfHouse;
        this.quantityOfFloors = quantityOfFloors;
        this.quantityOfRooms = quantityOfRooms;
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

    public Integer getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(Integer numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public Integer getSizeOfHouse() {
        return sizeOfHouse;
    }

    public void setSizeOfHouse(Integer sizeOfHouse) {
        this.sizeOfHouse = sizeOfHouse;
    }

    public Integer getQuantityOfFloors() {
        return quantityOfFloors;
    }

    public void setQuantityOfFloors(Integer quantityOfFloors) {
        this.quantityOfFloors = quantityOfFloors;
    }

    public Integer getQuantityOfRooms() {
        return quantityOfRooms;
    }

    public void setQuantityOfRooms(Integer quantityOfRooms) {
        this.quantityOfRooms = quantityOfRooms;
    }

    @Override
    public void chooseAction(Scanner scanner) {
        System.out.println("1: Посмотреть дом");
        System.out.println("2: Посмотреть информацию о доме");

        int numAction = scanner.nextInt();

        switch (numAction) {
            case 1:
                chooseHouse(new Scanner(System.in), new RoomEntity());
                break;
            case 2:
                chooseInformation(new Scanner(System.in), new HouseEntity());
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void chooseHouse(Scanner scanner, RoomEntity roomEntity) {
        System.out.println("Выберите дом, который хотите посмотреть");
        System.out.println("1: Дом - 1 ");
        System.out.println("2: Дом - 2 ");
        System.out.println("3: Дом - 3 ");
        System.out.println("4: Дом - 4");

        int numHouse = scanner.nextInt();

        switch (numHouse){
            case 1:
                viewHouse(numHouse);
                System.out.println();
                System.out.println("Выберите комнату, которую хотите посмотреть в доме - 1");
                System.out.println();
                roomEntity.chooseRoom(new Scanner(System.in));
                break;
            case 2:
                viewHouse(numHouse);
                System.out.println();
                System.out.println("Выберите комнату, которую хотите посмотреть в доме - 2");
                System.out.println();
                roomEntity.chooseRoom(new Scanner(System.in));
                break;
            case 3:
                viewHouse(numHouse);
                System.out.println();
                System.out.println("Выберите комнату, которую хотите посмотреть в доме - 3");
                System.out.println();
                roomEntity.chooseRoom(new Scanner(System.in));
                break;
            case 4:
                viewHouse(numHouse);
                System.out.println();
                System.out.println("Выберите комнату, которую хотите посмотреть в доме - 4");
                System.out.println();
                roomEntity.chooseRoom(new Scanner(System.in));
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
    public void chooseInformation(Scanner scanner, HouseEntity houseEntity) {
        System.out.println("Выберите дом про который хотите посмотреть информацию");
        System.out.println("1: Дом - 1 ");
        System.out.println("2: Дом - 2 ");
        System.out.println("3: Дом - 3 ");
        System.out.println("4: Дом - 4");

        int numInf = scanner.nextInt();

        switch (numInf) {
            case 1:
                System.out.println("Информация о доме - 1:");
                viewInformation(numInf, new HouseEntity("Москва", "Улица Тверская", 3, 185, 2, 4 ));
                break;
            case 2:
                System.out.println("Информация о доме - 2:");
                viewInformation(numInf, new HouseEntity("Казань", "Улица К", 5, 99, 1, 4 ));
                break;
            case 3:
                System.out.println("Информация о доме - 3:");
                viewInformation(numInf, new HouseEntity("Лондон", "Улица Л", 1, 120, 2, 4 ));
                break;
            case 4:
                System.out.println("Информация о доме - 4:");
                viewInformation(numInf, new HouseEntity("Нижний Новгород", "Улица Н", 10, 133, 3, 4 ));
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void viewInformation(Integer numView, HouseEntity houseEntity) {

        switch (numView) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println(houseEntity.toString());
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public String toString() {
        return "Город: " +  city + "\n" +
                "Адрес: " + address + "\n" +
                "Номер дома: " + numberOfHouse + "\n" +
                "Размер дома(кв/м): " + sizeOfHouse + "\n" +
                "Количество этажей: " + quantityOfFloors + "\n" +
                "Количество комнат: " + quantityOfRooms + "\n";
    }
}
