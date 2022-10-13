
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;


public class frame extends JFrame implements ActionListener{
    
    ArrayList<Integer> ints = new ArrayList<>(); 
    ArrayList<String> ops = new ArrayList<>();
    JButton equ = new JButton("=");
    
    String s,op;
    int n;

    Panel panel = new Panel();
    JPanel panel2 = new JPanel();

    JButton point = new JButton(".");
    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");

    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton times = new JButton("x");
    JButton div = new JButton("/");
    JButton clear = new JButton("Clear");

    Font font1 = new Font("SansSerif", Font.BOLD, 20);
    JTextField nums = new JTextField();


    frame()
    {

        panel2.setBounds(100,90,350,50);
        panel2.setLayout(new GridLayout(1,5));
        panel2.setFont(font1);
        panel.setFont(font1);

        equ.setBounds(200,400,100,50);
        equ.addActionListener(this);
        equ.setFocusable(false);

        zero.addActionListener(this);
        one.setFocusable(false);
        
        one.addActionListener(this);
        one.setFocusable(false);

        
        two.addActionListener(this);
        two.setFocusable(false);

        
        three.addActionListener(this);
        three.setFocusable(false);


        four.addActionListener(this);
        four.setFocusable(false);

  
        five.addActionListener(this);
        five.setFocusable(false);

       
        six.addActionListener(this);
        six.setFocusable(false);

   
        seven.addActionListener(this);
        seven.setFocusable(false);

       
        eight.addActionListener(this);
        eight.setFocusable(false);

        
        nine.addActionListener(this);
        nine.setFocusable(false);

        plus.setFocusable(false);
        plus.addActionListener(this);
    
        minus.setFocusable(false);
        minus.addActionListener(this);

        div.setFocusable(false);
        div.addActionListener(this);

        times.setFocusable(false);
        times.addActionListener(this);

        point.setFocusable(false);
        point.addActionListener(this);

        clear.setFocusable(false);
        clear.addActionListener(this);

       
       nums.setBounds(100,10,300,50);
       nums.setPreferredSize(new Dimension(200,200));
       nums.setFont(font1);

       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setSize(500,500);
      //  this.add(equ);
        this.add(nums);
        this.add(panel);
        this.add(panel2);
        this.setTitle("Pedro");


         panel2.add(plus);
         panel2.add(minus);
         panel2.add(times);
         panel2.add(div);
         panel2.add(clear);

        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);
        panel.add(zero);
        panel.add(point);
        panel.add(equ);



        this.setVisible(true);

    }

    


   @Override
   public void actionPerformed(ActionEvent e) {



       if(e.getSource()==equ)
        {
            s = nums.getText();
            ops.clear();
            ints.clear();
            oper();
            inter();
            Calcul();
            nums.setText(Integer.toString(n));

        }
        else if(e.getSource()==clear)
        {
            s="";
            ints.clear();
            ops.clear();
            nums.setText("");

        }
        else if(e.getSource()==one)
        {

            nums.setText(nums.getText()+"1");

        }
        else if(e.getSource()==two)
        {
            
            nums.setText(nums.getText()+"2");

        }
        else if(e.getSource()==three)
        {
            
            nums.setText(nums.getText()+"3");

        }
        else if(e.getSource()==four)
        {
            
            nums.setText(nums.getText()+"4");

        }
        else if(e.getSource()==five)
        {
            
            nums.setText(nums.getText()+"5");

        }
        else if(e.getSource()==six)
        {
            
            nums.setText(nums.getText()+"6");

        }
        else if(e.getSource()==seven)
        {
            
            nums.setText(nums.getText()+"7");

        }
        else if(e.getSource()==eight)
        {
            
            nums.setText(nums.getText()+"8");

        }
        else if(e.getSource()==nine)
        {
            
            nums.setText(nums.getText()+"9");

        }
        else if(e.getSource()==plus)
        {
           
            nums.setText(nums.getText()+"+");

        }
        else if(e.getSource()==minus)
        {
            
            nums.setText(nums.getText()+"-");

        }
        else if(e.getSource()==times)
        {
            
            nums.setText(nums.getText()+"x");

        }
        else if(e.getSource()==div)
        {
            
            nums.setText(nums.getText()+"/");

        }
        else if(e.getSource()==point)
        {
            
            nums.setText(nums.getText()+".");

        }
        else if(e.getSource()==zero)
        {
            
            nums.setText(nums.getText()+"0");

        }
      


   }

   public void oper()
   {
    
    int i;
     System.out.println(s);
    for(i=1;i<s.length();i++)
    {
        if(Character.compare(s.charAt(i), '+') == 0 )
        {
            s = s.replaceFirst("\\+",",");
            ops.add("+");

        }
        else if(Character.compare(s.charAt(i), '-') == 0 )
        {
           s = s.replaceFirst("-",",");
            ops.add("-");

        }
        else if(Character.compare(s.charAt(i), '/') == 0 )
        {
            s=s.replaceFirst("/",",");
            ops.add("/");

        }
        else if(Character.compare(s.charAt(i), 'x') == 0 )
        {
            s=s.replaceFirst("x",",");
            ops.add("x");

        }

    }

   }

   public void inter(){

     int i,k=0;

    // System.out.println(s.length());
        for(i=0;i<s.length();i++)
        {
            if(Character.compare(s.charAt(i),',') == 0 ){
                ints.add(Integer.valueOf(s.substring(k,i)));
                k=i+1;
            }
            else if(i+1 == s.length())
            {
                ints.add(Integer.valueOf(s.substring(k,i+1)));
            }



        } 
   }

   public void Calcul()
   {
    

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

     case "x":
     
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

    System.out.println(n);

   }


}

