package job9;

public class Etudiant {
    private String nom;
    private int age;
    private double moyenne;

    // Constructeur
    public Etudiant(String nom, int age, double moyenne) {
        this.nom = nom;
        this.age = age;
        this.moyenne = moyenne;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public double getMoyenne() {
        return moyenne;
    }

    // Setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setMoyenne(double moyenne) {
        if (moyenne >= 0 && moyenne <= 20) {
            this.moyenne = moyenne;
        }

    }



}
