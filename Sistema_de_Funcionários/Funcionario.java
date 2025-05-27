package Sistema_de_Funcionários;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public void recebeAumento(double aumento){
        salario = salario + aumento;
    }

    public double calculaGanhoAnual(){
        return salario * 12;
    }

    public void mostrar(){
        System.out.println("===== Dados dos Funcionarios =====");
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + salario);
        System.out.println("Data de Entrada: " + dataEntrada);
        System.out.println("RG: " + rg);
        System.out.println("Ganho Anual: R$" + calculaGanhoAnual());
    }


}
