/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizcolegiado.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author sombr
 */
public class Quizcolegiado4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[10];
        estudiantes[0] = new Estudiante("Juan", "Matemáticas", "Profesor A", 95.5);
        estudiantes[1] = new Estudiante("María", "Historia", "Profesor B", 85.0);
        estudiantes[2] = new Estudiante("Pedro", "Ciencias", "Profesor C", 91.3);
        estudiantes[2] = new Estudiante("Anthony", "Educ.Fisica", "Profesor D", 97.3);
        estudiantes[2] = new Estudiante("Josue", "Fisica mate", "Profesor E", 96.5);
        estudiantes[2] = new Estudiante("Alejandro", "Espanol", "Profesor F", 90.6);
        estudiantes[2] = new Estudiante("Brandon", "Quimica", "Profesor G", 88.7);
       

       
        StringBuilder listado = new StringBuilder("Listado de Estudiantes:\n");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                listado.append("Nombre: ").append(estudiante.getNombre())
                        .append(", Curso: ").append(estudiante.getCurso())
                        .append(", Profesor: ").append(estudiante.getProfesor())
                        .append(", Calificación: ").append(estudiante.getCalificacion())
                        .append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, listado.toString());

        
        Estudiante mayorCalificacion = estudiantes[0];
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getCalificacion() > mayorCalificacion.getCalificacion()) {
                mayorCalificacion = estudiante;
            }
        }
        JOptionPane.showMessageDialog(null, "Estudiante con la nota mayor: " + mayorCalificacion.getNombre());

        
        Estudiante menorCalificacion = estudiantes[0];
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getCalificacion() < menorCalificacion.getCalificacion()) {
                menorCalificacion = estudiante;
            }
        }
        JOptionPane.showMessageDialog(null, "Estudiante con la nota menor: " + menorCalificacion.getNombre());

        
        double sumaCalificaciones = 0;
        int cantidadEstudiantes = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                sumaCalificaciones += estudiante.getCalificacion();
                cantidadEstudiantes++;
            }
        }
        double promedio = sumaCalificaciones / cantidadEstudiantes;
        JOptionPane.showMessageDialog(null, "Promedio de calificaciones: " + promedio);

        
        StringBuilder calificacionesEncimaPromedio = new StringBuilder("Calificaciones por encima del promedio:\n");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getCalificacion() > promedio) {
                calificacionesEncimaPromedio.append(estudiante.getNombre())
                        .append(": ").append(estudiante.getCalificacion())
                        .append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, calificacionesEncimaPromedio.toString());

        
        StringBuilder calificacionesDebajoPromedio = new StringBuilder("Calificaciones por debajo del promedio:\n");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getCalificacion() < promedio) {
                calificacionesDebajoPromedio.append(estudiante.getNombre())
                        .append(": ").append(estudiante.getCalificacion())
                        .append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, calificacionesDebajoPromedio.toString());
    }
}

