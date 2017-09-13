
public class Komero implements Huone {

    private boolean onkoPakkiAvattu = false;
    private boolean onkoRuuvariOtettu = false;
    private boolean onkoTikkuOtettu = false;
    private boolean onkoHenkKorttiOtettu = false;
    private boolean voidaankoSiirtyaKaytavaan = false;
    
    
    public String huoneenKuvaus() {

        return "Olet jokseenkin ahtaassa komerossa. Seinällä on naulakko, jossa roikkuu "
                + "takki. Pienellä pöydällä on useita esineitä.";

    }

    public void katsoPoytaa() {

        System.out.println("Pöytä on hieman sotkuinen. Sen päällä on paljon rojua.");
        System.out.println("Tutkittuasi huolellisesti pöydällä lojuvia tavaroita, silmiisi osuu jonkinlainen työkalupakki.");

    }

    // metodit pakin tutkimiseen
    public void katsoPakkia() {

        System.out.println("Pakki on ison kokoinen. Mitäköhän sen sisällä on?");

    }

    public void avaaPakki() {

        System.out.println("Napsautat työkalupakin yksinkertaisen lukitusmekanismin auki ja katsot sen sisään.");
        System.out.println("Löydät läjän nauloja, ruuvimeisselin ja muttereita.");

    }

    public void otaRuuvari() {
        System.out.println("Päätät ottaa ruuvimeisselin. Saatat tarvita sitä myöhemmin.");
    }

    public void katsoRuuvaria() {
        System.out.println("Tavanomainen ruuvimeisseli.");
    }

    public void otaRuuvit() {
        System.out.println("Et tarvitse ruuveja...");
    }

    public void otaMutterit() {
        System.out.println("Et tarvitse muttereita...");
    }

    // metodeja takin tutkimiseen...
    public void katsoTakkia() {
        System.out.println("Takki on paksuhko ja siinä on useita taskuja. Tutkit takkia ja löydät henkilökortin sekä muistitikun.");

    }

    public void otaHenkKortti() {

        System.out.println("Otat henkilökortin takin taskusta.");

    }

// voidaan katsoa henkilökorttia, kun se on otettu takin taskusta
    public void katsoHenkKorttia() {
        System.out.println("Henkilökortissa on kuva. Et muista vieläkään, miten olet päätynyt tähän alukseen, mutta"
                + "pystyt selvästi tunnistamaan valokuvasta itsesi. Valokuvan alla lukee teksti: Johtava Teknikko. Aika "
                + "mielenkiintoista...? Huomaat myös, että tällä kortilla pääset kulkemaan käytävässä olevasta isommasta ovesta.");
    }

    // takin tutkimiseen metodeja
    public void otaMuistitikkku() {
        System.out.println("Otat pienehkön yleisliitäntäisen muistitikun haltuusi.");
    }

    public void katsoMuistitikkua() {
        System.out.println("Tähän yleisliitännäiseen muistitikkuun mahtuu reilusti dataa. Jos löytäisit tietokoneen, voisit katsoa,"
                + " mitä tiedostoja ja tietoa tikulta löytyy.");
    }

    // luokan aksessorit
    public boolean isOnkoPakkiAvattu() {
        return onkoPakkiAvattu;
    }

    public void setOnkoPakkiAvattu(boolean onkoPakkiAvattu) {
        this.onkoPakkiAvattu = onkoPakkiAvattu;
    }

    public boolean isOnkoRuuvariOtettu() {
        return onkoRuuvariOtettu;
    }

    public void setOnkoRuuvariOtettu(boolean onkoRuuvariOtettu) {
        this.onkoRuuvariOtettu = onkoRuuvariOtettu;
    }

    public boolean isOnkoTikkuOtettu() {
        return onkoTikkuOtettu;
    }

    public void setOnkoTikkuOtettu(boolean onkoTikkuOtettu) {
        this.onkoTikkuOtettu = onkoTikkuOtettu;
    }

    public boolean isOnkoHenkKorttiOtettu() {
        return onkoHenkKorttiOtettu;
    }

    public void setOnkoHenkKorttiOtettu(boolean onkoHenkKorttiOtettu) {
        this.onkoHenkKorttiOtettu = onkoHenkKorttiOtettu;
    }

    public boolean isVoidaankoSiirtyaKaytavaan() {
        return voidaankoSiirtyaKaytavaan;
    }

    public void setVoidaankoSiirtyaKaytavaan(boolean voidaankoSiirtyaKaytavaan) {
        this.voidaankoSiirtyaKaytavaan = voidaankoSiirtyaKaytavaan;
    }

    
    
}
