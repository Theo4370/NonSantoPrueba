/**
 * Created by digitalhouse on 29/08/17.
 */
public class Oveja extends Animal implements Pastoreable{
    private Double kilosDeLana;


    public Oveja(String fechaDeNacimiento, String patente, Double kilosDeLana) {
        super(fechaDeNacimiento, patente);
        this.kilosDeLana = kilosDeLana;
    }

    @Override
    public void pastorear() {
        System.out.println("Soy una oveja, estoy siendo pastoreada");
    }
}
