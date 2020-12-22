package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleTest {

    public static void main(String[] args) {
        System.out.println("Velkommen til min opskrifts.addlikations-dummy");
        linjeskift();
        linjeskift();
        System.out.println("********************");
        System.out.println("Indhold i kogebogen");
        System.out.println("********************");
        linjeskift();
        Opskrift glasurOpskrift = new Opskrift("Glasur","Bland vand og flormelis indtil det får den konsistens du ville have din glasur i",1,5);
        System.out.println("1: " + glasurOpskrift.navn);
        linjeskift();

        Opskrift teOpskrift = new Opskrift("Citron te","skær en citron ud i både og lig dem i kogende vand, lad citronen ligge i vandt i 10 min",1,10);
        System.out.println("2: " + teOpskrift.navn);
        linjeskift();

        System.out.println("********************");
        System.out.println("\t Opskrifter");
        System.out.println("********************");
        linjeskift();



        System.out.println("Hvilken opskrift ville du kigge på? Tip skriv 1 eller 2");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        //TODO en switch satement som ville gøre det meget nemt og udvide hvis jeg på et tidspunkt ville det.
        switch (x){
            case 1:
                System.out.println("Til " + glasurOpskrift.navn+ " skal du bruge: ");
                linjeskift();
                glasurOpskrift.addIngrediends("Vand");
                glasurOpskrift.addIngrediends("Flormelis");

                System.out.println("- " + glasurOpskrift.ingredienser.get(0));
                System.out.println("- " + glasurOpskrift.ingredienser.get(1));
                linjeskift();

                System.out.println("Fremgangsmaaden er således: ");
                linjeskift();
                glasurOpskrift.visFremgangsmaade();
                linjeskift();

                System.out.println("********************");
                System.out.println(" Kalorieberegning");
                System.out.println("********************");
                linjeskift();
                Ingrediens glasur = new Ingrediens();
                glasur.kalorier = 161;
                glasur.navn = glasurOpskrift.navn;
                System.out.println(glasur.navn + " har " + glasur.kalorier + " kalorier i sig");

                break;
            case 2:
                System.out.println("Til " + teOpskrift.navn + " skal du bruge: ");
                linjeskift();
                teOpskrift.addIngrediends("Citron");
                teOpskrift.addIngrediends("Kogende Vand");
                System.out.println("- " + teOpskrift.ingredienser.get(0));
                System.out.println("- " + teOpskrift.ingredienser.get(1));
                linjeskift();

                System.out.println("Fremgangsmaaden er således: ");
                teOpskrift.visFremgangsmaade();
                linjeskift();
                System.out.println("Du kan eventuelt selv tilføje andre tring til din te som f.eks ingefær");
                linjeskift();

                System.out.println("********************");
                System.out.println("Kalorieberegning");
                System.out.println("********************");
                linjeskift();
                Ingrediens citronte = new Ingrediens();
                citronte.kalorier = 1;
                citronte.navn = teOpskrift.navn;
                System.out.println(citronte.navn + " har " + citronte.kalorier + " en kalorie i sig");


                break;
            default:
                System.out.println("Skriv 1 eller 2 for at få vist en opskrift");
        }
        linjeskift();
        System.out.println("*****************");
        linjeskift();
        System.out.println();
    }
    //TODO metode uden parametere
    public static void linjeskift(){

        System.out.println("     ");
    }
}
