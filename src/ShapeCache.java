import java.util.Map;
import java.util.HashMap;
class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        Square square = new Square();

        shapeMap.put("1", circle);
        shapeMap.put("2", square);
    }
}
