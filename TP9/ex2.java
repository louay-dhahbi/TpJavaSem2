import java.util.Scanner;

public class ex2 {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Donner un entier : ");
        int n = Methode.lectureN();
        int nombreDeChiffres = Methode.comptage(n);
        System.out.println("Le nombre de chiffres est : " + nombreDeChiffres);
    }
}