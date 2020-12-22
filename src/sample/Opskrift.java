package sample;

import java.util.ArrayList;

public class Opskrift implements Kalorierberegner {
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
    public void addIngrediens(String navn, int kalorier){
        System.out.println(navn + " har " + kalorier + " kalorier");
    }
    public void showIngrediends(){ // Her bruger jeg en fori løkke til at vise alle de ingredienser der er i den opskrift brugeren har valgt.

        for (int i = 0; i < ingredienser.size(); i++) {
            System.out.println("- " + ingredienser.get(i));
        }

    }
    public void visFremgangsmaade(){
        System.out.println(fremgangsmaade);

    }
    public void visOpskrift(){
        System.out.println("Til " + navn + " skal du bruge:");
        showIngrediends();
        System.out.println("Fremgransmaaden er følgende:");
        System.out.println(fremgangsmaade);
    }

   public int kalorieriAlt() {
        int sum = 0;
       for (int i = 0; i < ingredienser.size(); i++) {

       }
       return sum;
    }
}

