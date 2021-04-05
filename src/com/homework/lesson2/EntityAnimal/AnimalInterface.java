package com.homework.lesson2.EntityAnimal;

import com.homework.lesson2.EntityGiraffe.GiraffeEntity;

import java.util.Scanner;

public interface AnimalInterface {

    void chooseAnimal(Scanner scanner, GiraffeEntity giraffeEntity); // выбрать животное
    void eat(AnimalEntity animalEntity); // поесть
    void sleep(AnimalEntity animalEntity); // поспать
    void drink(AnimalEntity animalEntity);// попить
    void viewInformationAnimal(AnimalEntity animalEntity); // посмотреть информацию о животном

}
