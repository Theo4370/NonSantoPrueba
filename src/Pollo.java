/**
 * Created by digitalhouse on 29/08/17.
 */
public class Pollo extends Animal implements Pastoreable{
    private Integer huevosPorSemana;

    public Pollo(String fechaDeNacimiento, String patente, Integer huevosPorSemana) {
        super(fechaDeNacimiento, patente);
        this.huevosPorSemana = huevosPorSemana;
    }

    @Override
    public void pastorear() {
        System.out.println("Soy un pollo, estoy siendo pastoreado");
    }
}
