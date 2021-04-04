package com.homework.lesson2.EntityWoman;

import com.homework.lesson2.EntityAnimal.AnimalEntity;
import com.homework.lesson2.EntityMan.ManEntity;
import com.homework.lesson2.EntityPerson.PersonInterface;

import java.util.Scanner;

public interface WomanInterface extends PersonInterface {

    void chooseAction(Scanner scanner, WomanEntity womanEntity, ManEntity manEntity, AnimalEntity animalEntity); // выбрать действие
//    void chooseRoom(Scanner scanner); // выбрать комнату
//    void chooseHouse(Scanner scanner); // выбрать дома
//    void viewHouse(Integer numHouse); // осмотреть дом
//    void talk(Scanner scanner); // поговорить
//    void patAnimal(Scanner scanner); // погладить животное
//    void patPerson(Scanner scanner); // погладить человека
//    void pat(Scanner scanner); // погладить
//    void feedAnimal(Scanner scanner); // покормить животное
//    void feedPerson(Scanner scanner); // покормить человека
//    void feed(Scanner scanner); // покормить
//    void viewInformation(WomanEntity womanEntity); // информация о мужчине
//    void actionWithAnimals(Scanner scanner); // действия с животными
}
