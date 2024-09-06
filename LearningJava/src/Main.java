interface ShapeA{
  void draw();
  void Shape1();
}

interface ShapeB{
  void draw2();
  void Shape2();
}

class Rectangle implements ShapeA, ShapeB{
  // @override
  public void draw(){
    System.out.println("Drawing");
  }
  public void Shape1(){
    System.out.println("Shaping");
  }
  public void draw2(){
    System.out.println("Drawing Again");
  }
  public void Shape2(){
    System.out.println("Shaping Again");
  }
}

public class Main{
  public static void main(String[] args) {
    Rectangle R = new Rectangle();
    R.draw();
    R.Shape1();
    R.Shape2();
    R.draw2();
  }
}
