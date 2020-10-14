/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java10;

/* * 
 *
 * @author elcot
 */
class threadtesting1 extends Thread { 

  public threadtesting1 (String s) { 
    super(s);
  }
 
  @Override
  public void run() { 
    System.out.println("Hello I am "+ getName()); 
  } 
}
public class threadtesting {
    public static void main (String arg[]) { 
    threadtesting1 t1, t2, t3, t4; 

    t1 = new MyThread ("Thread #1"); 
    t2 = new MyThread ("Thread #2"); 
    t3 = new MyThread ("Thread #3");
    t4 = new MyThread("Thread #4");
 
    
   
    
    t2.start();
    t4.start();
     t1.start();
     t3.start();
    
    
    
  }
    
}