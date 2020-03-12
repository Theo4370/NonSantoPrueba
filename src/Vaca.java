/**
 * Created by digitalhouse on 29/08/17.
 */
public class Vaca extends Animal implements Pastoreable{
    private Double lechePorDia;
    private Boolean estaLoca;


    public Vaca(String fechaDeNacimiento, String patente, Double lechePorDia, Boolean estaLoca) {
        super(fechaDeNacimiento, patente);
        this.lechePorDia = lechePorDia;
        this.estaLoca = estaLoca;
    }

    @Override
    public void pastorear() {
        System.out.println("Soy una vaca, estoy siendo pastoreada");
    }
}
