
public class StringManipulationTest{
  public static void main(String[] args){
    StringManipulation manipulator = new StringManipulation();
    String first = "Hello ";
    String sec = " World ";
    System.out.println(manipulator.trimAndConcat(first, sec));

    char letter = 'o';
    Integer a = manipulator.getIndexOrNull("Coding", letter);
    Integer b = manipulator.getIndexOrNull("Hello World", letter);
    Integer c = manipulator.getIndexOrNull("Hi", letter);
    System.out.println(a);
    System.out.println(b);
    if(c == -1){
      System.out.println("null");
    }


String word = manipulator.ConcatSubstring("Hello", 1, 2, "world");
System.out.println(word); // eworld


  }


}
