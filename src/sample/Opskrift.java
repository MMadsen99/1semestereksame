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
    public void addIngrediends(String ingrediens){
        ingredienser.add(ingrediens);

    }
    public void showIngrediends(){ // Her bruger jeg en fori løkke til at vise alle de ingredienser der er i den opskrift brugeren har valgt.
        System.out.println("ingredienserne er følgende: ");
        for (int i = 0; i < ingredienser.size(); i++) {
            System.out.println("- " + ingredienser.get(i));
        }
    }



}

