package aray�zgeli�tirme;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Waist extends JFrame implements MouseListener {
	JPanel pnlHairyArea = new JPanel(new GridLayout(4,1));
	JButton btnSubmit = new JButton("SUBMIT");
	JTextField txtCA = new JTextField();
	JTextField txtHED = new JTextField();
	JTextField txtHSA = new JTextField();
	JCheckBox chkIB = new JCheckBox("PAIN IN LOWER BACK");

	JCheckBox chkITC= new JCheckBox("MUSCLE SPASMS");

	JCheckBox chkBI = new JCheckBox("PAINFUL URINATION");
	
	JCheckBox chkCG = new JCheckBox("RADIATING TO THE ABDOMEN");
	JCheckBox chkCKS= new JCheckBox("LOSS OF BOWEL CONTROL");

	JCheckBox chkFP = new JCheckBox("LOSS OF BLADDER CONTROL");
	
	JCheckBox chkLJ = new JCheckBox("MUSCLE WEAKNESS IN LEG");
	public Waist() {
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(400,700);
		
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		
		JPanel pnlNose = new JPanel(new GridLayout(7,1));
		pnlHairyArea.add(chkIB); pnlHairyArea.add(chkITC); pnlHairyArea.add(chkBI);pnlHairyArea.add(chkCG);pnlHairyArea.add(chkCKS);pnlHairyArea.add(chkFP);pnlHairyArea.add(chkLJ);
		
		setLayout(new GridLayout(5,1)); 
		add(new JLabel("HAIRY AREA"));
		add(new JLabel("Enter the problem you have with your nose."));
		add(new JLabel("(You can choose one or more options.)"));
		add(pnlHairyArea);
		add(btnSubmit);
	
	
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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