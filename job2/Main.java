package job2;

public class Main {
    public static void main(String[] args) {
        // Création des objets
        Personne p1 = new Personne();
        p1.nom = "Alice";
        p1.age = 25;

        Personne p2 = new Personne();
        p2.nom = "Bob";
        p2.age = 30;

        Personne p3 = new Personne();
        p3.nom = "Charlie";
        p3.age = 22;

        // Appel de la méthode pour chaque personne
        p1.sePresenter();
        p2.sePresenter();
        p3.sePresenter();

    }
}