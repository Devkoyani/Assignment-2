import java.util.*;
class circle{
    double r;
    circle()
    {
        r=1;
    }
    circle(double k)
    {
        r=k;
    }
    double getarea()
    {
        return 3.14*r*r;
        
    }
    double getperimeter()
    {
        return 2*3.14*r;
    }

}
