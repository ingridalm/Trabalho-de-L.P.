/**
 * Classe filha de vendedor, contendo funções extras de subgerente + todas as
 * funções de vendedor.
 * @author Igor
 * @version 2.3
 * @see Vendedor
 */
package Classes.Funcionarios;

public class SubGerente extends Vendedor {
// Variaveis estaticas
    private static int contaMatricula = 1; // Conta o numero da matricula

//Construtores
/**
 * Construtor contendo todas as vaiaveis.
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
 * @see Vendedor#Vendedor(double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) 
 * @since Versao 1.2
 */
    public SubGerente(double salario, String matricula,
           String nome, String endereco, String telefone, String email,
           String RG, String CPF, String CPTS, String agenciaBancaria,
           String contaBancaria) {
        super(salario, matricula,nome, endereco, telefone, email, RG, CPF, CPTS, agenciaBancaria, contaBancaria);
    }
    /**
     * Construtor Vazio.
     * @see Vendedor#Vendedor() 
     * @since Versão 1.2
     */
    public SubGerente() {
        super();
    }

    
    
// Metodos sobrepostos
    /**
     * Metodo que gera a matricula do usuario sendo cadastrado.
     * Função sobrepões gerarMatricula da classe Pessoa
     * 
     * @see Vendedor#gerarMatricula()
     * @since 2.3 
     */
    @Override // Avisa ao compilador que estou sobrescrevendo um metodo herdado
    public void gerarMatricula() {
        /* Determina a matricula com baseada no codigo de Subgerente(2) e o 
        valor de contaMatricula.
        */
        matricula = Integer.toString(200000 + contaMatricula);
        contaMatricula++; // incrementa conta matricula
    }

    /**
     * Retorna o conteudo da variavel cargo, o cargo representado pela classe.
     * Função sobrepões gerarCargo da classe Funcionario.
     * 
     * @return <code>String</code> do cargo.
     * @see getCargo(Classe Funcionario)
     * @since Versão 2.3
     */
    @Override
    public String getCargo() {
        return "SubGerente"; //retorna o cargo representado pela classe
    }
}
