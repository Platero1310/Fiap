package aulaAssincrona;

public class Produto {
	
	private String nome;
	private double preco;
	private int qtdEstoque;
	
	
	//construtor vazio
	
	public Produto () {
		this.nome = "Sem nome";
		this.preco = 0.0;
		this.qtdEstoque = 0;
	}
	
	
	//construtor parametrizado, até aqui estava tudook :)
	
    public Produto(String nome, double preco, int qtdEstoque) {
    	
    	this.nome = nome;
    	this.preco = preco;
    	this.qtdEstoque = qtdEstoque;
    	 	
    }
	
    //getters and setters
    
    public String getNome() {
    	return nome;
    }
		
	public double getPreco() {
		return preco;
	}
	
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
	public void exibirInfos() {
		System.out.println("===== Relatório do Produto ====");
		System.out.println("Nome: " + this.nome);
		System.out.println("Quantidade em estoque: " + this.qtdEstoque);
		System.out.println("Preço: " + this.preco);
		System.out.println("=========================================");
	}
	
	
	//métodos operacionais -> ainda estava com dificuldade
	
	public boolean addEstoque(int qtd) {
		if (qtd > 0) {
			this.qtdEstoque = this.qtdEstoque + qtd;
			return true;
		}else {
			return false;
		}
		
	}
		
	public boolean fazerVenda(int qtd) {
		if (qtd > 0 && qtd <= this.qtdEstoque) {
			this.qtdEstoque = this.qtdEstoque - qtd;
			return true;
		}else {
			return false;
	}
}	
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
