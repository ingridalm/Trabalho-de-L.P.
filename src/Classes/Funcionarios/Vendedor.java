package Classes.Funcionarios; // pacote onde se localiza a classe

/**
 * Classe contendo funções proprias de um vendedor.
 * 
 * @author Igor
 * @author Deynne
 * @version 2.3
 * @see Funcionario
 */
public class Vendedor extends Funcionario {
// Variaveis estaticas
    private static int contaMatricula = 1; // Conta o numero da matricula
//Constutores
    /**
     * Construtor contendo todas as variaveis da classe Vendedor.
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
     * @see Funcionario#Funcionario(double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) 
     * @see Pessoa#Pessoa(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) 
     * @since Versão 1.2
     */
    public Vendedor(double salario, String matricula, String nome,
           String endereco, String telefone, String email, String RG,
           String CPF, String CPTS, String agenciaBancaria,
           String contaBancaria) {
        super(salario, nome, endereco, telefone, email, RG,
                CPF, CPTS, agenciaBancaria, contaBancaria);
    }
    /**
     * Construtor vazio da classe Vendedor.
     * @see Funcionario#Funcionario() 
     * @see Pessoa#Pessoa(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) 
     * @since Versão 1.2
     */
    public Vendedor() {
        super();
    }

    
    
// Metodos sobrepostos
    /**
     * Metodo que gera a matricula do usuario sendo cadastrado.
     * Função sobrepões gerarMatricula da classe Funcionario
     * @see Funcionario#gerarMatricula()
     * @since Versão 2.3
     */
    @Override // Avisa ao compilador que estou sobrescrevendo um metodo herdado
    public void gerarMatricula() {
        /* Determina a matricula com baseada no codigo de funcionario(3) e o 
        valor de contaMatricula.
        */
        matricula = Integer.toString(300000 + contaMatricula);
        contaMatricula++; // incrementa conta matricula
    }

    /**
     * Retorna o conteudo da variavel cargo, o cargo representado pela classe.
     * Função sobrepões gerarCargo da classe Funcionario.
     * 
     * @return <code>String</code> do cargo representado pela classe
     * @see Funcionario#getCargo() 
     * @since 2.3
     */
    @Override
    public String getCargo() {
        return "Vendedor"; //retorna o cargo representado pela classe
    }
}
/*
 * nota pessoal:
 * Implementar sistema de busca da ultima matricula.
 * Implementar sistema de substituição de matrcula removida
 * talvez a necessidade da variavel cargo ser static esteja incorrreta, discutir.
 * todas as funções em que não são operadas feitas como strings
 */