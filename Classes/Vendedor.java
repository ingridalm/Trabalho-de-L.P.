/**
 * @author Igor
 * @author Deynne
 * @version 2.2
 * @see Pessoa
 */
package Classes; // pacote onde se localiza a classe

public class Vendedor extends Funcionario {
// Variaveis estaticas
    protected static int contaMatricula = 1; // Conta o numero da matricula
    // Define o cargo representado por esta clase
    private static String cargo = "Funcionario";
// Metodos sobrepostos
    /**
     * Metodo que gera a matricula do usuario sendo cadastrado.
     * Função sobrepões gerarMatricula da classe Pessoa
     * 
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
     * Função sobrepões gerarMatricula da classe Pessoa.
     * 
     * @return o cargo representado pela classe
     */
    @Override // Avisa ao compilador que estou sobrescrevendo um metodo herdado
    public String getCargo(){
    	return cargo; // retorna o cargo que a classe representa
    }
}
/*
 * nota pessoal:
 * Implementar sistema de busca da ultima matricula.
 * Implementar sistema de substituição de matrcula removida
 * talvez a necessidade da variavel cargo ser static esteja incorrreta, discutir.
 * todas as funções em que não são operadas feitas como strings
 */