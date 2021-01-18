import java.util.Scanner;

public class Incidents extends Civils{
    public String lieux;
    public String mechantSurPlace;
    public String typeIncident;

    public void setIncident() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez le lieux de l'incidents : ");
        this.lieux = scanner.nextLine();
        System.out.println("Saisissez votre nom : ");
        super.nom = scanner.nextLine();
        System.out.println("Saisissez votre prénom : ");
        super.prenom = scanner.nextLine();
    }

    public void getIncident(){
        System.out.println(this.lieux);
        System.out.println(super.nom);
        System.out.println(super.prenom);
    }
}
