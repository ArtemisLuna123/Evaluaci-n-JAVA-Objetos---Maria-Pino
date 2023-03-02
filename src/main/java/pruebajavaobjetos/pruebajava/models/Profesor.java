package pruebajavaobjetos.pruebajava.models;

public class Profesor extends Persona {
    /*  Los atributos de un profesor son :
    * nombre
    *apellido
    *ID
    *Sueldo 
    *Sexo 
    *Materia Profesion 
    */
   
    public double sueldo;
    public  String profesion;

    //creamos constructores

    public Profesor(Object nomprofesor){
        super();
    }

    public Profesor(String nombre, String apellido, int id, char sexo, double sueldo, String profesion) {
        super(nombre, apellido, id, sexo);
        this.sueldo = sueldo;
        this.profesion = profesion;
    }

    
    //creamos get y set 





    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }


  
    // Crea toy String 

    @Override
    public String toString() {
        return super.toString()  +"Profesor [sueldo=" + sueldo + ", profesion=" + profesion + "]";
    }

  
    
    


   
    



    





    

     
    




   
    
    



    
        
     



    

}
