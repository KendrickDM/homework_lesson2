package com.homework.lesson2;

import com.homework.lesson2.EntityAnimal.AnimalEntity;
import com.homework.lesson2.EntityGiraffe.GiraffeEntity;
import com.homework.lesson2.EntityHouse.HouseEntity;
import com.homework.lesson2.EntityMan.ManEntity;
import com.homework.lesson2.EntityPerson.PersonEntity;
import com.homework.lesson2.EntityRoom.RoomEntity;
import com.homework.lesson2.EntityWoman.WomanEntity;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        System.out.println("Выберите, что вы хотите посмотреть!");

        Scanner sc = new Scanner(System.in);

        AnimalEntity animalEntity = new AnimalEntity();

        GiraffeEntity giraffeEntity = new GiraffeEntity("Жираф", "Мужской", "Желтый и черный", "Саванна, Африка", "Тревис",
                7, 800.0, 6.1, "Листья Акации", 55);

        PersonEntity personEntity = new PersonEntity();

        ManEntity manEntity = new ManEntity("Алексей", "Алексеев", "Мужчина", 25, "Москва",
                "Улица Тверская, 3", 75.5, 1.85, "Google", "Product Manager", 300000,
                "+7 (999)-999-9999", "9999 999999");

        WomanEntity womanEntity = new WomanEntity("Екатерина", "Екатеринова", "Женщина", 21,
                "Москва", "Улица Тверская, 3", 55.5, 1.70, "Google", "Developer",
                150000, "+7 (000)-000-0000", "0000 000000");

        HouseEntity houseEntity = new HouseEntity("Москва", "Улица Тверская", 3,
                185, 2, 4 );
        RoomEntity roomEntity = new RoomEntity(25, "Светло бежевый",
                23, 1, "Кухня");

        Application.runApp(sc, animalEntity, giraffeEntity, personEntity, manEntity, womanEntity, houseEntity, roomEntity);
    }
}
