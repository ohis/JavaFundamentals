
public class PythagoreanTest{

  public static void main(String[] args){
    Pythagorean p = new Pythagorean();
    int a = 2;
    int b = 3;
    double c = p.calculateHypotenuse(a,b);
    System.out.println("The hypotenuse is "+c);
  }
}
