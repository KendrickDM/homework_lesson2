package com.homework.lesson2.EntityMan;

import com.homework.lesson2.EntityAnimal.AnimalEntity;
import com.homework.lesson2.EntityPerson.PersonInterface;
import com.homework.lesson2.EntityWoman.WomanEntity;

import java.util.Scanner;

public interface ManInterface extends PersonInterface {

    void chooseAction(Scanner scanner, ManEntity manEntity, WomanEntity womanEntity, AnimalEntity animalEntity); // выбрать действие
//    void chooseRoom(Scanner scanner); // выбрать комнату
//    void chooseHouse(Scanner scanner); // выбрать дома
//    void viewHouse(Integer numHouse); // осмотреть дом
//    void talk(Scanner scanner); // поговорить
//    void pat(Scanner scanner); // погладить
//    void patAnimal(Scanner scanner); // погладить животное
//    void feed(Scanner scanner); // покормить
//    void feedPerson(Scanner scanner); // покормить человека
//    void feedAnimal(Scanner scanner); // покормить животное
//    void patPerson(Scanner scanner); // погладить человека
//    void viewInformation(ManEntity manEntity); // информация о мужчине
//    void actionWithAnimals(Scanner scanner); // действия с животными
}
