import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        System.out.println("4'ün katları:");
        for (int i=1; i<=n; i=i*4){
            System.out.println(i);
        }
        System.out.println("5'in katları:");
        for (int i=1; i<=n; i=i*5){
            System.out.println(i);
        }
    }
}