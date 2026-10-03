package aulaAssincrona;
 
public class TesteProduto {
 
    public static void main(String[] args) {
        
        // Criando o primeiro produto com o construtor vazio e setando os dados
        Produto prod1 = new Produto();
        prod1.setNome("Teclado Mecânico");
        prod1.setPreco(189.90);
        prod1.setQtdEstoque(15);
        
        // Criando o segundo produto direto pelo parametrizado
        Produto prod2 = new Produto("Mouse Gamer", 89.90, 8);
        
        // Testando a entrada de estoque no mouse
        System.out.println("--- Testando Adicionar Estoque ---");
        boolean adicaoSucesso = prod2.addEstoque(5);
        if (adicaoSucesso) {
            System.out.println("Sucesso: Estoque do Mouse atualizado com +5 unidades.");
        } else {
            System.out.println("Erro: Não deu para adicionar o estoque.");
        }
        System.out.println();
        
        // Testando as vendas no teclado
        System.out.println("--- Simulando Vendas ---");
        
        // Venda que tem que dar certo (comprando menos do que tem)
        boolean venda1 = prod1.fazerVenda(3);
        if (venda1) {
            System.out.println("Venda 1: 3 Teclados vendidos com sucesso!");
        } else {
            System.out.println("Venda 1 Falhou: Estoque insuficiente.");
        }
        
        // Venda que tem que estourar o estoque (comprando mais do que tem)
        boolean venda2 = prod1.fazerVenda(50);
        if (venda2) {
            System.out.println("Venda 2: 50 Teclados vendidos com sucesso!");
        } else {
            System.out.println("Venda 2 Falhou: Quantidade superior ao estoque disponível.");
        }
        System.out.println();
        
        // Printando os relatórios finais na tela
        System.out.println("--- Relatórios Finais do Estoque ---");
        prod1.exibirInfos(); 
        prod2.exibirInfos();
        
    }
}
 