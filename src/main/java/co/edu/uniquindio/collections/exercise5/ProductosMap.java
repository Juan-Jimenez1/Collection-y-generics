package co.edu.uniquindio.collections.exercise5;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class ProductosMap {
    private HashMap<Integer, String> productosHashMap;
    private LinkedHashMap<Integer, String> productosLinkedHashMap;
    private TreeMap<Integer, String> productosTreeMap;

    public ProductosMap() {
        productosHashMap = new HashMap<>();
        productosLinkedHashMap = new LinkedHashMap<>();
        productosTreeMap = new TreeMap<>();
    }

    public void agregarProductosHashMap() {
        productosHashMap.put(101, "Arroz");
        productosHashMap.put(102, "Leche");
        productosHashMap.put(103, "Pan");
    }
    public void agregarProductosLinkedHashMap() {
        productosLinkedHashMap.put(103, "Pan");
        productosLinkedHashMap.put(101, "Arroz");
        productosLinkedHashMap.put(102, "Leche");
    }
    public void agregarProductosTreeMap() {
        productosTreeMap.put(103, "Pan");
        productosTreeMap.put(101, "Arroz");
        productosTreeMap.put(102, "Leche");
    }
    public void mostrarMapas() {
        System.out.println("HashMap: " + productosHashMap);
        System.out.println("LinkedHashMap: " + productosLinkedHashMap);
        System.out.println("TreeMap: " + productosTreeMap);
    }
}
