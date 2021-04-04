package com.homework.lesson2.EntityGiraffe;

import com.homework.lesson2.EntityAnimal.AnimalEntity;

import java.util.Scanner;

public class GiraffeEntity extends AnimalEntity implements GiraffeInterface{

    private String name; // имя животного
    private Integer age; // возраст животного
    private Double weight; // вес жирафа
    private Double height; // рост жирафа
    private String preferredFood; // предпочтительная еда
    private Integer maxSpeed; // максимально развивающаяся скорость

    public GiraffeEntity(){}

    public GiraffeEntity(String animalType, String gender, String color, String placeOfResidence, String name,
                         Integer age, Double weight, Double height, String preferredFood, Integer maxSpeed) {
        super(animalType, gender, color, placeOfResidence);
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.preferredFood = preferredFood;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getPreferredFood() {
        return preferredFood;
    }

    public void setPreferredFood(String preferredFood) {
        this.preferredFood = preferredFood;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    @Override
    public void chooseAction(Scanner scanner, GiraffeEntity giraffeEntity) {
        System.out.println("1: Поесть");
        System.out.println("2: Поспать");
        System.out.println("3: Попить");
        System.out.println("4: Посмотреть информацию");

        int numAction = scanner.nextInt();

        switch(numAction){
            case 1:
                eat(giraffeEntity);
                break;
            case 2:
                sleep(giraffeEntity);
                break;
            case 3:
                drink(giraffeEntity);
                break;
            case 4:
                viewInformation(giraffeEntity);
                break;
            default:
                System.out.println("Повторите попытку!");
        }
    }


    @Override
    public void viewInformation(GiraffeEntity giraffeEntity) {
        System.out.println("Посмотреть информацию");
        System.out.println(giraffeEntity.toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Имя: " + name + "\n" +
                "Возраст(лет): " + age + "\n" +
                "Вес(кг): " + weight + "\n" +
                "Рост(м): " + height + "\n" +
                "Предпочтительная еда: " + preferredFood + "\n" +
                "Максимальная скорость развития(км/ч): " +  maxSpeed;
    }
}
