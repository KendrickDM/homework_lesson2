package com.homework.lesson2.EntityPerson;


import com.homework.lesson2.EntityGiraffe.GiraffeEntity;
import com.homework.lesson2.EntityMan.ManEntity;
import com.homework.lesson2.EntityRoom.RoomEntity;
import com.homework.lesson2.EntityWoman.WomanEntity;

import java.util.Scanner;

public interface PersonInterface {

    void choosePerson(Scanner scanner, ManEntity manEntity, WomanEntity womanEntity, GiraffeEntity giraffeEntity, RoomEntity roomEntity);
    void eat(); // поесть
    void sleep(); // поспать
    void chooseRoom(Scanner scanner, RoomEntity roomEntity); // выбрать комнату
    void chooseHouse(Scanner scanner, RoomEntity roomEntity); // выбрать дома
    void viewHouse(Integer numHouse); // осмотреть дом
    void pat(Scanner scanner); // погладить
    void patAnimal(Scanner scanner); // погладить животное
    void feed(Scanner scanner); // покормить
    void feedPerson(Scanner scanner); // покормить человека
    void feedAnimal(Scanner scanner); // покормить животное
    void patPerson(Scanner scanner); // погладить человека
    void viewInformation(PersonEntity personEntity); // информация о мужчине
}
