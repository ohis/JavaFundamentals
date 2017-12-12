
public class ProjectClass{
    String name;
    String descrption;

    public String elevatorPitch(){
        return name + ":" + descrption;
    }

    public ProjectClass(String name){
       this.name = name;
    }

    public ProjectClass(String name, String description){
        this.name = name;
        this.descrption = description;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDsec(){
        return this.descrption;
    }

    public void setDesc(String description){
        this.descrption = description;
    }
}