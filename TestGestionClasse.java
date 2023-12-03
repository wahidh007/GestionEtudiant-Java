public class TestGestionClasse {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("Salah Tozri", 1992, "98526788", "salaht@gmail.com", 5, 15.5);
        Etudiant e2 = new Etudiant("Fatma Tounsi", 1998, "52336745", "fatma@gmail.com", 9, 9.2);

        Enseignant ens1 = new Enseignant("Naofel", 1980, "22558899", "naofel@gmauil.com", 1200);

        Classe rsi21 = new Classe("RSI21", "Reseau Informatique");
        rsi21.addEtudiant(e1);
        rsi21.addEtudiant(e2);

        // Afficher des étudiants de RSI21
        // System.out.println(rsi21.getEtudiants());
        for (Etudiant e : rsi21.getEtudiants()) {
            try {
                System.out.println(e.getMoyenne());
            } catch (MoyInf10Exception e3) {
                // TODO Auto-generated catch block
                System.out.println(e3);
            }
        }

    }
}
