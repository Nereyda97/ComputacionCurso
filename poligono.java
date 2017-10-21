package figurasGeometricas;
//Lidia Nereyda Hernandez Campos
//lilinere97@gmail.com
import java.util.Scanner;
public class poligono {
    double[] lados;
    int numeroLados;
    static int numeroPoligonos;
    
    //constructor
    poligono(){
        numeroLados=3;//sin no especifico cuantos lados, minimo 3
        lados=new double[3];
        numeroPoligonos++;
        
        for(int i=0;i<3;i++){
            lados[i]=0;
        }
    }
    //constructor
    poligono(int nL){
         this.numeroLados=3;
         this.lados=new double[nL];
         for(int i=0;i<nL;i++){
            lados[i]=0;
        }
         numeroPoligonos++; 
    }
    
    //longitud en los lados del poligono
    public void ponerLados(){
        Scanner T=new Scanner(System.in);
        int n=lados.length;//cuantos lados tiene un poligono
        for(int i=0;i<n;i++){
            System.out.print("Dame el lado "+(i+1)+": ");
            lados[i]=T.nextInt();
        }
    }
    //calcular el perimetro
    public double calculaPerimetro(){
        int n=lados.length;
        double resultado=0;
        for(int i=0;i<n;i++){
        resultado=resultado+lados[i];
        }
        return resultado;
    }
    //regresa el numero de poligonos creados
    public void cuantosPoligonosExisten(){
        System.out.println("Se ha creado: "+numeroPoligonos+" poligono(s)");
    }
    
    public double calcularArea(){
    	double Tan;
        double angulo=360/(lados.length);
        double anguloRadianes = Math.toRadians(angulo/2);
        Tan= Math.tan(anguloRadianes);
        double apotema=(0.5)/(Tan);
        double perimetro=calculaPerimetro();
    	double area=(perimetro*apotema)/2;    
        return area;
    }
    
}
