package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Classes.Frigider;
import Classes.TestClass;
import Classes.CombinaFrigorifica;
import Classes.ElementeBucatarie;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class Gui extends JFrame {

	/**
	 * 
	 */
	 private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	
public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(950, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("ElementeBucatarie");
		
		DefaultListModel<ElementeBucatarie> model = new DefaultListModel<ElementeBucatarie>();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 141, 888, 387);
		contentPane.add(scrollPane);
		
		JList<ElementeBucatarie> list = new JList<ElementeBucatarie>(model);
		scrollPane.setViewportView(list);
	
		ArrayList<Frigider> frigiderr = TestClass.arrayFrigider();
		ArrayList<CombinaFrigorifica> combinafrigorificaa = TestClass.arrayCombinaFrigorifica();
		
	
		for(Frigider frg: frigiderr)
			model.addElement(frg);  
		for(CombinaFrigorifica combF: combinafrigorificaa)
			model.addElement(combF); 
		
		
		String[] listaproduse = {"Combina frigorifica", "Frigider"};
		String[] listabranduri = {"Arctic", "Beko", "Bosch", "De'Longhi", "Electrolux", "Heinner", "Indesit", "LG", "Philips", "Samsung"};
		Integer[] capacitati= {29, 30, 40, 50, 59, 60, 70, 100};
	
		
		
		JComboBox<Object>comboBox = new JComboBox<Object>(listaproduse); 
		comboBox.setBounds(88, 51, 138, 21);
		comboBox.setSelectedItem(null);
		contentPane.add(comboBox);
		
		
		
		JComboBox<Object> comboBox_1 = new JComboBox<Object>(listabranduri); 
		comboBox_1.setBounds(248, 51, 138, 21);
		comboBox_1.setSelectedItem(null);
		contentPane.add(comboBox_1); 

		
		JComboBox<Object>comboBox_2 = new JComboBox<Object>(capacitati);
		comboBox_2.setEnabled(false);
		comboBox_2.setBounds(461, 51, 131, 21);
		comboBox_2.setSelectedItem(null);
		contentPane.add(comboBox_2);

		JCheckBox checkBox = new JCheckBox("");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox.isSelected()) {
					comboBox_2.setEnabled(true);
				} else {
					comboBox_2.setEnabled(false);
				}
			}
		});
		checkBox.setBounds(434, 51, 21, 21);
		contentPane.add(checkBox);
		
	
		
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String produse = (String)comboBox.getSelectedItem();
				String numebranduri = (String)comboBox_1.getSelectedItem();
				Integer capacitatea = (Integer)comboBox_2.getSelectedItem();
				
				if(produse != null && numebranduri != null ) {
					if (checkBox.isSelected() && capacitatea != null) {
						if(produse == "Combina frigorifica") {
							model.clear();
							for(int i=0; i<combinafrigorificaa.size(); i++) {	
								if(combinafrigorificaa.get(i).getBrand().equals(numebranduri) && combinafrigorificaa.get(i).getCapacitate() == capacitatea) {
									model.addElement(combinafrigorificaa.get(i));
								}
							}
						}					
						else if(produse == "Frigider") {
							model.clear();
							for(int i=0; i<frigiderr.size(); i++) {
								if(frigiderr.get(i).getBrand().equals(numebranduri) && frigiderr.get(i).getCapacitate() == capacitatea) {
									model.addElement(frigiderr.get(i));
								}
							}
						}
					} 
					
					else {
						if(produse == "Combina frigorifica") {
							model.clear();
							for(int i=0; i<combinafrigorificaa.size(); i++) {
								if(combinafrigorificaa.get(i).getBrand().equals(numebranduri)) {
									model.addElement(combinafrigorificaa.get(i));
								}
							}
						}					
						else if(produse == "Frigider") {
							model.clear();
							for(int i=0; i<frigiderr.size(); i++) {
								if(frigiderr.get(i).getBrand().equals(numebranduri)) {
									model.addElement(frigiderr.get(i));
								}
							}
						}
					}
				}
				else if(produse == null && numebranduri != null) {
					if (checkBox.isSelected() && capacitatea != null) {
					     model.clear();
					         for(int i=0; i<combinafrigorificaa.size(); i++) {
						        if(combinafrigorificaa.get(i).getBrand().equals(numebranduri) && combinafrigorificaa.get(i).getCapacitate() == capacitatea) {
							      model.addElement(combinafrigorificaa.get(i));
						        }
						        else if(combinafrigorificaa.get(i).getBrand().equals(numebranduri)) {
							      model.addElement(combinafrigorificaa.get(i));
						        }
					         }
					
					      for(int i=0; i<frigiderr.size(); i++) {
						     if(frigiderr.get(i).getBrand().equals(numebranduri) && frigiderr.get(i).getCapacitate() == capacitatea) {
							   model.addElement(frigiderr.get(i));
						     }
						      else if(frigiderr.get(i).getBrand().equals(numebranduri) && capacitatea == null) {
							    model.addElement(frigiderr.get(i));
						      }
					      }
					}
					else {
						model.clear();
				        for(int i=0; i<combinafrigorificaa.size(); i++) {
				        	if(combinafrigorificaa.get(i).getBrand().equals(numebranduri)) {
						      model.addElement(combinafrigorificaa.get(i));
					        }
				        }
				        for(int i=0; i<frigiderr.size(); i++) {
				        	if(frigiderr.get(i).getBrand().equals(numebranduri)) {
				        		model.addElement(frigiderr.get(i));
				        	}
				        	else if(frigiderr.get(i).getBrand().equals(numebranduri) && capacitatea == null) {
				        		model.addElement(frigiderr.get(i));
				        	}
				        }
					}
				}
				if(produse != null && numebranduri == null) {
					if (checkBox.isSelected() && capacitatea != null) {
						if(produse == "Combina frigorifica") {
							model.clear();                                                        
							for(int i=0; i<combinafrigorificaa.size(); i++) {                   
								if (combinafrigorificaa.get(i).getCapacitate() == capacitatea) {
									model.addElement(combinafrigorificaa.get(i));
								}
							}
						}
						else if(produse == "Frigider") {
							model.clear();
							for(int i=0; i<frigiderr.size(); i++) {
								if (frigiderr.get(i).getCapacitate() == capacitatea) {
								model.addElement(frigiderr.get(i));
								}
							}
						}
					}
					else {
						if(produse == "Combina frigorifica") {
							model.clear();
							for(int i=0; i<combinafrigorificaa.size(); i++) {
								model.addElement(combinafrigorificaa.get(i));
							}
						}				
						else if(produse == "Frigider") {
							model.clear();
							for(int i=0; i<frigiderr.size(); i++) {
								model.addElement(frigiderr.get(i));
							}
						}
					}
				}
				else if(produse == null && numebranduri == null) {
					if (!checkBox.isSelected()) {
						JOptionPane.showMessageDialog(null, "Niciun filtru nu a fost selectat!");
					}
					else {
						JOptionPane.showMessageDialog(null, "Selecteaza si un brand sau un tip de produs!");
					}
				}
			}
		});
		
		
		btnNewButton.setBounds(633, 51, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESETEAZA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.clear();
				
				comboBox.setSelectedItem(null);        
				comboBox_1.setSelectedItem(null);		
				comboBox_2.setSelectedItem(null);	
				comboBox_2.setEnabled(false);		
				checkBox.setSelected(false);		
				
			    for(Frigider frg: frigiderr)
				model.addElement(frg); 
				for(CombinaFrigorifica combF: combinafrigorificaa)
					model.addElement(combF);
			} 
		});
		
		btnNewButton_1.setBounds(728, 51, 104, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Tip Produs");
		lblNewLabel.setBounds(88, 35, 138, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Brand-ul");
		lblNewLabel_1.setBounds(248, 35, 138, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Capacitate");
		lblNewLabel_2.setBounds(461, 35, 131, 13);
		contentPane.add(lblNewLabel_2);
		
		
		
	}
} 
