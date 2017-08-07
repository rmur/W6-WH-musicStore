package store_management;
import behaviours.*;

public class Baldvin implements Sellable {
  String type;
  int buyPrice;
  int sellPrice;

  public Baldvin(String type, int buyPrice, int SellPrice){
    this.type = type;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public int calculateMarkup(){
    return this.sellPrice - this.buyPrice;
  }

  public String getType(){
    return this.type;
  }

  

}