/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Sri Vyshnavi
 */
public class UberHistory {
    private ArrayList<Uber> history;

    public UberHistory() {
        this.history = new ArrayList<Uber>();
    }

    public ArrayList<Uber> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Uber> history) {
        this.history = history;
    }

    public Uber addNewCars() {
        Uber addCars= new Uber();
        history.add(addCars);
        return addCars;
    }

    public void removeCars(Uber remove) {
        history.remove(remove);
    }
    

    public Uber searchCars(String modelName) {
        for (Uber uc: history) {
            if (uc.getModelName() == modelName) {
                return uc;
            }
        }
        return null;
    }
    
    public Uber searchAvailableCars() {
        for (Uber uc: history) {
            if (uc.CarIsAvailable() == true) {
                return uc;
            }
        }
        return null;
    }
}
