package ohtu.kivipaperisakset;

public class Kayttoliittyma {

    public Kayttoliittyma() {
    }

    public void alkuOhjeistus() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }

    public void ohjeistaJaPelaa(Peli peli) {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        peli.pelaa();
    }
}
