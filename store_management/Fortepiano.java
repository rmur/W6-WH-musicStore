package store_management;

public class Fortepiano {
  private int keyboardKeys;
  private String type;

  public Fortepiano(String type, int keyboardKeys) {
    this.keyboardKeys = keyboardKeys;
    this.type = type;

  }

  public String returnType(){
    return this.type;
  }

  public int returnKeys(){
    return this.keyboardKeys;
  }


}