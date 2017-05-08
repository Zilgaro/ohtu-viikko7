package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends Peli{

    public KPSTekoaly(AI tekoaly, Scanner scanner) {
        super(tekoaly, scanner);
    }
    
    //template-metodiksi
    @Override
    public void pelaa() {
        Tuomari tuomari = new Tuomari();

        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = scanner.nextLine();

        String tokanSiirto = super.tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);


        while (super.onkoOkSiirto(ekanSiirto) && super.onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = scanner.nextLine();

            tokanSiirto = super.tekoaly.annaSiirto();
            System.out.println("Tietokone valitsi: " + tokanSiirto);
            super.tekoaly.asetaSiirto(ekanSiirto);

        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
}