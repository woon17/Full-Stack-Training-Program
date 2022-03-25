package msword;

import java.util.Iterator;

class MSWord extends Thread {
	public void run() {
		if(this.getName().equals("TYPE")) {
			type();
		}else if(this.getName().equals("AUTOSAVE")) {
			autoSave();
		}else if(this.getName().equals("SPELLCHECK")) {
			spellCheck();
		}
	}

	void type() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Typing...");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	void autoSave() {
		for (;;) {
			System.out.println("Auto Saving...");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	void spellCheck() {
		for (;;) {
			System.out.println("Spell checking...");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class LaunchMSWordApp {
/*autosave and spellcheck must after we type
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MSWord ms1 = new MSWord();
		MSWord ms2 = new MSWord();
		MSWord ms3 = new MSWord();
		
		ms1.setName("TYPE");
		ms2.setName("AUTOSAVE");
		ms3.setName("SPELLCHECK");
		ms2.setDaemon(true);
		ms3.setDaemon(true);
		
		ms2.setPriority(8);
		ms2.setPriority(9);
		
		ms1.start();
		ms2.start();
		ms3.start();
	}

}
