package com.homework.lesson2.EntityHouse;

import com.homework.lesson2.EntityRoom.RoomEntity;

import java.util.Scanner;

public interface HouseInterface {

    void chooseHouse(Scanner scanner, RoomEntity roomEntity);
    void viewHouse(Integer numHouse);
    void chooseAction(Scanner scanner);
    void viewInformation(Integer numView, HouseEntity houseEntity);
    void chooseInformation(Scanner scanner, HouseEntity houseEntity);
}
