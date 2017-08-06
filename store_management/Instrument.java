package store_management;

public abstract class Instrument{
  String color;
  String material;


  public Instrument(String material, String color){
      this.material = material;
      this.color = color;
  
  }

  public String getMaterial(){
    return this.material;
  }

  public String getColor(){
     return this.color;
  }
}