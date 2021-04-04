package com.homework.lesson2;

import com.homework.lesson2.EntityAnimal.AnimalEntity;
import com.homework.lesson2.EntityGiraffe.GiraffeEntity;
import com.homework.lesson2.EntityHouse.HouseEntity;
import com.homework.lesson2.EntityMan.ManEntity;
import com.homework.lesson2.EntityPerson.PersonEntity;
import com.homework.lesson2.EntityRoom.RoomEntity;
import com.homework.lesson2.EntityWoman.WomanEntity;

import java.util.Scanner;

public class Application {

    public static void runApp(Scanner sc, AnimalEntity ae, PersonEntity pe, HouseEntity he, RoomEntity re){

        System.out.print("1: Животное  ");
        System.out.print("2: Человек  ");
        System.out.print("3: Дом  ");
        System.out.print("4: Комната");
        System.out.println();

        int numEntity = sc.nextInt();

        switch(numEntity){
            case 1:
                ae.chooseAnimal(new Scanner(System.in), new GiraffeEntity());
                break;
            case 2:
                pe.choosePerson(new Scanner(System.in), new ManEntity(), new WomanEntity());
                break;
            case 3:
                he.chooseAction(new Scanner(System.in));
                break;
            case 4:
                re.chooseAction(new Scanner(System.in));
                break;
        }
    }
}
