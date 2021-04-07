package com.homework.lesson2.EntityMan;

import com.homework.lesson2.EntityHouse.HouseEntity;
import com.homework.lesson2.EntityPerson.PersonInterface;
import com.homework.lesson2.EntityRoom.RoomEntity;

import java.util.Scanner;

public interface ManInterface extends PersonInterface {

    void chooseActionMan(Scanner scanner, ManEntity manEntity, HouseEntity houseEntity, RoomEntity roomEntity); // выбрать действие
    void printUniqueInf();
}
