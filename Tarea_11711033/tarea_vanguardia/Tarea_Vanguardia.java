/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_vanguardia;

import Singleton.EagerSingleton;
import Factory.Car;
import Factory.CarFactory;
import Factory.CarType;
import Observer.HeadHunter;
import Observer.JobSeeker;
import Builder.Meal;
import Builder.MealDirector;
import Builder.MealBuilder;
import Builder.SandwichMealBuilder;

/**
 *
 * @author Samuel
 */
public class Tarea_Vanguardia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*************************************************************************");
        System.out.println("Sinigleton");
        Singleton();
        System.out.println("*************************************************************************");
        System.out.println("Factory");
        Factory();
        System.out.println("*************************************************************************");
        System.out.println("Observer");
        Observer();
        System.out.println("*************************************************************************");
        System.out.println("Builder");
        Builder();
        System.out.println("*************************************************************************");

    }

    public static void Singleton() {
        EagerSingleton instance = EagerSingleton.getInstance();
        System.out.println(instance.toString());

    }

    public static void Factory() {
        CarFactory factory = new CarFactory();
        Car carrito1 = factory.buildCar(CarType.SEDAN);
        System.out.println(carrito1.getModel());
        Car carrito2 = factory.buildCar(CarType.SMALL);
        System.out.println(carrito2.getModel());
        Car carrito3 = factory.buildCar(CarType.LUXURY);
        System.out.println(carrito3.getModel());
    }

    public static void Observer() {
        HeadHunter regis = new HeadHunter();
        JobSeeker name = new JobSeeker("Shamu");
        regis.registerObserver(name);
        regis.addJob("Limpiador de Ventanas");
    }

    public static void Builder() {
        MealBuilder meal = new SandwichMealBuilder();
        MealDirector director = new MealDirector();
        director.makeMeal(meal);

        Meal sandwich = meal.getMeal();
        System.out.println(sandwich.toString());
    }

}
