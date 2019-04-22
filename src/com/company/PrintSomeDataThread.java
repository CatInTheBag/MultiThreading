package com.company;

import static com.company.TreadColor.ANSI_PURPLE;

public class PrintSomeDataThread extends Thread
{
   @Override
   public void run()
   {
      for (int i = 0; i < 10; i++)
      {
         System.out.println(ANSI_PURPLE + "In PrintSomeDataThread" + i);
      }
   }
}
