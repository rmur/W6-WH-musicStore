package store_management;

public class Guitar extends Instrument{
  private int strings;
  private String name;

  public Guitar(String material,String color, String name, int strings){
    super(material, color);
    this.name = name;
    this.strings = strings;
    
  }

  public String getName(){
    return this.name;
  }

  public int getStrings(){
    return this.strings;
  }


}