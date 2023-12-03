import java.time.LocalDate;

public class Personne {

    private String nom;
    private int anneNais;
    private String numTel;
    private String email;

    public Personne(String nom, int anneNais, String numTel, String email) {
        this.nom = nom;
        this.anneNais = anneNais;
        this.numTel = numTel;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnneNais() {
        return anneNais;
    }

    public void setAnneNais(int anneNais) {
        this.anneNais = anneNais;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int age() {
        return LocalDate.now().getYear() - this.anneNais;
    }

    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", Age=" + this.age() + ", numTel=" + numTel + ", email=" + email + "]";
    }

}