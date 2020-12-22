package sample;

public class Ingrediens {
    String navn;
    int kalorier;

    public void ingrediens(String navn, int kalorier) {
        this.navn = navn;
        this.kalorier = kalorier;
    }

    public void rigPaaKalorier() {
        ingrediens(navn,kalorier);
        if (kalorier > 100) {
            System.out.println(navn + " er rig på kalorier");
        } else System.out.println(navn + " er ikke rig op kalorier");


    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getKalorier() {
        return kalorier;
    }

    public void setKalorier(int kalorier) {
        this.kalorier = kalorier;
    }
}

