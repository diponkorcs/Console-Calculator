
import java.lang.*;
import java.util.*; 

public class CalculatorInput
{
    public double x;
    public double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public CalculatorInput(){}
	
    public CalculatorInput(double x, double y)
    {
        this.x=x;
		this.y=y;
    }
	
    
}