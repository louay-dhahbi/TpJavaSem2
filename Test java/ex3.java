import java.util.Scanner;
public class ex3 {
    public static boolean estInf(String verbe) {
        return verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re") || verbe.endsWith("oir");
    }
    public static String Groupe(String verbe) {
        if (verbe.equals("aller")) return "3eme groupe";
        if (verbe.endsWith("er")) return "1er groupe";
        if (verbe.endsWith("ir")) return "2e groupe";
        return "3e groupe";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verbe;
        do {
            System.out.print("entrez un verbe à linfinitif : ");
            verbe = scanner.nextLine().trim().toLowerCase();
            if (!estInf(verbe)) {
                System.out.println("ce verbe n est pas à linfinitif");
            }
        } while (!estInf(verbe));
        String groupe = Groupe(verbe);
        System.out.println("le verbe " + verbe + " appartient au " + groupe);
    }
}