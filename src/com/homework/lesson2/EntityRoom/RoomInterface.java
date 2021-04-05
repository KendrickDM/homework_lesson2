package com.homework.lesson2.EntityRoom;

import java.util.Scanner;

public interface RoomInterface {

    void chooseAction(Scanner scanner, RoomEntity roomEntity); // выбрать действие
    void chooseRoom(Scanner scanner); // выбрать комнату
    void chooseInformationRoom(Scanner scanner, RoomEntity roomEntity); // выбрать информацию о комнате
    void viewInformationRoom(Integer numView, RoomEntity roomEntity); // посмотреть информацию
}
