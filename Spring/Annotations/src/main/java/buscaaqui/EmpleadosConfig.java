package buscaaqui;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//para sustituir los archivos de configuracion de XML a una class se utiliza la notacion @Configuration

@Configuration
//@ComponentScan se encargara de buscar los archivos de configuracion en el paquete por lo tanto se coloca el nombre del paquete
@ComponentScan("buscaaqui")
public class EmpleadosConfig {



}
