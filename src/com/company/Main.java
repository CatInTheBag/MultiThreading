package com.company;

import com.sun.security.ntlm.Server;

import static com.company.TreadColor.ANSI_GREEN;
import static com.company.TreadColor.ANSI_RED;

public class Main
{

    public static void main(String[] args)
    {
		 System.out.println(ANSI_GREEN + "Hello from main thread");

	     /*Thread thread1 = new ServerThread("Server 1");

	     thread1.start();*/

	     new Thread()
		  {
		  		public void run()
				{
					try
					{
						Thread.sleep(5000);
					}
					catch (InterruptedException e)
					{
						System.out.println(e.getMessage());
					}
				  System.out.println(ANSI_RED + "In Anonymous class");
			  }
		  }.start();

	     /*Thread myRunnableThread = new Thread(new MyRunnable());
	     myRunnableThread.start();*/

	     /*Thread anotherMyRunnableThread = new Thread(new MyRunnable()
		  {
			  @Override
			  public void run()
			  {
				  System.out.println(ANSI_RED+"In Anonymous MyRunnable class");
			  }
		  });*/

	     /*anotherMyRunnableThread.start();*/



		 (new Thread(new PrintSomeData())).start();
		 new PrintSomeDataThread().start();
		 System.out.println(ANSI_GREEN+"In main thread again");
    }
}
