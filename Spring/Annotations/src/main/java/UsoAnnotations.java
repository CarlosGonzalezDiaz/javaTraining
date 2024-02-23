import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {
    public static void main(String[] args) {
        //Leer el xml de conf
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ds");
        //pedir un bean al contenedor
        //para poder crear un bean con annotations es
        //@Component("nombre de ID")
        Empleados Antonio = context.getBean("empleadosImpl", Empleados.class);

        //usar el bean
        System.out.println(Antonio.getInformes());

        //cerrar el contexto
        context.close();
    }
}
