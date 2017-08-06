package store_management;

public class Guitar {
  private int strings;
  private String name;

  public Guitar(String name, int strings){
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