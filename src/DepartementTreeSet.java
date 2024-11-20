import java.util.TreeSet;
public class DepartementTreeSet implements IDepartement<Departement>{
    private TreeSet<Departement> departements;
    public DepartementTreeSet() {
        this.departements = new TreeSet<>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {
        if (departements.add(departement)) {
            System.out.println("Département ajouté : " + departement);
        } else {
            System.out.println("Le département existe déjà !");
        }
    }
    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement); // Utilise equals() de Departement
    }
    @Override
    public void supprimerDepartement(Departement departement) {
        if (departements.remove(departement)) {
            System.out.println("Département supprimé : " + departement);
        } else {
            System.out.println("Le département n'existe pas !");
        }
    }
    @Override
    public void displayDepartement() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département à afficher.");
        } else {
            System.out.println("Liste des départements :");
            for (Departement d : departements) {
                System.out.println(d);
            }
        }
    }
    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(departements); // Copie triée automatiquement
    }

}
