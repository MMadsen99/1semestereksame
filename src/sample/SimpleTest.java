package sample;

public class SimpleTest {
    public static void main(String[] args) {
        System.out.println("Velkommen til min opskrifts.addlikations-dummy");
        linjeskift();
        linjeskift();
        System.out.println("********************");
        System.out.println("Indhold i kogebogen");
        System.out.println("********************");
        linjeskift();
        Opskrift glasurOpskrift = new Opskrift("Glasur","rør flormelis og vand sammen",1, 5,"vand og flormelis");
        System.out.println("Opskrift oprettet: " + glasurOpskrift.navn);
        System.out.println("Opskriftens ingredienser: " + glasurOpskrift.ingredienser);
        System.out.println(glasurOpskrift.ingredienser);
        linjeskift();

        Opskrift teOpskrift = new Opskrift("Te","tilsæt citron i kogendevand",1,10,"citron og kogende vand");
        System.out.println("Opskrift oprettet: " + teOpskrift.navn);
        System.out.println("Opskriftens ingredienser: " + glasurOpskrift.ingredienser);
    }

    public static void linjeskift(){
        System.out.println("     ");
    }
}
