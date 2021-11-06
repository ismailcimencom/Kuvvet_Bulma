import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sinir sayinizi giriniz : ");
        n = input.nextInt();
        System.out.println("Bunlar 4 un kuvvetleridir.");
        for (int i=1; i <= n; i*=4){
            System.out.println(i);
        }
        System.out.println("Bunlar da 5 in kuvvetleridir.");
        for (int i=1; i <= n; i*=5){
            System.out.println(i);
        }
    }
}