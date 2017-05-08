package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);
    private static PelimuotoTehdas pelimuodot;
    private static Kayttoliittyma kayttis;

    public static void main(String[] args) {
        pelimuodot = new PelimuotoTehdas(scanner);
        kayttis = new Kayttoliittyma();
        //pilkotaan
        while (true) {
            kayttis.alkuOhjeistus();

            String vastaus = scanner.nextLine();
            Peli peli = pelimuodot.hae(vastaus);
            if (peli != null) {
                kayttis.ohjeistaJaPelaa(peli);
            } else {
                break;
            }
        }
    }
}
