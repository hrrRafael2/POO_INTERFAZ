import javax.swing.*;

public class Prueba {

    public static void main(String[] args) {
        // docente is abstrac
        // (agregar,
        //buscar, mostrarTodos, eliminar).

        Docente docente = new Docente("", "", "", "", "", ""){};
        Alumno alumno = new Alumno("", "", "", "", "", ""){};
        DocenteExterno  objDocenteE;
        objDocenteE = new DocenteExterno("","","","","","","",""){};

        // while
        int opcionMenu = 0;
        while(opcionMenu!=4){
         opcionMenu=Integer.parseInt(JOptionPane.showInputDialog(" MENU: "+"\n"+"1. Alumno "+"\n"+"2. Docente "+"\n"+"3. Docente externo "+"\n"+"4. Salir"));

        switch (opcionMenu) {
            case 1:
                JOptionPane.showMessageDialog(null, "ALUMNO...");
                int opcionAlumno = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer ? .... "+"\n"+"1. Agregar"+"\n"+"2. Eliminar"+"\n"+"3. Buscar"+"\n"+"4. Mostrar todo"));
                switch (opcionAlumno) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "AGREGAR ALUMNO...");
                        alumno.agregar();
                        break;
                    case 2:
                        alumno.eliminar();
                        break;
                    case 3:
                       alumno.buscar();
                        break;
                    case 4:
                        alumno.mostrarTodo();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                        break;
                }
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Genial , elejiste al docente.. ");
                int opcionDocente=Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer ? .... "+"\n"+"1. Agregar"+"\n"+"2. Eliminar"+"\n"+"3. Buscar"+"\n"+"4. Mostrar todo"));

                if(opcionDocente == 1){
                    docente.agregar();
                }
                else if(opcionDocente == 2){
                    docente.eliminar();
                }
                else if(opcionDocente == 3){
                    docente.buscar();
                }
                else if(opcionDocente == 4){
                    docente.mostrarTodo();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Genial , elejiste al docente externo.. ");
                int opcionDocenteExterno = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer ? .... "+"\n"+"1. Agregar"+"\n"+"2. Eliminar"+"\n"+"3. Buscar"+"\n"+"4. Mostrar todo"));
                if(opcionDocenteExterno == 1){
                    objDocenteE.agregar();
                }
                else if(opcionDocenteExterno == 2){
                    objDocenteE.eliminar();
                }
                else if (opcionDocenteExterno == 3){
                    objDocenteE.buscar();
                }
                else if(opcionDocenteExterno == 4){
                    objDocenteE.mostrarTodo();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                }

                break;
            case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                break;

        }

        }


    }
}
