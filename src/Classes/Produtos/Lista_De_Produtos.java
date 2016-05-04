
package Classes.Produtos;

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
 * @version 1.4
 * @see Produto
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
     * Metodo para adcionar itens a lista. Ela aloca espaço 
     * para o objeto produto, caso nao tenha sido alocado e invoca o metodo
     * AdcionarProduto da classe Produto.
     * 
     * @param produto
     * @see Produto#adcionarProduto(Classes.Produtos.Produto)
     * @throws NullPointerException
     * @since 1.4
     */
    public void adcionarProduto(Produto produto) {
        /* Caso nao exista espaco alocado para o produto base, ele deve ser
        criado.
        */
        if(produtoBase == null) {
            produtoBase = new Produto(); // Aloca espaco para o produto.
        }
        // Invoca o metodo da classe Produto utilizando o mesmo parametro.
        produtoBase.adcionarProduto(produto);
    }
    
    /**
     * 
     * Metodo que busca um produto através de seu nome ou
     * codigo de barras.
     * 
     * @param nomeOuCodigo 
     * @return Endereço do <code>Produto</code> buscado. Retorna <code>null</code> caso nao encontre.
     * @throws NullPointerException
     * @see Produto#procurarProduto(java.lang.String) 
     * @since Versão 1.4
     */
    public Produto procurarProduto(String nomeOuCodigo) {
        /* Caso nao exista espaco alocado para o produto base, ele deve ser
        criado.
        */
        if(produtoBase == null) {
            produtoBase = new Produto(); // Aloca espaco para o produto.
        }
        /* Invoca o metodo da classe Produto utilizando o mesmo parametro.
        e retorna o que ela lhe retornar.
        */
        return produtoBase.procurarProduto(nomeOuCodigo);
    }
    
    /**
     * 
     * Metodo com o objetivo de remover da lista um produto que
     * atenda pelo nome ou codigo inserido. 
     * 
     * @param nomeOuCodigo 
     * @return <code>true</code> caso consiga remover, <code>false</code> caso não consiga.
     * @see Produto#removerProduto(java.lang.String) 
     * @throws NullPointerException
     * @since Versão 1.4
     */
    public boolean removerProduto(String nomeOuCodigo) {
        /* Caso nao exista espaco alocado para o produto base, ele deve ser
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
     * @throws NullPointerException
     * @since Versão 1.4
     */
    public void apagarLista() {
        /* Define o objeto como null, removendo qualquer declaração dele e
        sugerindo ao coletor de lixo a memoria a ser limpa.
        */
        produtoBase = null;
    }
}
