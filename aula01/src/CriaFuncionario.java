public class CriaFuncionario {

    public static void main(String [] args){

        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Micalateia";
        funcionario1.cargo = "Mongoloide";
        funcionario1.salario = 2500;
        funcionario1.cpf = "552.234.567-86";
        funcionario1.comissao = 35.00;


        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Vanderleia";

        Funcionario funcionario3 = funcionario1;
        funcionario3.nome = "Claudete";


        System.out.println("O nome do funcionario 1 é:" + funcionario1.nome);
        System.out.println("O nome do funcionario 2 é:" + funcionario2.nome);
        System.out.println("O nome do funcionario 3 é:" + funcionario3.nome);

        if(funcionario1.nome == funcionario2.nome){
            System.out.println("Os dois funcionarios são iguais!!!!!");
        }else{
            System.out.println("Os dois funcionarios são diferentes!");
        }

        System.out.println(funcionario1);
        System.out.println(funcionario2);
    }

}