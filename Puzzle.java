import java.util.*;
public class Puzzle{

  public char[] ShuffleAlpahbet(ArrayList<Character> arr){

    Collections.shuffle(arr);
    char[] array = {arr.get(0), arr.get(arr.size() - 1)};

    if(array[0] == 'a' || array[0] == 'e' || array[0] == 'i' ||
      array[0] == 'o' || array[0] == 'u'){
        System.out.println("The first letter is a vowel");
      }

      return array;

  }

  public int[] GreaterThanTen(int[] arr){
    int len = arr.length;
    int sum = 0;
    ArrayList<Integer> array = new ArrayList<Integer>();
    for(int i = 0;i < len;i++){
      sum+=arr[i];
      if(arr[i] > 10){
        array.add(arr[i]);
      }
    }
    System.out.println(sum);
    int size = array.size();
    int[] ar;
    ar = new int[size];
    for(int n = 0; n <array.size();n++){
      ar[n] = array.get(n);
    }

    return ar;
  }
}
