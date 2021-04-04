package com.homework.lesson2.EntityGiraffe;

import com.homework.lesson2.EntityAnimal.AnimalInterface;

import java.util.List;
import java.util.Scanner;

public interface GiraffeInterface {

    void eat(); // поесть
    void sleep(); // поспать
    void chooseAction(Scanner scanner); // выбрать действие
    void viewInformation(GiraffeEntity giraffeEntity); // показать информацию
}
