package oop_basic;

public class CallbyValueandReference {

	public static void main(String[] args) {
		Counter myCounter = new Counter();
		System.out.println("before update:" 
				+ myCounter.count);
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter.count);
		System.out.println("after update:" 
				+ myCounter.count);
        myUpdater.update(myCounter);
        System.out.println("after update:"
        		+myCounter.count);        
	}
}
