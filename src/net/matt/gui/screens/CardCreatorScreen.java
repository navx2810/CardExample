package net.matt.gui.screens;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class CardCreatorScreen extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCardname;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CardCreatorScreen dialog = new CardCreatorScreen();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CardCreatorScreen() {
		setTitle("Card Creator");
		setSize(472, 325);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel);
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel lblName = new JLabel("Name:");
					panel_1.add(lblName);
				}
				{
					txtCardname = new JTextField();
					txtCardname.setText("CardName");
					panel_1.add(txtCardname);
					txtCardname.setColumns(10);
				}
				{
					JLabel lblDescription = new JLabel("Description");
					panel_1.add(lblDescription);
				}
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setViewportBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panel_1.add(scrollPane);
					{
						JTextArea taCardDesc = new JTextArea();
						taCardDesc.setLineWrap(true);
						scrollPane.setViewportView(taCardDesc);
						taCardDesc.setColumns(12);
						taCardDesc.setRows(3);
					}
				}
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel);
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel lblType = new JLabel("Type:");
					panel_1.add(lblType);
				}
				{
					JRadioButton rdbtnMob = new JRadioButton("MOB");
					buttonGroup.add(rdbtnMob);
					panel_1.add(rdbtnMob);
				}
				{
					JRadioButton rdbtnStructure = new JRadioButton("STRUCTURE");
					buttonGroup.add(rdbtnStructure);
					panel_1.add(rdbtnStructure);
				}
				{
					JRadioButton rdbtnSpell = new JRadioButton("SPELL");
					buttonGroup.add(rdbtnSpell);
					panel_1.add(rdbtnSpell);
				}
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel);
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel lblColor = new JLabel("Color:");
					panel_1.add(lblColor);
				}
				{
					JRadioButton rdbtnRed = new JRadioButton("RED");
					buttonGroup_1.add(rdbtnRed);
					panel_1.add(rdbtnRed);
				}
				{
					JRadioButton rdbtnBlue = new JRadioButton("BLUE");
					buttonGroup_1.add(rdbtnBlue);
					panel_1.add(rdbtnBlue);
				}
				{
					JRadioButton rdbtnGreen = new JRadioButton("GREEN");
					buttonGroup_1.add(rdbtnGreen);
					panel_1.add(rdbtnGreen);
				}
				{
					JRadioButton rdbtnWhite = new JRadioButton("WHITE");
					buttonGroup_1.add(rdbtnWhite);
					panel_1.add(rdbtnWhite);
				}
				{
					JRadioButton rdbtnBlack = new JRadioButton("BLACK");
					buttonGroup_1.add(rdbtnBlack);
					panel_1.add(rdbtnBlack);
				}
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel);
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel lblRarity = new JLabel("Rarity:");
					panel_1.add(lblRarity);
				}
				{
					JRadioButton rdbtnUncommon = new JRadioButton("UNCOMMON");
					buttonGroup_2.add(rdbtnUncommon);
					panel_1.add(rdbtnUncommon);
				}
				{
					JRadioButton rdbtnCommon = new JRadioButton("COMMON");
					buttonGroup_2.add(rdbtnCommon);
					panel_1.add(rdbtnCommon);
				}
				{
					JRadioButton rdbtnRare = new JRadioButton("RARE");
					buttonGroup_2.add(rdbtnRare);
					panel_1.add(rdbtnRare);
				}
				{
					JRadioButton rdbtnLegendary = new JRadioButton("LEGENDARY");
					buttonGroup_2.add(rdbtnLegendary);
					panel_1.add(rdbtnLegendary);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Create");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
