package com.homework.lesson2.EntityGiraffe;

import com.homework.lesson2.EntityAnimal.AnimalInterface;

import java.util.Scanner;

public interface GiraffeInterface extends AnimalInterface {

    void chooseActionGiraffe(Scanner scanner, GiraffeEntity giraffeEntity); // выбрать действие
    void printName(GiraffeEntity giraffeEntity); // вывод имени
    void printUniqueInformation(GiraffeEntity giraffeEntity); // вывод уникальной информации
}
