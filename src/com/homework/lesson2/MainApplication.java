package com.homework.lesson2;

import com.homework.lesson2.EntityAnimal.AnimalEntity;
import com.homework.lesson2.EntityHouse.HouseEntity;
import com.homework.lesson2.EntityPerson.PersonEntity;
import com.homework.lesson2.EntityRoom.RoomEntity;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        System.out.println("Выберите, что вы хотите посмотреть!");

        Scanner sc = new Scanner(System.in);
        AnimalEntity animalEntity = new AnimalEntity();
        PersonEntity personEntity = new PersonEntity();
        HouseEntity houseEntity = new HouseEntity();
        RoomEntity roomEntity = new RoomEntity();
        Application.runApp(sc, animalEntity, personEntity, houseEntity,roomEntity);
    }
}
