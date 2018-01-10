package mystuff;

import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressR extends Component implements ProgressInterfaceRemington {
	
	private boolean inPlay = false;
	private int sequenceSize;
	private int roundNumber;

	public ProgressR(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gameOver() {
		SimonScreenRemington.getLabel().setText("Game Over!");

	}

	@Override
	public void setSequenceSize(int size) {
		SimonScreenRemington.getLabel().setText(SimonScreenRemington.getLabel().getText() + "n/the sequence is of length " + size);
	}

	@Override
	public void setRound(int roundnumber) {
		SimonScreenRemington.getLabel().setText("this is round" + roundnumber);
	}

	@Override
	public void update(Graphics2D g) {
		g.drawRect(this.getX(),this.getY(),this.getWidth(),this.getHeight());
		if(inPlay) {
			
		}
		else {
			
		}
	}

}