package GUIAssessment;
import guiTeacher.GUIApplication;



public class WinOrLoseGUI extends GUIApplication {
	
	public static WinOrLoseGUI game;
	public static WinOrLoseScreen menu;
	public static WinScreen win;
	public static LoseScreen lose;
	
	public WinOrLoseGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}
	
	public static void main(String[] args){
		game = new WinOrLoseGUI(1000, 750);
		Thread go = new Thread(game);
		go.start();
	}

	@Override
	public void initScreen() {
		menu = new WinOrLoseScreen(getWidth(), getHeight());
		win = new WinScreen(getWidth(), getHeight());
		lose = new LoseScreen(getWidth(), getHeight());
		setScreen(menu);
	}
}