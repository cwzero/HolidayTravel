package edu.nwtc.system.gui;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class VehicleInventoryPanel extends HolidayTravelPanel {

	public VehicleInventoryPanel() {
		init();
	}
	
	/**
	 * Create the panel.
	 */
	public VehicleInventoryPanel(HolidayTravelFrame frame) {
		super(frame);
		init();
		frame.setVisible(true);

	}

	public void init() {

		setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblHolidayTravelVehicles = new JLabel("Holiday Travel Vehicles");
		lblHolidayTravelVehicles.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblHolidayTravelVehicles);

		JLabel lblVehicleInventoryMenu = new JLabel("Vehicle Inventory Menu");
		lblVehicleInventoryMenu.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblVehicleInventoryMenu);

		JButton btnCreateVehicleInventory = new JButton("Create Vehicle Inventory Record");
		add(btnCreateVehicleInventory);

		JButton btnChangeVehicleInventory = new JButton("Change Vehicle Inventory Record");
		add(btnChangeVehicleInventory);

		JButton btnDeleteVehicleInventory = new JButton("Delete Vehicle Inventory Record");
		add(btnDeleteVehicleInventory);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setDisplay(new MainMenuPanel(frame));
			}
		});
		add(btnBack);
	}

}
