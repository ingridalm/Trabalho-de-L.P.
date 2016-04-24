
package Classes;

/**
 *
 * Classe base para o funcionamento da lista de produtos. Conterá todas as 
 * funções de lista, como adcionar a lista, remover da lista e buscar na lista.
 * Tambem conterá a função de apagar lista.
 * Obs: Todas as funções da lista, com exceção da apagar lista, são funções que
 * invovam outras funções, de mesmo nome, presente na classe produto.
 * 
 * @author Deynne
 * @author Ingrid
 * @author Junior
 * @author Joubert
 * @author Igor
 * @version 1.2
 * @see classe Produto
 */
public class Lista_De_Produtos {
    /* A classe contem um produto, inicialmente nulo. Este produto é o produto 
    raiz da lista. Sendo um produto que ficará vazio e só servirá de base para 
    os novos produtos que serão adcionados.
    */
    Produto produtoBase = null;

//Metodos
    /**
     * 
     * AdcionarProduto: Metodo para adcionar itens a lista. Ela aloca espaço 
     * para o objeto produto, caso nao tenha sido alocado e invoca o metodo
     * AdcionarProduto da classe Produto.
     * 
     * @param produto Um produto criado anteriormente a chamada 
     * que será adcionado a lista
     * @see AdcionarProduto (Classe Produto)
     */
    public void adcionarProduto(Produto produto) {
        /* Caso não exista espaço alocado para o produto base, ele deve ser
        criado.
        */
        if(produtoBase == null) {
            produtoBase = new Produto(); // Aloca espaoo para o produto.
        }
        // Invoca o metodo da classe Produto utilizando o mesmo parametro.
        produtoBase.adcionarProduto(produto);
    }
    
    /**
     * 
     * ProcurarProduto: Metodo que busca um produto através de seu nome ou
     * codigo de barras.
     * 
     * @param nomeOuCodigo Um nome ou codigo a ser buscado nos produtos da
     * lista.
     * @return Endereço do objeto produto buscado. Retorna null caso nao 
     * encontre.
     * @see ProcurarProduto (Classe Produto)
     */
    public Produto procurarProduto(String nomeOuCodigo) {
        /* Caso não exista espaço alocado para o produto base, ele deve ser
        criado.
        */
        if(produtoBase == null) {
            produtoBase = new Produto(); // Aloca espaoo para o produto.
        }
        /* Invoca o metodo da classe Produto utilizando o mesmo parametro.
        e retorna o que ela lhe retornar.
        */
        return produtoBase.procurarProduto(nomeOuCodigo);
    }
    
    /**
     * 
     * RemoverProduto: Metodo com o objetivo de remover da lista um produto que
     * atenda pelo nome ou codigo inserido. 
     * 
     * @param nomeOuCodigo Nome ou codigo de um item na lista a ser removido.
     * @return true caso consiga remover, false caso não consiga.
     */
    public boolean removerProduto(String nomeOuCodigo) {
        /* Caso não exista espaço alocado para o produto base, ele deve ser
        criado.
        */
        if(produtoBase == null) {
            produtoBase = new Produto(); // Aloca espaoo para o produto.
        }
        /* Invoca o metodo da classe Produto utilizando o mesmo parametro.
        e retorna o que ela lhe retornar.
        */
        return produtoBase.removerProduto(nomeOuCodigo);
    }
    
    /**
     * ApagarLista: Função que tem como intuito apagar totalmente uma lista 
     * criada.
     */
    public void apagarLista() {
        /* Define o objeto como null, removendo qualquer declaração dele e
        sugerindo ao coletor de lixo a memoria a ser limpa.
        */
        produtoBase = null;
    }
}
