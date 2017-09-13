
public class Komero implements Huone {

    private boolean onkoPakkiAvattu = false;
    private boolean onkoRuuvariOtettu = false;
    private boolean onkoTikkuOtettu = false;
    private boolean onkoHenkKorttiOtettu = false;
    private boolean voidaankoSiirtyaKaytavaan = false;
    
    
    public String huoneenKuvaus() {

        return "Olet jokseenkin ahtaassa komerossa. Sein�ll� on naulakko, jossa roikkuu "
                + "takki. Pienell� p�yd�ll� on useita esineit�.";

    }

    public void katsoPoytaa() {

        System.out.println("P�yt� on hieman sotkuinen. Sen p��ll� on paljon rojua.");
        System.out.println("Tutkittuasi huolellisesti p�yd�ll� lojuvia tavaroita, silmiisi osuu jonkinlainen ty�kalupakki.");

    }

    // metodit pakin tutkimiseen
    public void katsoPakkia() {

        System.out.println("Pakki on ison kokoinen. Mit�k�h�n sen sis�ll� on?");

    }

    public void avaaPakki() {

        System.out.println("Napsautat ty�kalupakin yksinkertaisen lukitusmekanismin auki ja katsot sen sis��n.");
        System.out.println("L�yd�t l�j�n nauloja, ruuvimeisselin ja muttereita.");

    }

    public void otaRuuvari() {
        System.out.println("P��t�t ottaa ruuvimeisselin. Saatat tarvita sit� my�hemmin.");
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
        System.out.println("Takki on paksuhko ja siin� on useita taskuja. Tutkit takkia ja l�yd�t henkil�kortin sek� muistitikun.");

    }

    public void otaHenkKortti() {

        System.out.println("Otat henkil�kortin takin taskusta.");

    }

// voidaan katsoa henkil�korttia, kun se on otettu takin taskusta
    public void katsoHenkKorttia() {
        System.out.println("Henkil�kortissa on kuva. Et muista viel�k��n, miten olet p��tynyt t�h�n alukseen, mutta"
                + "pystyt selv�sti tunnistamaan valokuvasta itsesi. Valokuvan alla lukee teksti: Johtava Teknikko. Aika "
                + "mielenkiintoista...? Huomaat my�s, ett� t�ll� kortilla p��set kulkemaan k�yt�v�ss� olevasta isommasta ovesta.");
    }

    // takin tutkimiseen metodeja
    public void otaMuistitikkku() {
        System.out.println("Otat pienehk�n yleisliit�nt�isen muistitikun haltuusi.");
    }

    public void katsoMuistitikkua() {
        System.out.println("T�h�n yleisliit�nn�iseen muistitikkuun mahtuu reilusti dataa. Jos l�yt�isit tietokoneen, voisit katsoa,"
                + " mit� tiedostoja ja tietoa tikulta l�ytyy.");
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
