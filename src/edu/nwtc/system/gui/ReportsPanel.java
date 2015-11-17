package edu.nwtc.system.gui;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReportsPanel extends HolidayTravelPanel {

	public ReportsPanel() {
		init();
	}
	
	/**
	 * Create the panel.
	 */
	public ReportsPanel(HolidayTravelFrame frame) {
		super(frame);
		init();
		frame.setVisible(true);
	}
	
	public void init() {
		setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblHolidayTravelVehicles = new JLabel("Holiday Travel Vehicles");
		lblHolidayTravelVehicles.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblHolidayTravelVehicles);

		JLabel lblReportsMenu = new JLabel("Reports Menu");
		lblReportsMenu.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblReportsMenu);

		JButton btnCommisionReport = new JButton("Commision Report");
		add(btnCommisionReport);

		JButton btnRvSalesBy = new JButton("RV Sales by Make Report");
		add(btnRvSalesBy);

		JButton btnTrailerSalesBy = new JButton("Trailer Sales by Make Report");
		add(btnTrailerSalesBy);

		JButton btnDealerOptionsReport = new JButton("Dealer Options Report");
		add(btnDealerOptionsReport);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setDisplay(new MainMenuPanel(frame));
			}
		});
		add(btnBack);
	}

}
