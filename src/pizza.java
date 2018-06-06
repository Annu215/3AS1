
import static java.awt.geom.Point2D.distance;
import java.text.DecimalFormat;
import java.util.Scanner;

class pizza{
    
    int deliverycharge(int distance)
    {
        
        if (distance==0)
            return 0;
        
        else if(distance==1)
            return 100;
        
        else if(distance==2)
            return 110;
        
        return 0;
    }
    
    
        String order(String name)
    {
        
        return name;
        
    }

    
    int pizzadetails(int inches)
    {
        if(inches==10)
            return 150;
        
        else if(inches==12)
            return 200;
        
        else if(inches==14)
            return 300;
        
        else if(inches==16)
            return 400;
            
        return 0;
    }

        int pizzacrust(char crustType)
    {
        if (crustType == 'H' || crustType == 'h' )
	     {
            
	         return crustType;
	     }
	     else if (crustType == 'T' || crustType == 't' )
	     {
                 
	         return crustType;
	     }
	     else if (crustType == 'D' || crustType == 'd' )
	     {
	         return crustType;
	     }
        return 0;
    }
    Object pizzacrust(String t) {
 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    int pizzatoppings(char numberOfToppings)
    {
       
        if (numberOfToppings =='y' || numberOfToppings == 'Y' )
	     {
	       return 'y';
	        
	     }
	     else
	     {
	         return 'n';
	     }

    }
Object pizzatoppings(String y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}