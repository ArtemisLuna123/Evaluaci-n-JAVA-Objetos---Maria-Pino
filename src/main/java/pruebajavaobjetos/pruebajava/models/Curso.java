package pruebajavaobjetos.pruebajava.models;

public class Curso extends Persona {
   
    // un curso que atibutos y funcionalidades tiene dentro de un curso 
    // tiene cantidad de alumnos ya sea femenino o masculino.
    // tiene profesores ya sea femenino o masculino. 
    //adentro se hacen materias.
    // Los cursos tienen letra dividido por ya se  'a','b'o 'c'.
    //tambien tiene materias donde se imparten las clases.
    // horarios 
    //tambien tiene alumnos que van de 1 basico a 4 medio 
    public int horas;
    public char divisionletra;


   //constructores
    public Curso(int horas, char divisionletra) {
        this.horas = horas;
        this.divisionletra = divisionletra;
       
    }
    public Curso(String nombre, String apellido, int id, char sexo, int horas, char divisionletra) {
        super(nombre, apellido, id, sexo);
        this.horas = horas;
        this.divisionletra = divisionletra;
    }

    //get y set
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public char getDivisionletra() {
        return divisionletra;
    }
    public void setDivisionletra(char divisionletra) {
        this.divisionletra = divisionletra;     
    }
    //toy string 
    @Override
    public String toString() {
        return "Curso [horas=" + horas + ", divisionletra=" + divisionletra + "]";
    }

    
    

    


    
}
