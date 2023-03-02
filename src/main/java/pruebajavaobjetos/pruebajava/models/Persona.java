package pruebajavaobjetos.pruebajava.models;

public class Persona {
    public String nombre;
    public String apellido;
    public int  id; //identificacion 
    public char sexo;

     // intentar que esta sea la clase padre.
 

    // Se crea constructores.

    /**
     * 
     */
    public Persona() {
    }

    public Persona(String nombre, String apellido, int id, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;//edad
        this.sexo = sexo;
    }
    

   

    //get y set 



  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //Funcionalides 
    public void  Alimento(boolean comida ){
       
        if(comida == true ){
            System.out.println(nombre +"Vegano");

         }else{
            System.out.println(nombre + "Carnivoro");
         }
    }


    //Se cre toy String

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", sexo=" + sexo + "]";
    }

   


  
    
}
