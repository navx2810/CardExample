package net.matt.gui.screens;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import net.matt.entity.Card;
import net.matt.entity.CardList;
import javax.swing.JLabel;

public class CardSelectorScreen extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JList<String> jlCardList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CardSelectorScreen dialog = new CardSelectorScreen();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CardSelectorScreen() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(
					EtchedBorder.LOWERED, null, null), "",
					TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
				panel.add(scrollPane);
				{
					String names = "";
					for (Card card : CardList.getCards())
						names += card.getName() + "*";
					String[] namesStrings = names.split("[*]");
						jlCardList = new JList<String>();
						jlCardList.setListData(namesStrings);
						jlCardList.setVisibleRowCount(10);
						jlCardList.setFixedCellWidth(400);
					
					scrollPane.setViewportView(jlCardList);
				}
			}
		}
		{
			JLabel lblNoteIfYou = new JLabel("Note: If nothing appears, try loading.");
			contentPanel.add(lblNoteIfYou);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int cardNum = jlCardList.getSelectedIndex();
						CardList.getCards().remove(cardNum);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton btnViewCard = new JButton("View Card");
				btnViewCard.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						{
							CardViewerScreen cardViewerScreen = new CardViewerScreen(CardList.getCards().get(jlCardList.getSelectedIndex()));
							cardViewerScreen.setVisible(true);
							dispose();
						}
					}
				});
				buttonPane.add(btnViewCard);
			}
		}
	}

	public JList<String> getJlCardList() {
		return jlCardList;
	}
}
