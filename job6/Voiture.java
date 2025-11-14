package job6;

public class Voiture {
    String marque;
    int vitesse;

    public Voiture(String marque, int vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
    }
    public void accelerer() {
        vitesse +=10;
        System.out.println(marque + " roule maintenant à " + vitesse + " km/h");
    }
}
