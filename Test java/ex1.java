import java.util.Scanner;
public class ex1 {
    public static int lecture() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("donner un entier positive : ");
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }
    public static int compter(int n) {
        int compteur = 0;
        while (n > 0) {
            compteur++;
            n /= 10;
        }
        return compteur;
    }
    public static void main(String[] args) {
        int n = lecture();
        int chiffres = compter(n);
        System.out.println("le nombre de chiffres = " + chiffres);
    }
}