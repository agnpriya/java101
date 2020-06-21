package com.aipalbot.calcdiscount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       int noOfItems = 8;
       int itemPrice = 3;
       int discountCheck = 20;
       int totalPrice;
       int newDiscountPrice = 0;
       
      
       totalPrice = noOfItems * itemPrice;
       
       System.out.println("Total price before discount :" +totalPrice);
        
       
             if(totalPrice > discountCheck)
               {
    	   
    	         newDiscountPrice = totalPrice - (2*itemPrice);
    	   
    	          } 
    	   
            System.out.println("Total price after discount:" +newDiscountPrice);
    }
}
