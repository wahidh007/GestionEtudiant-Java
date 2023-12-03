public class Etudiant extends Personne {
    private int numEtudiant;
    private double moyenne;

    public Etudiant(String nom, int anneNais, String numTel, String email, int numEtudiant, double moyenne) {
        super(nom, anneNais, numTel, email);
        this.numEtudiant = numEtudiant;
        this.moyenne = moyenne;
    }

    public int getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(int numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public double getMoyenne() throws MoyInf10Exception {
        if (this.moyenne < 10) {
            throw new MoyInf10Exception();
        } else {
            return this.moyenne;
        }
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return super.toString() + " Etudiant [numEtudiant=" + numEtudiant + ", moyenne=" + moyenne + "]";
    }

}
