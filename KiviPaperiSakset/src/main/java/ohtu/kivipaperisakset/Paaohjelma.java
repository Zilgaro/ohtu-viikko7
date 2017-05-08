package ohtu.kivipaperisakset;

import java.util.Scanner;
public class Paaohjelma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PelimuotoTehdas pelimuodot = new PelimuotoTehdas(scanner);
        Kayttoliittyma kayttis = new Kayttoliittyma();
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
