/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anton
 */
public class Pelaaja {
    private String nimi;
    private int pisteet;
    
    public Pelaaja(){
        this.pisteet = 0;
    }
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    public void lisaaPisteitta(){
        this.pisteet += 1;
    }
    public String getNimi(){
        return this.nimi;
    }
    public int getPisteet(){
        return this.pisteet;
    }
}



