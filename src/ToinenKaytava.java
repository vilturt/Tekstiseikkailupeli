
public class ToinenKaytava implements Huone {

    
   public String huoneenKuvaus() {
        
        return "Olet toisessa käytävämäisessä huoneessa. Tilasta löytyy kaksi ovea. "
                + "Toinen niistä on lukittu ja toinen ovi sijaitsee vasemmalla. ";
    }
   
   public void katsoLukittuaOvea() {
       
       System.out.println("Ovi vaatii numerokoodin avautuakseen.");
       
   }
   
   public void katsoOvea() {
       
       System.out.print("Katsot ovea vasemmalla. Se on tavanomainen lukitsematon ovi. "
               + "Ovessa lukee teksti KOKOUSHUONE.");
       
   }
   
   
   public void siirryKokoushuoneeseen() {
       
       System.out.print("Siirryt kokoushuoneeseen...");
       
   }
    
    
}
