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
public class Meal {
	public String sandwich;
	public String sideOrder;
	public String drink;
	public String offer;
	public double price;

    @Override
    public String toString() {
        return "Meal{" + "sandwich=" + sandwich + ", sideOrder=" + sideOrder + ", drink=" + drink + ", offer=" + offer + ", price=" + price + '}';
    }

	
}
