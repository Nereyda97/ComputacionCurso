package institucioneducativa;

import java.util.Date;
import java.util.Calendar;

public class alumno {
    static int numeroAlumnos=0;
    String nombre;
    int matricula, creditos, anioIngreso, anioEgreso,
            anioDeNacimiento, materiasCursadas;
    double promedio, sumaCalificaciones;
    
//CONSTRUCTOR
    alumno(){
        numeroAlumnos++;
        this.matricula=generaMatricula();
        this.creditos=0;
        this.promedio=0;
        this.materiasCursadas=0;
        this.sumaCalificaciones=0;//AQUI SUMO LAS CALIFICACIONES DE LAS MATERIAS CURSADAS
    }
//CONSTRUCTOR
    alumno(String nombre, int anioDeNacimiento){
        numeroAlumnos++;
        this.matricula=generaMatricula();
        this.creditos=0;
        this.promedio=0;
        this.nombre=nombre;
        this.materiasCursadas=0;
        this.anioDeNacimiento=anioDeNacimiento;
        this.sumaCalificaciones=0;//AQUI SUMO LAS CALIFICACIONES DE LAS MATERIAS CURSADAS
    }
//METODO PARA GENERAR MATRICULA
    private int generaMatricula(){
        
        return (int)(Math.random()*1000000);
        
    }
//METODO PARA CAMBIAR NOMBRE
    private void cambiarNombre(String nombre){
        this.nombre=nombre;
    }
//METODO DAME-MATRICULA
    public int dameMatricula(){
        return this.matricula;
    }
    public double damePromedio(){
        return this.sumaCalificaciones/this.materiasCursadas;
    }
    public int dameTotalAlumnos(){
        return numeroAlumnos;
    }
    
}//Fin de la clase
