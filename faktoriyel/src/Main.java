import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        int total = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a factoriel number: ");
        n = inp.nextInt();
        for ( int i = 1; i <= n; i++) {
            total = total * i;
        }
            System.out.print(n +  " Faktoriyel :"  + total);
    }
}