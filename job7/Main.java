package job7;

public class Main {
    public static void main(String[] args) {
    CompteBancaire compte = new CompteBancaire(100);

    compte.afficherSolde();
    compte.deposer(500);
    compte.retirer(300);
    compte.retirer(400);
    compte.afficherSolde();
    }
}
