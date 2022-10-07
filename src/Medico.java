import java.util.Date;
import java.util.List;

public class Medico extends Persona{
    String codMedico;
    Hospital hospital;
    public Medico(String codHospital, String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, String DNI) {
        super(codHospital, nombre, primerApellido, segundoApellido, fechaNacimiento, DNI);
    }
}
