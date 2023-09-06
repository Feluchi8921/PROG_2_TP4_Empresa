import java.lang.reflect.Array;
import java.util.ArrayList;

public class Jerarquico extends Empleado{
    //Atributos
    private ArrayList<Empleado> empleadosAcargo = new ArrayList<>();

    //Constructor
    public Jerarquico(String nombre, String apellido, int edad, int nro_legajo, int sueldo) {
        super(nombre, apellido, edad, nro_legajo, sueldo);
        this.empleadosAcargo = new ArrayList<>();
    }

    //Metodos
    //Getters and Setters
    public ArrayList<Empleado> getEmpleados() {
        return empleadosAcargo;
    }
    //Agregar empleado a cargo
    public void addEmpleadoAcargo(Empleado empleado){
        empleadosAcargo.add(empleado);
    }

    //Eliminar empleado a cargo
    public void removeEmpleadoAcargo(Empleado empleado){
        empleadosAcargo.remove(empleado);
    }

    //Imprimir
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()+
        "\nNúmero de legajo: "+getNro_legajo()+"\nSueldo: "+getSueldo()+"\nEmpleados a cargo: "+getEmpleados();
    }
}
