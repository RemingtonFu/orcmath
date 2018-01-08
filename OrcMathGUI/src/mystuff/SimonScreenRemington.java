package mystuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenRemington extends ClickableScreen implements Runnable{

	private TextLabel text;
	private ButtonInterfaceRemington[] button;
	private ProgressInterfaceRemington progress;
	private ArrayList<MoveInterfaceRemington> sequence;
	
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	private TextLabel label;
	
	
	public SimonScreenRemington(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(SimonScreenRemington b: buttons){ 
		    viewObjects.add(b); 
		}
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceRemington>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);

		
	}

	private MoveInterfaceRemington randomMove() {
	    int bIndex = (int)(Math.random()*buttons.length);
	    while(bIndex == lastSelectedButton){ 
	        bIndex = (int)(Math.random()*buttons.length);
	    }
	    return getMove(bIndex);
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterfaceRemington getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 4;
		button = new ButtonInterfaceRemington[numberOfButtons];
		Color[] color = null;
		color[1] = Color.blue;
		color[2] = Color.green;
		color[3] = Color.red;
		color[4] = Color.pink;
		
		for(int i )
	}

}
