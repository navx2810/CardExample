package net.matt.gui.screens;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import net.matt.entity.CardList;
import net.matt.entity.Card.Color;
import net.matt.entity.Card.Rarity;

public class CardCreatorScreen extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCardname;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JTextArea taCardDesc;
	private JRadioButton rdbtnMob;
	private JRadioButton rdbtnStructure;
	private JRadioButton rdbtnSpell;
	private JRadioButton rdbtnRed;
	private JRadioButton rdbtnBlue;
	private JRadioButton rdbtnGreen;
	private JRadioButton rdbtnWhite;
	private JRadioButton rdbtnBlack;
	private JRadioButton rdbtnUncommon;
	private JRadioButton rdbtnRare;
	private JRadioButton rdbtnLegendary;
	private JRadioButton rdbtnCommon;
	

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
						taCardDesc = new JTextArea();
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
					rdbtnMob = new JRadioButton("MOB");
					buttonGroup.add(rdbtnMob);
					panel_1.add(rdbtnMob);
				}
				{
					rdbtnStructure = new JRadioButton("STRUCTURE");
					buttonGroup.add(rdbtnStructure);
					panel_1.add(rdbtnStructure);
				}
				{
					rdbtnSpell = new JRadioButton("SPELL");
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
					rdbtnRed = new JRadioButton("RED");
					buttonGroup_1.add(rdbtnRed);
					panel_1.add(rdbtnRed);
				}
				{
					rdbtnBlue = new JRadioButton("BLUE");
					buttonGroup_1.add(rdbtnBlue);
					panel_1.add(rdbtnBlue);
				}
				{
					rdbtnGreen = new JRadioButton("GREEN");
					buttonGroup_1.add(rdbtnGreen);
					panel_1.add(rdbtnGreen);
				}
				{
					rdbtnWhite = new JRadioButton("WHITE");
					buttonGroup_1.add(rdbtnWhite);
					panel_1.add(rdbtnWhite);
				}
				{
					rdbtnBlack = new JRadioButton("BLACK");
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
					rdbtnCommon = new JRadioButton("COMMON");
					buttonGroup_2.add(rdbtnCommon);
					panel_1.add(rdbtnCommon);
				}
				{
					rdbtnUncommon = new JRadioButton("UNCOMMON");
					buttonGroup_2.add(rdbtnUncommon);
					panel_1.add(rdbtnUncommon);
				}
				{
					rdbtnRare = new JRadioButton("RARE");
					buttonGroup_2.add(rdbtnRare);
					panel_1.add(rdbtnRare);
				}
				{
					rdbtnLegendary = new JRadioButton("LEGENDARY");
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
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						{ //start of method
		
							String name = txtCardname.getText(), description = taCardDesc.getText();
							net.matt.entity.Card.Type type = null;
							Color color = null;
							Rarity rarity = null;
							
							//Check Types
							if(rdbtnMob.isSelected())
								type = net.matt.entity.Card.Type.MOB;
							else if(rdbtnSpell.isSelected())
								type = net.matt.entity.Card.Type.SPELL;
							else if(rdbtnStructure.isSelected())
								type = net.matt.entity.Card.Type.STRUCTURE;
							
							//Check Color
							if(rdbtnBlack.isSelected())
								color = Color.BLACK;
							else if(rdbtnBlue.isSelected())
								color = Color.BLUE;
							else if(rdbtnGreen.isSelected())
								color = Color.GREEN;
							else if(rdbtnRed.isSelected())
								color = Color.RED;
							else if(rdbtnWhite.isSelected())
								color = Color.WHITE;
							
							//Check Rarity
							if(rdbtnUncommon.isSelected())
								rarity = Rarity.UNCOMMON;
							else if(rdbtnCommon.isSelected())
								rarity = Rarity.COMMON;
							else if(rdbtnRare.isSelected())
								rarity = Rarity.RARE;
							else if(rdbtnLegendary.isSelected())
								rarity = Rarity.LEGENDARY;
							
							CardList.addCard(name, description, type, rarity, color);
							dispose();
							
						}
						
					}
				});
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

	public JTextArea getTaCardDesc() {
		return taCardDesc;
	}
	public JRadioButton getRdbtnMob() {
		return rdbtnMob;
	}
	public JRadioButton getRdbtnStructure() {
		return rdbtnStructure;
	}
	public JRadioButton getRdbtnSpell() {
		return rdbtnSpell;
	}
	public JRadioButton getRdbtnRed() {
		return rdbtnRed;
	}
	public JRadioButton getRdbtnBlue() {
		return rdbtnBlue;
	}
	public JRadioButton getRdbtnGreen() {
		return rdbtnGreen;
	}
	public JRadioButton getRdbtnWhite() {
		return rdbtnWhite;
	}
	public JRadioButton getRdbtnBlack() {
		return rdbtnBlack;
	}
	public JRadioButton getRdbtnUncommon() {
		return rdbtnUncommon;
	}
	public JRadioButton getRdbtnCommon() {
		return rdbtnCommon;
	}
	public JRadioButton getRdbtnRare() {
		return rdbtnRare;
	}
	public JRadioButton getRdbtnLegendary() {
		return rdbtnLegendary;
	}
}
