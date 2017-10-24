
package institucioneducativa;

import java.util.Scanner;

public class InstitucionEducativa {
    int tipo;//o,PREPARATORIA;1,FACULTAD;2,INSTITUTO;3,ESCUELA;4,OTRO
    String nombre;
    static int numeroInstitucionesEducativas=0;
    int numeroAlumnos;//CUANTOS ALUMNOS SE HAN INSCRITO
    int aniofundacion;
    alumno[] alumnosInscritos;
    materia[] planEstudios;
    
    InstitucionEducativa(){
        this.numeroAlumnos=0;
        this.alumnosInscritos=new alumno[100];
        numeroInstitucionesEducativas++;
    }
     InstitucionEducativa(String nombre, int tipo, int capacidad){
        this.numeroAlumnos=numeroAlumnos;
        this.alumnosInscritos=new alumno[capacidad];
        this.nombre=nombre;
        this.tipo=tipo;
        numeroInstitucionesEducativas++;
    }
    private void ponerNombre(String nombre){
        this.nombre=nombre;
    }
    private void ponerAnioFundacion(int num){
        this.aniofundacion=num;
    }
//crea las materias de plan de estudios
    private void creaPlanEstudios(){
        Scanner T=new Scanner(System.in);
        String nombre;
        System.out.println("¿cuantas materias tiene el Plan de Estudio?: ");
        int n=T.nextInt();
        this.planEstudios=new materia[n];
        for(int i=0;i<n;i++){
            System.out.println("Nombre de la materia: ");
            nombre=T.nextLine();
            
//ME DA UN ERROR POR QUE??
            this.planEstudios[i]=new materia(nombre);
        }
    }
    
    private void inscribeAlumno(){
        Scanner T=new Scanner(System.in);
        System.out.println("Dame nombre de alumno(a): ");
        String nombre=T.nextLine();
        System.out.println("Dame año de ancimiento del alumno(a): ");
        int anioNaci=T.nextInt();
        this.alumnosInscritos[this.numeroAlumnos]=new alumno(nombre, anioNaci);
        this.numeroAlumnos++;
    }
    
 //METODO MAIN
    public static void main(String[] args) {
        Scanner T=new Scanner(System.in);

        InstitucionEducativa fismat=new InstitucionEducativa();
        InstitucionEducativa fie=new InstitucionEducativa("Facultad de Ingenieria Electrica",1,500);
        InstitucionEducativa ifm=new InstitucionEducativa("Instituto de Fisica y Matematicas",2,100);
        
        fismat.ponerNombre("Facultad de Ciencias Fisico-Matematicas");
        fismat.ponerAnioFundacion(1967);
        System.out.println("¿Cuantos alumnos va a inscribir?: ");
        int n=T.nextInt();
        for(int i=0;i<n;i++){
            fismat.inscribeAlumno();
        }
        fismat.creaPlanEstudios();
        ifm.creaPlanEstudios();
        fie.creaPlanEstudios();
        
    }    
}
