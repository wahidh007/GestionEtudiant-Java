import java.util.ArrayList;

public class Classe {
    private String nom;
    private String specialite;
    private ArrayList<Etudiant> listEtudiants;

    public Classe(String nom, String specialite) {
        this.nom = nom;
        this.specialite = specialite;

        this.listEtudiants = new ArrayList<Etudiant>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void addEtudiant(Etudiant e) {
        listEtudiants.add(e);
    }

    public ArrayList<Etudiant> getEtudiants() {
        return this.listEtudiants;
    }

    @Override
    public String toString() {
        return "Classe [nom=" + nom + ", specialite=" + specialite + "]";
    }

}
