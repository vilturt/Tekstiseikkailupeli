
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// Scanner-muuttuja aloitushuoneen komentoja varten
        Scanner lukija = new Scanner(System.in /*,  "Cp850" */);

// Scanner-muuttuja k�yt�v�n komentoja varten
        Scanner kaytavanLukija = new Scanner(System.in /*,"Cp850"*/);

// komennot omasta luokastaan
        TulostaKomennot pelinKomennot = new TulostaKomennot();

        System.out.print("Hylky \n\n");

        // Johdanto peliin, kirjoitetaan lyhyt tarina pelin alkuun
        System.out.print("Elet��n aikaa, jolloin oma kallis kotimme Maa on tullut \n"
                + "l�hestulkoon asumiskelvottomaksi. Ihmiskunta etsii uutta kotia. Se \n"
                + "etsii planeettaa, jolla asua ja el�� sek� jatkaa perint���n. \n\n"
                + "Keskell� t�t� kaikkea on p��henkil�mme. H�n on syv�ll� t�ss� \n"
                + "maailmassa muistinsa menett�neen�. Teht�v�si on yksinkertainen - \n"
                + "selviydy! \n \n");

        AloitusHuone alku = new AloitusHuone();

        System.out.print(alku.huoneenKuvaus());

        System.out.println();

        while (true) {

            System.out.println("Mit� teet seuraavaksi? (Kirjoita komento) (komennot - listaa komentoja) ");
            String komento = lukija.nextLine();

            if ("komennot".equals(komento)) {

                pelinKomennot.tulostaKaikkiKomennot();

            } else if ("katso ymp�rille".equals(komento)) {

                System.out.println(alku.huoneenKuvaus());

            } else if (("katso LED-valoa".equals(komento)) || ("katso LED valoa".equals(komento)) || ("katso valoa".equals(komento))) {

                alku.katsoLEDvaloa();
                alku.setKatsottuLED(true);

            } else if (("paina painiketta".equals(komento)) && (alku.isKatsottuLED())) {

                alku.painaPainiketta();
                alku.setPainettuPainiketta(true);

            } else if (("siirry k�yt�v��n".equals(komento)) && (alku.isKatsottuLED()) && (alku.isPainettuPainiketta())) {

                System.out.println("Olet nyt k�ytt�v�ss�.");

                Kaytava jatkuuKaytavaan = new Kaytava();
                System.out.println(jatkuuKaytavaan.huoneenKuvaus());

                // k�yt�v� alkaa
                while (true) {

                    System.out.println("Mit� teet seuraavaksi? (Kirjoita komento) ");
                    String komentoKayt = kaytavanLukija.nextLine();

                    if ("komennot".equals(komentoKayt)) {

                        pelinKomennot.tulostaKaikkiKomennot();

                    } else if ("katso ymp�rille".equals(komentoKayt)) {

                        System.out.print(jatkuuKaytavaan.huoneenKuvaus());

                    } else if ((("katso miest�".equals(komentoKayt)) || ("katso ruumista".equals(komentoKayt))) && (jatkuuKaytavaan.isPuhuttuMiehelle() == false)) {

                        jatkuuKaytavaan.katsoMiesta();

                    } else if ((("puhu miehelle".equals(komentoKayt)) && (jatkuuKaytavaan.isPuhuttuMiehelle() == false))) {

                        jatkuuKaytavaan.puhuMiehelle();
                        jatkuuKaytavaan.setPuhuttuMiehelle(true);

                    } else if (("katso miest�".equals(komentoKayt)) && (jatkuuKaytavaan.isPuhuttuMiehelle() == true)) {

                        jatkuuKaytavaan.tutkiMiehenTaskut();
                        jatkuuKaytavaan.setTaskutTutkittu(true);
                    } else if (("katso avainkorttia".equals(komentoKayt)) && (jatkuuKaytavaan.isTaskutTutkittu() == true) && (jatkuuKaytavaan.isAvainkorttiaKatsottu() == false)) {

                        jatkuuKaytavaan.katsoAvainkorttia();
                        jatkuuKaytavaan.setAvainkorttiaKatsottu(true);

                    } else if ((("k�yt� avainkorttia".equals(komentoKayt)) || ("avaa kaappi".equals(komentoKayt)) || ("avaa ovi".equals(komentoKayt))) && (jatkuuKaytavaan.isAvainkorttiaKatsottu() == true)) {
                        System.out.println("Kaapin ovi aukeaa k�ytetty�si siihen �sken l�yt�m��si avainkorttia. Astut ovesta sis��n.");

                        Komero komerossa = new Komero();

                        System.out.println(komerossa.huoneenKuvaus());

                        while (true) {

                            System.out.println("Mit� teet seuraavaksi? (Kirjoita komento) ");

                            // k�ytet��n ensimm�ist� luotua Scannerin ilmentym�� uuden sijaan (Scanner lukija)
                            String komentoKomero = lukija.nextLine();
                            if ("komennot".equals(komentoKomero)) {

                                pelinKomennot.tulostaKaikkiKomennot();

                            } else if ("katso ymp�rille".equals(komentoKomero)) {

                                System.out.println(komerossa.huoneenKuvaus());

                            } else if (("katso p�yt��".equals(komentoKomero)) || ("katso p�yt�".equals(komentoKomero))) {

                                komerossa.katsoPoytaa();
                            } else if (("katso pakkia".equals(komentoKomero)) || ("katso ty�kalupakkia".equals(komentoKomero))) {

                                komerossa.katsoPakkia();

                            } else if ((("avaa pakki".equals(komentoKomero)) || ("avaa ty�kalupakki".equals(komentoKomero))) && (komerossa.isOnkoPakkiAvattu() == false)) {

                                komerossa.avaaPakki();
                                komerossa.setOnkoPakkiAvattu(true);

                            } else if ((("avaa pakki".equals(komentoKomero)) || ("avaa ty�kalupakki".equals(komentoKomero))) && (komerossa.isOnkoPakkiAvattu() == true)) {

                                System.out.println("Olet jo avannut ty�kalupakin.");

                            } else if ((("ota ruuvari".equals(komentoKomero)) || ("ota ruuvimeisseli".equals(komentoKomero)) || ("ota meisseli".equals(komentoKomero))) && (komerossa.isOnkoPakkiAvattu() == false)) {

                                System.out.println("Avaa pakki ensin...");
                            } else if ((("ota ruuvari".equals(komentoKomero)) || ("ota ruuvimeisseli".equals(komentoKomero)) || ("ota meisseli".equals(komentoKomero))) && (komerossa.isOnkoPakkiAvattu() == true)) {

                                komerossa.otaRuuvari();
                                komerossa.setOnkoRuuvariOtettu(true);
                            } else if ((("katso ruuvaria".equals(komentoKomero)) || ("katso ruuvimeisseli�".equals(komentoKomero))) && (komerossa.isOnkoRuuvariOtettu() == true)) {

                                komerossa.katsoRuuvaria();

                            } else if ((("katso ruuvaria".equals(komentoKomero)) || ("katso ruuvimeisseli�".equals(komentoKomero))) && (komerossa.isOnkoRuuvariOtettu() == false)) {
                                System.out.println("Ota ruuvimeisseli haltuun, niin voit katsoa sit� tarkemmin.");

                            } else if (("ota ruuvit".equals(komentoKomero)) || ("ota ruuveja".equals(komentoKomero))) {

                                komerossa.otaRuuvit();

                                // ruuveja ei voi ottaa, ei tarvita jatkossa
                            } else if (("ota mutterit".equals(komentoKomero)) || ("ota muttereita".equals(komentoKomero))) {

                                komerossa.otaMutterit();

                                // muttereita ei voi ottaa, ei tarvita jatkossa
                            } else if (("katso takkia".equals(komentoKomero)) || ("tutki takkia".equals(komentoKomero)) || ("tutki takki".equals(komentoKomero))) {
                                komerossa.katsoTakkia();
                            } else if (("ota henkil�kortti".equals(komentoKomero)) || ("ota kortti".equals(komentoKomero))) {

                                komerossa.otaHenkKortti();
                                komerossa.setOnkoHenkKorttiOtettu(true);

                            } else if ((("katso henkil�korttia".equals(komentoKomero)) || ("katso korttia".equals(komentoKomero))) && (komerossa.isOnkoHenkKorttiOtettu() == false)) {

                                System.out.println("Et pysty katsomaan henkil�korttia ennenkuin otat sen haltuusi.");

                            } else if ((("katso henkil�korttia".equals(komentoKomero)) || ("katso korttia".equals(komentoKomero))) && (komerossa.isOnkoHenkKorttiOtettu() == true)) {

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
                              
                              // voidaan siirty� eteenp�in
                              
                              komerossa.setVoidaankoSiirtyaKaytavaan(true);
                              
                              System.out.println("Eteenp�in...");
                              
                          }
                             */ else if ((("siirry k�yt�v��n".equals(komentoKomero)) || ("siirry k�yt�v�lle".equals(komentoKomero)) || ("siirry ovesta".equals(komentoKomero))) && ((komerossa.isOnkoHenkKorttiOtettu() == false) || (komerossa.isOnkoRuuvariOtettu() == false) || (komerossa.isOnkoTikkuOtettu() == false))) {

                                System.out.println("Et ole viel� valmis poistumaan takaisin k�yt�v�lle.");

                            } else if ((("siirry k�yt�v��n".equals(komentoKomero)) || ("siirry k�yt�v�lle".equals(komentoKomero)) || ("siirry ovesta".equals(komentoKomero))) && ((komerossa.isOnkoHenkKorttiOtettu() == true) && (komerossa.isOnkoRuuvariOtettu() == true) && (komerossa.isOnkoTikkuOtettu() == true))) {
                                // kaikki katsottu komerossa, voidaan siirty� takaisin k�yt�v��n

                                System.out.println("P��t�t siirty� takaisin k�yt�v�lle, koska olet tutkinut komeron kauttaaltaan.");

                                // Ollaan takaisin k�yt�v�ll�. Ei toiminnallisuutta peliss�. Avataan vain ovi ja siirryt��n eteenp�in.
                                System.out.println("Olet k�yt�v�ss� taas. Edess�si on isohko ovi. Asetat henkil�kortin viivakoodin oven lukijaan. Ovi aukeaa ja astut syvemm�lle alukseen.");

                                ToinenKaytava toiseenKaytavaan = new ToinenKaytava();
                                System.out.println(toiseenKaytavaan.huoneenKuvaus());

                                while (true) {

                                    System.out.println("Mit� teet seuraavaksi? (Kirjoita komento) ");

                                    String komentoToinenKayt = lukija.nextLine();
                                    if ("komennot".equals(komentoToinenKayt)) {

                                        pelinKomennot.tulostaKaikkiKomennot();

                                    } else if ("katso ymp�rille".equals(komentoToinenKayt)) {

                                        toiseenKaytavaan.huoneenKuvaus();

                                    } else if ("katso ovea".equals(komentoToinenKayt)) {

                                        System.out.println("Yksi ovi on edess�si lukittuna ja toinen on lukitsemattomana vasemmalla.");

                                    } else if ("katso ovea vasemmalla".equals(komentoToinenKayt)) {
                                        toiseenKaytavaan.katsoOvea();
                                    } else if (("katso ovea edess�".equals(komentoToinenKayt)) || ("katso lukittua ovea".equals(komentoToinenKayt))) {
                                        toiseenKaytavaan.katsoLukittuaOvea();
                                    } else if ("siirry kokoushuoneeseen".equals(komentoToinenKayt)) {
                                        toiseenKaytavaan.siirryKokoushuoneeseen();

                                        // KOKOUSHUONEESSA
                                        KokousHuone kok = new KokousHuone();
                                        System.out.println(kok.huoneenKuvaus());

                                        while (true) {

                                            System.out.println("Mit� teet seuraavaksi? (Kirjoita komento) ");

                                            String kokKomento = lukija.nextLine();

                                            if ("komennot".equals(kokKomento)) {

                                                pelinKomennot.tulostaKaikkiKomennot();

                                            } else if ("katso ymp�rille".equals(kokKomento)) {

                                                kok.huoneenKuvaus();

                                            } else if (("katso taulua".equals(kokKomento)) || ("katso taululle".equals(kokKomento))) {

                                                kok.katsoTaululle();

                                            } else if ("katso tietokonetta".equals(kokKomento)) {

                                                kok.katsoTietokonetta();

                                            } else if ("k�yt� muistitikkua".equals(kokKomento)) {

                                                System.out.print("Ty�nn�t muistitikun paikoilleen.");
                                                kok.setMuistikorttiLiitetty(true);

                                            } else if (("avaa tietokone".equals(kokKomento)) && (!(kok.isMuistikorttiLiitetty()))) {

                                                System.out.print("Sy�t� ensin muistitikku!");

                                            } else if (("avaa tietokone".equals(kokKomento)) && kok.isMuistikorttiLiitetty()) {

                                                kok.avaaTietokone();

                                                String kayttaja = null;
                                                String salasana = null;

                                                while (!("w0rk1ng".equals(kayttaja)) && (!("p4ssw0rd".equals(salasana)))) {

                                                    System.out.println("K�ytt�j�tunnus: ");
                                                    kayttaja = lukija.nextLine();

                                                    System.out.println("Salasana: ");
                                                    salasana = lukija.nextLine();

                                                    if (("w0rk1ng".equals(kayttaja)) && ("p4ssw0rd".equals(salasana))) {

                                                        System.out.println("Kirjaudutaan sis��n...");

                                                        kok.setKayttajatunnusJaSalasanaSyotetty(true);

                                                        // tulostetaan kalvot ja pelaaja lukee niit�
                                                        kok.tulostaKalvoja();
                                                        // kalvot luettu ainakin kerran
                                                        kok.setKalvotLuettu(true);

                                                    } else {

                                                        System.out.println("V��r� tunnus tai salasana!!");
                                                        System.out.println("Kirjautuminen ep�onnistui...");

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
                                                System.out.println("Ep�m��r�inen komento. Kokeile uudestaan.");
                                            }

                                        }
                                    } else if ("lopeta".equals(komentoToinenKayt)) {
                                        System.exit(0);
                                    } else {
                                        System.out.println("Ep�m��r�inen komento. Kokeile uudestaan.");
                                    }
                                }
                            } else if ("lopeta".equals(komentoKomero)) {
                                System.exit(0);
                            } else {
                                System.out.println("Ep�m��r�inen komento. Kokeile uudestaan.");
                            }
                        }

                    } else if ("lopeta".equals(komentoKayt)) {
                        System.exit(0);
                    } else {
                        System.out.println("Ep�m��r�inen komento. Kokeile uudestaan.");
                    }
                }

            } else if ("lopeta".equals(komento)) {
                break;
            } else {
                System.out.println("Ep�m��r�inen komento. Kokeile uudestaan.");
            }

        }

    }

}
