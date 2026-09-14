/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities1.TripletH;

/**
 *
 * @author hp
 */
public class MainTripletH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TripletH<Integer, String, Double> th = new TripletH<Integer, String, Double>(42, "Answer", 3.14);
        th.affiche();

        TripletH<String, Integer, Boolean> th2 = new TripletH<String, Integer, Boolean>("Alice", 30, true);
        th2.affiche();
    }
    
}
