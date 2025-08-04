import java.util.Scanner;

public class Contador {

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
            if (num1 < 0 || num2 < 0 || num1 > num2) {
                throw new ParametrosInvalidosException();
            } else {
                for( int i = 0; i <= num2 - num1; i++) {
                    System.out.println("Imprimindo: " + (i));
                }
            }

        }
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor aleatorio:");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro valor aleatorio:");
        int num2 = scanner.nextInt();

        try {
            contar(num1, num2);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }  
    }
}
