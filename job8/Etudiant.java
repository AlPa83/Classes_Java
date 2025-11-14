package job8;

public class Etudiant {
    String nom;
    double moyenne;

    // Constructeur
    public Etudiant(String nom, int moyenne) {
        this.nom = nom;
        this.moyenne = moyenne;
    }
    // Méthode afficherMoyenne
    public void afficherMoyenne() {
        System.out.println(nom + " - Moyenne : " + moyenne + " - " + (moyenne >= 10 ? "Admis" : "Recalé"));

    }
}
