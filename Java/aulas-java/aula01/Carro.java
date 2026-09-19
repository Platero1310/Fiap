package aula01;

import java.util.Objects;

public class Carro {

    // Atributos e caracteristicas
    String marca;
    String modelo;
    String cor;
    int velocidadeAtual;


    // Metodos = Comportamentos e Açôes

    public void acelerar(){
        System.out.println("Acelerando");
        velocidadeAtual = velocidadeAtual + 10;
        System.out.println("O carro acelerou! Velocidade atual:" +
                " " + velocidadeAtual + "Km/h");
    }

    public void frear(){
        System.out.println("Freando...");
        velocidadeAtual = velocidadeAtual - 10;
        System.out.println("O carro freiou! " +
                "Velocidade atual: " + velocidadeAtual + "Km/h");
    }









//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Carro carro = (Carro) o;
//        return velocidadeAtual == carro.velocidadeAtual && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(cor, carro.cor);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(marca, modelo, cor, velocidadeAtual);
//    }
}
