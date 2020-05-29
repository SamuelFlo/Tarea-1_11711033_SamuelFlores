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
public class MealDirector {
    public void makeMeal(MealBuilder meal) {
        meal.addSandwich("SANDWICH CON QUESO");
        meal.addSides("PAPAS CON EXTRA QUESO");
        meal.addDrink("COCA COLA ZERO");
        meal.addOffer("2X1");
        meal.setPrice(430.0);
    }
}
