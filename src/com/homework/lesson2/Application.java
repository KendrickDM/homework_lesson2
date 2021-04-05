package com.homework.lesson2;

import com.homework.lesson2.EntityGiraffe.GiraffeEntity;
import com.homework.lesson2.EntityHouse.HouseEntity;
import com.homework.lesson2.EntityMan.ManEntity;
import com.homework.lesson2.EntityPerson.PersonEntity;
import com.homework.lesson2.EntityRoom.RoomEntity;
import com.homework.lesson2.EntityWoman.WomanEntity;

import java.util.Scanner;

public class Application {

    public static void runApp(Scanner sc, GiraffeEntity giraffeEntity, PersonEntity personEntity,
                              ManEntity manEntity, WomanEntity womanEntity, HouseEntity houseEntity, RoomEntity roomEntity){

        System.out.print("1: Животное  ");
        System.out.print("2: Человек  ");
        System.out.print("3: Дом  ");
        System.out.print("4: Комната");
        System.out.println();

        int numEntity = sc.nextInt();

        switch(numEntity){
            case 1:
                giraffeEntity.chooseAnimal(sc, giraffeEntity);
                break;
            case 2:
                personEntity.choosePerson(sc, manEntity, womanEntity, giraffeEntity, roomEntity);
                break;
            case 3:
                houseEntity.chooseAction(sc, houseEntity, roomEntity);
                break;
            case 4:
                roomEntity.chooseAction(sc, roomEntity);
                break;
        }
    }
}
