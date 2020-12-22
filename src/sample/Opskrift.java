package sample;

public class Opskrift {
    String navn = "";
    String fremgangsmaade = "";
    int antalPortioner;
    double tilberedningstid;
    String ingredienser;


    public Opskrift(String navn, String fremgangsmaade, int antalPortioner, double tilberedningstid, String ingredienser) {
        this.navn = navn;
        this.fremgangsmaade = fremgangsmaade;
        this.antalPortioner = antalPortioner;
        this.tilberedningstid = tilberedningstid;
        this.ingredienser = ingredienser;


    }
}
