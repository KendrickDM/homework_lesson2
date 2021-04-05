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
    public void printName(GiraffeEntity giraffeEntity) {
        System.out.println("Жирафа зовут " + giraffeEntity.getName());
    }

    @Override
    public void printUniqueInformation(GiraffeEntity giraffeEntity) {
        System.out.println("Жираф может развивать скорость до " + giraffeEntity.getMaxSpeed() +" км/ч");
        System.out.println(giraffeEntity.getPreferredFood() + " любимая еда жирафа");
        System.out.println("Среда обитания жирафа " + giraffeEntity.getPlaceOfResidence());
        System.out.println("Рост жирафа может достигать " + giraffeEntity.getHeight() + " метров");
    }

    @Override
    public void chooseAction(Scanner scanner, GiraffeEntity giraffeEntity) {
        System.out.println("1: Поесть");
        System.out.println("2: Поспать");
        System.out.println("3: Попить");
        System.out.println("4: Посмотреть информацию");
        System.out.println("5: Узнать имя жирафа");
        System.out.println("6: Узнать интересную информацию о жирафе");

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
                viewInformationAnimal(giraffeEntity);
                break;
            case 5:
                printName(giraffeEntity);
                break;
            case 6:
                printUniqueInformation(giraffeEntity);
                break;
            default:
                System.out.println("Повторите попытку!");
        }
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
