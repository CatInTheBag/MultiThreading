package com.company;

import static com.company.TreadColor.ANSI_BLUE;

public class ServerThread extends Thread
{
   public ServerThread(String threadName)
   {
      // this ti refer ti current object
      this.setName(threadName);
   }

   @Override
   public void run()
   {
      try
      {
         int clientNumber = 1;

         while(clientNumber != 21)
         {
            System.out.println(ANSI_BLUE + this.getName() +" sended data to client "+ clientNumber);
            clientNumber++;
            Thread.sleep(1000);
         }
      }
      catch(InterruptedException e)
      {
         System.err.println("Thread interrupted");
      }

   }
}
