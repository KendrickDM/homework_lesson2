package com.homework.lesson2.EntityWoman;

import com.homework.lesson2.EntityHouse.HouseEntity;
import com.homework.lesson2.EntityPerson.PersonInterface;
import com.homework.lesson2.EntityRoom.RoomEntity;

import java.util.Scanner;

public interface WomanInterface extends PersonInterface {

    void chooseActionWoman(Scanner scanner, WomanEntity womanEntity, HouseEntity houseEntity, RoomEntity roomEntity); // выбрать действие
}
