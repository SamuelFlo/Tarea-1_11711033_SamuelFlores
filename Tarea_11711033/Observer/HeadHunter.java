/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class HeadHunter implements Subject {

    ArrayList<String> jobs = new ArrayList();
    ArrayList<Observer> registros = new ArrayList();

    public HeadHunter() {
    }

    @Override
    public void registerObserver(Observer registro) {
        registros.add(registro);

    }

    @Override
    public void removeObserver(Observer remove) {
    }

 

    public void addJob(String agregar) {
        this.jobs.add(agregar);
        notifyAllObservers();

    }

    public ArrayList<String> getJobs() {
        return jobs;
    }

    @Override
    public String toString() {
        return "HeadHunter{" + "jobs=" + jobs + '}';
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o : registros) {
            o.Update(this);
        }
    }

}
