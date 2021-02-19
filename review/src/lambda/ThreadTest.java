package lambda;

public class ThreadTest {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Thread1());
		thread.start();
		
		//무명 클래스  >>  람다
		Thread thread2 = new Thread(new Runnable(){
			public void run() {
				for(int i = 2000; i < 2999; i++) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}} );
		thread2.start();
		
		//람다식( 클래스 선언, 객체 생성 == 무명클래스) / 메서드가 하나뿐일 때
		Thread thread3 = new Thread(
				() -> {
					for(int i = 3000; i < 3999; i++) {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(i);
					}
					}
				);
		thread3.start();
		
		for(int i = 1000; i < 1999; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
