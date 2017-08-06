package store_management;

public class Piano {
  private String type;
  private String name;

  public Piano(String type, String name){
    this.type = type;
    this.name = name;
  }

  public String getType(){
    return this.type;
  }

  public String getName(){
    return this.name;
  }

}