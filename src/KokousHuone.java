
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class KokousHuone implements Huone {

    // tarkistaa onko tunnukset sy�tetty oikein
    private boolean kayttajatunnusJaSalasanaSyotetty = false;

    // onko muistitikku kiinnitetty koneeseen
    private boolean muistikorttiLiitetty = false;
    
    // tarkistaa onko kalvot luettu (ainakin kerran)
    private boolean kalvotLuettu = false;
    
    // onko kartta otettu (otetaan automaattisesti, kun kalvot katsottu
    
   private boolean karttaOtettu = false;

    public String huoneenKuvaus() {

        return "Astelet sis��n kokoushuoneeseen. Taululla n�kyy merkint�j� ja muistiinpanoja. Huoneen etuosassa "
                + "on p�yt�, jolla on tietokone. Koneeseen on viritetty kiinni videotykki.";
    }

    public void katsoTaululle() {

        System.out.print("K�ytt�j�tunnus: 'w0rk1ng' \n Salasana: 'p4ssw0rd'");

    }

    public void katsoPoytaa() {

        System.out.print("Huoneen etuosassa on leve� p�yt�. P�yd�ll� on lev�ll��n papereita ja muuta toimistotarviketta sek�"
                + "tietokone.");

    }

    public void katsoTietokonetta() {

        System.out.print("N�ytt� on pime�n�.");

    }

    public void avaaTietokone() {

        System.out.print("Painat tietokoneen kytkimest� p��lle. Tietokone pyyt�� k�ytt�j�tunnusta ja salasanaa.");

    }
    
    

// tietokone tulostaa teksti�
    public void tulostaKalvoja() {

        int kalvoNumero = 0;

        String[] ppKalvoja = new String[5];

        // merkkijonomuuttujia, jotka esitt�v�t powerpoint-slaideja, taulukko
        // eka slaidi
        ppKalvoja[0] = "Operaatio Toinen Maa\n\n";

        ppKalvoja[1] = "Tervetuloa paikan p��lle. Kertaamme teht�v�n p��osittain."
                + "L�hdimme matkaan kohti mahdollista uutta Maapallon kaltaista planeettaa, "
                + "jolle siirtokunta perustetaan, kun teht�v�mme onnistuu. Alustavat "
                + "tutkimukset ovat ilmaisseet, ett� planeetta, jota kohti matkaamme, "
                + "on asuttamiskelpoinen.\n\n";

        ppKalvoja[2] = "Teht�v�mme on perustaa ensimm�inen laskeutumisalusta tulevien "
                + "siirtyjien teht�vien helpottamiseksi. Olemme ensimm�inen ryhm�, joka "
                + "l�hetet��n Yhteiskunnan toimesta kohti t�t� uutta planeettaa. "
                + "Lopullinen tavoitteemme on pysty� el�m��n uudella planeetalla.";

        ppKalvoja[3] = "Operaation toteuttamiseksi olemme varanneet alukseen ammattitaitoisia "
                + "teknikoita ja insin��rej�, sotilaita sek� muuta henkil�kuntaa, jotka "
                + "pit�v�t huolen siit�, ett� saavutamme tavoitteemme.";

        ppKalvoja[4] = "Uskokaa t�m� - emme tule ep�onnistumaan!";

        while (kalvoNumero < 5) {

            System.out.print(ppKalvoja[kalvoNumero]);

            kalvoNumero++;

            Scanner s = new Scanner(System.in);

            System.out.println("Seuraava kalvo (paina Enter)");

            s.nextLine();

        }

        System.out.print("Mietit hetken �sken n�kem��si diakalvosarjaa. Varsinkin "
                + "viimeinen kalvo her�tt�� pohdintaa. Mik� t��ll� oikeastaan meni "
                + "pieleen...?\n\n");

        System.out.print("Huomaat kartan p�yd�n alla ja otat sen mukaasi.");
        
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
