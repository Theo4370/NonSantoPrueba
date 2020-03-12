/**
 * Created by digitalhouse on 29/08/17.
 */
public class Cocodrilo extends Animal{
    private Double kilosDeCuero;

    public Cocodrilo(String fechaDeNacimiento, String patente, Double kilosDeCuero) {
        super(fechaDeNacimiento, patente);
        this.kilosDeCuero = kilosDeCuero;
    }
}
