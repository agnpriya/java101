package com.aipalbot.calcdiscount;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static int value;
	static int quantity;
	static int total = 0;
	static int total_sold = 0;
	static int total_cashier = 0;
	static float expensier = 0;
	int again = 1;
	static String answer;
	static String promoCode;
	//static int newDiscountValue = 0;
    public static void main( String[] args )
    {
      /*
        * int noOfItems = 8;
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
            
           
           //Second Program
    	
    	 Scanner scanner = new Scanner(System.in);
            
    	    System.out.println("Enter your value for x");
            int x = scanner.nextInt();
            System.out.println("The value x is : " +x);
            
            
            System.out.println("Enter your value for y");
            int y = scanner.nextInt();
            System.out.println("The value y is : " +y);
            
            //x^2 + 3x+1-3y-3x
            
           // double xy = Math.pow(x, 2) + 3 * x + 1 - 3 * y -3 * x;
           System.out.println("x^2 + 3x+1-3y-3x="+xy);
            
            // 2x+(y+3x*4y)-2x
            
            int xy = 2 * x + (y + 3 * x * 4 * y) - 2 * x;
            System.out.println("Result for 2x+(y+3x*4y)-2x= " +xy);
            
    	   
    	
    	//Third program
    	
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("The no of items purchased:");
    	//int noOfItems = scanner.nextInt();
    	//System.out.println(noOfItems);
    	int totalPrice = 0;
    	
    	
    	
    			 
    	
    	do
    	{
    		
    		System.out.print("Enter Item name:");
    		String itemName = scanner.next();
    		System.out.print("Enter the item price: ");
        	int itemPrice = scanner.nextInt();
        	totalPrice += itemPrice;
    		System.out.print("Do you want to enter another item: ENTER (Y/N) only:");
    		String a = scanner.next(); 		
   
    		
    	}while((a.equalsIgnoreCase("Y"))) ;
    	
    	System.out.print("Total cost of all items:"  +totalPrice);
    	
    	
    	
    	while (true) {
			System.out.print("Do you want to enter another  item price(Y/N) ?\n");
			Scanner ans = new Scanner(System.in);
			answer =ans.nextLine();
			if (answer.equalsIgnoreCase("Y")) {
				Scanner input = new Scanner(System.in);
				System.out.println("Input Price: \n");
				value = input.nextInt();

				Scanner input2 = new Scanner(System.in);
				System.out.println("Input Quantity: \n");
				quantity = input2.nextInt();
                
				total += value * quantity;
				total_cashier += total;

				if (value > expensier) {
					expensier = value;
				}

				total_sold += quantity;

			} else if (answer.equalsIgnoreCase("N")) {
				System.out.println("Thank you !!");
				break;
			} else {
				System.out.print("Try Again With (Y/N) only !");
			}
			System.out.println("Total to pay :" + total);
			System.out.println("Value of the expensiest product: " + expensier);
			System.out.println("Amount of products sold: " + total_sold);
			System.out.println("Amount of cash in cashier: " + total_cashier);
			
			 
		}
    	
    	
    	double newDiscountValue = 0.0;

    	if (total_cashier > 200)
	    {
	 	    double discount = (total_cashier * 10) / 100;
	 	    newDiscountValue = total_cashier - discount;
	 	  // System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "US"))
	 		    //    .format(newDiscountValue));
	 	  System.out.println("Cost after discount:" +newDiscountValue);
	 	   
	    } 
*/
 
   
    	
    	int aRowSize;
    	int aColSize;
    	int bRowSize;
    	int bColSize;
    	
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter first array row and column size: ");
    	aRowSize = input.nextInt();
    	aColSize = input.nextInt();
    	
    	System.out.println("Enter second array row and column size:");
    	bRowSize = input.nextInt();
    	bColSize = input.nextInt();
    	
    	
    	 if (aColSize != bRowSize)
    	 {
    	      System.out.println("The matrices can't be multiplied with each other.\n");
    	      System.out.println("TO MULTIPLY TWO MATRIXES COLUMSIZE OF FIRST MATRIX SHOULD BE EQUAL TO ROWSIZE OF SECOND MATRIX.");
    	      
    	 }
    	   else
    	   {
    		   int[][] matrixA = new int[aRowSize][aColSize];
    	    	int[][] matrixB = new int[bRowSize][bColSize];
    	    	
    	    	int[][] matrixC = new int[aRowSize][bColSize];
    	    	
    	    	
    	    	System.out.println("***********Enter MATRIX A elements************** of size: "+ aRowSize+ " Rows" +aColSize+ "  Columns" );
    	    	
    	    	
    	    	
    	    	for(int i=0; i<aRowSize; i++) 
    	    	{
    	    		int header=i;
    	    		System.out.println("**Enter " +(header+1)+ "  row  elements" );
    	    		
    	    		for(int j=0; j<aColSize; j++)
    	    		{
    	    			int l=j;
    	    			System.out.println("Enter  "+(l+1)+ "  column elements");
    	    			
    	    			matrixA[i][j] = input.nextInt();
    	    			
    	    		}
    	    		
    	    	}
    	    	
    	    	
    	    	System.out.println("***********Enter MATRIX B elements************** of size: " +bRowSize+ "Rows "+bColSize+ "Columns" );
    	    	
    	    	
    	    	
    	    	for(int i=0; i<bRowSize; i++) 
    	    	{
    	    		int header=i;
    	    		System.out.println("**Enter " +(header+1)+ "  row  elements" );
    	    		
    	    		for(int j=0; j<bColSize; j++)
    	    		{
    	    			int l=j;
    	    			System.out.println("Enter "+(l+1)+ "  column elements");
    	    		    matrixB[i][j] = input.nextInt();
    	    			
    	    		}
    	    		
    	    	}
    	    	
    	    	System.out.println("******** MATRIX A ELEMENTS*************"); 	
    	    	 for(int i=0;i<aRowSize;i++)
    	    	   {

    	    	   	System.out.print("|\t");
    	    	   	for(int j=0;j<aColSize;j++)
    	    	   	{
    	    	   		System.out.print(matrixA[i][j]+"\t");
    	    	   	}
    	    	   	System.out.print("|");
    	    	   	System.out.println("\n");
    	    	   }
    	    	   
    	    	   
    	    	   
    	    	 System.out.println("******** MATRIX B ELEMENTS*************"); 	
    	    	   
    	    	   
    	    	   for(int i=0;i<bRowSize;i++)
    	    	   {

    	    	   	System.out.print("|\t");
    	    	   	for(int j=0;j<bColSize;j++)
    	    	   	{
    	    	   		System.out.print(matrixB[i][j]+"\t");
    	    	   	}
    	    	   	System.out.print("|");
    	    	   	System.out.println("\n");
    	    	   }
    	    	
    	    	
    	    	   
    	    	 //Calculating multiplication of A*B matrices
    	    	   System.out.println("The RESULT array:");
    	    	   for(int i=0;i<aRowSize;i++){    
    	    		   for(int j=0;j<bColSize;j++){    
    	    		   matrixC[i][j]=0;      
    	    		   for(int k=0;k<bRowSize;k++)      
    	    		   {      
    	    				
    	    		   matrixC[i][j]+=matrixA[i][k]*matrixB[k][j];      
    	    		   }
    	    		   System.out.print(matrixC[i][j]+" ");   
    	    		   } 
    	    			
    	    		   
    	    		   System.out.println();    
    	    		   }    
    	    	   
    	    	   
    	    }
    	
    	
    }
}
