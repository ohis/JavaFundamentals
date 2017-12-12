
public class FizzBuzz {
  public String fizzBuzz(int num){

    if(num % 3 == 0 && num % 5 == 0){
      return "FizzBuzz";
    }

    if(num % 3 == 0){
      return "FIZZ";
    }

    if(num % 5 == 0){
      return "BUZZ";
    }

    return Integer.toString(num);
  }
}
