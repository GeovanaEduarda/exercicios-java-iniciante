import java.util.Scanner;

public class AtividadeTres {
    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);
        System.out.println("digite 1 para calcular a area do quadrado e 2 para calcular a area do circulo");
        int numCalc = opcao.nextInt();
         if(numCalc == 1){
             System.out.printf("Me enforme o valor do lado do quadrado");
             double lado = opcao.nextDouble();
             System.out.println("A área do quadrado é " + lado*lado);
         }else{
             System.out.println("Qual o raio da sua circunferencia?");
             double raio = opcao.nextDouble();
             System.out.println("A área do seu círculo é " + Math.PI * (raio * raio));

         }

         opcao.close();

    }
}
