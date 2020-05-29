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
public interface MealBuilder {	
	public abstract void addSandwich(String sandwich);
	public abstract void addSides(String sides);
	public abstract void addDrink(String drink);
	public abstract void addOffer(String coupon);
	public abstract void setPrice(double price);
	public abstract Meal getMeal();
}
