import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 29/08/17.
 */
public class Pastor {
    private List<Pastoreable> pastoreables;

    public Pastor() {
        pastoreables = new ArrayList<>();
    }

    public void pastorear(){
        for (Pastoreable pastoreable:pastoreables) {
            pastoreable.pastorear();
        }
    }

    public void agregarPastoreable(Pastoreable pastoreable){
        pastoreables.add(pastoreable);
    }
}
