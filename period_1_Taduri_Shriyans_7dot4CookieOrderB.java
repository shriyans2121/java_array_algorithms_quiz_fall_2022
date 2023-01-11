// IMPORTANT For each solution, you should create a new file and name it with the following format: period_1_lastname_firstname_7dot4exercisename.java (change the period as needed)

// example: period_1_Fox_Andy_ClimbingClubA.java

// commit the file to this repository (it will create a new fork - this is ok)
// INSIDE THE FILE, COMPLETE THE FOLLOWING
// enter your name (firstname lastname) - you can overwrite this text
// enter the name of the exercise that you chose for one solution - you can overwrite this text
// enter your code for this solution only

import java.util.List;
import java.util.ArrayList;

class CookieOrder
{
 private int numBoxes;
 private String variety;

 /** Constructs a new CookieOrder object */
 public CookieOrder(String variety, int numBoxes)
 {
   this.variety = variety;
   this.numBoxes = numBoxes;
 }

 /** @return the variety of cookie being ordered
 */
 public String getVariety()
 { return this.variety; }

 /** @return the number of boxes being ordered
 */
 public int getNumBoxes()
 { return this.numBoxes; }

 // There may be instance variables, constructors, and methods that are not shown.
}

public class MasterOrder
{
 /** The list of all cookie orders */
 private List<CookieOrder> orders;

 /** Constructs a new MasterOrder object */
 public MasterOrder()
 { orders = new ArrayList<CookieOrder>(); }

 /** Adds theOrder to the master order.
 *   @param theOrder the cookie order to add to the master order
 */
 public void addOrder(CookieOrder theOrder)
 { orders.add(theOrder); }

 /** @return the sum of the number of boxes of all of the cookie orders
 */
 public int getTotalBoxes(){
   int sum = 0;
    for (CookieOrder co : this.orders) {
      sum += co.getNumBoxes();
    }
    return sum;
 }

 public int removeVariety(String cookieVar){
  int numBoxesRemoved = 0;
     
   for (int i = this.orders.size() - 1; i >= 0; i--){
       CookieOrder thisOrder = this.orders.get(i);
       if (cookieVar.equals(thisOrder.getVariety()){
           numBoxesRemoved += thisOrder.getNumBoxes();
           this.orders.remove(i);
       }
  
 }
     }
       return numBoxesRemoved;
     }

 public static void main(String[] args){
   boolean test1 = false;
   boolean test2 = false;

   MasterOrder order = new MasterOrder();
   order.addOrder(new CookieOrder("Raisin", 3));
   order.addOrder(new CookieOrder("Oatmeal", 8));
   order.addOrder(new CookieOrder("Sugar", 2));

   if(order.removeVariety("Raisin") == 3 && order.removeVariety("Sugar") == 2)
     test1 = true;
   else
     System.out.println("Oops! Looks like your code doesn't return the correct value for cookie order varieties that exist.\n");

   if(order.removeVariety("Chocolate Chip") == 0)
     test2 = true;
   else
     System.out.println("Oops! Looks like your code doesn't return the correct value for cookie orders that don't exist in the master order.\n");

   if(test1 && test2)
     System.out.println("Looks like your code works well!");
   else
     System.out.println("Make some changes to your code, please.");
 }
}
