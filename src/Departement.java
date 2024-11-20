import java.util.TreeSet;
public class Departement implements Comparable<Departement> {

    private int id;
    private String nom;
    private int nbEmployes;
    public Departement() {
    }
    public Departement(int id, String nom, int nbEmployes) {
        this.id = id;
        this.nom = nom;
        this.nbEmployes = nbEmployes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomDepartement() {
        return nom;
    }
    public void setNomDepartement(String nom) {
        this.nom = nom;
    }
    public int getNombreEmployes() {
        return nbEmployes;
    }
    public void setNombreEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && nom.equalsIgnoreCase(that.nom);
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nom + '\'' +
                ", nombreEmployes=" + nom +
                '}';
    }
    @Override
    public int compareTo(Departement other) {
        return Integer.compare(this.id, other.id);
    }

}
