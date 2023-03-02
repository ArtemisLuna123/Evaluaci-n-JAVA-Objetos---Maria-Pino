package pruebajavaobjetos.pruebajava.models;

public class Matricula extends Persona{
    //Fecha ingreso 

    public int dia;
    public int mes;
    public int anio;


    public Matricula(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public Matricula(String nombre, String apellido, int id, char sexo, int dia, int mes, int anio) {
        super(nombre, apellido, id, sexo);
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    @Override
    public String toString() {
        return "Matricula [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
    }
    
    

    

    
}
