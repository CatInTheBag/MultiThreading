package com.company;

import static com.company.TreadColor.ANSI_RED;

public class MyRunnable implements Runnable
{
   @Override
   public void run()
   {
      System.out.println(ANSI_RED + "Hello from MyRunnable class");
   }
}
