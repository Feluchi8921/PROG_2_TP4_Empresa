public class Main {
    public static void main(String[] args) {
        //Instancio
        Persona persona1 = new Persona("Juan", "Pérez", 24); //Persona es abstract?
        Empleado empleado1 = new Empleado("Raúl", "Rodriguez", 24,3325632, 500000);
        Empleado empleado2 = new Empleado("Vera", "Margarita", 32,3261598, 400000);

        Jerarquico jerarquico1 = new Jerarquico("María", "Álvarez", 34, 3325632, 500000);

        //Agrego empleados a jerarquico 1
        jerarquico1.addEmpleadoAcargo(empleado1);
        jerarquico1.addEmpleadoAcargo(empleado2);

        //Imprimir
        System.out.println("-----------Persona 1:----------\n"+persona1.toString());
        System.out.println("-----------Empleado 1:----------\n"+empleado1.toString());
        System.out.println("-----------Jerárquico 1:----------\n"+jerarquico1.toString());
    }
}