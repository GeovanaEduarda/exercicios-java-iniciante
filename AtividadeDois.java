import java.util.Scanner;

public class AtividadeDois {
    static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        double primeiroNum = num.nextDouble();

        System.out.println("Digite o segundo número");
        double segundoNum = num.nextDouble();

        if(primeiroNum == segundoNum){
            System.out.printf("Os dois número são iguais");
        }else if(primeiroNum < segundoNum){
            System.out.println("O primeiro número é menor que o segundo");
        }else{
            System.out.printf("O primeiro número é maior que o segundo");
        }

    }
}
