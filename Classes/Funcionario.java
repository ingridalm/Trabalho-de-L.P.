/**
 * Classe abstrata basica contendo todas as informações de uma pessoa para o
 * programa. Nela estão definidas todas as variaveis base para o funcionamento
 * de um perfil de usuario. Com nome, RG, CPF, informações bancarias e etc.
 * 
 * @author Igor
 * @author Deynne
 * @version 1.2
 */
package Classes; // Pacote onde a classe se localiza.

public abstract class Funcionario {
// Variaveis
    protected double salario; // Armazena o valor do salario
    protected String nome, // Armazena o nome
                     matricula, // Armazena o numero de matricula
                     endereco, // Armazena o endereço
                     telefone, // Armazena o telefone
                     email, // Armazena o email
                     RG, // Armazena o Registro Geral
                     CPF, // Armazena o Certificado de Pessoa Fisica
                     CPTS, // Armazana o CTPS(Numero da carteira de trabalho)
                     agencia, // Armazena a agencia bancaria
                     contabancaria; // Armazena a conta bancaria
    
//Metodos abstratos
    
    /**
     * Metodo abstrato. Define uma base para o metodo gerarMatricula. Como a 
     * forma que a matricula é gerada varia a cada tipo filho, esse metodo deve
     * ser abstrato, ou sejá, será definido em cada classe filha. Inicia-se ele
     * aqui para assim poder utilizar o tipo Pessoa como base para qualquer
     * classe filha sem perda de metodos.
     * 
     * 
     */
    public abstract void gerarMatricula(); 
    
    /**
     * Metodo Abstrato. Define uma base para o metodo getCargo. Como o cargo
     * variaem cada tipo filho, esse metodo deve ser abstrato, ou sejá, será
     * definido em cada classe filha. Inicia-se ele aqui para assim poder
     * utilizar o tipo Pessoa como base para qualquer classe filha sem perda
     * de metodos.
     * 
     * @return Retorna o Cargo ocupado pela pessoa
     * 
    */
    public abstract String getCargo();
//Sets
    /**
     * Permite a alteração da variavel salario.
     * 
     * @param salario
     * 
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    /**
     * Permite a alteração da variavel ContaBancaria.
     * 
     * @param contaBancaria
     * 
     */
    public void setContabancaria(String contabancaria) {
        this.contabancaria = contabancaria;
    }
    /**
     * Permite a alteração da variavel nome.
     * 
     * @param nome
     * 
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    /**
     * Permite a alteração da variavel endereco.
     * @param endereco
     */
    public void setEndereco(String endereco){
    	this.endereco = endereco;
    }
    /**
     * Permite a alteração da variavel telefone.
     * 
     * @param telefone
     * 
     */
    public void setTelefone(String telefone){
    	this.telefone = telefone;
    }
    /**
     * Permite a alteração da variavel email.
     * 
     * @param email
     * 
     */
    public void setEmail(String email){
	this.email = email;
    }
    /**
     * Permite a alteração da variavel RG.
     * 
     * @param RG 
     * 
     */
    public void setRG(String RG){
    	this.RG = RG;
    }
    /**
     * Permite a alteração da variavel CPF.
     * 
     * @param CPF
     * 
     */
    public void setCPF(String CPF){
	this.CPF = CPF;
    }
    /**
     * Permite a alteração da variavel CTPS.
     * 
     * @param CPTS
     * 
     */
    public void setCPTS(String CPTS){
	this.CPTS = CPTS;
    }
    /**
     * Permite a alteração da variavel agencia.
     * 
     * @param agencia
     * 
     */
    public void setAgencia(String agencia){
	this.agencia = agencia;
    }
    /**
     * Permite a alteração da variavel nome.
     * 
     * @param contabancaria
     * 
     */
    public void setContaBancaria(String contabancaria){
	this.contabancaria = contabancaria;
    }
// Gets
    /**
     * Obtem o conteudo da variavel nome
     * 
     * @return conteudo da variavel nome
     * 
     */
    public String getNome(){
	return nome;
    }
    /**
     * Obtem o conteudo da variavel endereco
     * 
     * @return conteudo da variavel endereco
     * 
     */
    public String getEndereco(){
	return endereco;
    }
    /**
     * Obtem o conteudo da variavel telefone
     * 
     * @return conteudo da variavel teefone
     * 
     */
    public String getTelefone(){
	return telefone;
    }
    /**
     * Obtem o conteudo da variavel email
     * 
     * @return conteudo da variavel email
     * 
     */
    public String getEmail(){
    	return email;
    }
    /**
     * Obtem o conteudo dea variavel RG
     * 
     * @return conteudo da variavel
     * 
     */
    public String getRG(){
    	return RG;
    }
    /**
     * Obtem o conteudo da variavel CPF
     * 
     * @return conteudo da variavel CPF
     * 
     */
    public String getCPF(){
    	return CPF;
    }
    /**
     * Obtem o conteudo da variavel CTPS
     * 
     * @return conteudo da variavel CTPS
     * 
     */
    public String getCPTS(){
    	return CPTS;
    }
    /**
     * Obtem o conteudo da variavel agencia
     * 
     * @return conteudo da variavel agencia
     * 
     */
    public String getAgencia(){
	return agencia;
    }
    /**
     * Obtem o conteudo da variavel contaBancaria
     * 
     * @return conteudo da variavel contaBancaria
     * 
     */
    public String getContaBancaria(){
    	return contabancaria;
    }
    /**
     * Obtem o conteudo da variavel matricula
     * 
     * @return conteudo da variavel matricula
     * 
     */
    public String getMatricula() {
        return matricula;
    }
}
