package store_management;

public abstract class Instrument{
  protected String color;
  protected String material;
  protected Boolean adjustment;

  public Instrument(String color, String material){
      this.color = color;
      this.material = material;
      this.adjustment = adjustment;
  }
}