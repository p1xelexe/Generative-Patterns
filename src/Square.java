class Square extends Shape {
    public Square() {
        setType("Квадрат");
    }

    @Override
    void draw() {
        System.out.println("Рисую квадрат");
    }
}
