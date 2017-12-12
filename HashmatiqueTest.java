import java.util.*;

public class HashmatiqueTest{

  public static void main(String[] args) {
    HashMap<String, String> trackList = new HashMap<String,String>();

    trackList.put("Let me Love you", "Mario");
    trackList.put("Controller","Drake");
    trackList.put("Perfect","Ed Sheeran");
    trackList.put("Wake Me Up","Remy Ma");

    System.out.println(trackList.get("Controller"));

    for(Map.Entry<String, String> list : trackList.entrySet()){
      System.out.println("Track :"+list.getKey() + " Artist: "+ list.getValue());
    }
  }
}
