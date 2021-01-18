import java.util.Scanner;

public class Incidents extends Civils{
    public String lieux;
    public String mechantSurPlace;
    public String typeIncident;

    public void setIncident() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez le lieux de l'incidents : ");
        this.lieux = scanner.nextLine();
        System.out.println("Saisissez le type de l'incidents : ");
        this.typeIncident = scanner.nextLine();
        System.out.println("Un Super-Vilain est-il présent sur place ? 1/2");
        int yon = scanner.nextInt();
        if(yon == 1){
            System.out.println("Lequel ? : ");
            this.mechantSurPlace = scanner.nextLine();
        }else if(yon == 2){
            System.out.println("Très bien");
            System.out.println("Saisissez votre nom : ");
            super.nom = scanner.nextLine();
            System.out.println("Saisissez votre prénom : ");
            super.prenom = scanner.nextLine();
            System.out.println("Email : ");
            super.email = scanner.nextLine();
            System.out.println("Telephone : ");
            super.telephone = scanner.nextLine();
        }

    }

    public void getIncident(){
        System.out.println(this.lieux);
        System.out.println(super.nom);
        System.out.println(super.prenom);
    }
}
