/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Samuel
 */
public class CarFactory {
    public Car buildCar(CarType model){
        if(model.equals(CarType.LUXURY)){
            return new LuxuryCar();
         
        }else if (model.equals(CarType.SEDAN)){
            return new SedanCar();
        }else if (model.equals(CarType.SMALL)){
            return new SmallCar();
        }
        return new Car(model);
    }
}
