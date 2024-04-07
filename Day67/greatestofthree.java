package Day67;

class greatestofthree{
    public static void main(String arg[]){


        // // Three no comparesion-----

        int num1=10,num2=33,num3=3;

        //now for num1
        if(num1>=num2 && num1>=num3)
            System.out.println("Num1 is greatest no: "+num1);
        
        else if(num2>=num1 && num2>=num3)
            System.out.println("Num2 is greatest no: "+num2);
        
        else
            System.out.println("Num3 is greatest no: "+num3);
        




   //     // let two numbers comparesion---
        // int num1=10, num2=33;

        // if(num1>num2)
        // System.out.println("Num1 is greater than num2: "+num1);

        // else
        // System.out.println("num2 is greater than num1: "+num2);
    }
}
