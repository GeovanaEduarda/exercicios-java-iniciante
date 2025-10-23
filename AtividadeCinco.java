import java.util.Scanner;

public class AtividadeCinco {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numInt = num.nextInt();

        if(numInt % 2 == 0){
            System.out.println("O número que você digitou é par");
        }else{
            System.out.println("O número que você digitou é impar");
        }
        num.close();
    }
}
