
import java.util.*;



public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String op;
         int i=0,n=0;

        ArrayList<Integer> ints = new ArrayList<>(); 
        ArrayList<String> ops = new ArrayList<>();

        System.out.println("Calculate: ");

        ints.add(scan.nextInt());
        ops.add(scan.next());

        while( ops.get(ops.size()-1).equals("=") == false )
        {
            ints.add(scan.nextInt());
            ops.add(scan.next());
        }


     
         ops.remove("=");
         

        while(ops.isEmpty() == false)    
       {
        op = ops.get(0);
        ops.remove(0);
        
        switch(op){

        case "+":

       n=ints.get(0)+ints.get(1);
       ints.remove(0);
       ints.remove(0);
       ints.add(0,n);
       
       break;

        case "-":
        
        n=(ints.get(0)-ints.get(1));

       
        ints.remove(0);
        ints.remove(0);
        ints.add(0,n);
        

        break;  

        case "*":
        
        n=(ints.get(0)*ints.get(1));

    
        ints.remove(0);
        ints.remove(0);
        ints.add(0,n);
        

        break;  

        case "/":
        
        n=(ints.get(0)/ints.get(1));

       
        ints.remove(0);
        ints.remove(0);
        ints.add(0,n);
        

        break;  

        }

        
       }
       System.out.println(ints);

       System.out.println(n);





    }
    
}
