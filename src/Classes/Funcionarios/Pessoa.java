
package Classes.Funcionarios;

/**
 * Classe contendo informações basicas de uma pessoa.
 * 
 * @author Deynne
 * @version 1.1
 * @see Funcionario
 */
public class Pessoa {
    
// Variaveis    
    protected String nome, // Armazena o nome
                     endereco, // Armazena o endereço
                     telefone, // Armazena o telefone
                     email, // Armazena o email
                     RG, // Armazena o Registro Geral
                     CPF, // Armazena o Certificado de Pessoa Fisica
                     CPTS, // Armazana o CTPS(Numero da carteira de trabalho)
                     agenciaBancaria, // Armazena a agencia bancaria
                     contaBancaria; // Armazena a conta bancaria
    
// Construtores
   /**
    * Construtor basico da classe.
    * @since 1.0
    */
    public Pessoa() {
        nome = ""; // Inicia o nome
        endereco = ""; // Inicia o endereço
        telefone = ""; // Inicia o telefone
        email = ""; // Inicia o email
        RG = ""; // Inicia o Registro Geral
        CPF = ""; // Inicia o Certificado de Pessoa Fisica
        CPTS = ""; // Inicia o CTPS(Numero da carteira de trabalho)
        agenciaBancaria = ""; // Inicia a agencia bancaria
        contaBancaria = ""; // Inicia a conta bancaria
    }
    /**
     * Construtor completo da classe, contem todas as variaveis.
     * @param nome
     * @param endereco
     * @param telefone
     * @param email
     * @param RG
     * @param CPF
     * @param CPTS
     * @param agenciaBancaria
     * @param contaBancaria 
     * @since Versão 1.0
     */
    public Pessoa(String nome, String endereco, String telefone, String email,
           String RG, String CPF, String CPTS, String agenciaBancaria,
           String contaBancaria) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.RG = RG;
        this.CPF = CPF;
        this.CPTS = CPTS;
        this.agenciaBancaria = agenciaBancaria;
        this.contaBancaria = contaBancaria;
    }
    
// Metodos
    /**
     * Metodo contendo as informações basicas de uma pessoa. Como nome,endereço,
     * telefone e e-mail.
     * @return <code>String</code> contentendo as informações basicas de uma pessoa.
     * @see Pessoa#infoPrivada()
     * @see Pessoa#toString()
     * @since Versao 1.1
     */
    public String infoBasica() {
        return "Nome: " + nome + "\n" + "Endereço: " + endereco + "\n" +
               "Telefone: " + telefone + "\n" + "E-mail: " + email + "\n";
    }
    /**
     * Metodo contendo informações privadas de uma pessoa. Como cpf, rg, e etc.
     * @return <code>String</code> contentendo as informações privadas de uma pessoa.
     * @see Pessoa#infoBasica()
     * @see Pessoa#toString()
     * @since Versão 1.1
     */
    public String infoPrivada() {
        return "Cpf: " + CPF + "\n" + "RG: " + RG + "\n" +
               "Conta Bancaria: " + contaBancaria + "\n" + "Agencia Bancaria: "
                + agenciaBancaria + "\n";
    }
    /**
     * Metodo contendo todas as informações de uma pessoa, basicas e privadas.
     * @return <code>String</code> contentendo as informações Todas as informações de uma pessoa.
     * @see Pessoa#infoBasica()
     * @see Pessoa#infoPrivada()
     * @see Funcionario#toString()
     * @since Versão 1.1
     *
     */
    @Override //
    public String toString() {
        return infoBasica() + infoPrivada();
    }
    
// Sets
    /**
     * Permite a alteração da variavel nome.
     * 
     * @param nome
     * @see Pessoa#setEndereco(java.lang.String)
     * @see Pessoa#setTelefone(java.lang.String) 
     * @see Pessoa#setEmail(java.lang.String) 
     * @see Pessoa#setCPF(java.lang.String) 
     * @see Pessoa#setRG(java.lang.String) 
     * @see Pessoa#setContaBancaria(java.lang.String) 
     * @see Pessoa#setAgenciaBancaria(java.lang.String) 
     * @see Pessoa#setCPTS(java.lang.String) 
     * @since Versão 1.0
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    
    /**
     * Permite a alteração da variavel endereco.
     * @param endereco
     * @see Pessoa#setNome(java.lang.String)
     * @see Pessoa#setTelefone(java.lang.String) 
     * @see Pessoa#setEmail(java.lang.String) 
     * @see Pessoa#setCPF(java.lang.String) 
     * @see Pessoa#setRG(java.lang.String) 
     * @see Pessoa#setContaBancaria(java.lang.String) 
     * @see Pessoa#setAgenciaBancaria(java.lang.String) 
     * @see Pessoa#setCPTS(java.lang.String)
     * @since Versão 1.0
     */
    public void setEndereco(String endereco){
    	this.endereco = endereco;
    }
    
    /**
     * Permite a alteração da variavel telefone.
     * 
     * @param telefone
     * @see Pessoa#setEndereco(java.lang.String)
     * @see Pessoa#setNome(java.lang.String) 
     * @see Pessoa#setEmail(java.lang.String) 
     * @see Pessoa#setCPF(java.lang.String) 
     * @see Pessoa#setRG(java.lang.String) 
     * @see Pessoa#setContaBancaria(java.lang.String) 
     * @see Pessoa#setAgenciaBancaria(java.lang.String) 
     * @see Pessoa#setCPTS(java.lang.String)
     * @since Versão 1.0
     */
    public void setTelefone(String telefone){
    	this.telefone = telefone;
    }
    
    /**
     * Permite a alteração da variavel email.
     * 
     * @param email
     * @see Pessoa#setEndereco(java.lang.String)
     * @see Pessoa#setTelefone(java.lang.String) 
     * @see Pessoa#setNome(java.lang.String) 
     * @see Pessoa#setCPF(java.lang.String) 
     * @see Pessoa#setRG(java.lang.String) 
     * @see Pessoa#setContaBancaria(java.lang.String) 
     * @see Pessoa#setAgenciaBancaria(java.lang.String) 
     * @see Pessoa#setCPTS(java.lang.String)
     * @since Versão 1.0
     */
    public void setEmail(String email){
	this.email = email;
    }
    
    /**
     * Permite a alteração da variavel RG.
     * 
     * @param RG 
     * @see Pessoa#setEndereco(java.lang.String)
     * @see Pessoa#setTelefone(java.lang.String) 
     * @see Pessoa#setEmail(java.lang.String) 
     * @see Pessoa#setCPF(java.lang.String) 
     * @see Pessoa#setNome(java.lang.String) 
     * @see Pessoa#setContaBancaria(java.lang.String) 
     * @see Pessoa#setAgenciaBancaria(java.lang.String) 
     * @see Pessoa#setCPTS(java.lang.String)
     * @since Versão 1.0
     */
    public void setRG(String RG){
    	this.RG = RG;
    }
    
    /**
     * Permite a alteração da variavel CPF.
     * 
     * @param CPF
     * @see Pessoa#setEndereco(java.lang.String)
     * @see Pessoa#setTelefone(java.lang.String) 
     * @see Pessoa#setEmail(java.lang.String) 
     * @see Pessoa#setNome(java.lang.String) 
     * @see Pessoa#setRG(java.lang.String) 
     * @see Pessoa#setContaBancaria(java.lang.String) 
     * @see Pessoa#setAgenciaBancaria(java.lang.String) 
     * @see Pessoa#setCPTS(java.lang.String)
     * @since Versão 1.0
     */
    public void setCPF(String CPF){
	this.CPF = CPF;
    }
    
    /**
     * Permite a alteração da variavel CTPS.
     * 
     * @param CPTS@see Pessoa#setEndereco(java.lang.String)
     * @see Pessoa#setTelefone(java.lang.String) 
     * @see Pessoa#setEmail(java.lang.String) 
     * @see Pessoa#setCPF(java.lang.String) 
     * @see Pessoa#setRG(java.lang.String) 
     * @see Pessoa#setContaBancaria(java.lang.String) 
     * @see Pessoa#setAgenciaBancaria(java.lang.String) 
     * @see Pessoa#setNome(java.lang.String)
     * @since Versão 1.0
     */
    public void setCPTS(String CPTS){
	this.CPTS = CPTS;
    }
    
    /**
     * Permite a alteração da variavel agencia.
     * 
     * @param agenciaBancaria
     * @see Pessoa#setEndereco(java.lang.String)
     * @see Pessoa#setTelefone(java.lang.String) 
     * @see Pessoa#setEmail(java.lang.String) 
     * @see Pessoa#setCPF(java.lang.String) 
     * @see Pessoa#setRG(java.lang.String) 
     * @see Pessoa#setContaBancaria(java.lang.String) 
     * @see Pessoa#setNome(java.lang.String) 
     * @see Pessoa#setCPTS(java.lang.String)
     * @since Versão 1.0
     */
    public void setAgenciaBancaria(String agenciaBancaria){
	this.agenciaBancaria = agenciaBancaria;
    }
    
    /**
     * Permite a alteração da variavel nome.
     * 
     * @param contaBancaria
     * @see Pessoa#setEndereco(java.lang.String)
     * @see Pessoa#setTelefone(java.lang.String) 
     * @see Pessoa#setEmail(java.lang.String) 
     * @see Pessoa#setCPF(java.lang.String) 
     * @see Pessoa#setRG(java.lang.String) 
     * @see Pessoa#setNome(java.lang.String) 
     * @see Pessoa#setAgenciaBancaria(java.lang.String) 
     * @see Pessoa#setCPTS(java.lang.String)
     * @since Versão 1.0
     */
    public void setContaBancaria(String contaBancaria){
	this.contaBancaria = contaBancaria;
    }
    
// Gets
    /**
     * Obtem o conteudo da variavel nome
     * 
     * @return <code>String</code> representando nome
     * @see Pessoa#getEndereco()
     * @see Pessoa#getEmail() 
     * @see Pessoa#getTelefone() 
     * @see Pessoa#getRG() 
     * @see Pessoa#getCPF() 
     * @see Pessoa#getCPTS() 
     * @see Pessoa#getContaBancaria() 
     * @see Pessoa#getAgenciaBancaria()
     * @since Versão 1.0
     */
    public String getNome(){
	return nome;
    }
    
    /**
     * Obtem o conteudo da variavel endereco
     * 
     * @return <code>String</code> representando endereço
     * @see Pessoa#getNome()
     * @see Pessoa#getEmail() 
     * @see Pessoa#getTelefone() 
     * @see Pessoa#getRG() 
     * @see Pessoa#getCPF() 
     * @see Pessoa#getCPTS() 
     * @see Pessoa#getContaBancaria() 
     * @see Pessoa#getAgenciaBancaria()
     * @since Versão 1.0
     */
    public String getEndereco(){
	return endereco;
    }
    
    /**
     * Obtem o conteudo da variavel telefone
     * 
     * @return <code>String</code> representando telefone.
     * @see Pessoa#getEndereco()
     * @see Pessoa#getEmail() 
     * @see Pessoa#getNome() 
     * @see Pessoa#getRG() 
     * @see Pessoa#getCPF() 
     * @see Pessoa#getCPTS() 
     * @see Pessoa#getContaBancaria() 
     * @see Pessoa#getAgenciaBancaria()
     * @since Versão 1.0
     */
    public String getTelefone(){
	return telefone;
    }
    
    /**
     * Obtem o conteudo da variavel email
     * 
     * @return <code>String</code> representando email.
     * @see Pessoa#getEndereco()
     * @see Pessoa#getNome() 
     * @see Pessoa#getTelefone() 
     * @see Pessoa#getRG() 
     * @see Pessoa#getCPF() 
     * @see Pessoa#getCPTS() 
     * @see Pessoa#getContaBancaria() 
     * @see Pessoa#getAgenciaBancaria()
     * @since Versão 1.0
     */
    public String getEmail(){
    	return email;
    }
    
    /**
     * Obtem o conteudo dea variavel RG
     * 
     @return <code>String</code> representando RG
     * @see Pessoa#getEndereco()
     * @see Pessoa#getEmail() 
     * @see Pessoa#getTelefone() 
     * @see Pessoa#getNome() 
     * @see Pessoa#getCPF() 
     * @see Pessoa#getCPTS() 
     * @see Pessoa#getContaBancaria() 
     * @see Pessoa#getAgenciaBancaria()
     * @since Versão 1.0
     */
    public String getRG(){
    	return RG;
    }
    
    /**
     * Obtem o conteudo da variavel CPF
     * 
     * @return <code>String</code> representando CPF.
     * @see Pessoa#getEndereco()
     * @see Pessoa#getEmail() 
     * @see Pessoa#getTelefone() 
     * @see Pessoa#getRG() 
     * @see Pessoa#getNome() 
     * @see Pessoa#getCPTS() 
     * @see Pessoa#getContaBancaria() 
     * @see Pessoa#getAgenciaBancaria()
     * @since Versão 1.0
     */
    public String getCPF(){
    	return CPF;
    }
    
    /**
     * Obtem o conteudo da variavel CTPS
     * 
     * @return <code>String</code> representando CTPS.
     * @see Pessoa#getEndereco()
     * @see Pessoa#getEmail() 
     * @see Pessoa#getTelefone() 
     * @see Pessoa#getRG() 
     * @see Pessoa#getCPF() 
     * @see Pessoa#getNome() 
     * @see Pessoa#getContaBancaria() 
     * @see Pessoa#getAgenciaBancaria()
     * @since Versão 1.0
     */
    public String getCPTS(){
    	return CPTS;
    }
    
    /**
     * Obtem o conteudo da variavel agencia
     * 
     * @return <code>String</code> representando agencia bancaria.
     * @see Pessoa#getEndereco()
     * @see Pessoa#getEmail() 
     * @see Pessoa#getTelefone() 
     * @see Pessoa#getRG() 
     * @see Pessoa#getCPF() 
     * @see Pessoa#getCPTS() 
     * @see Pessoa#getContaBancaria() 
     * @see Pessoa#getNome()
     * @since Versão 1.0
     */
    public String getAgenciaBancaria(){
	return agenciaBancaria;
    }
    
    /**
     * Obtem o conteudo da variavel contaBancaria
     * 
     * @return <code>String</code> representando conta bancaria.
     * @see Pessoa#getEndereco()
     * @see Pessoa#getEmail() 
     * @see Pessoa#getTelefone() 
     * @see Pessoa#getRG() 
     * @see Pessoa#getCPF() 
     * @see Pessoa#getCPTS() 
     * @see Pessoa#getNome() 
     * @see Pessoa#getAgenciaBancaria()
     * @since Versão 1.0
     */
    public String getContaBancaria(){
    	return contaBancaria;
    }
    
}