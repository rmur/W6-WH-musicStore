//array list of stock (several array liss; by interface;)

package store_management;
import java.util.ArrayList;
import behaviours.*;

public class Shop {
  private String name;
  private ArrayList<Sellable> stock;

  public Shop(String name){
    this.name = name;
    this.stock = new ArrayList<Sellable>();
  }

  public String getName(){
    return this.name;
  }

  public int stockCount(){
    return this.stock.size();
  }

  public void addToStock(Sellable item){
    this.stock.add(item);
  }

  public void removeFromStock(Sellable item){
    this.stock.remove(item);
  }


}