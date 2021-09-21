package MT50;

public class lecturethread {
	static public int hr=1;
	public void firstlecture(int hr) {
		synchronized(this){
		if(hr>1) {
			try {
				System.out.println("waiting for 2nd lecturer teacher ");
				wait();
			}catch(Exception e) {
				e.printStackTrace();	
			}
		}
	
	hr=1;
	System.out.println("first lecture attended");
	}
	}
	public void secondlecture(int hr) {
		System.out.println("second lecturer is on the way");
		hr=1;
		System.out.println("second lecture started");
		synchronized(this){
			notify();
	}
}
	public static void main(String[] args) {
		lecturethread thread=new lecturethread();
		
		Thread thread1=new Thread(new Runnable() {
			public void run() {
				thread.firstlecture(1);	
			}
		});
		thread1.setName("Thread");
		thread1.start();
		Thread thread2=new Thread(new Runnable() {

			public void run() {
				try {
					thread1.sleep(1000);
					}catch(Exception e) {
						e.printStackTrace();
						
					}
				thread.secondlecture(1);
			}
		});
		thread2.setName("Thread");
		thread2.start();
	}
	}

		
			
	