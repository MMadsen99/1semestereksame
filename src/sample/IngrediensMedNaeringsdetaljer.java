package sample;

public class IngrediensMedNaeringsdetaljer extends Ingrediens {
    int cVitamin;
    int kalk;
    int magnesium;



    public IngrediensMedNaeringsdetaljer(String navn, int kalorier, int cVitamin, int kalk, int magnesium){

        if (cVitamin>5){
            System.out.println(navn + " er god med forkølelse");
        }else System.out.println(navn + " er ikke god med forkølelse");

    }
}
