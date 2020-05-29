/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Samuel
 */
public class SandwichMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void addSandwich(String sandwich) {
        meal.sandwich = sandwich;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addSides(String sides) {
        meal.sideOrder = sides;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addDrink(String drink) {
        meal.drink = drink;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOffer(String coupon) {
        meal.offer = coupon;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrice(double price) {
        meal.price = price;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Meal getMeal() {
        return meal;
        //To change body of generated methods, choose Tools | Templates.
    }
}
