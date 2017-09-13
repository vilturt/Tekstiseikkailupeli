
public class Kaytava implements Huone {
    
    private boolean puhuttuMiehelle = false;
    
    private boolean taskutTutkittu = false;
    
    private boolean avainkorttiaKatsottu = false;
    
    public String huoneenKuvaus() {
        
        return "Astut ulos ahtaasta ja pime‰st‰ huoneesta. N‰‰t jo paremmin ymp‰rillesi.\n"
                + "Valot v‰lkkyv‰t hieman. N‰‰t nurkassa makaamassa n‰kyv‰sti haavoittuneen\n"
                + "miehen. K‰yt‰v‰ll‰ on myˆs kaksi ovea, joista toinen on pienempi ja \n"
                + "toinen hieman jykev‰mpi.";
        
    }
        
    public void katsoMiesta() {
        
        System.out.println("Mies vuotaa verta ja n‰ytt‰‰ muutenkin heikkokuntoiselta.");
        
    }
    
    public void puhuMiehelle() {
        
        System.out.print("Kysyt miehelt‰, onko h‰n kunnossa. \n Saat vastaukseksi ep‰m‰‰r‰ist‰ puhetta. Lopulta mies korisee ja menehtyy. "
                + "\nEt olisi voinut tehd‰ mit‰‰n h‰nen pelastamisekseen. ");
        
    }
    
    public void tutkiMiehenTaskut() {
        
        System.out.println("Tutkit miehen taskut. Lˆyd‰t avainkortin ja otat sen itsellesi.");
        
    }
    
    public void katsoAvainkorttia() {
        
        System.out.println("T‰m‰ avainkortti n‰ytt‰‰ k‰yv‰n pienemp‰‰n oveen.");
    }
    
    public void k‰yt‰Avainkorttia() {
        
        System.out.println("Avaat kaapin oven.");
        
    }
   
    public boolean isPuhuttuMiehelle() {
        return puhuttuMiehelle;
    }

    public void setPuhuttuMiehelle(boolean puhuttuMiehelle) {
        this.puhuttuMiehelle = puhuttuMiehelle;
    }

    public boolean isTaskutTutkittu() {
        return taskutTutkittu;
    }

    public void setTaskutTutkittu(boolean taskutTutkittu) {
        this.taskutTutkittu = taskutTutkittu;
    }

    public boolean isAvainkorttiaKatsottu() {
        return avainkorttiaKatsottu;
    }

    public void setAvainkorttiaKatsottu(boolean avainkorttiaKatsottu) {
        this.avainkorttiaKatsottu = avainkorttiaKatsottu;
    }
    
    
}
