import java.util.ArrayList;

public class Empresa {
    //Atributos
    private ArrayList<Persona> personas = new ArrayList<>();

    //Constructor
    public Empresa(){
        this.personas = personas;
    }

    //Metodos
    public void addPersona(Persona persona){
        personas.add(persona);
    }

    public void deletePersona(Persona persona){
        personas.remove(persona);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
}
