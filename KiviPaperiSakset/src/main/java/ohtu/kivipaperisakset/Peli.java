/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author Zilgaro
 */
public abstract class Peli {
    
    protected Scanner scanner;
    protected AI tekoaly;
    
    public Peli(AI tekoaly, Scanner scanner) {
        this.scanner = scanner;
        this.tekoaly = tekoaly;
    }
    
    public Peli(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    
    public abstract void pelaa();
}
