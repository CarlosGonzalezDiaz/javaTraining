package Ejemplos;

import Service.FileService;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo2 = "C:\\ManejoArchivos\\Tests\\archivoTest2.txt";
        FileService fileService = new FileService();
        System.out.println(fileService.leerArchivo2(nombreArchivo2));
    }
}
