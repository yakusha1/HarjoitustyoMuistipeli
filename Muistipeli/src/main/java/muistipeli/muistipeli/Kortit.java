/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package muistipeli.muistipeli;

/**
 *
 * @author Anton
 */
public class Kortit {
    private int arvo;
    private int rivi;
    private int sarakke;
    
    public Kortit(int arvo){
        this.arvo = arvo;
        this.rivi = 0;
        this.sarakke = 0;
    }
    
    public int getKortti(){
        return this.arvo;
    }
    public void setPaikka(int rivi, int sarakke){
        this.rivi = rivi;
        this.sarakke = sarakke;
    }
    public int getPaikka(){
        return this.rivi + this.sarakke;
    }
    public void setPaikka2(int rivi, int sarakke){
        this.rivi = rivi;
        this.sarakke = sarakke;
                
    }
    public int getPaikka2(){
        return this.rivi + this.sarakke;
    }
}
