package drawing.controller;

import drawing.view.ArtFrame;
import javax.swing.JOptionPane;

public class DrawingController
{
	private ArtFrame appFrame;
	
	public DrawingController()
	{
		appFrame = new ArtFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Welcome to Art!");
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	
	public ArtFrame getFrame()
	{
		return appFrame;
	}

}
