import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero");
        number = sc.nextInt();
        System.out.println("O numero digitado foi: " +number);
        sc.close();
    }
}
