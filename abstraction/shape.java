package abstraction;

public abstract class shape {
    public abstract void calculate(int x, int y);

    public static void main(String[] args) {
        shape s = new rectangle();
        s.calculate(5, 3);
    }
}

class rectangle extends shape {

    public void calculate(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}

