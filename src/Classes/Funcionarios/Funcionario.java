
package Classes.Funcionarios; // Pacote onde a classe se localiza.

import Classes.Produtos.*;
/**
 * Classe abstrata contendo informações e metodos que serao usados por
 * funcionarios.
 * 
 * @author Igor
 * @author Deynne
 * @version 2.0
 * @see Pessoa
 * @see Vendedor
 * @see SubGerente
 * @see Gerente
 */
public abstract class Funcionario extends Pessoa{
    
// Variaveis
    protected double salario;// Armazena o valor do salario
    protected String matricula; // Armazena o numero de matricula

//Construtores
    /**
     * Construtor contendo todas as informações de um funcionario.
     * 
     * @param salario
     * @param nome
     * @param endereco
     * @param telefone
     * @param email
     * @param RG
     * @param CPF
     * @param CPTS
     * @param agenciaBancaria
     * @param contaBancaria 
     * @see Pessoa#Pessoa(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     * @since Versão 1.2
     */
    public Funcionario(double salario, String nome,
            String endereco, String telefone, String email, String RG,
            String CPF, String CPTS, String agenciaBancaria,
            String contaBancaria) {
        super(nome, endereco, telefone, email, RG, CPF, CPTS,
              agenciaBancaria, contaBancaria); // chama o construtor da classe Pessoa
        this.salario = salario; // Define o salario //
    }
    /**
     * Construtor basico.
     * @see Pessoa#Pessoa() 
     * @since Versão 1.2
     */
    public Funcionario() {
        super(); // Chama construtor da classe Pessoa
        matricula = ""; // Incia matricula
        salario = 0.0; // Inicia salario
    }
    
    

//Metodos abstratos
    /**
     * Metodo abstrato. Define uma base para o metodo gerarMatricula. Como a 
     * forma que a matricula é gerada varia a cada tipo filho, esse metodo deve
     * ser abstrato, ou sejá, será definido em cada classe filha. Inicia-se ele
     * aqui para assim poder utilizar o tipo Pessoa como base para qualquer
     * classe filha sem perda de metodos.
     *
     * @see Vendedor#gerarMatricula()
     * @see Gerente#gerarMatricula()
     * @see SubGerente#gerarMatricula()
     * @since Versão 1.2
     */
    public abstract void gerarMatricula(); 
    
    /**
     * Metodo abstrato, varia em cada casse.
     * Obtem o conteudo da variavel cargo
     * 
     * @return <code>String</code> representando o cargo ocupado pelo funcionario
     * @see Vendedor#getCargo() 
     * @see SubGerente#getCargo() 
     * @see Gerente#getCargo() 
     * @since Versão 1.4
     */
    public abstract String getCargo();
    
//Metodos
    /**
     * Metodo para listar todas as informações do funcionario cadastrado.
     * 
     * @return <code>String</code> com a Lista de informações do funcionario.
     * @see Pessoa#toString()
     * @since Versão 1.4
     */
    @Override // sobrepõe metodo da classe Pessoa
    public String toString() {
        return super.toString() + "Cargo: " + getCargo() + '\n' +
               "Matricula: " + getMatricula() + '\n' + "Salario: " +
               salario + '\n';   
    }
    /**
     * Metodo para adção de produtos a lista.
     * 
     * @param lP
     * @param p
     * @see Produto#adcionarProduto(Classes.Produtos.Produto)
     * @see Lista_De_Produtos#adcionarProduto(Classes.Produtos.Produto) 
     * @since Versão 2.0
     */
    public void adcionarProduto(Lista_De_Produtos lP,Produto p) {
        lP.adcionarProduto(p); // Invoca metodo da classe Lista_De_Produtos.
    }
    /**
     * Busca os produtos na lista.
     * 
     * @param lP
     * @param nOuC
     * @return O Endereço do <code>Produto</code> buscado.
     * @see Lista_De_Produtos#procurarProduto(java.lang.String) 
     * @see Produto#procurarProduto(java.lang.String) 
     * @since Versão 2.0
     */
    public Produto procurarProduto(Lista_De_Produtos lP,String nOuC) {
        // Invoca o metodo da classe Lista_De_Produtos e retorna o que ele retornar.
        return lP.procurarProduto(nOuC);
    }
    /**
     * Remove um produto da lista
     * @param lP
     * @param nOuC
     * @return <code>true</code> se o item for removido, <code>false</code> caso contrario.
     * @see Produto#removerProduto(java.lang.String) 
     * @see Lista_De_Produtos#removerProduto(java.lang.String) 
     * @since Versão 2.0
     */
    public boolean removerProduto(Lista_De_Produtos lP,String nOuC) {
        // Invoca o metodo da classe Lista_De_Produtos e retorna o que ele retornar.
        return lP.removerProduto(nOuC);
    }
    /**
     * Apaga uma lista de produtos da memoria do programa.
     * @param lP 
     * @see Lista_De_Produtos#apagarLista() 
     * @since Versão 2.0
     */
    public void apagarLista(Lista_De_Produtos lP) {
        // Invoca o metodo da classe Lista_De_Produtos.
        lP.apagarLista();
    }
//Sets    
    /**
     * Permite a alteração da variavel salario.
     * 
     * @param salario
     * @since Versão 1.0
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

// Gets    
    /**
     * Obtem o conteudo da variavel matricula
     * 
     * @return <code>String</code> representando matricula
     * @since Versão 1.0
     */
    public String getMatricula() {
        return matricula;
    }
}
