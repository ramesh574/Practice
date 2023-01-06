package com.Ramesh;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;
    public double getFirstNumber()
    {
        return firstNumber;
    }
    public double getSecondNumber()
    {
        return secondNumber;
    }
    public void setFirstNumber(double a)
    {
        this.firstNumber=a;
    }
     public void setSecondNumber(double b)
     {
         this.secondNumber=b;
         //return secondNumber;
     }
     public double getAdditionResult()
     {
         return firstNumber+secondNumber;
     }
     public double getSubtractionResult()
     {
         return firstNumber-secondNumber;
     }
     public  double getMultiplicationResult()
     {
         return firstNumber*secondNumber;
     }
     public  double getDivisionResult()
     {
         if(secondNumber==0)
         {
             return 0;
         }
         else {
             return firstNumber/secondNumber;
         }
     }
}
