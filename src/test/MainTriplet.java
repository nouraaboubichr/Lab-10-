/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Triplet;

/**
 *
 * @author hp
 */
public class MainTriplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triplet<Integer> tInt = new Triplet<Integer>(1, 2, 3);
        tInt.affiche();

        Triplet<String> tStr = new Triplet<String>("A", "B", "C");
        tStr.affiche();

        System.out.println("Second element de tInt : " + tInt.getSecond());
    }
    
}
