package Sistema_Carro;

public class Teste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.setMarca("Toyota");
        carro.setAno(2003);
        carro.setModelo("Corolla");
        carro.setVelocidadeAtual(0.0);

        System.out.println("===== Testando o carro =====");
        carro.mostrarVelocidade();

        System.out.println("\nAcelerando...\n");
        carro.acelerar(60.0);
        carro.mostrarVelocidade();

        System.out.println("\nFreando...\n");
        carro.frear(30.0);
        carro.mostrarVelocidade();

        System.out.println("===== Teste cocluido com sucesso =====\n");
        
        System.out.println("===== Dados do carro =====");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Modelo: " + carro.getModelo());

    }
}
