package com.homework.lesson2.EntityRoom;

import com.homework.lesson2.EntityHouse.HouseEntity;

import java.util.Scanner;

public class RoomEntity extends HouseEntity implements RoomInterface {

    private Integer size; // размер комнаты
    private String color; // цвет комнаты
    private Integer quantityOfFurniture; // количество мебели в комнате
    private Integer roomFlor; // на каком этаже находится комната
    private String roomType; // тип комнаты

    public RoomEntity(){

    }

    public RoomEntity(Integer size, String color, Integer quantityOfFurniture, Integer roomFlor, String roomType) {
        this.size = size;
        this.color = color;
        this.quantityOfFurniture = quantityOfFurniture;
        this.roomFlor = roomFlor;
        this.roomType = roomType;
    }

//    public RoomEntity(String city, String address, Integer numberOfHouse, Integer sizeOfHouse, Integer quantityOfFloors, Integer quantityOfRooms, Integer size, String color, Integer quantityOfFurniture, Integer roomFlor, String roomType) {
//        super(city, address, numberOfHouse, sizeOfHouse, quantityOfFloors, quantityOfRooms);
//        this.size = size;
//        this.color = color;
//        this.quantityOfFurniture = quantityOfFurniture;
//        this.roomFlor = roomFlor;
//        this.roomType = roomType;
//    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getQuantityOfFurniture() {
        return quantityOfFurniture;
    }

    public void setQuantityOfFurniture(Integer quantityOfFurniture) {
        this.quantityOfFurniture = quantityOfFurniture;
    }

    public Integer getRoomFlor() {
        return roomFlor;
    }

    public void setRoomFlor(Integer roomFlor) {
        this.roomFlor = roomFlor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public void chooseActionRoom(Scanner scanner, RoomEntity roomEntity) {
        System.out.println("1: Посмотреть комнату");
        System.out.println("2: Информация о комнате");

        int numAction = scanner.nextInt();

        switch (numAction) {
            case 1:
                chooseRoom(scanner);
                break;
            case 2:
                chooseInformationRoom(scanner, roomEntity);
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void chooseRoom(Scanner scanner) {
        System.out.println("Выберите комнату, которую хотите посмотреть");
        System.out.println("1: Комната - 1");

        int numRoom = scanner.nextInt();

        switch (numRoom){
            case 1:
                System.out.println("Вы посмотрели комнату - 1");
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }


    @Override
    public void viewInformationRoom(Integer numView, RoomEntity roomEntity) {

        switch (numView) {
            case 1:
                System.out.println(roomEntity.toString());
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void chooseInformationRoom(Scanner scanner, RoomEntity roomEntity) {
        System.out.println("Выберите комнату про которую хотите посмотреть информацию");
        System.out.println("1: Комната - 1");

        int numView = scanner.nextInt();

        switch (numView){
            case 1:
                System.out.println("Информация о комнате - 1:");
                viewInformationRoom(numView, roomEntity);
                break;
            default:
                System.out.println("Повторите попытку");
        }
    }

    @Override
    public String toString() {

        return  "Тип комнаты: " + roomType + "\n" +
                "Цвет комнаты: " + color + "\n" +
                "Размер команты(кв/м): " + size +"\n" +
                "Количество мебели в комнате: " + quantityOfFurniture + "\n" +
                "Этаж комнаты: " + roomFlor + "\n";
    }
}
