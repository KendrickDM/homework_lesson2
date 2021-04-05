package com.homework.lesson2.EntityRoom;

import java.util.Scanner;

public interface RoomInterface {

    void chooseAction(Scanner scanner, RoomEntity roomEntity);
    void chooseRoom(Scanner scanner);
    void chooseInformationRoom(Scanner scanner, RoomEntity roomEntity);
    void viewInformationRoom(Integer numView, RoomEntity roomEntity);
}
