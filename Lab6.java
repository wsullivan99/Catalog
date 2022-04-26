/** Test Client for testing the Catalog class
  * @author Professor Gregory
  */
  
public class Lab6
{
public static void main(String[] args)
{
// TEST 1
// Create catalog and test the static getCount method
   System.out.println("Class has not been created. There are " + Catalog.count + " items.");
   Catalog myCatalog = new Catalog();
	System.out.println("\nCatalog class created. ");
	myCatalog.display();

   
// TEST 2
// Test the add method (version 1)
   CatalogItem item1 = new CatalogItem(123, "Pencils", 1.25);
	CatalogItem item2 = new CatalogItem(234, "Crayons", 2.50);
	CatalogItem item3 = new CatalogItem(567, "Paper", 5.00);
	myCatalog.add(item1);
	myCatalog.add(item2);
	myCatalog.add(item3);
	myCatalog.display();
	
// TEST 3	
// Test the add method (version 2)
   myCatalog.add(987,"Coloring Book",9.75);
	myCatalog.add(876,"Magic Marker",3.75);
	myCatalog.display();
	
//TEST 4	
// Testing encapsulation - item 1 will be changed in client - should not change in Catalog
 	System.out.print("\nChanged LOCAL item " + item1.toString() + " to " );  
	item1.setDescription("Pencils (10 count)");
	System.out.println(item1.toString());
	System.out.println("Change should NOT be reflected in the catalog!");
	myCatalog.display();
	
// TEST 5	
// Testing update methods
   System.out.println("\nChanged first item in the catalog");
   myCatalog.update(item1.getItemId(),"Pencils (15 count)");
	myCatalog.update(item1.getItemId(),1.75);
	myCatalog.display();
	
// TEST 6
// Tesing price increase method
   System.out.println("\nIncreasing prices by 10%");
	myCatalog.priceIncrease(.10);
	myCatalog.display();
	
// Price increase should not be reflected in local instance
   System.out.println("\nLOCAL item2 should contain original price\n" + 
	                   item2.toString());

// Test 7
// Test the getCatalogItem method
   System.out.println("\nLocating a CatalogItem");
   CatalogItem cat = myCatalog.getCatalogItem(123);
	if (cat != null)
	   System.out.println("Found item 123!");
	else
	   System.out.println("Didn't find item 123!");
		
	CatalogItem cat2 = myCatalog.getCatalogItem(123456);
	if (cat2 != null)
	   System.out.println("Found item 123456!");
	else
	   System.out.println("Didn't find item 123456!");
		
// TEST 8
// Test the toString() method of the Catalog class
   System.out.println("\nHere is the final list: " + myCatalog.toString());

}
}