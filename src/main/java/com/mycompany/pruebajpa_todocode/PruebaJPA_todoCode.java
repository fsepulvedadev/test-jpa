

package com.mycompany.pruebajpa_todocode;

import com.mycompany.pruebajpa_todocode.logica.Alumno;
import com.mycompany.pruebajpa_todocode.logica.Carrera;
import com.mycompany.pruebajpa_todocode.logica.ControladoraLogica;
import com.mycompany.pruebajpa_todocode.logica.Materia;
import java.util.Date;
import java.util.LinkedList;


public class PruebaJPA_todoCode {

    public static void main(String[] args) {
        
        ControladoraLogica control = new ControladoraLogica();
        
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        Carrera licInformatica = new Carrera(1,"Licenciatura en Informatica",listaMaterias);

        control.crearCarrera(licInformatica);

        
        Materia logica = new Materia(0, "Logica de programacion", "bimestral",licInformatica);
        Materia basesDeDatos = new Materia(0, "Bases de Datos", "bimestral", licInformatica);
        Materia matematica = new Materia(0, "Matematica aplicada", "bimestral", licInformatica);
        
        control.crearMateria(logica);
        control.crearMateria(matematica);
        control.crearMateria(basesDeDatos);

        
        listaMaterias.add(logica);
        listaMaterias.add(basesDeDatos);
        listaMaterias.add(matematica);
        
        licInformatica.setListaMaterias(listaMaterias);
        control.editarCarrera(licInformatica);
        
        
        Alumno a12 = new Alumno(23, "Rodrigo", "Negri", new Date(), licInformatica);
        
        control.crearAlumno(a12);
        

        System.out.println("---------------------");
        System.out.println("----DATOS ALUMNO-----");
        
        Alumno alu = control.traerAlumno(23);
        
        System.out.println("Alumno: " + alu.getNombre()+ " " + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
   
   
    };
}
