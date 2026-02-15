/**
 * @author Hugo Ramirez Jr.
 * @date 2/14/20265
 * Module 8 - Threads 
 * @description This program creates three threads that print out random letters, numbers, and symbols. 
 * Each thread will print out 10,000 characters and then indicate when it has completed its task. 
 * The main method will also indicate when it has ended.
 */
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class HugoThreeThreads{

  public static void main(String[] args){

    Runnable_1 Letters = new Runnable_1();
    Runnable_2 Numbers = new Runnable_2();
    Runnable_3 Symbols = new Runnable_3();

    Thread thread_1 = new Thread(Letters);
    Thread thread_2 = new Thread(Numbers);
    Thread thread_3= new Thread(Symbols);

    thread_1.setName("Letters Thread ");
    thread_2.setName("Numbers Thread ");
    thread_3.setName("Symbols Thread ");

    thread_1.start();
    thread_2.start();
    thread_3.start();

    System.out.println("Main method has ended.");
  }
}

class Runnable_1 implements Runnable{
  @Override
  public void run(){

    for(int i = 0; i < 10001; i++){
      Random letter = new Random();
      char l = (char) (letter.nextInt(26) + 'a');
      System.out.println(Thread.currentThread().getName() + "# " + i + " " + l);
    }

    System.out.println("\t\t\t" + Thread.currentThread().getName() + "is now complete.");
  }
}

class Runnable_2 implements Runnable{
  @Override
  public void run(){

    for(int i = 0; i < 10001; i++){
      Random number = new Random();
      int n = number.nextInt(9);
      System.out.println(Thread.currentThread().getName() + "# " + i + " " + n);
    }

    System.out.println("\t\t\t" + Thread.currentThread().getName() + "is now complete.");
  }
}

class Runnable_3 implements Runnable{
  @Override
  public void run(){
    
    for(int i = 0; i < 10001; i++){
      List<String> symbols = new ArrayList<>();
      Collections.addAll(symbols, "!", "@", "#", "$", "%", "^", "&", "*", "(", ")");
      System.out.println(Thread.currentThread().getName() + "# " + i + " " + symbols.get(i % symbols.size()));
    }

    System.out.println("\t\t\t" + Thread.currentThread().getName() + "is now complete.");
  }
}



