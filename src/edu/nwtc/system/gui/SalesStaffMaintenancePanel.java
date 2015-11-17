package edu.nwtc.system.gui;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class SalesStaffMaintenancePanel extends HolidayTravelPanel {

	public SalesStaffMaintenancePanel() {
		init();
	}
	
	/**
	 * Create the panel.
	 */
	public SalesStaffMaintenancePanel(HolidayTravelFrame frame) {
		super(frame);
		init();
		frame.setVisible(true);
	}

	public void init() {

		setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblHolidayTravelVehicles = new JLabel("Holiday Travel Vehicles");
		lblHolidayTravelVehicles.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblHolidayTravelVehicles);

		JLabel lblSalesStaffMaintenance = new JLabel("Sales Staff Maintenance Menu");
		lblSalesStaffMaintenance.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSalesStaffMaintenance);

		JButton btnAddSalespersonRecord = new JButton("Add Salesperson Record");
		add(btnAddSalespersonRecord);

		JButton btnChangeSalespersonRecord = new JButton("Change Salesperson Record");
		add(btnChangeSalespersonRecord);

		JButton btnDeleteSalespersonRecord = new JButton("Delete Salesperson Record");
		add(btnDeleteSalespersonRecord);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setDisplay(new MainMenuPanel(frame));
			}
		});
		add(btnBack);
	}
}
