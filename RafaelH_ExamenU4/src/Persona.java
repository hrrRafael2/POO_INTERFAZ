public abstract class Persona {
    private String curp;
    private String nombre;
    private String fechaNacimiento; //or date
    private String telefono;

    public Persona(String curp, String nombre, String fechaNacimiento, String telefono){
        this.curp = curp;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public String getCurp(){
        return curp;
    }

    public String getNombre(){
        return nombre;
    }

    public String getFechaNacimiento(){
        return fechaNacimiento;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setCurp(String curp){
        this.curp = curp;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }



}

