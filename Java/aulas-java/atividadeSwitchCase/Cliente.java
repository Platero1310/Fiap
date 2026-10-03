package aividadeSwitchCase;

public class Cliente {
    
    private String nome;
    private String cpf;
    private double saldoCarteira;

    // Construtor Vazio
    public Cliente() {
        this.nome = "Java primeiros passos";
        this.cpf = "241.056.878-34";
        this.saldoCarteira = 50.99;
    }

    // Construtor Parametrizado
    public Cliente(String nome, String cpf, double saldoCarteira) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldoCarteira = saldoCarteira;
    }

    // Getters & Setters corretos
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldoCarteira() {
        return this.saldoCarteira;
    }
    
    public void setSaldoCarteira(double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }
    
    // Método de Pagamento
    public boolean realizarPagamento(double valor) {
        if (this.saldoCarteira >= valor) {
            this.saldoCarteira -= valor;
            return true; // Compra aprovada
        } else {
            return false; // Saldo insuficiente
        }
    }
}