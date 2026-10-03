package aividadeSwitchCase;

public class Livro {
    
    private String titulo;
    private String autor;
    private double preco;

    // Construtor Vazio
    public Livro() {
        this.titulo = "Java primeiros passos";
        this.autor = "Daniel";
        this.preco = 50.0;
    }

    // Construtor Parametrizado
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    // Getters & Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("===== Relatório do Produto ====");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("=========================================");
    }
}