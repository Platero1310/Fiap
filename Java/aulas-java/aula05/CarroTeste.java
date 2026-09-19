package aula05;

public class CarroTeste {

    public static void main(String[] args) {

        // Carro 1
    Carro carro = new Carro();
    carro.exibirInfo();

    // Carro 2

    Carro carro2 = new Carro("Chevrolet", "Onix", 2017);
    carro2.exibirInfo();

    // Carro 3
    Carro carro3 = new Carro("Jeep", "Renegade", 2023);
    carro3.exibirInfo();

    carro3.setPreco(76000.00f);
    carro3.setCor("Cinza");

    carro3.exibirInfo();


    // Carro 4
    Carro carro4 = new Carro("Ford", "KA", 2020,
            "Preto", 40.303f);
    carro4.exibirInfo();






    }




}
