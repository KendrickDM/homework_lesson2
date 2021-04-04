package com.homework.lesson2.EntityWoman;

import com.homework.lesson2.EntityMan.ManEntity;

import java.util.Scanner;

public interface WomanInterface {

    void chooseAction(Scanner scanner); // выбрать действие
    void chooseRoom(Scanner scanner); // выбрать комнату
    void chooseHouse(Scanner scanner); // выбрать дома
    void viewHouse(int numHouse); // осмотреть дом
    void viewRoom(int numRoom); // осмотреть комнату
    void eat(); // поесть
    void sleep(); // поспать
    void talk(Scanner scanner); // поговорить
    void patAnimal(Scanner scanner); // погладить животное
    void patPerson(Scanner scanner); // погладить мужчину
    void pat(Scanner scanner);
    void feedAnimal(Scanner scanner); // покормить животное
    void feedPerson(Scanner scanner);
    void feed(Scanner scanner);
    void viewInformation(WomanEntity womanEntity); // информация о мужчине
    void actionWithAnimals(Scanner scanner); // действия с животными
}
