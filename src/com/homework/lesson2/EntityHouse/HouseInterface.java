package com.homework.lesson2.EntityHouse;

import com.homework.lesson2.EntityRoom.RoomEntity;

import java.util.Scanner;

public interface HouseInterface {

    void chooseHouse(Scanner scanner, RoomEntity roomEntity); // выбрать дом
    void viewHouse(Integer numHouse); // осмотреть дом
    void chooseAction(Scanner scanner, HouseEntity houseEntity, RoomEntity roomEntity); // выбрать действие
    void viewInformationHouse(Integer numView, HouseEntity houseEntity); // посмотреть информацию о доме
    void chooseInformationHouse(Scanner scanner, HouseEntity houseEntity); // выбрать информацию о доме
}
