public class Main {

    public static void main(String[] args) {

        Vaca unaVaca = new Vaca("10/10/1990", "ABJ567", 34.0, true);
        Oveja unaOveja = new Oveja("9/1/1955","KLC888",2.5);
        Pollo unPollo = new Pollo("8/4/2001", "OUV023",15);

        Pastor unPastor = new Pastor();
        unPastor.agregarPastoreable(unaVaca);
        unPastor.agregarPastoreable(unaOveja);
        unPastor.agregarPastoreable(unPollo);

        unPastor.pastorear();
    }
}
