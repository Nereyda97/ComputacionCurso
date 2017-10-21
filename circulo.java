package figurasGeometricas;
//Lidia Nereyda Hernandez Campos
//lilinere97@gmail.com
import java.util.Scanner;
public class circulo {
	Scanner T=new Scanner(System.in);
    double radio;
    double diametro;
    static int numeroCirculos=0;
    final double PI=Math.PI;
    
    //Constructor
    circulo(){
        radio=0;
        numeroCirculos++;
    }
    //CONSTRUCTOR
    circulo(double radio){
        this.radio=radio;
        numeroCirculos++;
    }
    
    public double calculaArea(){
        return PI*radio*radio;
    }
    public double calculaPerimetro(){
        return Math.PI*(2*radio);
    }
    public void DameRadio(){
    	System.out.println("Dame el radio: ");
    	this.radio=T.nextDouble();
    }
    public  void cuantosCirculosExisten(){
    	System.out.println("Se ha creado: "+numeroCirculos+" circulos(s)");
    }
}
