package aula05;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private float preco;


    public Carro() {
        this.marca = "Indefinido!";
        this.modelo = "Indefinido!";
        this.ano = 0000;
        this.cor = "Indefinido!";
        this.preco = 0;
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(String marca, String modelo, int ano, String cor, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

        this.cor = cor;
        this.preco = preco;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void exibirInfo(){
        System.out.println("\n-----------------------------------------");
        System.out.println("----------- INFOS DO " + modelo.toUpperCase() + " -------------\n");

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: " + preco);


//        if(ano >= 2020){
//            System.out.println("Seu carro é novo!");
//        }
    }
}
