/**
 * Created by digitalhouse on 29/08/17.
 */
public abstract class Animal {
    private String fechaDeNacimiento;
    private String patente;

    public Animal(String fechaDeNacimiento, String patente) {
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.patente = patente;
    }
}
