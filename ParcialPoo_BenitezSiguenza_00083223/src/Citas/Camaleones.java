package Citas;

public class Camaleones extends Consultas{

    private int edad;
    private String descripcion;
    private String textura;


    public Camaleones(int edad, String descripcion, String textura, String nombre, String especie,String raza, String alimentacion, String moodshower) {
        this.edad = edad;
        this.descripcion = descripcion;
        this.textura = textura;
        setNombre(nombre);
        setEspecie(especie);
        setRaza(raza);
        setAlimentacion(alimentacion);
        setMoodShower(moodshower);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    @Override
    public void Informacion() {
        System.out.println("nombre de su camaleon: " + getNombre());
        System.out.println("especie: " + getEspecie());
        System.out.println("raza: " + getRaza());
        System.out.println("edad: " + getEdad());
        System.out.println("descripcion: " + getDescripcion());
        System.out.println(" textura de la piel: "+ getTextura());
        printAlimentacion();
        printModoShowe();
    }
}
