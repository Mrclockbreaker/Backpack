import java.util.ArrayList;

public class Backpack {
  private String pocketSize;
  private int pocketAmount;
  private String pocketUse; 

  public Backpack(){
    pocketSize = "Small" + "Medium" + "Large";
    pocketAmount = 1 + (int)(Math.random() * 3);
    pocketUse = "Notebooks" + "Textbooks" + "Laptops"; 
  }
  public Backpack(String pocketSize){
    this();
    this.pocketSize = pocketSize; 
  }
  public Backpack(String pocketSize, int pocketAmount, String pocketUse){
    this.pocketSize = pocketSize;
    this.pocketAmount = pocketAmount;
    this.pocketUse = pocketUse;
  }
  public String toString(){
    return "Size: " + pocketSize + "Amount of pockets: " + pocketAmount + "What each pocket is used for: " + pocketUse;
  }
  public void open(){
    boolean isBackpackOpen = true;
  }
  public void close(){
    boolean isBackpackClosed = false;
  }
  public void wear(){
    String location = "On my back";
  }
  
}