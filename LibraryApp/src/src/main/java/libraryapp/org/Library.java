package libraryapp.org;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<PrintedMaterial> materials;

    public Library() {
        materials = new ArrayList<>();
    }

    public void addMaterial(PrintedMaterial material) {
        materials.add(material);
    }

    public void getAllMaterials() {
        for(PrintedMaterial material : materials) {
            System.out.println(material);
            System.out.println("---------------------");
        }
    }

    public List<PrintedMaterial> getMaterials() {
        return materials;
    }
}
