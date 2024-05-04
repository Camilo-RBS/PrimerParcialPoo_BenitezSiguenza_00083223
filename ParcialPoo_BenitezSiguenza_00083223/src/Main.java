import Citas.Consultas;
import Citas.Camaleones;
import Citas.Gatos;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    static ArrayList<Consultas> consultas = new ArrayList<>();
    static Scanner s;
    public static void main(String[] args) {

        String name;
        String especie;
        String raza;
        String alimentacion;
        String moodShower;

        s = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Bienvenido a MascoHealth");
            System.out.println("Que desea realizar : ");
            System.out.println("1- Hacer Consulta Gato");
            System.out.println("2- Hacer Consulta Cameleon");
            System.out.println("3- Eliminar consulta");
            System.out.println("4- Mostrar Consulta");
            System.out.println("5- Salir");

            try {
                opcion = s.nextInt();
            }catch (InputMismatchException ignored){}


            switch (opcion){
                case 1:
                    int edad;
                    String descripcion;

                    System.out.println("Ingrese los datos que se solicita de su masconta: ");
                    System.out.println("Nombre: ");
                    name = s.next();
                    System.out.println("Especie : ");
                    especie = s.next();
                    System.out.println("Raza : ");
                    raza = s.next();
                    System.out.println("Forma de alimentacion: ");
                    alimentacion= s.next();
                    System.out.println("Forma de limpieza: ");
                    moodShower= s.next();
                    System.out.println("Edad : ");
                    edad = s.nextInt();
                    System.out.println("Motivo de la cita: ");
                    descripcion = s.next();

                    Gatos gatos = new Gatos(edad,descripcion,name,especie,raza,alimentacion,moodShower);

                    consultas.add(gatos);

                    break;
                case 2:
                    int Edad;
                    String Descripcion;
                    String textura;

                    System.out.println("Ingrese los datos que se solicita de su masconta: ");
                    System.out.println("Nombre: ");
                    name = s.next();
                    System.out.println("Especie : ");
                    especie = s.next();
                    System.out.println("Raza : ");
                    raza = s.next();
                    System.out.println("Forma de alimentacion: ");
                    alimentacion= s.next();
                    System.out.println("Forma de limpieza: ");
                    moodShower= s.next();
                    System.out.println("Edad : ");
                    Edad = s.nextInt();
                    System.out.println("Textura : ");
                    textura = s.next();
                    System.out.println("Motivo de la cita: ");
                    Descripcion = s.next();

                    Camaleones camaleones = new Camaleones(Edad,Descripcion,textura,name,especie,raza,alimentacion,moodShower);

                    consultas.add(camaleones);

                    break;
                case 3:
                    System.out.println("Ingrese el nombre de su mascota: ");
                    s.nextLine();
                    name=s.nextLine();
                    Consultas deleteConsultas = showConsulta(name);
                    if (deleteConsultas != null){
                        consultas.remove(deleteConsultas);
                        System.out.println("Se ha eliminado su consulta");
                    }else{
                        System.out.println("No se encontro ninguna cita para esa mascota");
                    }

                    break;
                case 4:
                    System.out.println("Ingrese el nombre de su mascota: ");
                    s.nextLine();
                    name=s.nextLine();

                    Consultas consultas = showConsulta(name);

                    if( consultas != null){

                        consultas.Informacion();
                    }else {
                        System.out.println("no existe esa consulta");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por su visita ");
                    break;
                default:
                    break;




            }

        }while (opcion != 5);

    }

    public static Consultas showConsulta (String name){
        for (Consultas consultas: consultas){
        if (consultas.getNombre().equals(name)){
            return consultas;
        }

        }
        return null;
    }
}