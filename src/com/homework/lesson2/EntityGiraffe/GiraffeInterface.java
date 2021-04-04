package com.homework.lesson2.EntityGiraffe;

import com.homework.lesson2.EntityAnimal.AnimalInterface;

import java.util.List;
import java.util.Scanner;

public interface GiraffeInterface extends AnimalInterface {

    void chooseAction(Scanner scanner, GiraffeEntity giraffeEntity); // выбрать действие
    void viewInformation(GiraffeEntity giraffeEntity); // показать информацию
}
