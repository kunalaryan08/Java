
package A.mathematics;

import java.lang.*;
class PriorityThread extends Thread {
	public void run()
	{
		System.out.println("Inside run method");
	}
	public static void main(String[] args)
	{
		PriorityThread t1 = new PriorityThread();
		PriorityThread t2 = new PriorityThread();
		PriorityThread t3 = new PriorityThread();

		System.out.println("t1 thread priority : "
						+ t1.getPriority());

		System.out.println("t2 thread priority : "
						+ t2.getPriority());
		System.out.println("t3 thread priority : "
						+ t3.getPriority());

		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);
		System.out.println("t1 thread priority : "
						+ t1.getPriority());
		System.out.println("t2 thread priority : "
						+ t2.getPriority());
		System.out.println("t3 thread priority : "
						+ t3.getPriority());
		

		System.out.println(
			"Main thread priority : "
			+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);

		System.out.println(
			"Main thread priority : "
			+ Thread.currentThread().getPriority());
	}
}