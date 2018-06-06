
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
    
    
}