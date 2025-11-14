package job7;

public class CompteBancaire {
    double solde;

    // Constructeur
    public CompteBancaire(double soldeInitial) {
        solde = soldeInitial;
    }

    // Méthode deposer
    public void deposer(double montant) {
        solde += montant;
        System.out.println("Depot de " + montant + "€ effectué");
    }

    // Méthode retirer
    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + "€ effectué");
        } else {
            System.out.println("Retrait impossible : solde insuffisant");
        }
    }
    // Méthode afficher solde
    public void afficherSolde() {
        System.out.println("Solde actuel : " + solde + "€");
    }
}
