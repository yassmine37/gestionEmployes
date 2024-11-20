public class Main {
    public static void main(String[] args) {

       /* SocieteArrayList societe = new SocieteArrayList();


        Employe emp1 = new Employe(1, "Dupont", "Jean", "Finance", 3);
        Employe emp2 = new Employe(2, "Martin", "Claire", "Ressources Humaines", 4);
        Employe emp3 = new Employe(3, "Bernard", "Lucas", "IT", 2);


        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);


        System.out.println("Liste des employés avant le tri :");
        societe.displayEmploye();


        societe.trierEmployeParId();
        System.out.println("\nListe des employés triée par ID :");
        societe.displayEmploye();


        societe.trierEmployeParNomDepartementEtGrade();
        System.out.println("\nListe des employés triée par département et grade :");
        societe.displayEmploye();*/

        DepartementTreeSet gestion = new DepartementTreeSet();


        Departement d1 = new Departement(3, "Informatique", 25);
        Departement d2 = new Departement(1, "Finance", 15);
        Departement d3 = new Departement(2, "Marketing", 20);

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);

        gestion.displayDepartement();
        System.out.println("Recherche 'Finance' : " + gestion.rechercherDepartement("Finance"));
        gestion.supprimerDepartement(d2);
        gestion.displayDepartement();


    }


}
