package aula01;

public class CarroTeste {

    public static void main(String[] args) {

        // Criando objeto carro1 do tipo -> Carro
        Carro carro1 = new Carro();
        System.out.println(carro1.hashCode());

        // Atribuição de valores para Objeto
        carro1.marca =  "Fiat";
        carro1.modelo =  "Uno";
        carro1.cor =  "Azul";
        carro1.velocidadeAtual =  0;

        // Imprimindo dados do objeto
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Velocidade Atual: " + carro1.velocidadeAtual);

        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();
        carro1.frear();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();

        System.out.println("\n-----------------------------------------\n");

        Carro carro2 = new Carro();
        System.out.println(carro2.hashCode());

        carro2.marca =  "Jeep";
        carro2.modelo =  "Compass";
        carro2.cor =  "Preto";
        carro2.velocidadeAtual =  0;

        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Cor: " + carro2.cor);
        System.out.println("Velocidade Atual: " + carro2.velocidadeAtual);

        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.frear();
        carro2.acelerar();
        carro2.frear();
        carro2.acelerar();
        carro2.acelerar();
        carro2.frear();
        carro2.frear();
        carro2.acelerar();
        carro2.frear();
    }
}
