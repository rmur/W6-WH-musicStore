package store_management;

public class Fortepiano extends Instrument {
  private int keyboardKeys;
  private String type;

  public Fortepiano(String material, String color,String type, int keyboardKeys) {
    super( material, color );
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