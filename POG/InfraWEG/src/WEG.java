import java.util.ArrayList;

/**
 * A classe WEG representa uma empresa que fornece produtos e serviços de manutenção.
 * Ela mantém listas de produtos disponíveis e serviços de manutenção.
 */
public class WEG {
    private ArrayList<ProdutoWEG> produtosDisponiveis = new ArrayList<ProdutoWEG>();
    private ArrayList<ServicoManutencao> servicosDeManutencao = new ArrayList<ServicoManutencao>();

    /**
     * Adiciona um produto à lista de produtos disponíveis.
     *
     * @param produto O produto a ser adicionado.
     */
    public void adicionarProduto(ProdutoWEG produto) {
        produtosDisponiveis.add(produto);
    }

    /**
     * Adiciona um serviço de manutenção à lista de serviços de manutenção.
     *
     * @param servico O serviço de manutenção a ser adicionado.
     */
    public void adicionarServicoManutencao(ServicoManutencao servico) {
        servicosDeManutencao.add(servico);
    }

    /**
     * Lista todos os produtos disponíveis.
     */
    public void listarTodosOsProdutos() {
        for (int i = 0; i < produtosDisponiveis.size(); i++) {
            System.out.println(produtosDisponiveis.get(i));
        }
    }

    /**
     * Lista todos os serviços de manutenção disponíveis.
     */
    public void listarTodosOsServicosManutencao() {
        for (int i = 0; i < servicosDeManutencao.size(); i++) {
            System.out.println(servicosDeManutencao.get(i));
        }
    }

    /**
     * Lista as informações detalhadas de todos os produtos disponíveis.
     */
    public void listarInformacoesProdutos() {
        System.out.println("-----------------------");
        for (int i = 0; i < produtosDisponiveis.size(); i++) {
            ProdutoWEG produto = produtosDisponiveis.get(i);
            produto.imprimirInformacoes();
            System.out.println("-----------------------");
        }
    }
}
