/**
   CatalogItem Class
   
   @author William Sullvian
   
   The CatalogItem class defines a single item in a storage catalog
   of items available for purchase.  Each item has an integer itemID, 
   which identifies the item, a description, and a price value.  All 
   fields should be private, with accessor methods defined.  The 
   description and price fields should also define mutator methods.  
   Provide a default constructor which sets the fields to a default 
   value, an overloaded constructor which accepts values for all three 
   fields and a copy constructor which creates a new object which is a 
   copy of the parameter object.  A toString method should be defined 
   to return the itemID, description, and price,formatted in currency, 
   as a single descriptive string.  An equals method should be included.  
   Two CatalogItem objects are considered equal when their three field 
   values are the same.
   
*/
public class CatalogItem {
   private int itemID;
   private String description;
   private double priceValue;
   public CatalogItem() {
      this.itemID = 0;
      this.description = "";
      this.priceValue = 0;
   }
   public CatalogItem(int itemID, String description, double priceValue) {
      this.itemID = itemID;
      this.description = description;
      this.priceValue = priceValue;
   }
   public CatalogItem(CatalogItem catalogItem) {
      this.itemID = catalogItem.itemID;
      this.description = catalogItem.description;
      this.priceValue = catalogItem.priceValue;
   }
   public int getItemId() {
      return itemID;
   }
   public String getDescription() {
      return description;
   }
   public double getPriceValue() {
      return priceValue;
   }
   public void setDescription(String description) {
      this.description = description;
   }
   public void setPriceValue(double priceValue) {
      this.priceValue = priceValue;
   }
   public String toString() {
      return "Item: " + itemID + ", " + description + ". Price: $" + String.format("%.2f", priceValue);
   }
}