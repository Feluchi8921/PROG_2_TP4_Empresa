public class Empleado extends Persona{
    //Atributos
    private int nro_legajo;
    private int sueldo;

    //Constructor
    public Empleado(String nombre, String apellido, int edad, int nro_legajo, int sueldo) {
        super(nombre, apellido, edad);
        this.nro_legajo = nro_legajo;
        this.sueldo = sueldo;
    }

    //Metodos
    //Getters and Setters

    public int getNro_legajo() {
        return nro_legajo;
    }

    public void setNro_legajo(int nro_legajo) {
        this.nro_legajo = nro_legajo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    //Imprimir
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()+
                "\nNúmero de legajo"+getNro_legajo()+"\nSueldo: "+getSueldo();
    }

}
