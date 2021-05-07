import java.time.LocalDate;

public class Mission extends Incidents {
    private String nature;
    private String titre;
    public String dateDebut;
    public String dateFin;
    public String Intinéraire;
    public String infoComp;
    public String niveauGravite = "Normal";
    public boolean missionAcheve = false;

    Incidents incident1 = new Incidents();
    Civils infoCivil1 = new Civils();

    public void mission(){

        /*this.nature = incident1.typeIncident;
        this.titre = "Defaut Title";
        this.dateDebut = LocalDate.now().toString();
        if(missionAcheve = true) {
            this.dateFin = LocalDate.now().toString();
        }else if(missionAcheve = false){
            this.dateFin = "Pas fini !";
        }
        this.infoComp = "Dafaut Info Comp";
        System.out.println("Le nom est  : " + incident1.nom);*/
    }

    public void afficherMission(){
        /*System.out.println("Nature de la mission : " + this.nature);
        System.out.println("Mission : " + this.titre);
        System.out.println("Itinéraire de la mission : " + "Base-" + this.Intinéraire);
        System.out.println("Date de création de la mission : " + this.dateDebut);
        System.out.println("Date de fin de mission de la mission : " + this.dateFin);
        System.out.println("Info complémentaire : " + this.infoComp);
        System.out.println("Niveau de gravité : " + this.niveauGravite);
        System.out.println(super.mechantSurPlace);
        System.out.println(super.typeIncident);
        System.out.println(incident1.nom);
        System.out.println(super.prenom);
        System.out.println(super.email);
        System.out.println(super.telephone);*/
        System.out.println(incident1.nom);
    }
}
