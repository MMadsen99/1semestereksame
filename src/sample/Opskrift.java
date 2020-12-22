package sample;

import java.util.ArrayList;

public class Opskrift {
    String navn = "";
    String fremgangsmaade = "";
    int antalPortioner;
    double tilberedningstid;
    ArrayList ingredienser = new ArrayList();




    public Opskrift() {
        this.navn = navn;
        this.fremgangsmaade = fremgangsmaade;
        this.antalPortioner = antalPortioner;
        this.tilberedningstid = tilberedningstid;
        this.ingredienser = ingredienser;
    }

    public Opskrift(String navn, String fremgangsmaade, int antalPortioner, double tilberedningstid) {
        this.navn = navn;
        this.fremgangsmaade = fremgangsmaade;
        this.antalPortioner = antalPortioner;
        this.tilberedningstid = tilberedningstid;
        this.ingredienser = ingredienser;
    }
    public void addIngrediends(Ingrediens ingrediens){

    }
}

