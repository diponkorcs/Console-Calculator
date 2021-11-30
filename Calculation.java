
import java.lang.*;

import java.util.*;

public class Calculation extends CalculatorInput
{
    public double result;
	
    public Calculation()
    {
	super();
    }

    public Calculation(double x, double y)
    {
	super( x, y);
    }

    public double addition()
    {
	result =  x+y;
	return result;
    }

    public double substraction()
    {
	result= x-y;
	return result;
    }

    public double multiplication()
    {
	result=x*y;
	return result;
    }

    public double division(double x, double y)
    {
		if (y==0){
			String result = "infinity";
		}
		else{
			result=x/y;
			
		}
		return result;
    }

    public double square()
    {
	result = x*x;
	return result;
    }

    public double cube()
    {
	result= x*x*x;
	return result;
    }

    public double modulus()
    {
        result=x%y;
	return result;
    }

    public double power(double x, double y)
    {
        double result = 1;
	while(y != 0)
	{
            result *= x ;
            --y;
	}
	return result;
    }
}