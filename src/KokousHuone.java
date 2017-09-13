
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class KokousHuone implements Huone {

    // tarkistaa onko tunnukset syötetty oikein
    private boolean kayttajatunnusJaSalasanaSyotetty = false;

    // onko muistitikku kiinnitetty koneeseen
    private boolean muistikorttiLiitetty = false;
    
    // tarkistaa onko kalvot luettu (ainakin kerran)
    private boolean kalvotLuettu = false;
    
    // onko kartta otettu (otetaan automaattisesti, kun kalvot katsottu
    
   private boolean karttaOtettu = false;

    public String huoneenKuvaus() {

        return "Astelet sisään kokoushuoneeseen. Taululla näkyy merkintöjä ja muistiinpanoja. Huoneen etuosassa "
                + "on pöytä, jolla on tietokone. Koneeseen on viritetty kiinni videotykki.";
    }

    public void katsoTaululle() {

        System.out.print("Käyttäjätunnus: 'w0rk1ng' \n Salasana: 'p4ssw0rd'");

    }

    public void katsoPoytaa() {

        System.out.print("Huoneen etuosassa on leveä pöytä. Pöydällä on levällään papereita ja muuta toimistotarviketta sekä"
                + "tietokone.");

    }

    public void katsoTietokonetta() {

        System.out.print("Näyttö on pimeänä.");

    }

    public void avaaTietokone() {

        System.out.print("Painat tietokoneen kytkimestä päälle. Tietokone pyytää käyttäjätunnusta ja salasanaa.");

    }
    
    

// tietokone tulostaa tekstiä
    public void tulostaKalvoja() {

        int kalvoNumero = 0;

        String[] ppKalvoja = new String[5];

        // merkkijonomuuttujia, jotka esittävät powerpoint-slaideja, taulukko
        // eka slaidi
        ppKalvoja[0] = "Operaatio Toinen Maa\n\n";

        ppKalvoja[1] = "Tervetuloa paikan päälle. Kertaamme tehtävän pääosittain."
                + "Lähdimme matkaan kohti mahdollista uutta Maapallon kaltaista planeettaa, "
                + "jolle siirtokunta perustetaan, kun tehtävämme onnistuu. Alustavat "
                + "tutkimukset ovat ilmaisseet, että planeetta, jota kohti matkaamme, "
                + "on asuttamiskelpoinen.\n\n";

        ppKalvoja[2] = "Tehtävämme on perustaa ensimmäinen laskeutumisalusta tulevien "
                + "siirtyjien tehtävien helpottamiseksi. Olemme ensimmäinen ryhmä, joka "
                + "lähetetään Yhteiskunnan toimesta kohti tätä uutta planeettaa. "
                + "Lopullinen tavoitteemme on pystyä elämään uudella planeetalla.";

        ppKalvoja[3] = "Operaation toteuttamiseksi olemme varanneet alukseen ammattitaitoisia "
                + "teknikoita ja insinöörejä, sotilaita sekä muuta henkilökuntaa, jotka "
                + "pitävät huolen siitä, että saavutamme tavoitteemme.";

        ppKalvoja[4] = "Uskokaa tämä - emme tule epäonnistumaan!";

        while (kalvoNumero < 5) {

            System.out.print(ppKalvoja[kalvoNumero]);

            kalvoNumero++;

            Scanner s = new Scanner(System.in);

            System.out.println("Seuraava kalvo (paina Enter)");

            s.nextLine();

        }

        System.out.print("Mietit hetken äsken näkemääsi diakalvosarjaa. Varsinkin "
                + "viimeinen kalvo herättää pohdintaa. Mikä täällä oikeastaan meni "
                + "pieleen...?\n\n");

        System.out.print("Huomaat kartan pöydän alla ja otat sen mukaasi.");
        
    }
    
    

    public boolean isKayttajatunnusJaSalasanaSyotetty() {
        return kayttajatunnusJaSalasanaSyotetty;
    }

    public void setKayttajatunnusJaSalasanaSyotetty(boolean kayttajatunnusJaSalasanaSyotetty) {
        this.kayttajatunnusJaSalasanaSyotetty = kayttajatunnusJaSalasanaSyotetty;
    }

    public boolean isKalvotLuettu() {
        return kalvotLuettu;
    }

    public void setKalvotLuettu(boolean kalvotLuettu) {
        this.kalvotLuettu = kalvotLuettu;
    }

    public boolean isKarttaOtettu() {
        return karttaOtettu;
    }

    public void setKarttaOtettu(boolean karttaOtettu) {
        this.karttaOtettu = karttaOtettu;
    }

    public boolean isMuistikorttiLiitetty() {
        return muistikorttiLiitetty;
    }

    public void setMuistikorttiLiitetty(boolean muistikorttiLiitetty) {
        this.muistikorttiLiitetty = muistikorttiLiitetty;
    }

}
