package Sistema_de_Funcionários;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Ana");
        funcionario.setDepartamento("XXXXXX");
        funcionario.setRg("112233445");
        funcionario.setDataEntrada("xx/xx/xx");
        funcionario.setSalario(2000);

        System.out.println("Rodando teste...");

        funcionario.mostrar();

        System.out.println("Aplicando aumento...");

        funcionario.recebeAumento(1000);
        System.out.println("Aumento aplicado com sucesso.");

        funcionario.mostrar();
    }
}
