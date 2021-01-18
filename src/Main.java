import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Incidents incident1 = new Incidents();
        Scanner menu = new Scanner(System.in);

        System.out.println("#####################");
        System.out.println("######SUPER_CRM######");
        System.out.println("#####################");

        System.out.println(" ");

        System.out.println("1. Déclarer un Incidents");
        System.out.println("2. Voir les missions");
        int choix = menu.nextInt();


        System.out.println(choix);

        if(choix == 1){
            System.out.println("Veuillez renter les informations suivante");
            incident1.setIncident();
            incident1.getIncident();
        }else if(choix == 2){
            System.out.println("Aucune mission en cours...");
        }


    }
}
