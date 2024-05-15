package eva3_15_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EVA3_15_SERIALIZABLE {

    public static void main(String[] args) {
        try {
            Persona human = new Persona("Héctor", "Murguía", 39);
            Persona.guardarObjeto(human);
            Persona human2 = Persona.leerObjeto();
            System.out.println(human2);
        } catch (IOException | ClassNotFoundException ex) {
            
        }
    }

    static class Persona implements Serializable {
        private String nombre;
        private String apellido;
        private int edad;

        public Persona() {
            this.nombre = "Sin Nombre";
            this.apellido = "Sin Apellido";
            this.edad = 0;
        }

        public Persona(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public static void guardarObjeto(Persona obj) throws FileNotFoundException, IOException {
            String ruta = "C:\\archivos\\persona.txt";
            FileOutputStream abrirArch = new FileOutputStream(ruta);
            ObjectOutputStream guardarDatos = new ObjectOutputStream(abrirArch);
            guardarDatos.writeObject(obj);
        }

        public static Persona leerObjeto() throws IOException, ClassNotFoundException {
            String ruta = "C:\\archivos\\persona.txt";
            FileInputStream abrir = new FileInputStream(ruta);
            ObjectInputStream leerArch = new ObjectInputStream(abrir);
            return (Persona) leerArch.readObject();
        }
       
    }
}