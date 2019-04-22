package com.company;

import static com.company.TreadColor.ANSI_CYAN;

public class PrintSomeData implements Runnable
{
   @Override
   public void run()
   {
      for (int i = 0; i < 10; i++)
      {
         System.out.println(ANSI_CYAN +"In PrintSomeData Runnable" + i);
      }
   }
}
