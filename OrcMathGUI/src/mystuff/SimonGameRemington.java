package mystuff;

import guiTeacher.GUIApplication;

public class SimonGameRemington extends GUIApplication {
	
	static SimonGameRemington game= new SimonGameRemington(500,500);

	public SimonGameRemington(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		SimonScreenRemington screen = new SimonScreenRemington(400,400);
		setScreen(screen);

	}

	public static void main(String[] args) {
		Thread go= new Thread(game);
		go.start();
	}

}