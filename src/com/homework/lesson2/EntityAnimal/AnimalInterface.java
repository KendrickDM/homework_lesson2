package com.homework.lesson2.EntityAnimal;

import com.homework.lesson2.EntityGiraffe.GiraffeEntity;

import java.util.Scanner;

public interface AnimalInterface {

    void chooseAnimal(Scanner scanner, GiraffeEntity giraffeEntity); // выбрать животное
    void eat(AnimalEntity animalEntity);
    void sleep(AnimalEntity animalEntity);
    void drink(AnimalEntity animalEntity);
    void viewInformationAnimal(AnimalEntity animalEntity);
}
