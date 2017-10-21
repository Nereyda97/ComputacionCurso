package figurasGeometricas;
//Lidia Nereyda Hernandez Campos
//lilinere97@gmail.com
import java.util.Scanner;
public class triangulo {
	Scanner T=new Scanner(System.in);
    double base;
    double altura;
    double lado1,lado2,lado3;
    static int numeroTriangulos=0;
    
    //Constructor
    triangulo(){
    	base=0;
    	altura=0;
        numeroTriangulos++;
    }
    //CONSTRUCTOR
    triangulo(double a,double b,double c){
    	this.lado1=a;
    	this.lado2=b;
    	this.lado3=c;
    	numeroTriangulos++;
    	}
    //CONSTRUCTOR
    triangulo(double base,double altura){
    	this.base=base;
    	this.altura=altura;
    	numeroTriangulos++;
    }
    public void DameBaseAltura(){
    	System.out.println("Dame la base: ");
    	base=T.nextDouble();
    	System.out.println("Dame la altura: ");
    	altura=T.nextDouble();
    }
    public double Area(){
    	return ((base*altura)/2);
    }
    public double perimetro(){
    	double perimetro=lado1+lado2+lado3;
    	return perimetro;
    }
    public void DameLados(){
    		System.out.println("Dame lado 1: ");
    		lado1=T.nextDouble();
    		System.out.println("Dame lado 2: ");
    		lado2=T.nextDouble();
    		System.out.println("Dame lado 3: ");
    		lado3=T.nextDouble();
    }
    public void cuantosTriangulosExisten(){
    	System.out.println("Se ha creado: "+numeroTriangulos+" triangulos(s)");
    }
}

