
import java.util.Scanner;

public class Executar {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		int i = 0, j = 0, k = 0;
		int b = 1, o = 1, p = 1;
		String a, d, f, m;
		int g, l, n, q = 0;
		long h;
		double c;
		Funcionario[] funcionarios = new Funcionario[i];
		SubGerente[] subgerentes = new SubGerente[j];
		Gerente[] gerentes = new Gerente[k];
		System.out.println("inserir 1 para executar, 0 sair");
		int x = ler.nextInt();
		while(x == 1){
			System.out.println("1-gerente, 2-subgerete, 3-funcionario");
			int y = ler.nextInt();
			switch(y){
			case 1:
				k++;//serve pra indicar a quantidade de elementos GERENTES
				gerentes = new Gerente[k];
				gerentes[k-1] = new Gerente();//a partir daqui, tudo se trata de setar os atributos
				System.out.println("nome: ");
				a = ler.next();
				gerentes[k-1].setNome(a);
				gerentes[k-1].setMatricula(b);
				System.out.println("salario: ");
				c = ler.nextDouble();
				gerentes[k-1].setSalario(c);
				System.out.println("endere�o: ");
				d = ler.next();
				gerentes[k-1].setEndereco(d);
				System.out.println("telefone: ");
				String e = ler.next();
				gerentes[k-1].setTelefone(e);
				System.out.println("email: ");
				f = ler.next();
				gerentes[k-1].setEmail(f);
				System.out.println("RG: ");
				g = ler.nextInt();
				gerentes[k-1].setRG(g);
				System.out.println("CPF: ");
				h = ler.nextLong();
				gerentes[k-1].setCPF(h);
				System.out.println("CPTS: ");
				l = ler.nextInt();
				gerentes[k-1].setCPTS(l);
				System.out.println("agencia bancaria: ");
				m = ler.next();
				gerentes[k-1].setAgencia(m);
				System.out.println("conta bancaria: ");
				n = ler.nextInt();
				gerentes[k-1].setContaBancaria(n);
				b++;//incremento para se usar na matricula do pr�ximo gerente 
				System.out.println("numero de matricula do funcioanrio: " + gerentes[k-1].getMatricula());
				break;
			case 2:
				j++;//serve pra indicar a quantidade de elementos SUBGERENTES
				subgerentes = new SubGerente[j];
				subgerentes[j-1] = new SubGerente();//a partir daqui, tudo se trata de setar os atributos
				System.out.println("nome: ");
				a = ler.next();
				subgerentes[j-1].setNome(a);
				subgerentes[j-1].setMatricula(o);
				System.out.println("salario: ");
				c = ler.nextDouble();
				subgerentes[j-1].setSalario(c);
				System.out.println("endere�o: ");
				d = ler.next();
				subgerentes[j-1].setEndereco(d);
				System.out.println("telefone: ");
				e = ler.next();
				subgerentes[j-1].setTelefone(e);
				System.out.println("email: ");
				f = ler.next();
				subgerentes[j-1].setEmail(f);
				System.out.println("RG: ");
				g = ler.nextInt();
				subgerentes[j-1].setRG(g);
				System.out.println("CPF: ");
				h = ler.nextLong();
				subgerentes[j-1].setCPF(h);
				System.out.println("CPTS: ");
				l = ler.nextInt();
				subgerentes[j-1].setCPTS(l);
				System.out.println("agencia bancaria: ");
				m = ler.next();
				subgerentes[j-1].setAgencia(m);
				System.out.println("conta bancaria: ");
				n = ler.nextInt();
				subgerentes[j-1].setContaBancaria(n);
				o++;//incremento para se usar na matricula do pr�ximo subgerente
				System.out.println("numero de matricula do funcioanrio: " + subgerentes[j-1].getMatricula());
				break;
			case 3:
				i++;//serve pra indicar a quantidade de elementos FUNCIONARIOS
				funcionarios = new Funcionario[i];
				funcionarios[i-1] = new Funcionario();//a partir daqui, tudo se trata de setar os atributos
				System.out.println("nome: ");
				a = ler.next();
				funcionarios[i-1].setNome(a);
				funcionarios[i-1].setMatricula(p);
				System.out.println("salario: ");
				c = ler.nextDouble();
				funcionarios[i-1].setSalario(c);
				System.out.println("endere�o: ");
				d = ler.next();
				funcionarios[i-1].setEndereco(d);
				System.out.println("telefone: ");
				e = ler.next();
				funcionarios[i-1].setTelefone(e);
				System.out.println("email: ");
				f = ler.next();
				funcionarios[i-1].setEmail(f);
				System.out.println("RG: ");
				g = ler.nextInt();
				funcionarios[i-1].setRG(g);
				System.out.println("CPF: ");
				h = ler.nextLong();
				funcionarios[i-1].setCPF(h);
				System.out.println("CPTS: ");
				l = ler.nextInt();
				funcionarios[i-1].setCPTS(l);
				System.out.println("agencia bancaria: ");
				m = ler.next();
				funcionarios[i-1].setAgencia(m);
				System.out.println("conta bancaria: ");
				n = ler.nextInt();
				funcionarios[i-1].setContaBancaria(n);
				p++;//incremento para se usar na matricula do pr�ximo funcionario
				System.out.println("numero de matricula do funcioanrio: " + funcionarios[i-1].getMatricula());
				break;
			default:
				System.out.println("op��o invalida");
			}
			System.out.println("Opera��o concluida, reinsira um novo valor");
			x = ler.nextInt();
		}
		if (x == 2){
			System.out.println("Insira a matricula para busca: ");
			int z = ler.nextInt();
			if (z > 300000){//busca para funcionarios
				for (int I = 0; I < funcionarios.length; I++){
					if (z == funcionarios[I].getMatricula()){
						System.out.println("cargo: " + funcionarios[I].getCargo());
						System.out.println("nome: " + funcionarios[I].getNome());						
						System.out.println("matricula : " + funcionarios[I].getMatricula());
						System.out.println("salario: " + funcionarios[I].getSalario());						
						System.out.println("endere�o: " + funcionarios[I].getEndereco());						
						System.out.println("telefone: " + funcionarios[I].getTelefone());						
						System.out.println("email: " + funcionarios[I].getEmail());						
						System.out.println("RG: " + funcionarios[I].getRG());						
						System.out.println("CPF: " + funcionarios[I].getCPF());						
						System.out.println("CPTS: " + funcionarios[I].getCPTS());						
						System.out.println("agencia bancaria: " + funcionarios[I].getAgencia());					
						System.out.println("conta bancaria: " + funcionarios[I].getContaBancaria());
						q = I;
						break;
					}
				}
				if (q == funcionarios.length){//caso nao encontre funcionario com a matricula inserida
					System.out.println("nao existe tal matricula");
				}
			} else if(300000 > z && z > 200000){//busca para subgerentes
				for (int I = 0; I < subgerentes.length; I++){
					if (z == subgerentes[I].getMatricula()){
						System.out.println("cargo: " + subgerentes[I].getCargo());
						System.out.println("nome: " + subgerentes[I].getNome());						
						System.out.println("matricula : " + subgerentes[I].getMatricula());
						System.out.println("salario: " + subgerentes[I].getSalario());						
						System.out.println("endere�o: " + subgerentes[I].getEndereco());						
						System.out.println("telefone: " + subgerentes[I].getTelefone());						
						System.out.println("email: " + subgerentes[I].getEmail());						
						System.out.println("RG: " + subgerentes[I].getRG());						
						System.out.println("CPF: " + subgerentes[I].getCPF());						
						System.out.println("CPTS: " + subgerentes[I].getCPTS());						
						System.out.println("agencia bancaria: " + subgerentes[I].getAgencia());					
						System.out.println("conta bancaria: " + subgerentes[I].getContaBancaria());
						q = I;
						break;
					}
				}
				if (q == subgerentes.length){//caso nao encontre subgerente com a matricula inserida
					System.out.println("nao existe tal matricula");
				}
			} else if(200000 > z && z > 100000){//busca para gerentes
				for (int I = 0; I < gerentes.length; I++){
					if (z == gerentes[I].getMatricula()){
						System.out.println("cargo: " + gerentes[I].getCargo());
						System.out.println("nome: " + gerentes[I].getNome());						
						System.out.println("matricula : " + gerentes[I].getMatricula());
						System.out.println("salario: " + gerentes[I].getSalario());						
						System.out.println("endere�o: " + gerentes[I].getEndereco());						
						System.out.println("telefone: " + gerentes[I].getTelefone());						
						System.out.println("email: " + gerentes[I].getEmail());						
						System.out.println("RG: " + gerentes[I].getRG());						
						System.out.println("CPF: " + gerentes[I].getCPF());						
						System.out.println("CPTS: " + gerentes[I].getCPTS());						
						System.out.println("agencia bancaria: " + gerentes[I].getAgencia());					
						System.out.println("conta bancaria: " + gerentes[I].getContaBancaria());
						q = I;
						break;
					}
				}
				if (q == gerentes.length){//caso nao encontre nenhum gerente com a matricula inserida
					System.out.println("nao existe tal matricula");
				}
			} else {//caso a matricula nao esteja nos padroes aceitos no programa
				System.out.println("nao existe tal matricula");
			}
		}
	}
}