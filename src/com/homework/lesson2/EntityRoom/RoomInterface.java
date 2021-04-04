package com.homework.lesson2.EntityRoom;

import java.util.Scanner;

public interface RoomInterface {

    void chooseAction(Scanner scanner);
    void chooseRoom(Scanner scanner);
    void chooseInformation(Scanner scanner, RoomEntity roomEntity);
    void viewInformation(Integer numView, RoomEntity roomEntity);
}
