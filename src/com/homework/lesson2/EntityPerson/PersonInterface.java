package com.homework.lesson2.EntityPerson;

import com.homework.lesson2.EntityMan.ManEntity;
import com.homework.lesson2.EntityWoman.WomanEntity;

import java.util.Scanner;

public interface PersonInterface {

    void choosePerson(Scanner scanner, ManEntity manEntity, WomanEntity womanEntity);
    void eat(); // поесть
    void sleep(); // поспать
}
