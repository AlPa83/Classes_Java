package job10;

public class Rectangle {
    private double largeur;
    private double hauteur;

    // Constructeur
    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    // Méthode calculerAire
    public double calculerAire() {
        return largeur * hauteur;
    }

    // Getters and Setters
    public double getLargeur() {
        return largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
}
