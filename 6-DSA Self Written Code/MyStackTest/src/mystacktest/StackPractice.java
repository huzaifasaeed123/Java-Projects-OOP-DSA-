
package mystacktest;

import java.util.Arrays;

public class StackPractice 
{
    public void pushAtBottom(StackWithArrayList<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        else
        {
            int top=s.pop();
            pushAtBottom(s,data);
            s.push(top);
        }
    }

    public void ReverseStackByRecursion(StackWithArrayList<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        else
        {
            int top=s.pop();
            ReverseStackByRecursion(s);
            this.pushAtBottom(s, top);
        }
    }
    public String ReverseString(String str)
    {
        String result="";
        StackWithArrayList<String> stack=new StackWithArrayList<>();
        for (int i = 0; i < str.length(); i++) 
        {
            System.out.println(str.charAt(i));
            stack.push(String.valueOf(str.charAt(i)));
            
        }
        while(!stack.isEmpty()){
            result= result+stack.pop();
        }
        return result;
    }
    public int[] NextGreaterRight(int[] arr)
    {
        int NextGreater[]=new int[arr.length];
        StackWithArrayList<Integer> stack=new StackWithArrayList<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i]>=stack.peak())
            {
                stack.pop();
            }
            if(stack.isEmpty())
                NextGreater[i]=-1;
            else
                NextGreater[i]=stack.peak();
            
            stack.push(arr[i]);
        }
        
        for (int i = 0; i < NextGreater.length; i++) {
            System.out.println(NextGreater[i]);
        }
        return NextGreater;
    }
     public int[] NextSmallerRight(int[] arr)
    {
        
        int NextGreater[]=new int[arr.length];
        StackWithArrayList<Integer> stack=new StackWithArrayList<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i]<=arr[stack.peak()])
            {
                stack.pop();
            }
            if(stack.isEmpty())
                NextGreater[i]=arr.length;
            else
                NextGreater[i]=stack.peak();
            
            stack.push(i);
        }
//        System.out.println("smaller right");
//        for (int i = 0; i < NextGreater.length; i++) {
//            System.out.println(NextGreater[i]);
//        }
        return NextGreater;
    }
    public int[] NextGreaterleft(int[] arr)
    {
        int NextGreater[]=new int[arr.length];
        StackWithArrayList<Integer> stack=new StackWithArrayList<>();
        for (int i = 0; i <arr.length; i++) {
            while (!stack.isEmpty() && arr[i]>=stack.peak())
            {
                stack.pop();
            }
            if(stack.isEmpty())
                NextGreater[i]=-1;
            else
                NextGreater[i]=stack.peak();
            
            stack.push(arr[i]);
        }
        
        for (int i = 0; i < NextGreater.length; i++) {
            System.out.println(NextGreater[i]);
        }
        return NextGreater;
    }
    public int[] NextSmallerleft(int[] arr)
    {
        int NextGreater[]=new int[arr.length];
        StackWithArrayList<Integer> stack=new StackWithArrayList<>();
        for (int i = 0; i <arr.length; i++) {
            while (!stack.isEmpty() && arr[i]<=arr[stack.peak()]) //need an index thats why arr[stack.peek]
            {
                stack.pop();
            }
            if(stack.isEmpty())
                NextGreater[i]=-1;
            else
                NextGreater[i]=stack.peak();
            
            stack.push(i);
        }
//        System.out.println("smaller left");
//        for (int i = 0; i < NextGreater.length; i++) {
//            System.out.println(NextGreater[i]);
//        }
        return NextGreater;
    }
    public int MaxAreaHistogram(int[] arr)
    {
        int [] Smallerleft=this.NextSmallerleft(arr);
        int [] SmallerRight=this.NextSmallerRight(arr);
        int [] area=new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            int width=SmallerRight[i]-Smallerleft[i]-1;
            int height=arr[i];
            area[i]=height*width;
        }
        Arrays.sort(area);
//        for (int i = 0; i < area.length; i++) {
//            System.out.println(area[i]);
//        }
        return area[arr.length-1];
        
        
    }
    public boolean ValidBracket(String str)
    {
        StackWithArrayList<String> stack=new StackWithArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c=='(' || c=='[' || c=='{')
            {
                stack.push(String.valueOf(c));
            }
            else
            {
                if(stack.isEmpty())
                    return false;
                else if((c==')' && "(".equals(stack.peak())) || (c=='}' && "{".equals(stack.peak()))   || ( c==']' && "[".equals(stack.peak())) )
                {
                    stack.pop();
                }
                else
                {
                        return false;
                }
                     
            }
        }
        if(stack.isEmpty())
        {return true;}
        else
            return false;
    }
    public boolean DuplicateBracket(String str)
    {
        StackWithArrayList<Character> stack=new StackWithArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c==')')
            {
                int count=0;
                while(stack.peak()!='(')
                {
                    count++;
                    stack.pop();
                }
                if(count<1)
                    return true;
            }
            else
                stack.push(c);
        }
        
            return false;
    }
}
