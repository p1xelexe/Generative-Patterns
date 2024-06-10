public class PrototypePatternExample {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedCircle = ShapeCache.getShape("1");
        System.out.println("Тип фигуры : " + clonedCircle.getType());
        clonedCircle.draw();

        Shape clonedSquare = ShapeCache.getShape("2");
        System.out.println("Тип фигуры : " + clonedSquare.getType());
        clonedSquare.draw();
    }
}
