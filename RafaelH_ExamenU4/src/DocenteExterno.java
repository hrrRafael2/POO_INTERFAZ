import javax.swing.*;
import java.util.ArrayList;

public  abstract class DocenteExterno extends Docente implements  AccionesPersona{
    private String fechaContratacion;
    private String limiteVigencia;

    //arrayList
    ArrayList<String> docenteExternoArr = new ArrayList<>();

    //constructor
    public DocenteExterno(String curp,String nombre , String fechaNacimiento, String telefono , String rfc,String fechaIngreso, String fechaContratacion, String limiteVigencia) {
        super(curp,nombre,fechaNacimiento,telefono,rfc,fechaIngreso);
        this.fechaContratacion = fechaContratacion;
        this.limiteVigencia = limiteVigencia;
    }

    //get && set
    public String getFechaContratacion() {
        return fechaContratacion;
    }
    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public String getLimiteVigencia() {
        return limiteVigencia;
    }
    public void setLimiteVigencia(String limiteVigencia) {
        this.limiteVigencia = limiteVigencia;
    }

    //
    int contadorDocenteExterno = 0;
    public void agregar() {
        this.setNombre(JOptionPane.showInputDialog(null, "Ingresa tu nombre: "));
        docenteExternoArr.add("NOMBRE: "+this.getNombre());
        this.setCurp(JOptionPane.showInputDialog(null, "Ingresa tu curp: "));
        docenteExternoArr.add("CURP: "+this.getCurp());
        this.setFechaNacimiento(JOptionPane.showInputDialog(null, "Ingresa tu fecha de nacimiento: "));
        docenteExternoArr.add("FECHA NACIMIENTO: "+this.getFechaNacimiento());
        this.setTelefono(JOptionPane.showInputDialog(null, "Ingresa tu telefono: "));
        docenteExternoArr.add("TELEFONO: "+this.getTelefono());
        this.setRfc(JOptionPane.showInputDialog(null, "Ingresa tu rfc: "));
        docenteExternoArr.add("RFC: "+this.getRfc());
        this.setFechaIngreso(JOptionPane.showInputDialog(null, "Ingresa tu fecha de ingreso: "));
        docenteExternoArr.add("FEHCA INGRESO: "+this.getFechaIngreso());
        this.setFechaContratacion(JOptionPane.showInputDialog(null, "Ingresa tu fecha de contratacion: "));
        docenteExternoArr.add("FECHA CONTRATACION: "+this.getFechaContratacion());
        this.setLimiteVigencia(JOptionPane.showInputDialog(null, "Ingresa tu limite de vigencia: "));
        docenteExternoArr.add("LIMITE VIGENCIA: "+this.getLimiteVigencia());
        contadorDocenteExterno++;
    }

    public void eliminar(){

        if(docenteExternoArr.size() < 1){
            JOptionPane.showMessageDialog(null, "No hay datos para eliminar");
        }
        else if(docenteExternoArr.size() >  1) {
            int eliminar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a eliminar: "));
            docenteExternoArr.remove(eliminar);
            JOptionPane.showMessageDialog(null, "Elemento eliminado");
        }
        else{
            JOptionPane.showMessageDialog(null, "El elemento no se encuentra en el arreglo");
        }

    }
    public void buscar(){
        if (docenteExternoArr.size() < 0) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        for(int i = 0; i < docenteExternoArr.size(); i++) {
            if (docenteExternoArr.size() > 0 && contadorDocenteExterno==i) {
                String buscarC = JOptionPane.showInputDialog(null, "Ingresa el dato a buscar: ");
                if (docenteExternoArr.contains(buscarC)) {
                    JOptionPane.showMessageDialog(null, "El dato " + buscarC + " se encuentra en la lista");
                } else {
                    JOptionPane.showMessageDialog(null, "El dato " + buscarC + " no se encuentra en la lista");
                }
            }
        }

    }
    public void mostrarTodo() {
        for (int i = 0; i < docenteExternoArr.size(); i++) {
            JOptionPane.showMessageDialog(null, docenteExternoArr.get(i));
        }
    }
}
