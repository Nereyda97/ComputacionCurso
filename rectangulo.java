package figurasGeometricas;
//Lidia Nereyda Hernandez Campos
//lilinere97@gmail.com
import java.util.Scanner;
public class rectangulo {
    double base;
    double altura;
    static int numeroRectangulos=0;
    
    //Constructor
    rectangulo(){
    	base=0;
    	altura=0;
    	numeroRectangulos++;
    }
    //CONSTRUCTOR
    rectangulo(double base,double altura){
        this.base=base;
        this.altura=altura;
    	numeroRectangulos++;
    }
   
    public void dameBaseAltura(){
    	Scanner T=new Scanner(System.in);
    	System.out.println("Dame la base");
    	this.base=T.nextDouble();
    	System.out.println("Dame altura");
    	this.altura=T.nextDouble();
    }    
    public double perimetro(){
    	return ((2*base)+(2*altura));
    }
    public double area(){
    	return base*altura;
    }
    public   void cuantosRectangulosExisten(){
    	System.out.println("Se ha creado: "+numeroRectangulos+" rectangulos(s)");
    }
    
}

