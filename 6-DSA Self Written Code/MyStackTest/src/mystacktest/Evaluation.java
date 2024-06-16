/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mystacktest;

/**
 *
 * @author saeed
 */
public class Evaluation {
    MyStack<Double> st=new MyStack();

    public double prefix(String exp)
    {
        
        for(int i=exp.length()-1;i>=0;i--)
        {
            char c=exp.charAt(i);
            if(Character.isDigit(c))
            {
                double d= Double.parseDouble(c+"");
                st.push(d);
            }
            else
            {
                double op1=st.pop();
                double op2=st.pop();
                st.push(cal(op1,op2,c));
                
            }
                
        }
        return st.pop();
    }
    private double cal(double op1,double op2,char c)
    {
        if(c=='+')
        {
            return op1+op2;
        }
        else if(c=='-')
        {
            return op1-op2;
        }
        else if(c=='/')
        return op1/op2;
        else if(c=='*')
        return op1*op2;
        else if(c=='%')
        {
           return op1%op2;
        }
        else
            return Math.pow(op1, op2);
    }
}
