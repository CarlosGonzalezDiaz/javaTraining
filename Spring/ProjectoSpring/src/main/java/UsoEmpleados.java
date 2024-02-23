import IoC.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
    public static void main(String[] args) {
        /*Empleados empleado1 = new DirectorEmpleado();
        System.out.println(empleado1.getTareas());*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*Empleados Juan = context.getBean("miEmpleado", Empleados.class);
        System.out.println(Juan.getTareas());
         */
        SecretarioEmpleado Maria = context.getBean("indormePorSetter", SecretarioEmpleado.class);
        System.out.println(Maria.getTareas());
        System.out.println(Maria.getInforme());
        System.out.println(Maria.getEmail());
        System.out.println(Maria.getNombreEmpresa());
        context.close();
    }
}
