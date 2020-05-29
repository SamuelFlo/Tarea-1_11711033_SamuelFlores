/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Samuel
 */
public interface Subject {
    
    public void notifyAllObservers();
    public void registerObserver(Observer registro);
    public void removeObserver(Observer remove);
}
