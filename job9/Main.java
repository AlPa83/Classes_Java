package job9;

public class Main {
    public static void main(String[] args) {
    Etudiant etudiant1 = new Etudiant("Alice", 30, 17.5);

    etudiant1.setNom("Logan");
    etudiant1.setAge(25);
    etudiant1.setMoyenne(18);

        System.out.println("Nom : " + etudiant1.getNom());
        System.out.println("Age : " + etudiant1.getAge());
        System.out.println("Moyenne : " + etudiant1.getMoyenne());
    }
}
