import java.util.Scanner;
public class Methode {
    public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            while (!scanner.hasNextInt()){
                System.out.println("Erreur : Veuillez entrer un entier valide.");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erreur : L'entier doit être strictement positif.");
            }
        } while (n <= 0);
        return n;
    }

    public static int comptage(int n) {
        String ch = Integer.toString(n); 
        return ch.length();
    }
    public static int somme (int n) {
    return n;
    }
}