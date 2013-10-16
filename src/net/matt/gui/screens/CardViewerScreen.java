package net.matt.gui.screens;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.matt.entity.Card;

public class CardViewerScreen extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tfCardName;
	private JTextField txtCardrarity;
	private JTextField txtCardType;
	private JTextField txtCardColor;


	/**
	 * Create the dialog.
	 */
	public CardViewerScreen(Card card) {
		setResizable(false);
		setTitle("Card Viewer");
		setSize(565,300);
		setLocationRelativeTo(null);
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
				tfCardName.setText(card.getName());
				panel.add(tfCardName);
				tfCardName.setColumns(20);
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
				txtCardrarity.setText(card.getRarity().toString());
				panel.add(txtCardrarity);
				txtCardrarity.setColumns(10);
			}
			{
				JLabel label = new JLabel("Type: ");
				panel.add(label);
			}
			{
				txtCardType = new JTextField();
				txtCardType.setText(card.getType().toString());
				txtCardType.setEditable(false);
				txtCardType.setColumns(10);
				panel.add(txtCardType);
			}
			{
				JLabel label = new JLabel("Color:");
				panel.add(label);
			}
			{
				txtCardColor = new JTextField();
				txtCardColor.setText(card.getColor().toString());
				txtCardColor.setEditable(false);
				txtCardColor.setColumns(10);
				panel.add(txtCardColor);
			}
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
					txtrCarddescription.setEditable(false);
					txtrCarddescription.setColumns(30);
					txtrCarddescription.setRows(6);
					scrollPane.setViewportView(txtrCarddescription);
					txtrCarddescription.setText(card.getDescription());
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
