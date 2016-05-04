/**
 * Classe filha da classe subgerente podendo fazer todas as funções de subgerente
 * juntamente com as de gerente.
 * @author Igor
 * @version 2.3
 * @see Subgerente
 */
package Classes.Funcionarios; // Pacote onde se localiza a classe

public class Gerente extends SubGerente {
// Variaveis estaticas
    private static int contaMatricula = 1; // Conta o numero da matricula
    
//Construtores
    /**
     * Construtor contendo todas as variaveis.
     * @param salario
     * @param matricula
     * @param nome
     * @param endereco
     * @param telefone
     * @param email
     * @param RG
     * @param CPF
     * @param CPTS
     * @param agenciaBancaria
     * @param contaBancaria 
     * @see SubGerente#SubGerente(double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) 
     * @since Versão 1.2
     */
    public Gerente(double salario, String matricula,
           String nome, String endereco, String telefone, String email,
           String RG, String CPF, String CPTS, String agenciaBancaria,
           String contaBancaria) {
        super(salario, matricula,nome, endereco, telefone, email, RG,
              CPF, CPTS, agenciaBancaria, contaBancaria);
    }
    /**
     * Construtor vazio
     * @see SubGerente#SubGerente()
     * @since Versão 1.2
     */
    public Gerente() {
        super();
    }
    
    
// Metodos sobrepostos   
    /**
     * Metodo que gera a matricula do usuario sendo cadastrado.
     * Função sobrepões gerarMatricula da classe Pessoa
     * 
     * @see SubGerente#gerarMatricula() 
     * @since Versão 2.3
     */
    @Override // Avisa ao compilador que estou sobrescrevendo um metodo herdado
    public void gerarMatricula() {
        /* Determina a matricula com baseada no codigo de Subgerente(2) e o 
        valor de contaMatricula.
        */
        matricula = Integer.toString(100000 + contaMatricula);
        contaMatricula++; // incrementa conta matricula
    }
    
    /**
     * Retorna o conteudo da variavel cargo, o cargo representado pela classe.
     * Função sobrepões gerarCargo da classe Funcionario.
     * 
     * @return <code>String</code> do cargo.
     * @see SubGerente#getCargo() 
     * @since Versão 2.3
     */
    @Override
    public String getCargo() {
        return "Gerente";
    }
}
