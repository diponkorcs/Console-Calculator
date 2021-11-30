//package pulok.project;

import java.util.*;
import java.lang.*;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);
            
            CalculatorInput i1 =new CalculatorInput();
            Calculation c1 = new Calculation();
            BuffterWriter rt = new BuffterWriter();
			Output resultview = new Output();
            int count=0;
            
            while(true)
            {
				if (count==0)
				{
                int selection = 0;
                try
                {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("What do you want to do...?");
                System.out.println("1. Addition");
                System.out.println("2. Substraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Square");
                System.out.println("6. Cube");
                System.out.println("7. Power");
                System.out.println("8. Modulus");
                
	
                System.out.print("Choose your option: ");
                selection = sc2.nextInt();
                }
                catch(InputMismatchException E)
                {
                    System.out.println(E);
                    System.out.println("Please Enter a Valid Option.");
                    System.out.println();
                }
                finally
                {
                    switch(selection)
                    {
                        case 1:
                            try
                            {
                                Scanner in1 = new Scanner(System.in);
                                
                                System.out.print("Enter a number: ");
                                double x1 = in1.nextDouble();
                                System.out.print("Enter another number: ");
                                double y1 = in1.nextDouble();
                                    
                                c1.setX(x1);
                                c1.setY(y1);
                                rt.write(c1.addition()); 
								resultview.read();
                            }
                            catch(InputMismatchException E1)
                            {
                                System.out.println(E1);
                                System.out.println("Please Enter Valid Number(s).");
                                System.out.println();
                            }
				break;
			case 2:
                            try
                            {
                                Scanner in2 = new Scanner(System.in);
                                System.out.print("Enter a number: ");
                                double x2 = in2.nextDouble();
                                System.out.print("Enter another number: ");
                                double y2 = in2.nextDouble();
                                
                                c1.setX(x2);
                                c1.setY(y2);
								rt.write(c1.substraction());
								resultview.read();
                            }
                            catch(InputMismatchException E2)
                            {
                                System.out.println(E2);
                                System.out.println("Please Enter Valid Number(s).");
                                System.out.println();
                            }
				break;
			case 3:
                            try
                            {
                                Scanner in3 = new Scanner(System.in);
                                System.out.print("Enter a number: ");
                                double x3 = in3.nextDouble();
                                System.out.print("Enter another number: ");
                                double y3 = in3.nextDouble();
                                
                                c1.setX(x3);
                                c1.setY(y3);
								rt.write(c1.multiplication());
								resultview.read();
                            }
                            catch(InputMismatchException E3)
                            {
                                System.out.println(E3);
                                System.out.println("Please Enter Valid Number(s).");
                                System.out.println();
                            }
                            
				break;
			case 4:
                            try
                            {
                                Scanner in4 = new Scanner(System.in);
                                System.out.print("Enter a number: ");
                                double x4 = in4.nextDouble();
                                System.out.print("Enter another number: ");
                                double y4 = in4.nextDouble();
                                
                                c1.setX(x4);
                                c1.setY(y4);
								rt.write(c1.division(x4,y4));
								resultview.read();
                            }
                            catch(InputMismatchException E4)
                            {
                                System.out.println(E4);
                                System.out.println("Please Enter Valid Number(s).");
                                System.out.println();
                            }
                            
				break;
			case 5:
                            try
                            {
                                Scanner in5 = new Scanner(System.in);
                                System.out.print("Enter a number: ");
                                double x5 = in5.nextDouble();
                                
                                c1.setX(x5);
                                //c1.setY(y5);
								rt.write(c1.square());
								resultview.read();
                            }
                            catch(InputMismatchException E5)
                            {
                                System.out.println(E5);
                                System.out.println("Please Enter Valid Number(s).");
                                System.out.println();
                            }
				break;
			case 6:
                            try
                            {
                                Scanner in6 = new Scanner(System.in);
                                System.out.print("Enter a number: ");
                                double x6 = in6.nextDouble();
                                
                                c1.setX(x6);
                                //c1.setY(y6);
								
				rt.write(c1.cube());
				resultview.read();
                            }
                            catch(InputMismatchException E6)
                            {
                                System.out.println(E6);
                                System.out.println("Please Enter Valid Number(s).");
                                System.out.println();
                            }
				break;
			case 7:
                            try
                            {
                                Scanner in2 = new Scanner(System.in);
                                System.out.print("Enter Base: ");
                                double x7 = in2.nextDouble();
                                System.out.print("Enter exponential: ");
                                double y7 = in2.nextDouble();
                                
                                c1.setX(x7);
                                c1.setY(y7);
							rt.write(c1.power(x7,y7));
							resultview.read();
                            }
                            catch(InputMismatchException E2)
                            {
                                System.out.println(E2);
                                System.out.println("Please Enter Valid Number(s).");
                                System.out.println();
                            }
				break;
			case 8:
                            try
                            {
                                Scanner in8 = new Scanner(System.in);
                                System.out.print("Enter a number: ");
                                double x8 = in8.nextDouble();
                                System.out.print("Enter another number: ");
                                double y8 = in8.nextDouble();
                                
                                c1.setX(x8);
                                c1.setY(y8);
								rt.write(c1.modulus());
								resultview.read();
                            }
			
                            catch(InputMismatchException E8)
                            {
                                System.out.println(E8);
                                System.out.println("Please Enter Valid Number(s).");
                                System.out.println();
                            }
				break;
			
			
                        default:
                                System.out.println("Wrong Input!! Please Try again.");
                                System.out.println();
                    }
				}
				}   
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Press 0 for another calculation");
		System.out.println("Press 9 to exit");
		Scanner in10 = new Scanner(System.in);
		int pressed=in10.nextInt();
		
	
		switch (pressed)
		{
			case 0:
				count=pressed;
				break;
			case 9:
				count++;
				System.out.println("Thank you for using my calculator");
				
				return;
		}
		
		
			}	
		}
}
	


