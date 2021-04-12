import java.util.Scanner;
public class Main
{
static	double taxa = 28;
static	double cem = 1000;
	double solicitado;
	double resultado;
	int parcelas;
	double juros;
	
	
	
	public double solicitar(){
	   Scanner sc = new Scanner(System.in);
	
	        System.out.println("digite o valor que deseja solicitar.");
	    
	    
	    solicitado = sc.nextInt();
	        System.out.println("Valor solicitado: "+solicitado+"");
	    return solicitado;
	    }	       	   

	
	public double juros_simples(){
	  Main main = new Main();
	    
	    resultado = solicitar() *  taxa;
	    
	    resultado = resultado / cem;
	   solicitado = resultado +solicitado;
	   System.out.println("valor total a ser pago, \n juros simples"+solicitado+"");
	    return solicitado;
	} 
	
	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);



Main main = new Main();
main.juros_simples();

	}

    
    
}
