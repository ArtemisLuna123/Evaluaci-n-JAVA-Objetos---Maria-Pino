package pruebajavaobjetos.pruebajava.models;

public class Alumnos extends Persona {
    /*  Los atributos de un profesor son :
    * nombre
    *apellido
    *ID
    *correo 
    *Sexo 
    *notas
    */
    public String correo;
    public Double notas;

    // Se creo constructores

    public Alumnos(){
        super();
    }

    public Alumnos(String nombre, String apellido, int id, char sexo, String correo, Double notas) {
        super(nombre, apellido, id, sexo);
        this.correo = correo;
        this.notas = notas;
    }

    //Se creo get y set 




    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Double getNotas() {
        return notas;
    }

    public void setNotas(Double notas) {
        this.notas = notas;
    }

    //funcionalidaes 

    //Crea toy string 

    @Override
    public String toString() {
        return super.toString() + "Alumnos [correo=" + correo + ", notas=" + notas + "]";
    }



    
    
      
}
