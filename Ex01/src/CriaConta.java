import java.util.Scanner;

public class CriaConta {


    public static void main(String [] args){


        Scanner ler = new Scanner(System.in);

        Conta cliente1 = new Conta();
       // Conta cliente2 = new Conta();
       // Conta cliente3 = new Conta();


        cliente1.nome = "Jumelo";
        cliente1.saldo = 30000;

        System.out.println("O que deseja fazer? (Sacar(1),Depositar(2),Saldo(3))");
        cliente1.acao = ler.nextInt();

        if(cliente1.acao == 1){
            System.out.println("Digite o valor que deseja sacar: ");
            cliente1.saque = ler.nextDouble();
            double sacar = cliente1.sacar(cliente1.saque);
        }else if(cliente1.acao == 2){
            System.out.println("Digite o valor que deseja depositar: ");
            cliente1.depos = ler.nextDouble();
            double depositar = cliente1.depositar(cliente1.depos);
        }else if(cliente1.acao == 3){
            double render = cliente1.render(cliente1.saldo);
            System.out.println("Seu saldo é de: "+ cliente1.saldo+ ", e o rendimento em conta é de: "+ cliente1.rende);
        }else{
            System.out.println("Comando invalido");
        }

        System.out.println(cliente1.saldo);

    }

}
