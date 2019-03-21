package cn.com.flyweight;

/**
 * 　享元模式主要用于减少创建对象的数量，以减少内存占用和提高性能，这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构方式
 *
 *  主要解决在有大量对象时，有可能会造成内存溢出，我们把其中共同部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重复创建对象
 */
public class FlyweightPatternDemo {

    private static final String colors[] = {"Red","Green","Blue","White","Black"};

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }


    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random()*100);
    }

    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

}
