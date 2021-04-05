package com.homework.lesson2.EntityMan;

import com.homework.lesson2.EntityPerson.PersonInterface;
import com.homework.lesson2.EntityRoom.RoomEntity;

import java.util.Scanner;

public interface ManInterface extends PersonInterface {

    void chooseAction(Scanner scanner, ManEntity manEntity, RoomEntity roomEntity); // выбрать действие

}
