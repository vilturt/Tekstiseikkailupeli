
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// Scanner-muuttuja aloitushuoneen komentoja varten
        Scanner lukija = new Scanner(System.in /*,  "Cp850" */);

// Scanner-muuttuja käytävän komentoja varten
        Scanner kaytavanLukija = new Scanner(System.in /*,"Cp850"*/);

// komennot omasta luokastaan
        TulostaKomennot pelinKomennot = new TulostaKomennot();

        System.out.print("Hylky \n\n");

        // Johdanto peliin, kirjoitetaan lyhyt tarina pelin alkuun
        System.out.print("Eletään aikaa, jolloin oma kallis kotimme Maa on tullut \n"
                + "lähestulkoon asumiskelvottomaksi. Ihmiskunta etsii uutta kotia. Se \n"
                + "etsii planeettaa, jolla asua ja elää sekä jatkaa perintöään. \n\n"
                + "Keskellä tätä kaikkea on päähenkilömme. Hän on syvällä tässä \n"
                + "maailmassa muistinsa menettäneenä. Tehtäväsi on yksinkertainen - \n"
                + "selviydy! \n \n");

        AloitusHuone alku = new AloitusHuone();

        System.out.print(alku.huoneenKuvaus());

        System.out.println();

        while (true) {

            System.out.println("Mitä teet seuraavaksi? (Kirjoita komento) (komennot - listaa komentoja) ");
            String komento = lukija.nextLine();

            if ("komennot".equals(komento)) {

                pelinKomennot.tulostaKaikkiKomennot();

            } else if ("katso ympärille".equals(komento)) {

                System.out.println(alku.huoneenKuvaus());

            } else if (("katso LED-valoa".equals(komento)) || ("katso LED valoa".equals(komento)) || ("katso valoa".equals(komento))) {

                alku.katsoLEDvaloa();
                alku.setKatsottuLED(true);

            } else if (("paina painiketta".equals(komento)) && (alku.isKatsottuLED())) {

                alku.painaPainiketta();
                alku.setPainettuPainiketta(true);

            } else if (("siirry käytävään".equals(komento)) && (alku.isKatsottuLED()) && (alku.isPainettuPainiketta())) {

                System.out.println("Olet nyt käyttävässä.");

                Kaytava jatkuuKaytavaan = new Kaytava();
                System.out.println(jatkuuKaytavaan.huoneenKuvaus());

                // käytävä alkaa
                while (true) {

                    System.out.println("Mitä teet seuraavaksi? (Kirjoita komento) ");
                    String komentoKayt = kaytavanLukija.nextLine();

                    if ("komennot".equals(komentoKayt)) {

                        pelinKomennot.tulostaKaikkiKomennot();

                    } else if ("katso ympärille".equals(komentoKayt)) {

                        System.out.print(jatkuuKaytavaan.huoneenKuvaus());

                    } else if ((("katso miestä".equals(komentoKayt)) || ("katso ruumista".equals(komentoKayt))) && (jatkuuKaytavaan.isPuhuttuMiehelle() == false)) {

                        jatkuuKaytavaan.katsoMiesta();

                    } else if ((("puhu miehelle".equals(komentoKayt)) && (jatkuuKaytavaan.isPuhuttuMiehelle() == false))) {

                        jatkuuKaytavaan.puhuMiehelle();
                        jatkuuKaytavaan.setPuhuttuMiehelle(true);

                    } else if (("katso miestä".equals(komentoKayt)) && (jatkuuKaytavaan.isPuhuttuMiehelle() == true)) {

                        jatkuuKaytavaan.tutkiMiehenTaskut();
                        jatkuuKaytavaan.setTaskutTutkittu(true);
                    } else if (("katso avainkorttia".equals(komentoKayt)) && (jatkuuKaytavaan.isTaskutTutkittu() == true) && (jatkuuKaytavaan.isAvainkorttiaKatsottu() == false)) {

                        jatkuuKaytavaan.katsoAvainkorttia();
                        jatkuuKaytavaan.setAvainkorttiaKatsottu(true);

                    } else if ((("käytä avainkorttia".equals(komentoKayt)) || ("avaa kaappi".equals(komentoKayt)) || ("avaa ovi".equals(komentoKayt))) && (jatkuuKaytavaan.isAvainkorttiaKatsottu() == true)) {
                        System.out.println("Kaapin ovi aukeaa käytettyäsi siihen äsken löytämääsi avainkorttia. Astut ovesta sisään.");

                        Komero komerossa = new Komero();

                        System.out.println(komerossa.huoneenKuvaus());

                        while (true) {

                            System.out.println("Mitä teet seuraavaksi? (Kirjoita komento) ");

                            // käytetään ensimmäistä luotua Scannerin ilmentymää uuden sijaan (Scanner lukija)
                            String komentoKomero = lukija.nextLine();
                            if ("komennot".equals(komentoKomero)) {

                                pelinKomennot.tulostaKaikkiKomennot();

                            } else if ("katso ympärille".equals(komentoKomero)) {

                                System.out.println(komerossa.huoneenKuvaus());

                            } else if (("katso pöytää".equals(komentoKomero)) || ("katso pöytä".equals(komentoKomero))) {

                                komerossa.katsoPoytaa();
                            } else if (("katso pakkia".equals(komentoKomero)) || ("katso työkalupakkia".equals(komentoKomero))) {

                                komerossa.katsoPakkia();

                            } else if ((("avaa pakki".equals(komentoKomero)) || ("avaa työkalupakki".equals(komentoKomero))) && (komerossa.isOnkoPakkiAvattu() == false)) {

                                komerossa.avaaPakki();
                                komerossa.setOnkoPakkiAvattu(true);

                            } else if ((("avaa pakki".equals(komentoKomero)) || ("avaa työkalupakki".equals(komentoKomero))) && (komerossa.isOnkoPakkiAvattu() == true)) {

                                System.out.println("Olet jo avannut työkalupakin.");

                            } else if ((("ota ruuvari".equals(komentoKomero)) || ("ota ruuvimeisseli".equals(komentoKomero)) || ("ota meisseli".equals(komentoKomero))) && (komerossa.isOnkoPakkiAvattu() == false)) {

                                System.out.println("Avaa pakki ensin...");
                            } else if ((("ota ruuvari".equals(komentoKomero)) || ("ota ruuvimeisseli".equals(komentoKomero)) || ("ota meisseli".equals(komentoKomero))) && (komerossa.isOnkoPakkiAvattu() == true)) {

                                komerossa.otaRuuvari();
                                komerossa.setOnkoRuuvariOtettu(true);
                            } else if ((("katso ruuvaria".equals(komentoKomero)) || ("katso ruuvimeisseliä".equals(komentoKomero))) && (komerossa.isOnkoRuuvariOtettu() == true)) {

                                komerossa.katsoRuuvaria();

                            } else if ((("katso ruuvaria".equals(komentoKomero)) || ("katso ruuvimeisseliä".equals(komentoKomero))) && (komerossa.isOnkoRuuvariOtettu() == false)) {
                                System.out.println("Ota ruuvimeisseli haltuun, niin voit katsoa sitä tarkemmin.");

                            } else if (("ota ruuvit".equals(komentoKomero)) || ("ota ruuveja".equals(komentoKomero))) {

                                komerossa.otaRuuvit();

                                // ruuveja ei voi ottaa, ei tarvita jatkossa
                            } else if (("ota mutterit".equals(komentoKomero)) || ("ota muttereita".equals(komentoKomero))) {

                                komerossa.otaMutterit();

                                // muttereita ei voi ottaa, ei tarvita jatkossa
                            } else if (("katso takkia".equals(komentoKomero)) || ("tutki takkia".equals(komentoKomero)) || ("tutki takki".equals(komentoKomero))) {
                                komerossa.katsoTakkia();
                            } else if (("ota henkilökortti".equals(komentoKomero)) || ("ota kortti".equals(komentoKomero))) {

                                komerossa.otaHenkKortti();
                                komerossa.setOnkoHenkKorttiOtettu(true);

                            } else if ((("katso henkilökorttia".equals(komentoKomero)) || ("katso korttia".equals(komentoKomero))) && (komerossa.isOnkoHenkKorttiOtettu() == false)) {

                                System.out.println("Et pysty katsomaan henkilökorttia ennenkuin otat sen haltuusi.");

                            } else if ((("katso henkilökorttia".equals(komentoKomero)) || ("katso korttia".equals(komentoKomero))) && (komerossa.isOnkoHenkKorttiOtettu() == true)) {

                                komerossa.katsoHenkKorttia();

                            } else if ((("ota muistitikku".equals(komentoKomero)) || ("ota tikku".equals(komentoKomero))) && (komerossa.isOnkoTikkuOtettu() == true)) {
                                System.out.println("Olet jo ottanut muistitikun.");
                            } else if ((("ota muistitikku".equals(komentoKomero)) || ("ota tikku".equals(komentoKomero))) && (komerossa.isOnkoTikkuOtettu() == false)) {
                                komerossa.otaMuistitikkku();
                                komerossa.setOnkoTikkuOtettu(true);
                            } else if ((("katso muistitikkua".equals(komentoKomero)) || ("katso tikkua".equals(komentoKomero))) && (komerossa.isOnkoTikkuOtettu() == false)) {

                                System.out.println("Ota muistitikku haltuun ensin.");

                            } else if ((("katso muistitikkua".equals(komentoKomero)) || ("katso tikkua".equals(komentoKomero))) && (komerossa.isOnkoTikkuOtettu() == true)) {

                                komerossa.katsoMuistitikkua();

                            } /*
                          else if ((komerossa.isOnkoHenkKorttiOtettu() == true)&&(komerossa.isOnkoRuuvariOtettu() == true) && (komerossa.isOnkoTikkuOtettu() == true)) {
                              
                              // voidaan siirtyä eteenpäin
                              
                              komerossa.setVoidaankoSiirtyaKaytavaan(true);
                              
                              System.out.println("Eteenpäin...");
                              
                          }
                             */ else if ((("siirry käytävään".equals(komentoKomero)) || ("siirry käytävälle".equals(komentoKomero)) || ("siirry ovesta".equals(komentoKomero))) && ((komerossa.isOnkoHenkKorttiOtettu() == false) || (komerossa.isOnkoRuuvariOtettu() == false) || (komerossa.isOnkoTikkuOtettu() == false))) {

                                System.out.println("Et ole vielä valmis poistumaan takaisin käytävälle.");

                            } else if ((("siirry käytävään".equals(komentoKomero)) || ("siirry käytävälle".equals(komentoKomero)) || ("siirry ovesta".equals(komentoKomero))) && ((komerossa.isOnkoHenkKorttiOtettu() == true) && (komerossa.isOnkoRuuvariOtettu() == true) && (komerossa.isOnkoTikkuOtettu() == true))) {
                                // kaikki katsottu komerossa, voidaan siirtyä takaisin käytävään

                                System.out.println("Päätät siirtyä takaisin käytävälle, koska olet tutkinut komeron kauttaaltaan.");

                                // Ollaan takaisin käytävällä. Ei toiminnallisuutta pelissä. Avataan vain ovi ja siirrytään eteenpäin.
                                System.out.println("Olet käytävässä taas. Edessäsi on isohko ovi. Asetat henkilökortin viivakoodin oven lukijaan. Ovi aukeaa ja astut syvemmälle alukseen.");

                                ToinenKaytava toiseenKaytavaan = new ToinenKaytava();
                                System.out.println(toiseenKaytavaan.huoneenKuvaus());

                                while (true) {

                                    System.out.println("Mitä teet seuraavaksi? (Kirjoita komento) ");

                                    String komentoToinenKayt = lukija.nextLine();
                                    if ("komennot".equals(komentoToinenKayt)) {

                                        pelinKomennot.tulostaKaikkiKomennot();

                                    } else if ("katso ympärille".equals(komentoToinenKayt)) {

                                        toiseenKaytavaan.huoneenKuvaus();

                                    } else if ("katso ovea".equals(komentoToinenKayt)) {

                                        System.out.println("Yksi ovi on edessäsi lukittuna ja toinen on lukitsemattomana vasemmalla.");

                                    } else if ("katso ovea vasemmalla".equals(komentoToinenKayt)) {
                                        toiseenKaytavaan.katsoOvea();
                                    } else if (("katso ovea edessä".equals(komentoToinenKayt)) || ("katso lukittua ovea".equals(komentoToinenKayt))) {
                                        toiseenKaytavaan.katsoLukittuaOvea();
                                    } else if ("siirry kokoushuoneeseen".equals(komentoToinenKayt)) {
                                        toiseenKaytavaan.siirryKokoushuoneeseen();

                                        // KOKOUSHUONEESSA
                                        KokousHuone kok = new KokousHuone();
                                        System.out.println(kok.huoneenKuvaus());

                                        while (true) {

                                            System.out.println("Mitä teet seuraavaksi? (Kirjoita komento) ");

                                            String kokKomento = lukija.nextLine();

                                            if ("komennot".equals(kokKomento)) {

                                                pelinKomennot.tulostaKaikkiKomennot();

                                            } else if ("katso ympärille".equals(kokKomento)) {

                                                kok.huoneenKuvaus();

                                            } else if (("katso taulua".equals(kokKomento)) || ("katso taululle".equals(kokKomento))) {

                                                kok.katsoTaululle();

                                            } else if ("katso tietokonetta".equals(kokKomento)) {

                                                kok.katsoTietokonetta();

                                            } else if ("käytä muistitikkua".equals(kokKomento)) {

                                                System.out.print("Työnnät muistitikun paikoilleen.");
                                                kok.setMuistikorttiLiitetty(true);

                                            } else if (("avaa tietokone".equals(kokKomento)) && (!(kok.isMuistikorttiLiitetty()))) {

                                                System.out.print("Syötä ensin muistitikku!");

                                            } else if (("avaa tietokone".equals(kokKomento)) && kok.isMuistikorttiLiitetty()) {

                                                kok.avaaTietokone();

                                                String kayttaja = null;
                                                String salasana = null;

                                                while (!("w0rk1ng".equals(kayttaja)) && (!("p4ssw0rd".equals(salasana)))) {

                                                    System.out.println("Käyttäjätunnus: ");
                                                    kayttaja = lukija.nextLine();

                                                    System.out.println("Salasana: ");
                                                    salasana = lukija.nextLine();

                                                    if (("w0rk1ng".equals(kayttaja)) && ("p4ssw0rd".equals(salasana))) {

                                                        System.out.println("Kirjaudutaan sisään...");

                                                        kok.setKayttajatunnusJaSalasanaSyotetty(true);

                                                        // tulostetaan kalvot ja pelaaja lukee niitä
                                                        kok.tulostaKalvoja();
                                                        // kalvot luettu ainakin kerran
                                                        kok.setKalvotLuettu(true);

                                                    } else {

                                                        System.out.println("Väärä tunnus tai salasana!!");
                                                        System.out.println("Kirjautuminen epäonnistui...");

                                                    }

                                                }

                                            }
                                            
                                            else if (kok.isKalvotLuettu() && ("katso karttaa".equals(kokKomento))){
                                                
                                                EkanKerroksenKartta ekaKartta = new EkanKerroksenKartta();
                                                
                                                ekaKartta.katsoKarttaa();
                                                
                                            }
                                            
                                            else if ("lopeta".equals(komentoToinenKayt)) {
                                                System.exit(0);
                                            } else {
                                                System.out.println("Epämääräinen komento. Kokeile uudestaan.");
                                            }

                                        }
                                    } else if ("lopeta".equals(komentoToinenKayt)) {
                                        System.exit(0);
                                    } else {
                                        System.out.println("Epämääräinen komento. Kokeile uudestaan.");
                                    }
                                }
                            } else if ("lopeta".equals(komentoKomero)) {
                                System.exit(0);
                            } else {
                                System.out.println("Epämääräinen komento. Kokeile uudestaan.");
                            }
                        }

                    } else if ("lopeta".equals(komentoKayt)) {
                        System.exit(0);
                    } else {
                        System.out.println("Epämääräinen komento. Kokeile uudestaan.");
                    }
                }

            } else if ("lopeta".equals(komento)) {
                break;
            } else {
                System.out.println("Epämääräinen komento. Kokeile uudestaan.");
            }

        }

    }

}
