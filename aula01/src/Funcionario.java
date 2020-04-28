public class Funcionario {

    public String nome;
    public String cpf;
    public double salario;
    public String logradouro;
    public int numeroDaRua;
    public String cargo;
    public double comissao;

    public double calculaComissao(int numeroVenda){
        if(numeroVenda > 0 & numeroVenda < 5){
            return comissao * 0.10;
        }else{
            return comissao * 0.20;
        }
    }
}
