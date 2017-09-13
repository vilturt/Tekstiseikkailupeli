
public class AloitusHuone implements Huone {

    private boolean katsottuLED = false;
    private boolean painettuPainiketta = false;

    public String huoneenKuvaus() {

        return "On pime‰‰. Sein‰ss‰ vilkkuu punainen LED-valo. Et n‰‰ juuri mit‰‰n muuta.";

    }

    public void katsoLEDvaloa() {

        System.out.println("LED-valon alla n‰kyy painike.");

    }

    public void katsoPainiketta() {

        System.out.println("Tavanomainen painike.");

    }

    public void painaPainiketta() {

        System.out.println("Painoit painiketta. Ovi k‰yt‰v‰‰n aukeaa.");

    }

    public boolean isKatsottuLED() {
        return katsottuLED;
    }

    public void setKatsottuLED(boolean katsottuLED) {
        this.katsottuLED = katsottuLED;
    }

    public boolean isPainettuPainiketta() {
        return painettuPainiketta;
    }

    public void setPainettuPainiketta(boolean painettuPainiketta) {
        this.painettuPainiketta = painettuPainiketta;
    }

}
