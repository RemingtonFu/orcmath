package GUIAssessment;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class ClickerScreen extends FullFunctionScreen {
	
	private int Score;
	private int Countdown;
	private int StartTime;
	private TextLabel scoreboard;
	private TextLabel clock;
	public ClickerScreen(int width, int height) {
		super(width, height);
		update();
		Score=0;
		Countdown=5;
		StartTime = 3;
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		scoreboard= new TextLabel(100, 400, 200, 100, "Score");
		clock=new TextLabel(100,50,100,100, "Timer");
		
		Button b = new Button(150,150);
		viewObjects.add(scoreboard);
		viewObjects.add(clock);
		
		Timer t= new Timer();
		t.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				clock.setText(Integer.toString(StartTime));
				if(StartTime<=0) {
					Timer t2= new Timer();
					t2.scheduleAtFixedRate(new TimerTask() {
						@Override
						public void run() {
							clock.setText("Go! Time left: " +Integer.toString(Countdown));
							b.updateString("Click me!");
							b.setAction(new Action() {
								@Override
								public void act() {
									Score++;
									scoreboard.setText(Integer.toString(Score));	
								}	
							});
							if(Countdown<=0) {
								gameover();
								t2.cancel();
							}
							Countdown--;
						}
						private void gameover() {
							b.setEnabled(false);
							b.updateString("Done");
							scoreboard.setText("Game Over! you scored "+ Integer.toString(Score));	
						}
					}, 0, 1000);
					t.cancel();
				}
				StartTime--;
			}
		}, 1000, 1000);{		
		}
		viewObjects.add(b);
	
	}
}
