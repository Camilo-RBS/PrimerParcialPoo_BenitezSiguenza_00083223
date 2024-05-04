package Citas;

public abstract class Consultas implements Consult {
    private String nombre;
    private String especie;
    private String raza;
    private String alimentacion;
    private String moodShower;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getMoodShower() {
        return moodShower;
    }

    public void setMoodShower(String moodShower) {
        this.moodShower = moodShower;
    }

    @Override
    public void printAlimentacion() {
        System.out.println("Su metodo de alimentacion es : "+ alimentacion);
    }

    @Override
    public void printModoShowe() {
        System.out.println("Su metodo de modo showe es : "+ moodShower);
    }

    public abstract void Informacion();
}
