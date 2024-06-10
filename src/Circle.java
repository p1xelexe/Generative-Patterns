public class Circle extends Shape{
    public Circle(){
        setType("Круг");
    }
    @Override
    void draw(){
        System.out.println("Рисую круг");
    }
}
