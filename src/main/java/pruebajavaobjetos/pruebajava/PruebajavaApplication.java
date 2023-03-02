package pruebajavaobjetos.pruebajava;





import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class PruebajavaApplication {

	/*Te contactaron desde un colegio municipal para que los ayudes a generar un software
    pensando en ordenar su funcionamiento, este colegio siempre a funcionado de manera análoga
    por 20 años y esto ha generado errores de pérdidas de datos de alumnos antiguos,
    documentos estropeados y nula posibilidad de generar estadísticas de rendimiento del colegio.
    En esta instancia tu tarea será generar los objetos necesarios para cubrir las necesidades del
    colegio, utilizando herencia.
    Además debes generar 3 funciones distintas que te ayudarán a los distintos procesos del
    colegio
    Puntos a considerar:
    ● El colegio cuenta con distintos cursos, profesores, materias y alumnos
    ● Se debe crear una función que permita al profesor ingresar notas por estudiante y que
    luego permita obtener el promedio de cada estudiante.
    ● Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
    alumnos por curso y que luego los muestre.
    ● Se debe crear una función que dado un arreglo de notas obtenga la mejor nota, la peor
    nota y el promedio de notas.
    Puntos a evaluar:
    ● Creación de objetos pertinentes al caso.
    ● Creación de funciones.
    ● Proyecto funcional.
	 */
    
    

    // ● Se debe crear una función que permita al profesor ingresar notas por estudiante y que
	// luego permita obtener el promedio de cada estudiante.*/
     
  

    
    public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        //Necesito ingresar el nombre del profesor:
        //Necesito ingresar el nombre de  5 alumnos:
        //Necestio sacar el promedio de las notas por alumno;
        String nombre;
        int  notas;

        //Aqui pongo nombre del alumno y del profesor
        nombre = leer.nextLine();
        System.out.println("Ingrese el nombre del profesor que impartira la clase:" + nombre);
        nombre = leer.nextLine();
        System.out.println("Ingrese el nombre del alumno 1:"+nombre);
        System.out.println("Ingrese el nombre del alumno 2:"+nombre);
        System.out.println("Ingrese el nombre del alumno 3:"+nombre);
        System.out.println("Ingrese el nombre del alumno 4:"+nombre);
        System.out.println("Ingrese el nombre del alumno 5:"+nombre);
        nombre = leer.nextLine();

        //Saco el promedio de nota por Alumno 
        System.out.print("ingrese cantidad de notas:");
        notas = leer.nextInt();

         int suma = 0;
         int prom = 0; 
         int nota = 0;

         for(int i=1; i<= notas; i++){
        System.out.println("ingrese la nota del alumno "+" "+i+" "+"de"+" "+notas+":");
        nota = leer.nextInt();    
        suma = suma + nota;

            if(nota > 4 ){
                System.out.println(nombre +"Se saco un azul");

             }else{
                System.out.println(nombre + "Se saco un rojo");
             }

        }

        prom = suma/notas;
        System.out.println("promedio de las notas:"+prom );
            //Profe me fue imposible poner los array lo tuve que hacer de esta manera creo que voy a recuperativa 
            // me falta estudiar mas array y como integrarlo a los objetos. 
      }
}
    
	 /*● Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
	 alumnos por curso y que luego los muestre.*/
	/* ● Se debe crear una función que dado un arreglo de notas obtenga la mejor nota, la peor
	 nota y el promedio de notas.*/
	 //Ejercicio 1
     
 
   
   
      



	


