package app.jdbcspring.test;

import app.jdbcspring.dao.ServicioDAO;
import app.jdbcspring.model.Servicio;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    public static void main(String[] args) {
        Servicio servicio= new  Servicio();
        servicio.setId(2);
        AppTest.getServicio(servicio);
    }

    public static void saveServicio() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_database.xml");
        ServicioDAO servicioDAO = (ServicioDAO) context.getBean("servicioDAO");
        Servicio servicio = new Servicio();
        servicio.setDescripcion("almuerzo campestre");
        servicio.setCostoHora(19d);
        servicioDAO.save(servicio);

    }

    public static void getServicio(Servicio servicio) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_database.xml");
        ServicioDAO localDAO = (ServicioDAO) context.getBean("servicioDAO");
        Servicio servicioFull = localDAO.get(servicio);
        System.out.println(servicioFull.getDescripcion() + " " + servicioFull.getCostoHora());
    }

    public static void getAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_database.xml");

        ServicioDAO servicioDAO = (ServicioDAO) context.getBean("servicioDAO");
        List<Servicio> servicios = servicioDAO.list();
        for (Servicio servicio : servicios) {
            System.out.println(servicio.getDescripcion() + " " + servicio.getCostoHora());
        }
    }
}
