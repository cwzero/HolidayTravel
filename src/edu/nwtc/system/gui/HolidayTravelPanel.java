package edu.nwtc.system.gui;

import javax.swing.JPanel;

public class HolidayTravelPanel extends JPanel {
	protected HolidayTravelFrame frame;
	public HolidayTravelPanel() {
		
	}
	
	public HolidayTravelPanel(HolidayTravelFrame frame) {
		this.frame = frame;
		frame.setDisplay(this);
	}
}
