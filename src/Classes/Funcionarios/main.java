/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Funcionarios;
import Classes.Produtos.*;
/**
 *
 * @author Deynne
 */
public class main {
    public static void main(String[] args) {
        Lista_De_Produtos lP = new Lista_De_Produtos();
        Produto p = new Produto("Fuba","123",12,2,1997);
        Produto fP;
        Funcionario v = new Vendedor();
        Funcionario g = new Gerente();
        Funcionario sg = new SubGerente();
        v.setNome("Joaquin");
        v.adcionarProduto(lP, p);
        //System.out.println("" + ("".equals(v.getNome())?"Erro 1: Funcionario não cadastrado.":v) + '\n' + ("".equals(g.getNome())?"Erro 1: Funcionario não cadastrado.":g) + '\n' + ("".equals(sg.getNome())?"Erro 1: Funcionario não cadastrado.":sg) + '\n');
        fP = v.procurarProduto(lP,"Fuba");

        System.out.println(fP.getNome());
        if(v.removerProduto(lP, "Fuba")) {
            System.out.println("Produto Removido.");
        }
        else {
            System.out.println("Produto nao consta em estoque");
        }
        v.apagarLista(lP);
        
    }
}
