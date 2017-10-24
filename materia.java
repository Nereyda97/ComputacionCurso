
package institucioneducativa;

public class materia {
String nombre, clave;
int area;//O,COMPU;1,MATEMATICAS;2,FISICA;3,OTRO
int creditos,horasSemana;
static int numeroMaterias=0;

materia(){
    numeroMaterias++;
}
materia(String nombre,String clave, int area,int creditos,int hS){
    numeroMaterias++;
    this.area=area;
    this.clave=clave;
    this.nombre=nombre;
    this.creditos=creditos;
    
}

}//FIN DE CLASE
