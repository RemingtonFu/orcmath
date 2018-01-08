package mystuff;

import guiPlayer.CustomGUI;
import guiPlayer.CustomScreen;
import guiTeacher.GUIApplication;

public class SimonGameRemington extends GUIApplication{

	public SimonGameRemington(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		CustomScreen screen = new CustomScreen(getWidth(), getHeight());
		setScreen(screen);
		
	}

	public static void main(String[] args) {
		SimonGameRemington s = new SimonGameRemington(800, 550);
		Thread runner = new Thread(s);
		runner.start();
	}
}
