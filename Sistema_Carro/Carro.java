package Sistema_Carro;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setVelocidadeAtual(double velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(double incremento){
        velocidadeAtual += incremento;
    }

    public void frear(double decremento){
        velocidadeAtual -= decremento;

        if (velocidadeAtual < 0) {
           velocidadeAtual = 0; 
        }
    }

    public void mostrarVelocidade(){
        System.out.println("====== Painel ======");
        System.out.println("Velocidade Atual: " + velocidadeAtual + "Km/h");
    }

    //get pra consultar os valores
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public double velocidadeAtual(){
        return velocidadeAtual;
    }
}
