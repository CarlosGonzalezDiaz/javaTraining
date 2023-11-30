package Service;

import java.io.*;
import java.util.Scanner;

public class FileService {
    //Creamos un metodo que reciba un String como parametro para nombrar el archivo
    public void crearArchivo(String nombre){
        //Utilizamos la clase File de Java.io
        File archivo = new File(nombre);
        try {
            //Agregamos la clase FileWriter para poder modificar el archivo creado
            //Si queremos que se pueda modificar texto sin estar borrando y agregando, ponemos en true el parametro append
            FileWriter escritor = new FileWriter(archivo, true);

            //BufferedWriter es una version optimizada para trabajar con mayor cantidad de caracteres y tenga que usar el sistema menos veces
            BufferedWriter bufferedWriter = new BufferedWriter(escritor);

            //con el metodo append agregamos texto al archivo
            bufferedWriter.append("hola que tal amigos").append(" todo bien?").append(" nos vemos!!");
            //una vez que se tenga el archivo modificado se tiene que cerrar el editor para que los cambios se vean reflejados
            bufferedWriter.close();
            //Simplemente nos mandamos un texto comprobando que la tarea se cumplio
            System.out.println("el archivo se ha creado con exito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(archivo))){
            printWriter.println("Hola Amigos");
            printWriter.println("Saludos desde manejo de archivos");
            printWriter.println("nos vemos!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String leerArchivo(String documento){
        StringBuilder stringBuilder = new StringBuilder();
        File archivo = new File(documento);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = bufferedReader.readLine()) != null)
            {
                stringBuilder.append(linea).append("\n");
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }

    public String leerArchivo2(String documento){
        StringBuilder stringBuilder = new StringBuilder();
        File archivo = new File(documento);
        try {
            Scanner scanner = new Scanner(archivo);
            scanner.useDelimiter("\n");
            while (scanner.hasNext())
            {
                stringBuilder.append(scanner.next()).append("\n");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }

}
