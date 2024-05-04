package Citas;

public class Gatos extends Consultas{
    private int edad;
    private String Descripcion;

    public Gatos(int edad, String descripcion,String nombre, String especie,String raza,String alimentacion,String moodShower) {
        this.edad = edad;
        Descripcion = descripcion;
        setNombre(nombre);
        setEspecie(especie);
        setRaza(raza);
        setAlimentacion(alimentacion);
        setMoodShower(moodShower);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    @Override
    public void Informacion() {
        System.out.println("nombre de su gato: " + getNombre());
        System.out.println("especie: " + getEspecie());
        System.out.println("raza: " + getRaza());
        System.out.println("edad: " + getEdad());
        System.out.println("descripcion: " + getDescripcion());
        printAlimentacion();
        printModoShowe();

    }
}
