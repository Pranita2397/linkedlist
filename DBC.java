package MT50;

public class DBC implements Runnable{
	Thread t;
	String name;
	DBC(String n){
		name=n;
		t=new Thread(this,name);
	}
	

	@Override
	public void run() {
		System.out.println("this is--->"+t);
		
		
	}

}
-------------------------------------continue----------
package MT50;

import java.util.concurrent.TimeUnit;

public class Test20sept {
  public static void main(String[] args) throws InterruptedException {
	  System.out.println("lets connect");
	  DBC d1=new DBC("pranita");
	  d1.t.start();
	  TimeUnit.SECONDS.sleep(1);
	  System.out.println("connection close");
	
}

}

