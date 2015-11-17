package edu.nwtc.system.gui;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalesInvoicePanel extends HolidayTravelPanel {
	
	public SalesInvoicePanel() {
		init();
	}
	
	/**
	 * Create the panel.
	 */
	public SalesInvoicePanel(HolidayTravelFrame frame) {
		super(frame);
		init();
		frame.setVisible(true);
	}
	
	public void init() {

		setLayout(new GridLayout(0, 1, 0, 0));

		JLabel label = new JLabel("Holiday Travel Vehicles");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label);

		JLabel lblSalesInvoiceMenu = new JLabel("Sales Invoice Menu");
		lblSalesInvoiceMenu.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSalesInvoiceMenu);

		JButton btnCreateSalesInvoice = new JButton("Create Sales Invoice");
		add(btnCreateSalesInvoice);

		JButton btnChangeSalesInvoice = new JButton("Change Sales Invoice");
		add(btnChangeSalesInvoice);

		JButton btnCancelSalesInvoice = new JButton("Cancel Sales Invoice");
		add(btnCancelSalesInvoice);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setDisplay(new MainMenuPanel(frame));
			}
		});
		add(btnBack);
	}

}
