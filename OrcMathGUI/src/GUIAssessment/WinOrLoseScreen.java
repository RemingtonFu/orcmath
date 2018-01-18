package GUIAssessment;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class WinOrLoseScreen extends FullFunctionScreen{

	public WinOrLoseScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public void initAllObjects(List<Visible> viewObjects) {
		Button win = new Button((getWidth()-100)/2,getHeight()-40,100,30,"Win the Game!",new Action() {

		@Override
		public void act() {
			 WinOrLoseGUI.game.setScreen(WinOrLoseGUI.win);
		}});
		Button lose = new Button((getWidth()-100)/2,getHeight()-40,150,50,"Lose the Game!",new Action() {

			@Override
			public void act() {
				 WinOrLoseGUI.game.setScreen(WinOrLoseGUI.lose);
			}});
		viewObjects.add(win);
		viewObjects.add(lose);

	}
}