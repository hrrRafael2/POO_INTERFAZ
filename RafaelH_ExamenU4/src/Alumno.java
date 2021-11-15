import javax.swing.*;
import java.util.ArrayList;

public abstract class Alumno extends Persona implements AccionesPersona {
    private String matricula;
    private String carrera;

    //arraylist
    ArrayList<String> alumno = new ArrayList<>();

    public Alumno(String curp, String nombre,String fechaNacimiento, String telefono ,String matricula, String carrera) {
        super(curp,nombre,fechaNacimiento,telefono);
        this.matricula = matricula;
        this.carrera = carrera;

    }
    //get and set
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //
    int contadorAlumno = 0;
    // metodos de la clase interfaz
    public void agregar() {
        this.setNombre(JOptionPane.showInputDialog(null, "Ingresa tu nombre: "));
        alumno.add(this.getNombre());
        this.setCurp(JOptionPane.showInputDialog(null, "Ingresa tu curp: "));
        alumno.add(this.getCurp());
        this.setFechaNacimiento(JOptionPane.showInputDialog(null, "Ingresa tu fecha de nacimiento: "));
        alumno.add(this.getFechaNacimiento());
        this.setTelefono(JOptionPane.showInputDialog(null, "Ingresa tu telefono: "));
        alumno.add(this.getTelefono());
        this.setMatricula(JOptionPane.showInputDialog(null, "Ingresa tu matricula: "));
        alumno.add(this.getMatricula());
        this.setCarrera(JOptionPane.showInputDialog(null, "Ingresa tu carrera: "));
        alumno.add(this.getCarrera());
        contadorAlumno++;
    }

    public void eliminar(){

    }
    // funciona
    public void buscar(){
        for(int i = 0; i < alumno.size(); i++) {
            if (alumno.size() > 0 && contadorAlumno==i) {
                String buscar = JOptionPane.showInputDialog(null, "Ingresa el dato a buscar: ");
                if (alumno.contains(buscar)) {
                    JOptionPane.showMessageDialog(null, "El dato " + buscar + " se encuentra en la lista");
                } else {
                    JOptionPane.showMessageDialog(null, "El dato " + buscar + " no se encuentra en la lista");
                }
            }
        }
        if (alumno.size() < 0) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }

    public void mostrarTodo() {
        for (int i = 0; i < alumno.size(); i++) {
            JOptionPane.showMessageDialog(null, alumno.get(i));
        }
    }



}
