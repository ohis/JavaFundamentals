import  java.util.*;
public class PuzzleTest{
  public static void main(String[] args){
    Puzzle gtTen = new Puzzle();
    int[] array = {3,5,1,2,7,9,8,13,25,32};
    int[] arr = gtTen.GreaterThanTen(array);

    for(int i : arr){
      System.out.println(i);
    }

    Puzzle shuffle = new Puzzle();
    char[] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
  'o','p','q','r','s','t','u','v','w','x','y','z'};
  ArrayList<Character> ShufAlph = new ArrayList<Character>();
    for(int i = 0; i < alph.length; i++){
      ShufAlph.add(alph[i]);
    }
    char[] arr1 = shuffle.ShuffleAlpahbet(ShufAlph);
    System.out.println("The first alphabet is "+arr1[0]+" The last is "+arr1[1]);
  }
}
