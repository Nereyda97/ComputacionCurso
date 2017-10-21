package figurasGeometricas;
//Lidia Nereyda Hernandez Campos
//lilinere97@gmail.com
import java.util.Scanner;
public class FigurasGeometricas {
    public static void main(String[] args) {
   
        poligono P1,P2,P3;
        circulo C1,C2;
        rectangulo R1,R2;
        triangulo T1,T2,T3;
        
        double resultado;
        int respuesta;
        double respuestaDouble;
        Scanner T=new Scanner(System.in);
        
        //TRIANGULO QUE RECIBE BASE Y ALTURA
        
        System.out.println("---Triangulo que recibe base 3 y altura 2.---");
        System.out.println("");
        T3=new triangulo(3,2);       
        respuestaDouble=T3.Area();
        System.out.println("El area del triangulo es : "+respuestaDouble);
        T3.DameLados();
        respuestaDouble=T3.perimetro();
        System.out.println("El perimetro del triangulo es: "+respuestaDouble);
        T3.cuantosTriangulosExisten();
        
        //TRIANGULO QUE RECIBE TRES LADOS(1,2,3) RESPECTIVAMENTE
        
        System.out.println("");
        System.out.println("---Triagulo que recibe tres lados(1,2,3) respectivamente.---");
        System.out.println("");
        T2=new triangulo(1,2,3);
        respuestaDouble=T2.perimetro();
        System.out.println("El perimetro del triangulo es: "+respuestaDouble);
        T2.DameBaseAltura();
        respuestaDouble=T2.Area();
        System.out.println("El area del triangulo es : "+respuestaDouble);
        T2.cuantosTriangulosExisten();
        
        //TRIANGULO QUE NO RECIBE NADA
        
        System.out.println("");
        System.out.println("---Triagulo que no recibe nada.---");
        System.out.println("");
        T1=new triangulo();
        T1.DameBaseAltura();
        respuestaDouble=T1.Area();
        System.out.println("El area del triangulo es : "+respuestaDouble);
        T1.DameLados();
        respuestaDouble=T1.perimetro();
        System.out.println("El perimetro del triangulo es: "+respuestaDouble);
        T1.cuantosTriangulosExisten();
        
        //RECTANGULO QUE RECIBE BASE Y ALTURA
        
        System.out.println("");
        R2=new rectangulo(3,2);
        System.out.println("---Rectagulo que recibe base 3 y altura 2.---");
        System.out.println("");
        respuestaDouble=R2.area();
        System.out.println("El area del rectangulo es: "+respuestaDouble);
        respuestaDouble=R2.perimetro();
        System.out.println("El perimetro del rectangulo es: "+respuestaDouble);
        R2.cuantosRectangulosExisten();
        
        //RECTANGULO QUE NO RECIBE NADA
        
        System.out.println("");
        System.out.println("---Rectagulo que no recibe nada.---");
        System.out.println("");
        R1=new rectangulo();
        R1.dameBaseAltura();
        respuestaDouble=R1.perimetro();
        System.out.println("El perimetros del rectangulo es: "+respuestaDouble);
        respuestaDouble=R1.area();
        System.out.println("El area del rectangulo es: "+respuestaDouble);
        R1.cuantosRectangulosExisten();
        
        //CIRCULO QUE NO RECIBE NADA
        
        System.out.println("");
        System.out.println("---Circulo que no recibe nada.---");
        System.out.println("");
        C1=new circulo();
        C1.DameRadio();
        resultado=C1.calculaArea();
        System.out.println("El area es: "+resultado);
        respuestaDouble=C1.calculaPerimetro();
        System.out.println("El perimetro es: "+resultado);
        C1.cuantosCirculosExisten();
        
        //CIRCULO QUE RECIBE RADIO POR EL USUARIO
        
        System.out.println("");
        System.out.println("---Circulo que recibe el radio por el usuario.---");   
        System.out.println("");
        System.out.println("Introduzca el radio: ");
        respuestaDouble=T.nextDouble();        
        C2=new circulo(respuestaDouble);
        respuestaDouble=C2.calculaArea();
        System.out.println("El area es: "+Math.round(respuestaDouble*100)/100d);
        C2.cuantosCirculosExisten();
        
        //POLIGONO QUE NO RECIBE NADA Y EL USUARIO PONE EL VALOR DE LOS LADOS
        
        System.out.println("");
        System.out.println("---Poligono que no recibe nada y el Usuario pone el vlor de los lados.---");
        System.out.println("");
        P1=new poligono();
        P1.ponerLados();
        resultado=P1.calculaPerimetro();
        System.out.println("El perimetro es: "+resultado);
        resultado=P1.calcularArea();
        System.out.println("El area es: "+resultado);
        P1.cuantosPoligonosExisten();
        
        //POLIGONO QUE RECIBE 5 LADOS
        
        System.out.println("");
        System.out.println("---Poligono que recibe 5 lados.---");
        System.out.println("");
        P2=new poligono(5);
        P2.ponerLados();
        resultado=P2.calculaPerimetro();
        System.out.println("el perimetro es: "+resultado);
        resultado=P2.calcularArea();
        System.out.println("El area es: "+resultado);
        P2.cuantosPoligonosExisten();
        
        //POLIGONO QUE RECIBE EL NUMERO DE LADOS POR EL USUARIO.
        
        System.out.println("");
        System.out.print("---Poligono que recibe el numero de lados por el Usuario.--- ");
        System.out.println("");
        System.out.print("Dame el numero de lados de tu poligono: ");
        respuesta=T.nextInt();
        P3=new poligono(respuesta);
        P3.ponerLados();
        resultado=P3.calculaPerimetro();
        System.out.println("el perimetro es: "+resultado);
        resultado=P3.calcularArea();
        System.out.println("El area es: "+resultado);
        P3.cuantosPoligonosExisten();
    }
    
}

