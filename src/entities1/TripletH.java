/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities1;

/**
 *
 * @author hp
 */

public class TripletH<A, B, C> {

    private A premier;
    private B second;
    private C troisieme;

    public TripletH(A premier, B second, C troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    public A getPremier() {
        return premier;
    }

    public B getSecond() {
        return second;
    }

    public C getTroisieme() {
        return troisieme;
    }

    public void affiche() {
        System.out.println("TripletH : [" + premier + ", " + second + ", " + troisieme + "]");
    }
}
