package pk.biki;

public class Car {

private String Model;
private String Colour;
private int Number;


public void setModel(String model){
    String VerifyModel = model.toLowerCase();
    if (model.equals("ertiga") || model.equals("alto")) {
        this.Model = model;
    }else{
        this.Model = "unknown";
    }
}
public String getModel(){
    return this.Model;
}

}
