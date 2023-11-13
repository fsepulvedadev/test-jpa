
package com.mycompany.pruebajpa_todocode.persistencia;

import com.mycompany.pruebajpa_todocode.logica.Alumno;
import com.mycompany.pruebajpa_todocode.logica.Carrera;
import com.mycompany.pruebajpa_todocode.logica.Materia;
import com.mycompany.pruebajpa_todocode.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
    MateriaJpaController materiaJpa = new MateriaJpaController();


    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
       return aluJpa.findAlumno(id);
        
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        
        List<Alumno> lista = aluJpa.findAlumnoEntities();
        
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno> (lista);
        
        return listaAlumnos;
    }
    
    // CARRERA
  public void crearCarrera(Carrera carre) {
        carreJpa.create(carre);
    }

    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        
        try {
            carreJpa.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
       return carreJpa.findCarrera(id);
        
    }

    public ArrayList<Carrera> traerListaCarreras() {
        
        List<Carrera> lista = carreJpa.findCarreraEntities();
        
        ArrayList<Carrera> listaCarreras = new ArrayList<Carrera> (lista);
        
        return listaCarreras;
    }
    
    // MATERIA
    public void crearMateria(Materia mate) {
        materiaJpa.create(mate);
    }

    public void eliminarMateria(int id) {
        try {
            materiaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia mate) {
        
        try {
            materiaJpa.edit(mate);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
       return materiaJpa.findMateria(id);
        
    }

    public ArrayList<Materia> traerListaMaterias() {
        
        List<Materia> lista = materiaJpa.findMateriaEntities();
        
        ArrayList<Materia> listaMaterias = new ArrayList<Materia> (lista);
        
        return listaMaterias;
    }
    
    
}
