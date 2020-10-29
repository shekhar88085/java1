package oops.packages.models;

public class Students {
    private String name;
    public Students(String name){
        this.name=name;
    }
    public String getName(){
        return  name;

    }
    private String getPassword(){ //we should make password private and restrict everybody to
        // access it
        return "dfghjk2@SDF";
    }
}
