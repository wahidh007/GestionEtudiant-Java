public class Enseignant extends Personne {
    private double salaire;

    public Enseignant(String nom, int anneNais, String numTel, String email, double salaire) {
        super(nom, anneNais, numTel, email);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Enseignant [salaire=" + salaire + "]";
    }

}
