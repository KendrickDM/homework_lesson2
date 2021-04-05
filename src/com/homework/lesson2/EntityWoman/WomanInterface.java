package com.homework.lesson2.EntityWoman;

import com.homework.lesson2.EntityPerson.PersonInterface;
import com.homework.lesson2.EntityRoom.RoomEntity;

import java.util.Scanner;

public interface WomanInterface extends PersonInterface {

    void chooseAction(Scanner scanner, WomanEntity womanEntity, RoomEntity roomEntity); // выбрать действие
}
