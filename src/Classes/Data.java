public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		int invalida = 0 , bissexto = 0;

//Verifica se o ano é bissexto
		
		if(ano < 0){
			invalida++;
			
		}else if((ano%4 == 0) && (ano%100 != 0)){
			bissexto++;
			
		}else if (ano%400 == 0){
			bissexto++;
		}
		
		
		
		
		if ((dia < 1) || (dia > 31)){
			invalida++;
		}
		else if((mes < 1) || (mes > 12)){
			invalida++;
		}
		
		else if(((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && (dia > 30)){
			invalida++;
		}
		else if(bissexto == 0){
				if((mes == 2) && (dia > 28)){
					invalida++;
		        }else{
				    if((mes == 2) && (dia > 29)){
					    invalida++;
		             }
		        }	
		 }
	
	    
		if(invalida == 0){
			System.out.println("É uma data valida!");
		}else{
			System.out.println("É uma data invalida!");
		}
	}
    
	public int getDia(){
		return dia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public int getAno(){
		return ano;
	}
	
	public void setDia(int dia){
		this.dia = dia;
	}
	
	public void setMes(int mes){
		this.mes = mes;
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
	
	public String toString(){
		String dataString = "";
		dataString = (dia + "/" + mes + "/" + ano);
		return dataString;
	}

}
