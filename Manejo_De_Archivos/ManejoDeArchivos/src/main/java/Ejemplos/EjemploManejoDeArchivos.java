package Ejemplos;

import Service.FileService;

public class EjemploManejoDeArchivos {
    public static void main(String[] args) {
        String nombreArchivo2 = "C:\\ManejoArchivos\\Tests\\archivoTest2.txt";
        FileService fileService = new FileService();
        fileService.crearArchivo2(nombreArchivo2);
    }
}
