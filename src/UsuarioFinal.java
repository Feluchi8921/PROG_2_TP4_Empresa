public class UsuarioFinal extends Persona{
    //Atributos
    private String nombreUsuario;
    private String password;

    //Constructor
    public UsuarioFinal(String nombre, String apellido, int edad, String nombreUsuario, String password) {
        super(nombre, apellido, edad);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    //Metodos
    //Getters and Setters

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombreUsuario = nombre_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //Imprimir
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()+"\nNombre de usuario: "+
                getNombreUsuario()+"\nPassword: "+getPassword();
    }

    //
}

