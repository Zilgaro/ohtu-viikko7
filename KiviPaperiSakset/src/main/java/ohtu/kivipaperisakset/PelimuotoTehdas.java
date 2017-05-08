package ohtu.kivipaperisakset;

import java.util.HashMap;
import java.util.Scanner;


public class PelimuotoTehdas {
    private HashMap<String, Peli> pelimuodot;
    private Scanner scanner;
    private final int MUISTI = 20;

    public PelimuotoTehdas(Scanner scanner) {
        this.scanner = scanner;
        AI normi = new Tekoaly();
        AI parempi = new TekoalyParannettu(MUISTI); 
        /* Tähän jää nyt maaginen numero, tavallaanhan siitä pääsisi eroon 
        määrittelemällä vaikka eri vaikeustasoja niin, että skaalalla 1-5
        määritellään kuinka paljon tekoäly muistaa. En nyt lähde tätä toteuttamaan.
        */
        
        pelimuodot = new HashMap<>();
        pelimuodot.put("a", new KPSPelaajaVsPelaaja(scanner));
        pelimuodot.put("b", new KPSTekoaly(normi, scanner));
        pelimuodot.put("c", new KPSTekoaly(parempi, scanner));
    }
    
    public Peli hae(String muoto) {
        Peli peli = pelimuodot.get(muoto);
        return peli;
    }
}
