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
public class JobSeeker implements Observer {
    private String nombre;
   
    public JobSeeker(String nombre) {
        this.nombre = nombre;
    }
    public void Update(Subject update){
        System.out.println(this.nombre+ " Fue modificado");
		System.out.println(update);
                
    }
}
