
public class BasicsTest {

  public static void main(String[] args){
    Basics max = new Basics();
    int[] arr = {-3,-5,-7,4};
    System.out.println("The max is "+max.Max(arr));
    int[] array = {1,5,10,7,-2};
    Basics shift = new Basics();
    int[] arr1 = shift.ShiftVal(array);
    for(int n :arr1){
      System.out.println(n);
    }
  }
}
