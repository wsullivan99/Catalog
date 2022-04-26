/**
   Catalog Class
   
   @author William Sullivan
   
   The Catalog class will maintain an ArrayList of CatalogItem 
   objects.  The Catalog class should be capable of storing up 
   to 100 CatalogItem objects in its list.   However, at any 
   given time, there is likely less than 100 CatalogItem objects.  

   
*/
import java.util.ArrayList;
public class Catalog {
   private ArrayList<CatalogItem> catalogItems;
   public static int count;
   public Catalog() {
      catalogItems = new ArrayList<CatalogItem>();
      count = 0;
   }
   public void add (CatalogItem catalogItem) {
      if (count < 100) {
         catalogItems.add(catalogItem);
         count++;
      } 
      else {
         System.out.println("No more capacity to add catalog item");
      }
   }
   public void add (int itemID, String description, double priceValue) {
      if (count < 100) {
         CatalogItem catalogItem = new CatalogItem(itemID, description, priceValue);
         catalogItems.add(catalogItem);
         count++;
      } 
      else {
         System.out.println("No more capacity to add catalog item");
      }
   }
   public void update (int itemID, String description) {
      for (int i=0;i<count;i++) {
         CatalogItem catalogItem = catalogItems.get(i);
         if (catalogItem.getItemId() == itemID) {
            catalogItem.setDescription(description);
         break;
         }
      }
   }
   public void update (int itemID, double priceValue) {
      for (int i=0;i<count;i++) {
         CatalogItem catalogItem = catalogItems.get(i);
         if (catalogItem.getItemId() == itemID) {
            catalogItem.setPriceValue(priceValue);
         break;
         }
      }
   }
   public void priceIncrease(double percentageAmount ) {
      for (int i=0;i<count;i++) {
         CatalogItem catalogItem = catalogItems.get(i);
         double newPriceValue = (catalogItem.getPriceValue() * percentageAmount) + catalogItem.getPriceValue();
         catalogItem.setPriceValue(newPriceValue);
      }
   }
   public CatalogItem getCatalogItem (int itemID) {
      for (int i=0;i<count;i++) {
         CatalogItem catalogItem = catalogItems.get(i);
         if (catalogItem.getItemId() == itemID) {
            return catalogItem;
         }
      }
      return null;
   }
   public void display() {
      if (count > 0) {
         System.out.println("\nThe Catalog consists of "+count+" items.");
         for (int i=0;i<count;i++) {
            CatalogItem catalogItem = catalogItems.get(i);
            System.out.println(catalogItem);
         }
      } 
      else {
         System.out.println("\nThe Catalog consists of 0 items.");
      }
   }

   public String toString() {
      String output = "\nThe Catalog consists of "+count+" items.\n";
      for (int i=0;i<count;i++) {
         CatalogItem catalogItem = catalogItems.get(i);
         output = output + catalogItem + "\n";
      }
      return output;
   }
}