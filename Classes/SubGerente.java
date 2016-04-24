/**
 * Classe filha de vendedor, contendo funções extras de subgerente + todas as
 * funções de vendedor.
 * @author Igor
 * @version 2.2
 * @see Vendedor
 */
package Classes;

public class SubGerente extends Vendedor {
// Variaveis estaticas
    protected static int contaMatricula = 1; // Conta o numero da matricula
    // Define o cargo representado por esta clase
    private static String cargo = "Subgerente";
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
        matricula = Integer.toString(200000 + contaMatricula);
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
