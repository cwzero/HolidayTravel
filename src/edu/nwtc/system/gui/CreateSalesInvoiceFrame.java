package edu.nwtc.system.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.ScrollPane;

import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.AbstractListModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class CreateSalesInvoiceFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblInvoiceDate;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateSalesInvoiceFrame frame = new CreateSalesInvoiceFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreateSalesInvoiceFrame() {
		ButtonGroup group = new ButtonGroup();
		setTitle("Create Sales Invoice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 893);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		contentPane.setLayout(gbl_contentPane);

		JLabel lblInvoiceNumber = new JLabel("Invoice Number:");
		GridBagConstraints gbc_lblInvoiceNumber = new GridBagConstraints();
		gbc_lblInvoiceNumber.weightx = -1.0;
		gbc_lblInvoiceNumber.anchor = GridBagConstraints.NORTH;
		gbc_lblInvoiceNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInvoiceNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblInvoiceNumber.gridx = 0;
		gbc_lblInvoiceNumber.gridy = 0;
		contentPane.add(lblInvoiceNumber, gbc_lblInvoiceNumber);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.weightx = 1.0;
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);

		lblInvoiceDate = new JLabel("Invoice Date:");
		GridBagConstraints gbc_lblInvoiceDate = new GridBagConstraints();
		gbc_lblInvoiceDate.anchor = GridBagConstraints.NORTH;
		gbc_lblInvoiceDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInvoiceDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblInvoiceDate.gridx = 0;
		gbc_lblInvoiceDate.gridy = 1;
		contentPane.add(lblInvoiceDate, gbc_lblInvoiceDate);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.weightx = 1.0;
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		contentPane.add(textField_1, gbc_textField_1);

		JRadioButton rdbtnRv = new JRadioButton("RV");
		group.add(rdbtnRv);
		GridBagConstraints gbc_rdbtnRv = new GridBagConstraints();
		gbc_rdbtnRv.weightx = -1.0;
		gbc_rdbtnRv.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnRv.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnRv.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnRv.gridx = 1;
		gbc_rdbtnRv.gridy = 3;
		contentPane.add(rdbtnRv, gbc_rdbtnRv);

		JRadioButton rdbtnTrailer = new JRadioButton("Trailer");
		group.add(rdbtnTrailer);
		GridBagConstraints gbc_rdbtnTrailer = new GridBagConstraints();
		gbc_rdbtnTrailer.weightx = -1.0;
		gbc_rdbtnTrailer.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnTrailer.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnTrailer.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnTrailer.gridx = 2;
		gbc_rdbtnTrailer.gridy = 3;
		contentPane.add(rdbtnTrailer, gbc_rdbtnTrailer);

		JLabel lblManufacturer = new JLabel("Manufacturer:");
		GridBagConstraints gbc_lblManufacturer = new GridBagConstraints();
		gbc_lblManufacturer.anchor = GridBagConstraints.NORTH;
		gbc_lblManufacturer.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblManufacturer.insets = new Insets(0, 0, 5, 5);
		gbc_lblManufacturer.gridx = 0;
		gbc_lblManufacturer.gridy = 4;
		contentPane.add(lblManufacturer, gbc_lblManufacturer);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Mfg-A", "Mfg-B", "Mfg-C", "Mfg-D" }));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.weightx = 1.0;
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		contentPane.add(comboBox, gbc_comboBox);

		JLabel lblName = new JLabel("Name:");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.NORTH;
		gbc_lblName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 5;
		contentPane.add(lblName, gbc_lblName);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "", "Name-1", "Name-2", "Name-3" }));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.weightx = 1.0;
		gbc_comboBox_1.gridwidth = 3;
		gbc_comboBox_1.anchor = GridBagConstraints.NORTH;
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 5;
		contentPane.add(comboBox_1, gbc_comboBox_1);

		JLabel lblModel = new JLabel("Model:");
		GridBagConstraints gbc_lblModel = new GridBagConstraints();
		gbc_lblModel.anchor = GridBagConstraints.NORTH;
		gbc_lblModel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblModel.insets = new Insets(0, 0, 5, 5);
		gbc_lblModel.gridx = 0;
		gbc_lblModel.gridy = 6;
		contentPane.add(lblModel, gbc_lblModel);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "", "Model-X", "Model-Y", "Model-Z" }));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.weightx = 1.0;
		gbc_comboBox_2.gridwidth = 3;
		gbc_comboBox_2.anchor = GridBagConstraints.NORTH;
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 6;
		contentPane.add(comboBox_2, gbc_comboBox_2);

		JLabel lblSerialNumber = new JLabel("Serial Number:");
		GridBagConstraints gbc_lblSerialNumber = new GridBagConstraints();
		gbc_lblSerialNumber.anchor = GridBagConstraints.NORTH;
		gbc_lblSerialNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSerialNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblSerialNumber.gridx = 0;
		gbc_lblSerialNumber.gridy = 7;
		contentPane.add(lblSerialNumber, gbc_lblSerialNumber);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.weightx = 1.0;
		gbc_textField_2.gridwidth = 3;
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 7;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblYear = new JLabel("Year:");
		GridBagConstraints gbc_lblYear = new GridBagConstraints();
		gbc_lblYear.anchor = GridBagConstraints.NORTH;
		gbc_lblYear.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblYear.insets = new Insets(0, 0, 5, 5);
		gbc_lblYear.gridx = 0;
		gbc_lblYear.gridy = 8;
		contentPane.add(lblYear, gbc_lblYear);

		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.weightx = 1.0;
		gbc_textField_3.gridwidth = 3;
		gbc_textField_3.anchor = GridBagConstraints.NORTH;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 8;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JLabel lblOptions = new JLabel("Options:");
		lblOptions.setVerticalAlignment(SwingConstants.TOP);
		lblOptions.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblOptions = new GridBagConstraints();
		gbc_lblOptions.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblOptions.anchor = GridBagConstraints.NORTH;
		gbc_lblOptions.insets = new Insets(0, 0, 5, 5);
		gbc_lblOptions.gridx = 0;
		gbc_lblOptions.gridy = 9;
		contentPane.add(lblOptions, gbc_lblOptions);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { "Option 1", "Desc 1", "Price 1" }, { " ", " ", " " },
				{ " ", " ", " " }, { " ", " ", " " }, }, new String[] { "Code", "Description", "Price" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, Object.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.weighty = 1.0;
		gbc_table.gridwidth = 4;
		gbc_table.insets = new Insets(0, 0, 5, 0);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 10;
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(table.getPreferredSize());
		scrollPane.getViewport().setPreferredSize(table.getPreferredSize());
		//scrollPane.setPreferredSize(new Dimension(0, 0));
		contentPane.add(scrollPane, gbc_table);
		
		JLabel lblVehicleBaseCost = new JLabel("Vehicle Base Cost:");
		GridBagConstraints gbc_lblVehicleBaseCost = new GridBagConstraints();
		gbc_lblVehicleBaseCost.insets = new Insets(0, 0, 5, 5);
		gbc_lblVehicleBaseCost.gridx = 0;
		gbc_lblVehicleBaseCost.gridy = 11;
		contentPane.add(lblVehicleBaseCost, gbc_lblVehicleBaseCost);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 3;
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 11;
		contentPane.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTradeinAllowance = new JLabel("Trade-In Allowance:");
		lblTradeinAllowance.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblTradeinAllowance = new GridBagConstraints();
		gbc_lblTradeinAllowance.anchor = GridBagConstraints.EAST;
		gbc_lblTradeinAllowance.insets = new Insets(0, 0, 5, 5);
		gbc_lblTradeinAllowance.gridx = 0;
		gbc_lblTradeinAllowance.gridy = 12;
		contentPane.add(lblTradeinAllowance, gbc_lblTradeinAllowance);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 3;
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 12;
		contentPane.add(textField_5, gbc_textField_5);
		
		JLabel lblTotalOptions = new JLabel("Total Options:");
		lblTotalOptions.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblTotalOptions = new GridBagConstraints();
		gbc_lblTotalOptions.anchor = GridBagConstraints.EAST;
		gbc_lblTotalOptions.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalOptions.gridx = 0;
		gbc_lblTotalOptions.gridy = 13;
		contentPane.add(lblTotalOptions, gbc_lblTotalOptions);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.gridwidth = 3;
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 13;
		contentPane.add(textField_6, gbc_textField_6);
		
		JLabel lblTax = new JLabel("Tax:");
		GridBagConstraints gbc_lblTax = new GridBagConstraints();
		gbc_lblTax.anchor = GridBagConstraints.EAST;
		gbc_lblTax.insets = new Insets(0, 0, 5, 5);
		gbc_lblTax.gridx = 0;
		gbc_lblTax.gridy = 14;
		contentPane.add(lblTax, gbc_lblTax);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.gridwidth = 3;
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 14;
		contentPane.add(textField_7, gbc_textField_7);
		
		JLabel lblLicenseFee = new JLabel("License Fee:");
		GridBagConstraints gbc_lblLicenseFee = new GridBagConstraints();
		gbc_lblLicenseFee.anchor = GridBagConstraints.EAST;
		gbc_lblLicenseFee.insets = new Insets(0, 0, 5, 5);
		gbc_lblLicenseFee.gridx = 0;
		gbc_lblLicenseFee.gridy = 15;
		contentPane.add(lblLicenseFee, gbc_lblLicenseFee);
		
		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.gridwidth = 3;
		gbc_textField_8.insets = new Insets(0, 0, 5, 0);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 15;
		contentPane.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		JLabel lblFinalCost = new JLabel("Final Cost:");
		GridBagConstraints gbc_lblFinalCost = new GridBagConstraints();
		gbc_lblFinalCost.anchor = GridBagConstraints.EAST;
		gbc_lblFinalCost.insets = new Insets(0, 0, 5, 5);
		gbc_lblFinalCost.gridx = 0;
		gbc_lblFinalCost.gridy = 16;
		contentPane.add(lblFinalCost, gbc_lblFinalCost);
		
		textField_9 = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.gridwidth = 3;
		gbc_textField_9.insets = new Insets(0, 0, 5, 0);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 1;
		gbc_textField_9.gridy = 16;
		contentPane.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);

		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "Mfg-A Name-1 Model-X" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setPreferredSize(new Dimension((int)(this.getPreferredSize().getWidth()), 200));
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 0);
		gbc_list.weightx = 2.0;
		gbc_list.gridheight = 3;
		gbc_list.gridwidth = 4;
		gbc_list.fill = GridBagConstraints.HORIZONTAL;
		gbc_list.gridx = 0;
		gbc_list.gridy = 17;
		contentPane.add(list, gbc_list);
		
		JButton btnNew = new JButton("New");
		GridBagConstraints gbc_btnNew = new GridBagConstraints();
		gbc_btnNew.insets = new Insets(0, 0, 0, 5);
		gbc_btnNew.gridx = 0;
		gbc_btnNew.gridy = 20;
		contentPane.add(btnNew, gbc_btnNew);
		
		JButton btnTradein = new JButton("Trade-In");
		GridBagConstraints gbc_btnTradein = new GridBagConstraints();
		gbc_btnTradein.insets = new Insets(0, 0, 0, 5);
		gbc_btnTradein.gridx = 1;
		gbc_btnTradein.gridy = 20;
		contentPane.add(btnTradein, gbc_btnTradein);
		
		JButton btnDone = new JButton("Done");
		GridBagConstraints gbc_btnDone = new GridBagConstraints();
		gbc_btnDone.gridx = 3;
		gbc_btnDone.gridy = 20;
		contentPane.add(btnDone, gbc_btnDone);
	}
}
