package com.oopsassign;

public class Checkout {
       DessertItem cashReg[];
       
       public void addItems(DessertItem items[])
       {
    	   this.cashReg=items;
       }
       
       public int getNumberofItems()
       {
    	   if(this.cashReg==null)
    	   {
    		   System.err.println("Empty Cart");
    		   return 0;
    	   }
    	   else
    	   {
    		   return this.cashReg.length;
    	   }
       }
       public void clearCart()
       {
    	   this.cashReg=null;
       }
       public double getTotal()
       {
    	   if(this.cashReg==null)
    	   {
    		   System.err.println("Empty Cart");
    		   return 0;
    	   }
    	   else
    	   {
    		   double cost=0.0;
    		   for (DessertItem i: cashReg)
    		   {
    			   cost=cost+i.cost();
    		   }
    		   return cost;
    	   }
       }
       @Override
       public String toString()
       {
    	   System.out.println("Receipt.....");
   		String s = "";
    	   if(this.cashReg==null)
    	   {
    		   System.err.println("Empty Cart");
    		   return "";
    	   }
    	   else
    	   {
    		   double cost=0.0;
    		   for (DessertItem i: cashReg)
    		   {
    			   s=s+i.name()+":"+i.cost()+"\n";
    		   }
    		   s=s+"Total Cost"+this.getTotal();
    		   return s;
    	   }
       }
       
}
