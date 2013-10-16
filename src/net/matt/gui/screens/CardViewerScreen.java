package net.matt.gui.screens;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Component;

import javax.swing.Box;

import net.matt.entity.Card;

public class CardViewerScreen extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tfCardName;
	private JTextField txtCardtype;
	private JTextField txtCardcolor;
	private JTextField txtCardrarity;


	/**
	 * Create the dialog.
	 */
	public CardViewerScreen(Card card) {
		setResizable(false);
		setTitle("Card Viewer");
		setBounds(100, 100, 507, 300);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel lblName = new JLabel("Name:");
				panel.add(lblName);
			}
			{
				tfCardName = new JTextField();
				tfCardName.setEditable(false);
				panel.add(tfCardName);
				tfCardName.setColumns(10);
			}
			{
				JLabel lblType = new JLabel("Type: ");
				panel.add(lblType);
			}
			{
				txtCardtype = new JTextField();
				txtCardtype.setEditable(false);
				txtCardtype.setText("CardType");
				panel.add(txtCardtype);
				txtCardtype.setColumns(10);
			}
			{
				JLabel lblColor = new JLabel("Color:");
				panel.add(lblColor);
			}
			{
				txtCardcolor = new JTextField();
				txtCardcolor.setEditable(false);
				txtCardcolor.setText("CardColor");
				panel.add(txtCardcolor);
				txtCardcolor.setColumns(10);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel lblRarity = new JLabel("Rarity:");
				panel.add(lblRarity);
			}
			{
				txtCardrarity = new JTextField();
				txtCardrarity.setEditable(false);
				txtCardrarity.setText("CardRarity");
				panel.add(txtCardrarity);
				txtCardrarity.setColumns(10);
			}
		}
		{
			Component horizontalStrut = Box.createHorizontalStrut(80);
			contentPanel.add(horizontalStrut);
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel lblDescription = new JLabel("Description:");
				panel.add(lblDescription);
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				panel.add(scrollPane);
				{
					JTextArea txtrCarddescription = new JTextArea();
					txtrCarddescription.setColumns(30);
					txtrCarddescription.setRows(6);
					scrollPane.setViewportView(txtrCarddescription);
					txtrCarddescription.setText("CardDescription");
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
