
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

    
}