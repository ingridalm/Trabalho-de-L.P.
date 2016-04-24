/**
 * Classe filha da classe subgerente podendo fazer todas as funções de subgerente
 * juntamente com as de gerente.
 * @author Igor
 * @version 2.2
 * @see Subgerente
 */
package Classes; // Pacote onde se localiza a classe

public class Gerente extends SubGerente {
// Variaveis estaticas
    protected static int contaMatricula = 1; // Conta o numero da matricula
    // Define o cargo representado por esta clase
    private static String cargo = "Gerente";
/**
     * Metodo que gera a matricula do usuario sendo cadastrado.
     * Função sobrepões gerarMatricula da classe Pessoa
     * 
     * @see gerarMatricula (Classe Vendedor)
     * 
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
     * Função sobrepões gerarMatricula da classe Pessoa.
     * 
     * @return o cargo representado pela classe
     */
    @Override // Avisa ao compilador que estou sobrescrevendo um metodo herdado
    public String getCargo(){
    	return cargo; // retorna o cargo que a classe representa
    }
}
