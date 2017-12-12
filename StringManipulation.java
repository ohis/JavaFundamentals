
public class StringManipulation {

 public String ConcatSubstring(String str1, int a, int b, String str2){
   char[] arr = str1.toCharArray();
   char firstString = ' ';
   for(int i = a; i < b; i++){
     firstString = arr[i];
   }
   String ist = String.valueOf(firstString);
   return  ist + str2;
 }

  public  int getIndexOrNull(String str, char letter){
  //  if(str.contains(letter)){
      char[] arr = str.toCharArray();
      for(int i = 0; i < arr.length;i++){
        if(arr[i] == letter){
          return i;
        }
      }
  //  }
    return -1;
  }
  public String trimAndConcat(String str1, String str2){
    char[] newStr = str1.toCharArray();
    char[] secStr = str2.toCharArray();
    //System.out.println(newStr.length);

  int count1 = NumNonSpace(secStr);
  int count = NumNonSpace(newStr);

    int sum = count + count1;
    System.out.println("The sum is "+sum);
    System.out.println("The first count is "+count);
    char[] finalStr = new char[sum];
    int a = 0;
    for(int n = 0; n < sum; n++){
      if(n < newStr.length){
        if(newStr[n] != ' '){
            finalStr[a] = newStr[n];
            a++;
        }
        else{
          continue;
        }
      }
    }

    for(int n = 0; n < sum; n++){
      if(n < secStr.length){
        if(secStr[n] != ' '){
            finalStr[count] = secStr[n];
            count++;
        }
        else{
          continue;
        }

      }

    }
    //System.out.println(count);
    //System.out.println(count1);
    //System.out.println(String.valueOf(secStr));
    //System.out.println(String.valueOf(newStr));
    System.out.println(String.valueOf(finalStr));

    return String.valueOf(finalStr);

  }

  public int NumNonSpace(char[] arr){
     int count = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] != ' '){
        count++;
      }
    }
    return count;
  }
}
