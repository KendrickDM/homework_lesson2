package com.homework.lesson2.EntityAnimal;

import com.homework.lesson2.EntityGiraffe.GiraffeEntity;
import sun.jvm.hotspot.memory.SystemDictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalEntity implements AnimalInterface {

    private String animalType; // тип животного
    private String gender; // пол животного
    private String color; // цвет животного
    private String placeOfResidence; // место обитания животного


    public AnimalEntity(){}

    public AnimalEntity(String animalType, String gender, String color, String placeOfResidence) {
        this.animalType = animalType;
        this.gender = gender;
        this.color = color;
        this.placeOfResidence = placeOfResidence;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }


    @Override
    public void chooseAnimal(Scanner scanner, GiraffeEntity giraffeEntity) {
        System.out.println("Выберите животное, которое хотите посмотреть");
        System.out.println("1: Жираф");


        int numAnimal = scanner.nextInt();

        switch(numAnimal){
            case 1:
               // System.out.println("Вы выбрали Жирафа");
                System.out.println("Выберите действие");
                giraffeEntity.chooseAction(new Scanner(System.in), giraffeEntity);
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }

    @Override
    public void eat(AnimalEntity animalEntity) {
        System.out.println(getAnimalType() + " поел");
    }

    @Override
    public void sleep(AnimalEntity animalEntity) {
        System.out.println(getAnimalType() + " поспал");
    }

    @Override
    public void drink(AnimalEntity animalEntity) {
        System.out.println(getAnimalType() + " попил");
    }

    @Override
    public String toString() {
        return "Тип животного: " + animalType + "\n" +
                "Пол: " + gender + "\n" +
                "Цвет: " + color + "\n" +
                "Место обитания: " + placeOfResidence + "\n";
    }
}
