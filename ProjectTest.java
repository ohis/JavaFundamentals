
public class ProjectTest{
    public static void main(String[] args){
        ProjectClass t1 = new ProjectClass("jaane");
        System.out.println(t1.getName());
         t1.setName("mike");
         String newName = t1.getName();
        System.out.println(newName);
    }
}