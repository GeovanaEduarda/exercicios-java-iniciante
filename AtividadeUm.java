import java.util.Scanner;

public class AtividadeUm {
    static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 10");
        double usuario = numero.nextDouble();

        if(usuario < 0){
            System.out.println("Número negativo");
        }else{
            System.out.println("Número positivo");

        }
        
    }
}
