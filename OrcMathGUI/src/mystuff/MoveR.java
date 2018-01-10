package mystuff;

public class MoveR implements MoveInterfaceRemington {
	
	ButtonInterfaceRemington button;
	public MoveR(ButtonInterfaceRemington button) {
		this.button=button;
	}

	@Override
	public ButtonInterfaceRemington getButton() {
		return button;
	}

}
