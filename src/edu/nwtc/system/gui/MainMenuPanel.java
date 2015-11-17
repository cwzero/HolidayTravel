package edu.nwtc.system.gui;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenuPanel extends HolidayTravelPanel {
	public MainMenuPanel() {
		init();
	}
	
	public MainMenuPanel(HolidayTravelFrame frame) {
		super(frame);
		init();
		frame.setVisible(true);
	}
	
	public void init() {
		setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblHolidayTravelVehicles = new JLabel("Holiday Travel Vehicles");
		lblHolidayTravelVehicles.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblHolidayTravelVehicles);

		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblMainMenu);

		JButton btnSalesInvoice = new JButton("Sales Invoice");
		btnSalesInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setDisplay(new SalesInvoicePanel(frame));
			}
		});
		add(btnSalesInvoice);

		JButton btnVehicleInventory = new JButton("Vehicle Inventory");
		btnVehicleInventory.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setDisplay(new VehicleInventoryPanel(frame));
			}
		});
		add(btnVehicleInventory);

		JButton btnNewButton = new JButton("Reports");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setDisplay(new ReportsPanel(frame));
			}
		});
		add(btnNewButton);

		JButton btnSalesStaff = new JButton("Sales Staff");
		btnSalesStaff.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setDisplay(new SalesInvoicePanel(frame));
			}
		});
		add(btnSalesStaff);
	}
}
