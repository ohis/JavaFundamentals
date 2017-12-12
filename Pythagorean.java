

public class Pythagorean{

  public double calculateHypotenuse(int legA, int legB){
    double c = legA*legA + legB*legB;
    double squareRt =  Math.sqrt(c);
    return  squareRt;
  }
}
