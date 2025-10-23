import java.util.Scanner;

public class AtividadeQuatro {
    public static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int num = tabuada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        tabuada.close();
    }
}
