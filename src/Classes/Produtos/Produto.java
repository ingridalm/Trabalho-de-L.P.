package Classes.Produtos;
//Importações
import java.util.Calendar;

        
/**
 * 
 * Classe que conterá todas as funções e caracteristicas do produto. O nome,
 * codigo de barras, preço de venda e o custo de compra, a validade. Tambem 
 * realizará as operações que envolvam o produto como obtenção do lucro obtido
 * na venda do  produto, a taxa de impostos sobre o produto, o cadastro de 
 * novos produtos e a criação da tabela, a verificaçao de produtos vencidos.
 * Contem tambem funções recursivas que funcionarão para criar, procurar e 
 * remover produtos da lista criada.
 * 
 * Funções a serem implementadas: Salvar, buscar, e apagar produtos em arquivo.
 * 
 * @author Deynne
 * @author Ingrid
 * @version 1.4
 * 
 */
public class Produto{
    
    // O unico acesso as variaveis é atravez dos metodos.
    private String nome, // Armazena o nome do produto.
                   codigo; // Armazena o codigo do produto.
    
    private Double preco, // Armazena o preço de venda do protudo.
                   custo, // Armazena o custo de obtenção do produto.
                   imposto; // taxa de porcentagemd e imposto
    
    private Calendar validade; // Armazena a data
    //Armazena o proximo produto(Necessario para criação de lista)
    private Produto proximoProduto; 
    
    
//Constutores
    /**
     * 
     * Construtor mais simples, sem parametros.
     * @since Versão 1.4
     */
    public Produto(){
        nome = ""; // Armazena o nome do produto.
        codigo = ""; // Armazena o codigo do produto.
        preco = 0.0; // Armazena o preço de venda do protudo.
        custo = 0.0; // Armazena o custo de obtenção do produto.
        imposto = 0.0; // taxa de porcentagemd e imposto
        
        /* Obtem as informações de data atuais do sistema,
        usado definir uma memoria a ser alocada.
        */
        validade = Calendar.getInstance();
        proximoProduto = null; //Define o endereço do proximo produto;
    } 
    
    /**
     * 
     * Construtor simples, mas com parametros para nome, validade e codigo do 
     * objeto.
     * 
     * @param nome Nome do produto.
     * @param codigo Codigo de barras do produto.
     * @param dia dia de vencimento.
     * @param mes mês de vencimento.
     * @param ano ano de vencimento.
     * @since Versão 1.0
     */
    public Produto(String nome, String codigo, int dia, int mes, int ano) {
        this.nome = nome; // Define nome(variavel) como nome(Parametro).
        this.codigo = codigo; // Define codigo(variavel) como codigo(Parametro).
        /* Obtem as informações de data atuais do sistema,
        usado definir uma memoria a ser alocada.
        */
        validade = Calendar.getInstance();
        // define a validade(variavel) com o dia, mês e ano dos parametros.
        this.validade.set(ano, mes, dia);
    }
    
    /**
     * 
     * Construtor completo com parametros necessarios para preencher todos os
     * dados do produto.
     * 
     * @param nome Nome do produto.
     * @param codigo Codigo do produto
     * @param preco Preço do produto
     * @param custo Custo do produto
     * @param dia Dia de vencimento
     * @param mes Mes de vencimento
     * @param ano Ano de vencimento
     * @since Versão 1.0
     */
    public Produto(String nome, String codigo, Double preco, Double custo, int dia, int mes, int ano) {
        this(nome,codigo,dia,mes,ano); // Chama o construtor anterior.
        this.preco = preco; // Atribui ao preco(variavel) o valor de preco(Parametro)
        this.custo = custo; // Atribui ao custo(variavel) o valor de custo(Parametro)
    }    
//Metodos 
    /**
     * 
     * Calcula o valor inserido com o desconto da porcentagem de
     * impostos.
     * 
     * @param valor // valor a ser calculado.
     * @return Um <code>Double</code> representando o valor com impostos descontados.
     * @see Double
     * @since 1.0
     */
    public Double valImp(Double valor) {
        return valor -= valor*this.imposto; // Retorna o valor menos o imposto.
    }
    
    /**
     * 
     * Verifica se o produto se encontra na validade ou não.
     * Caso a data de validade estiver antes dada ta atual o
     * produto esta na validade, caso contrario, nao está.
     * 
     * @return <code>true</code> se o valor de validade estiver antes do de dataAtual, <code>false</code> caso contrario.
     * @since Versão 1.2
     * 
     */
    public boolean naValidade () {
        Calendar dataAtual = Calendar.getInstance(); // Obtem a data do sistema.
        // Verifica se a validade está antes da data atual.
        return this.validade.before(dataAtual.getTime());
    }
    
    /** 
     * 
     * Calcula o lucro esperado para um produto, ja considerando o
     * desconto dos impostos.
     * 
     * @param preco O preço de venda do produto
     * @param custo O preço de obtenção do produto(do fabricante).
     * @return Um <code>Double</code> contendo o lucro esperado pra um produto.
     * @see Double
     * @since Versão 1.0
     */
    public Double lucro(Double preco, Double custo) {
        double dif = valImp(preco); // dif recebe o valor do preço com o imposto descontado.
        return dif -= valImp(custo); // a diferença entre o custo e o preço dá o lucro.
    }
    
    /**
     * 
     * Metodo que tem como objetivo possibilitar a criação de 
     * novos objetos do tipo Produto, Possibilitando a adção de novos produtos
     * a "lista".
     * 
     * @param produto Novo produto a ser adcionado.
     * @since Versão 1.4
     */
    public void adcionarProduto(Produto produto) {
        /* Caso o objeto proximoProduto seja nulo, ele está apto a receber
        o parametro produto, que contem o novo produto.
        */
        if(proximoProduto == null) {
            // adciona produto na locação de proximoProduto
            proximoProduto = produto; 
            return; //Return para finalizar a função.
        }
        else {
            /* Caso proximoProduto não seja nulo, de forma recursiva, 
            AdcionarProduto será chamado para proximoProduto, onde será
            analizado se o proximo produto dele será nulo. 
            A função continuará rodando ate que enfim encontre um 
            "proximoProduto" nulo onde possa alocar a variavel.
            */
            proximoProduto.adcionarProduto(produto);
            return; // retorno para finalizar a função.
        }
    }
    
    /**
     * 
     * Procura na "lista" de produtos por um nome ou
     * codigo de um produto expecifico, caso encontre, retorna o endereço de
     * memoria deste poduto, caso contrario retorna null.
     * 
     * @param nomeOuCodigo Nome ou codigo de barras do produto buscado.
     * @return retorna o endereço do <code>Produto</code>, caso o encontre, ou
     * <code>null</code>, caso não encontre nenhum produto com o nome ou codigo inserido.
     * @since Versão 1.4
     */
    public Produto procurarProduto(String nomeOuCodigo) {
        /* Verifica se o codigo ou o nome do produto atual é igual ao nome ou 
        codigo no parametro.
        */
        if(this.codigo.equals(nomeOuCodigo) || this.nome.equals(nomeOuCodigo)) {
            return this; // retorna o endereço do produto.
        }
        /* Caso o proximoProduto do objeto atual seja nulo, então o fim da lista
        foi alcançado e desta forma não é possivel buscar mais pelo produto. Ele
        não existe na lista. Sendo assim, deve-se retornar um endereço nulo.
        */
        else if(proximoProduto == null) {
            return null; // Retorna null.
        }
        /* Por fim, se o nome não é da função, e o proximoProduto não é null,
        então há ainda elementos não verificados na "lista" que devem ser
        verificados.
        */
        else {
            // realisa a procura na proxima lista e retorna o que ela retornar.
            return proximoProduto.procurarProduto(nomeOuCodigo);
        }
    }
    
    /**
     * 
     * Remove um dos elementos da lista.
     * 
     * @param nomeOuCodigo
     * @return <code>true</code> se encontrar e remover o elemento, <code>false</code> caso contrario.
     * @since Versão 1.4
     */
    public boolean removerProduto(String nomeOuCodigo) {
        /* Caso o proximoProduto do objeto atual seja nulo, então o fim da lista
        foi alcançado e desta forma não é possivel buscar mais pelo produto, ele
        não existe na lista e sendo assim, deve-se retornar false.
        */
        if (proximoProduto == null){
            return false;
        }
        /* Se o produto atual tiver o nome ou o codigo determinado no parametro
        ele é o produto a ser removido.
        */
        if(proximoProduto.nome.equals(nomeOuCodigo) || 
           proximoProduto.codigo.equals(nomeOuCodigo)) {
           /* Para que não haja perda dos demais fatores da lista, tendo em  
            apagar um elemento resulta em perder todos os seus "filhos", é
            necessario que o elemento a ser apagado receba o endereço do seu 
            "filho", que manterá a existencia da "lista" ao mesmo tempo que
            remove o elemento que era buscado para remoção.
            
            Observação: Note que o espaço de memoria não é liberado, mas apenas
            não possui mais variaveis se referindo a ele. Desta forma, cabe ao
            garbage colector a liberação da memoria.
            */
            proximoProduto = proximoProduto.proximoProduto;
           return true; // finaliza a função
        }
        else {
            /* Caso contrario executa a função para o proximo produto e retorna
            o que ela retornar.
            */
            return proximoProduto.removerProduto(nome);
            
        }
    }
    
//Sets
    /**
     * 
     * Permite a insersão de um nome.
     * 
     * @param nome O nome do produto.
     * @see Produto#getNome()
     * @since Versão 1.0
     */
    public void setNome(String nome) {
        this.nome = nome; // nome variavel recebe o nome parametro.
    }
    
    /**
     * 
     * Permite a insersão de um codigo.
     * 
     * @param codigo O codigo do produto.
     * @see Produto#getCodigo()
     * @since Versão 1.0
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo; // codigo variavel recebe codigo parametro.
    }
    
    /**
     * 
     * Permite a insersão de um preço.
     * 
     * @param preco O preço do produto.
     * @see Produto#getPreco()
     * 
     */
    public void setPreco(Double preco) {
        this.preco = preco; //  preco variavel recebe preco parametro.
    }
    
    /**
     * 
     * Permite a insersão de um custo.
     * 
     * @param custo O custo do produto.
     * @see Produto#getCusto()
     * 
     */
    public void setCusto(Double custo) {
        this.custo = custo; // custo variavel recebe custo parametros
    }
    
    /**
     * 
     * Permite a insersão de uma validade.
     * 
     * @param dia dia de vencimento
     * @param mes mes de vencimento
     * @param ano ano de vencimento
     * @see Produto#getValidade()
     * @since Versão 1.2
     */
    public void setValidade(int dia, int mes,int ano) {
        /* Utiliza set para definir o dia, mes e ano. Observe que o mês recebe
        o valor do parametro-1, isto se deve ao fato da contagem do mês se 
        iniciar em 0.
        */
        this.validade.set(ano,mes-1,dia);
    }
    
    /**
     * 
     * setImposto: determina um valor para a porcentagem de imposto. O valor
     * inserido será inteiro e então será convertido para real.
     * 
     * @param imposto 
     * @see Produto#getImposto()
     * @since 1.0
     */
    public void setImposto(Double imposto) {
        this.imposto = imposto/100;
    }
    
//Gets
    /**
     * 
     * Exibe o nome do produto.
     * 
     * @return retorna a <code>String</code> do nome
     * @see Produto#setNome(java.lang.String)
     * @since Versão 1.0
     */
    public String getNome() {
        return this.nome; // retorno do nome do produto.
    }
    
    /**
     * 
     * Exibe o codigo de barras do produto
     * 
     * @return retorna o <code>String</code> do code.
     * @see Produto#setCodigo(java.lang.String) 
     * @since Versão 1.0
     */
    public String getCodigo() {
        return this.codigo; // retorna o nome do produto.
    }
    
    /**
     * 
     * Exibe o preço do produto.
     * 
     * @return retorna o <code>Double</code> do preço.
     * @see Produto#setPreco(java.lang.Double) 
     * @since Versão 1.0
     */
    public Double getPreco() {
        return this.preco; // retorna o preço do produto.
    }
    
    /**
     * 
     * getCusto: Exibe o custo do produto.
     * 
     * @return retorna o <code>Double</code> do custo.
     * @see Produto#setCusto(java.lang.Double) 
     * @since Versão 1.0
     */
    public Double getCusto() {
        return this.custo; // retorna o custo do produto.
    }
    
    /**
     * 
     * getValidade: Exibe a validade no formato dd/MM/YYYY.
     * 
     * @return retorna a <code>String</code> da validade do protudo.
     * @see Produto#setValidade(int, int, int) 
     * @since Versão 1.2
     */
    public String getValidade() {
        Integer dia, mes, ano; // Variaveis para o dia, mes e ano.
        dia = this.validade.get(Calendar.DATE); // Recebe o dia do mês
        /* O mês, como foi dito na setValidade() inicia sua contagem no 0 e por
        este motivo deve receber o parametro - 1. Isto não acontece com a 
        exibição do valor de mÊs, o que faz com que o valor de mÊs, que foi 
        reduzido no setValidade() necessite ser aumentado novamente.
        */
        mes = this.validade.get(Calendar.MONTH)+1;
        ano = this.validade.get(Calendar.YEAR); // recebe o valor do ano.
        // Retorna uma string com o valor da data no formato dd/MM/YYYY.
        return dia.toString() + "/" + mes.toString() + "/" + ano.toString() + " ";
    }
    /**
     * Retorna o valor do importo calculado em forma de porcentagem
     * 
     * @return retorna a <code>String</code> da validade do imposto.
     * @see Produto#setImposto(java.lang.Double) 
     * @since Versão 1.0
     */
    public String getImposto() {
        Double num = this.imposto * 100;
        return num.toString() + "%";
    }
    
}