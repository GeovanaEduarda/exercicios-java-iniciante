import javax.xml.transform.Source;
import java.util.Scanner;

public class ControleBancario{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 2500.00;

        System.out.println("""
                ==============================
                   DADOS BANCÁRIOS
                ==============================
                Nome: Geovana Eduarda
                Tipo de Conta: Corrente
                Saldo inicial: """ + saldo + """
                ==============================
                """);
        int opcao = 0;

        while(opcao != 4){
            System.out.println("""
                    Operações disponíveis:

                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair

                    Digite a opção desejada:
                    """);

            opcao = input.nextInt();

            switch (opcao){
                case 1 ->{
                    System.out.println("Seu saldo atual é R$ "+saldo);
                }
                case 2 ->{
                    System.out.println("Informe o valor que ira receber");
                    double valor = input.nextDouble();
                    System.out.println("Valor recebido com sucesso! Novo saldo: R$ "+(valor+saldo));
                }
                case 3 ->{
                    System.out.println("Digite o valor que deseja retirar");
                    double valorTirado = input.nextDouble();
                    if (valorTirado > saldo) {
                        System.out.println("Saldo insuficiente!\n");
                    } else {
                        System.out.printf("Transferência realizada! Novo saldo: "+(saldo-valorTirado));
                    }
                }
                case 4 -> System.out.println("Saindo do sistema... Até logo!");
                default -> System.out.println("Opção inválida! Tente novamente.\n");
            }
        }
        input.close();
    }
}