
public class Basics {
  public int Max(int[] arr){
    int len = arr.length;
    int max = arr[0];
    for(int i = 0;i < len; i++ ){
      if(arr[i] > max){
        max = arr[i];
      }
    }
//  System.out.println("tHe max is :"+max);
    return max;
  }

  public int[] ShiftVal(int[] arr){
    arr[0] = arr[1];

    for(int i = 1; i < arr.length-1;i++){
      arr[i] = arr[i+1];
    }
    arr[arr.length - 1] = 0;

    return arr;

  }
}
