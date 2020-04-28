public class Conta {


        public String nome;
        public int numero;
        public int agencia;
        public double saldo;
        public String data;
        public double saque;
        public double depos;
        public double rende;
        public int acao;




        public double sacar (double saque){
               return saldo = saldo - saque;
        }
        public double depositar (double depos){
               return saldo = saldo + depos;
        }
        public double render (double saldo){
                return rende = saldo * 0.1;
        }

}
