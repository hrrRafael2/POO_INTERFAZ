import javax.swing.*;
import java.util.ArrayList;

public  abstract class   Docente extends Persona implements AccionesPersona{
    private String rfc;
    private String fechaIngreso;

    //ArrayList
   ArrayList<String> docente = new ArrayList<String>();

    public Docente(String curp, String fechaNacimiento , String telefono , String nombre , String rfc , String fechaIngreso){
        super(curp,nombre,fechaNacimiento,telefono);
        this.rfc = rfc;
        this.fechaIngreso = fechaIngreso;
    }
    // get and set
    public String getRfc(){
        return rfc;
    }
    public void setRfc(String rfc){
        this.rfc = rfc;
    }
    public String getFechaIngreso(){
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }

    // metodos
    int contadorAgregar = 0;
    // metodos AccionesPersona
    public void agregar() {
        this.setNombre(JOptionPane.showInputDialog(null, "Ingresa tu nombre: "));
        docente.add("NOMBRE: "+this.getNombre());
        this.setCurp(JOptionPane.showInputDialog(null, "Ingresa tu curp: "));
        docente.add("CURP: "+this.getCurp());
        this.setFechaNacimiento(JOptionPane.showInputDialog(null, "Ingresa tu fecha de nacimiento: "));
        docente.add("FECHA NACIMIENTO: "+this.getFechaNacimiento());
        this.setTelefono(JOptionPane.showInputDialog(null, "Ingresa tu telefono: "));
        docente.add("TELEFONO: "+this.getTelefono());
        this.setRfc(JOptionPane.showInputDialog(null, "Ingresa tu rfc: "));
        docente.add("RFC: "+this.getRfc());
        this.setFechaIngreso(JOptionPane.showInputDialog(null, "Ingresa tu fecha de ingreso: "));
        docente.add("FECHA INGRESO: "+this.getFechaIngreso());
        contadorAgregar++;
    }

/*
* if(docente.size() < 1 && elejirN == 2){
               JOptionPane.showMessageDialog(null, "No hay datos para eliminar");
           }
* */
    public void eliminar() {
        int elejirN = Integer.parseInt(JOptionPane.showInputDialog(null, "Eliminando..." + "\n" + "1. ELIMINAR TODO LOS ELEMENTOS: " + "\n" + "2. ELIMINAR UN ELEMENTO ESPECIFICO: "));
        for(int i=0; i<docente.size(); i++){
            if (contadorAgregar==i && elejirN==1 ) {
                docente.clear();
                JOptionPane.showMessageDialog(null, "Elementos eliminados");
            }
            else {
                JOptionPane.showMessageDialog(null, "El elemento no se encuentra en el arreglo");
            }
        }
        /*
        if (elejirN == 2 && docente.size() > 1) {

            if (contadorAgregar == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminara el arreglo de: " + docente.get(0));
                // si se elimina el nombre pasaremos a mostrar otro elemento , curp , para identificar que persona se eliminara
                int eliminar1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el indice a eliminar: "));

                for (int i = 0; i < docente.size(); i++) {
                    docente.remove(eliminar1);
                }

            }
        }
        // 0,1,2,3,4,5 --> 6
        else if (contadorAgregar == 2) {
            JOptionPane.showMessageDialog(null, "Se eliminara el arreglo de: " + docente.get(6));
        } else if (contadorAgregar == 3) {
            JOptionPane.showMessageDialog(null, "Se eliminara el arreglo de: " + docente.get(12));
        } else if (contadorAgregar == 4) {
            JOptionPane.showMessageDialog(null, "Se eliminara el arreglo de: " + docente.get(18));
        } else if (contadorAgregar == 5) {
            JOptionPane.showMessageDialog(null, "Se eliminara el arreglo de: " + docente.get(24));
        }

        // menu de eliminar , para saber cual docente se eliminara , se empieza a imprimir con el nombre
               /*
               int elejir = Integer.parseInt(JOptionPane.showInputDialog(null,  "Ahora solo existe "+contadorAgregar+" docentes: "+" " +
                       "elija un numero menor o igual para eliminarlo: "));

               if (elejir == 1 && contadorAgregar == 1) {
                   int eliminar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a eliminar: "));
                   for(int i = 0; i < 6; i++){
                       docente.remove(eliminar);
                   }
                   JOptionPane.showMessageDialog(null, "Elemento eliminado");
               }
               else if(elejir == 2 && elejir == contadorAgregar){
                   int eliminar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a eliminar: "));
                   for (int i = 0; i < 12; i++) {
                       docente.remove(eliminar);
                   }
                   JOptionPane.showMessageDialog(null, "Elemento eliminado");
               }
               else if(elejir == 3){
                   int eliminar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a eliminar: "));
                   docente.remove(eliminar);
                   JOptionPane.showMessageDialog(null, "Elemento eliminado");
               }
               else if(elejir == 4){
                   int eliminar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a eliminar: "));
                   docente.remove(eliminar);
                   JOptionPane.showMessageDialog(null, "Elemento eliminado");
               }
               else if(elejir == 5){
                   int eliminar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a eliminar: "));
                   docente.remove(eliminar);
                   JOptionPane.showMessageDialog(null, "Elemento eliminado");
               }
               else{
                   JOptionPane.showMessageDialog(null, "No se encontro el elemento");
               }
           }
           */



    }

    public void buscar(){
        for(int i = 0; i < docente.size(); i++) {
            if (docente.size() > 0 && contadorAgregar==i) {
                String buscar = JOptionPane.showInputDialog(null, "Ingresa el dato a buscar: ");
                if (docente.contains(buscar)) {
                    JOptionPane.showMessageDialog(null, "El dato " + buscar + " se encuentra en la lista");
                } else {
                    JOptionPane.showMessageDialog(null, "El dato " + buscar + " no se encuentra en la lista");
                }
            }
        }
        if (docente.size() < 0) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }

    public void mostrarTodo() {
        if(docente.size() > 0) {
            for (int i = 0; i < docente.size(); i++) { //
                JOptionPane.showMessageDialog(null, docente.get(i));
            }

        }
        else {
            JOptionPane.showMessageDialog(null, "No hay datos para mostrar");
        }
    }


};




