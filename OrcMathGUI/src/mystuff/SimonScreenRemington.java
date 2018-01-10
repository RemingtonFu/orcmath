package mystuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class SimonScreenRemington extends ClickableScreen implements Runnable{

	private ButtonInterfaceRemington[] buttons;
	private ProgressInterfaceRemington progress;
	private TextLabel text;
	private ArrayList<MoveInterfaceRemington> buttonOrder = new ArrayList<MoveInterfaceRemington>();
	private int count;
	private int roundNumber = 1;
	boolean acceptingInput = false;
	int lastSelectedButton;
	
	public SimonScreenRemington(int width,int height) {
		super(width,height);
		Thread app = new Thread(this);
		app.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(ButtonInterfaceRemington b: buttons) {
			viewObjects.add(b);
		}
		progress = getProgress();
		buttonOrder = new ArrayList<MoveInterfaceRemington>();
		lastSelectedButton = -1;
		buttonOrder.add(randomMove());
		buttonOrder.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(text);
	}

	private MoveInterfaceRemington randomMove() {
		int random = (int)(Math.random()*buttons.length);
		while(random == lastSelectedButton) {
			random = (int)(Math.random()*buttons.length);
		}
		return getMove(random);
	}

	private MoveInterfaceRemington getMove(int random) {
		return null;
	}

	private ProgressInterfaceRemington getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 4;
		buttons = new ButtonInterfaceRemington[numberOfButtons];
		Color[] colors = null;
		colors[1] = Color.blue;
		colors[2] = Color.red;
		colors[3] = Color.green;
		colors[4] = Color.pink;
		for(int i = 0; i < numberOfButtons; i++) {
			final ButtonInterfaceRemington b = getAButton();
			b.setColor(colors[i]);
			b.setX(40);
			b.setY(40);
			b.setAction(new Action(){
				
				public void act() {
					if(acceptingInput) {
						Thread blink = new Thread(new Runnable() {
							public void run() {
								b.highlight();
								try {
									Thread.sleep(800);
								} catch(InterruptedException e) {
									e.printStackTrace();
								}
								b.dim();
							}
						});
						blink.start();
					}
				}
				
			});
			buttons[i] = b;
		}
	}

	private ButtonInterfaceRemington getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}