package main;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Nose extends JFrame implements MouseListener{
	JPanel pnlNose = new JPanel(new GridLayout(4,1));
	JButton btnSubmit = new JButton("SUBMIT");
	JTextField txtCA = new JTextField();
	JTextField txtHED = new JTextField();
	JTextField txtHSA = new JTextField();
	JCheckBox chkRunnyNose = new JCheckBox("RUNNY NOSE");

	JCheckBox chkRsos= new JCheckBox("REDUCED SENSE OF SMELL");

	JCheckBox chkNasalCongestion = new JCheckBox("NASAL CONGESTION");
	
	JCheckBox chkSneeze = new JCheckBox("SNEEZE");

	
	public Nose() {
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(400,700);
		
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		
		JPanel pnlNose = new JPanel(new GridLayout(4,1));
		pnlNose.add(chkRunnyNose); pnlNose.add(chkRsos);
		pnlNose.add(chkNasalCongestion);pnlNose.add(chkSneeze);
		
		setLayout(new GridLayout(5,1)); 
		add(new JLabel("NOSE"));
		add(new JLabel("Enter the problem you have with your nose"));
		add(new JLabel("(You can choose one or more options.)"));
		add(pnlNose);
		add(btnSubmit);
		btnSubmit.addMouseListener(this);
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnSubmit) {
            ArrayList<String> selectedOptions = new ArrayList<>();
            
         // Get all the components within the pnlNose panel
            Component[] components = pnlNose.getComponents();

            // Iterate over the components
            for (Component component : components) {
                if (component instanceof JCheckBox) {
                    JCheckBox checkBox = (JCheckBox) component;
                    if (checkBox.isSelected()) {
                        selectedOptions.add(checkBox.getText());
                    }
                }
            }

            System.out.println("Selected Options: " + selectedOptions);
        } 
			
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
