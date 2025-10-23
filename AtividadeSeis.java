import java.util.Scanner;

public class AtividadeSeis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int num = entrada.nextInt();

        int fatorial = 1;


        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);

        entrada.close();
    }
}
