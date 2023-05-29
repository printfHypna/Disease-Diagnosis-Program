package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;


public class Results extends JFrame implements MouseListener{
	
	private ArrayList<String> selectedCheckBoxes;
	private String username;
	private JList<String> diseaseList;
	private DiseaseTree tree;
	
	
	JButton descBtn = new JButton("Description");
	
	public Results(String username, ArrayList<String> selectedCheckBoxes) {
		
		
		this.username = username;
		this.selectedCheckBoxes = selectedCheckBoxes;
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(400,700);
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		setLayout(new BorderLayout());
		
	
		LinkedList linkedList = new LinkedList();
		linkedList.add(username, selectedCheckBoxes);
		linkedList.display();
		
		tree = new DiseaseTree();
		createDiseaseTree(tree);
		ArrayList<String> matchingDiseases = tree.searchBySymptoms(selectedCheckBoxes);
		
		JLabel diseasesLabel = new JLabel("POSSIBLE DISEASES:");
		Font labelFont = diseasesLabel.getFont();
		Font newLabelFont = labelFont.deriveFont(24f);
		diseasesLabel.setFont(newLabelFont);
		diseasesLabel.setPreferredSize(new Dimension(100, 100));
		
		diseaseList = new JList<>();
		Font listFont = diseaseList.getFont();
		Font newListFont = listFont.deriveFont(20f);
		diseaseList.setFont(newListFont);
		diseaseList.setListData(matchingDiseases.toArray(new String[0]));
		
		add(diseaseList, BorderLayout.CENTER);
		add(diseasesLabel, BorderLayout.NORTH);
		add(descBtn, BorderLayout.SOUTH);
		
		descBtn.addMouseListener(this);
		diseaseList.addMouseListener(this);
		
		
	}
	 public static void createDiseaseTree(DiseaseTree tree) {
		  
	        ArrayList<String> sinisitisSymptoms = new ArrayList<>();
	        sinisitisSymptoms.add("FACIAL PLAIN");
	        sinisitisSymptoms.add("REDUCED SENSE OF SMELL");
	        sinisitisSymptoms.add("NASAL CONGESTION");
	        sinisitisSymptoms.add("HEADACHE");

	        ArrayList<String> nasalpolypsSymptoms = new ArrayList<>();
	        nasalpolypsSymptoms.add("NASAL CONGESTION");
	        nasalpolypsSymptoms.add("RUNNY NOSE");
	        nasalpolypsSymptoms.add("REDUCED SENSE OF SMELL");
	        nasalpolypsSymptoms.add("FACIAL PLAIN");

	        ArrayList<String> rhinitsSymptoms = new ArrayList<>();
	        rhinitsSymptoms.add("RUNNY NOSE");
	        rhinitsSymptoms.add("NASAL CONGESTION");
	        rhinitsSymptoms.add("SNEEZE");
	        rhinitsSymptoms.add("ITCHY NOSE");

	     
	        
	        ArrayList<String> migraineSymptoms = new ArrayList<>();
	        migraineSymptoms.add("HEADACHE");
	        migraineSymptoms.add("LIGHT SENSIVITY");
	        migraineSymptoms.add("NAUSEA");
	        
	        ArrayList<String> sinusitsSymptoms = new ArrayList<>();
	        sinusitsSymptoms.add("COUGH");
	        sinusitsSymptoms.add("CHEEKS");
	        
	        ArrayList<String> temporomandibularJointDisorderSymptoms = new ArrayList<>();
	        temporomandibularJointDisorderSymptoms.add("FACIAL PAIN");
	        temporomandibularJointDisorderSymptoms.add("LOCKJAW");
	        
	        ArrayList<String> ConjuctivitsSymptoms = new ArrayList<>();
	        ConjuctivitsSymptoms.add("ITCHING OR BURNING SENSATION IN THE EYE");
	        ConjuctivitsSymptoms.add("EYE FATIGUTE");
	        

	        ArrayList<String> GlacomaSymptoms = new ArrayList<>();
	        GlacomaSymptoms.add("TUNNEL VISION");
	        GlacomaSymptoms.add("BLURRED VISION");
	        GlacomaSymptoms.add("EYE PAIN");
	        
	        
	        ArrayList<String> dryeyesyndromeSymptoms = new ArrayList<>();
	        GlacomaSymptoms.add("REDNESS");
	        GlacomaSymptoms.add("LIGHT SENSIVITY");
	        GlacomaSymptoms.add("EYE FATIGUTE");
	        
	        ArrayList<String> anginaSymptoms = new ArrayList<>();
	        anginaSymptoms.add("CHEST PAIN");
	        anginaSymptoms.add("PRESSURE IN THE CHEST");
	        anginaSymptoms.add("HAVINESS IN THE CHEST");

	        ArrayList<String> costochondritisSymptoms = new ArrayList<>();
	        costochondritisSymptoms.add("PAIN WITH DEEP BREATHING");
	        costochondritisSymptoms.add("PAIN IN THE CHEST WALL");
	        
	        
	        
	        ArrayList<String> pulmonaryembolismSymptoms = new ArrayList<>();
	        pulmonaryembolismSymptoms.add("RAPID HEART RATE");
	        pulmonaryembolismSymptoms.add("FAINTING");
	        
	        ArrayList<String> pneumoniaSymptoms = new ArrayList<>();
	        pneumoniaSymptoms.add("COUGH");
	        pneumoniaSymptoms.add("SHORTNESS BREATH");
	        pneumoniaSymptoms.add("RAPID BREATH");

	        ArrayList<String> pleurisySymptoms = new ArrayList<>();
	        pleurisySymptoms.add("UNEXPLAINED WEIGHT LOSS");
	        pleurisySymptoms.add("RAPID BREATH");
	        
	        
	        
	        ArrayList<String> gasreosophagealrefluxdiseaseSymptoms = new ArrayList<>();
	        gasreosophagealrefluxdiseaseSymptoms.add("HEARTHBURN");
	        gasreosophagealrefluxdiseaseSymptoms.add("CHRONIC COUGH");
	        gasreosophagealrefluxdiseaseSymptoms.add("HOARSENESS");
	       
	        ArrayList<String> plantarfasciitisSymptoms = new ArrayList<>();
	        plantarfasciitisSymptoms.add("PAIN IN THE HEEL OR BOTTOM OF THE FOOT");
	        plantarfasciitisSymptoms.add("TENDERNESS");
	        plantarfasciitisSymptoms.add("INFLAMMATION");

	        ArrayList<String> athletesfootSymptoms = new ArrayList<>();
	        athletesfootSymptoms.add("RED SK�N");
	        athletesfootSymptoms.add("ITCHING, BURNING AND STINGING SENSATION BETWEEN TOES");
	        
	        ArrayList<String> goutSymptoms = new ArrayList<>();
	        goutSymptoms.add("SUDDEN INTENSE PAIN IN THE FOOT");
	        goutSymptoms.add("GOUT ATTACKS");
	        
	        
	        
	        ArrayList<String> patellofemoralpainsyndromeSymptoms = new ArrayList<>();
	        patellofemoralpainsyndromeSymptoms.add("DULL, ACHING PAIN AROUND KNEECAP");
	        patellofemoralpainsyndromeSymptoms.add("SWELLING AND A GRINDIN OR POPPING SENSATION");
	       
	        ArrayList<String> patellartendinitisSymptoms = new ArrayList<>();
	        patellartendinitisSymptoms.add("PAIN WORSENS WITH ACTIVITIES");
	        patellartendinitisSymptoms.add("STIFNESS IN KNEE");
	        patellartendinitisSymptoms.add("SWELLING IN KNEE");

	        ArrayList<String> chondromalaciapatellaeSymptoms = new ArrayList<>();
	        chondromalaciapatellaeSymptoms.add("PAIN AND ACHING IN THE KNEE");
	        chondromalaciapatellaeSymptoms.add("PAIN WORSENS WITH ACTIVITIES");
	        
	        ArrayList<String> hamstringstrainSymptoms = new ArrayList<>();
	        hamstringstrainSymptoms.add("SUDDEN SHARP PAIN IN THE BACK OF THIGH");
	        hamstringstrainSymptoms.add("SENSATION OF WEAKNESS IN THE HARMSTRING");
	        hamstringstrainSymptoms.add("TENDERNESS");
	       
	        ArrayList<String> quadricepsstrainSymptoms = new ArrayList<>();
	        quadricepsstrainSymptoms.add("WALKING DIFFICULTY");
	        quadricepsstrainSymptoms.add("TENDERNESS");
	        

	        ArrayList<String> femoralherniaSymptoms = new ArrayList<>();
	        femoralherniaSymptoms.add("BULGE OR LUMP IN THE UPPER THIGH");
	        femoralherniaSymptoms.add("PAIN OR DISCOMFORT PRESENT IN UPPER LEG");
	        femoralherniaSymptoms.add("STRENGHT DURING PYHSICAL ACTIVITY");
	        
	        ArrayList<String> gastritisSymptoms = new ArrayList<>();
	        gastritisSymptoms.add("ABDOMINAL PAIN IN UPPER ABDOMEN");
	        gastritisSymptoms.add("NAUSEA");
	        gastritisSymptoms.add("VOMITING");
	       
	        ArrayList<String> gastroesophegalrefluxdiseaseSymptoms = new ArrayList<>();
	        gastroesophegalrefluxdiseaseSymptoms.add("HEARTHBURN");
	        gastroesophegalrefluxdiseaseSymptoms.add("BURNING IN UPPER ABDOMEN");
	        

	        ArrayList<String> pepticulcerdiseaseSymptoms = new ArrayList<>();
	        pepticulcerdiseaseSymptoms.add("BLOATING");
	        pepticulcerdiseaseSymptoms.add("BELCHING");
	        
	        ArrayList<String> gallstonesSymptoms = new ArrayList<>();
	        gallstonesSymptoms.add("INDIGESTION");
	        gallstonesSymptoms.add("JAUNDICE");
	        
	       
	        ArrayList<String> gastroesophegalRefluxdiseaseSymptoms = new ArrayList<>();
	        gastroesophegalRefluxdiseaseSymptoms.add("HEARTHBURN");
	        gastroesophegalRefluxdiseaseSymptoms.add("BURNING IN UPPER ABDOMEN");
	        gastroesophegalRefluxdiseaseSymptoms.add("REGULATION OF STOMACH ACID INTO MOUTH");
	        

	        ArrayList<String> pepticUlcerdiseaseSymptoms = new ArrayList<>();
	        pepticUlcerdiseaseSymptoms.add("BLOATING");
	        pepticUlcerdiseaseSymptoms.add("FEELING FULL QUICKLY");
	        
	        ArrayList<String> appendicitisSymptoms = new ArrayList<>();
	        appendicitisSymptoms.add("TENDERNESS AND SHARP PAIN TO THE LOWER SIDE OF THE ABDOMEN");
	        appendicitisSymptoms.add("VOMITING");
	        appendicitisSymptoms.add("NAUSEA");
	       
	        ArrayList<String> irritablebowelsyndromeSymptoms = new ArrayList<>();
	        irritablebowelsyndromeSymptoms.add("CHANGES IN BOWEL HABITS");
	        irritablebowelsyndromeSymptoms.add("EXCESSIVE GAS");
	        
	        

	        ArrayList<String> urinarytractinfectionSymptoms = new ArrayList<>();
	        urinarytractinfectionSymptoms.add("FREQUENT AND URGEND NEED TO URINATE");
	        urinarytractinfectionSymptoms.add("CLOUDY OR BLOODY URINE");
	        

	        ArrayList<String> lumbarstrainSymptoms = new ArrayList<>();
	        lumbarstrainSymptoms.add("PAIN IN LOWER BACK");
	        lumbarstrainSymptoms.add("MUSCLE SPASMS");
	        
	       
	        ArrayList<String> kidneystonesSymptoms = new ArrayList<>();
	        kidneystonesSymptoms.add("PAINFUL URINATION");
	        kidneystonesSymptoms.add("RADIATING TO THE ABDOMEN");
	        
	        

	        ArrayList<String> herniateddiscSymptoms = new ArrayList<>();
	        herniateddiscSymptoms.add("LOSS OF BOWEL CONTROL");
	        herniateddiscSymptoms.add("LOSS OF BLADDER CONTROL");
	        herniateddiscSymptoms.add("MUSCLE WEAKNESS IN LEG");
	        
	        ArrayList<String> sciaticaSymptoms = new ArrayList<>();
	        sciaticaSymptoms.add("WEAKNESS IN LEG");
	        sciaticaSymptoms.add("TINGLING IN LEG");
	        
	       
	        ArrayList<String> degenerativediscdiseaseSymptoms = new ArrayList<>();
	        degenerativediscdiseaseSymptoms.add("MUSCLE SPASM");
	        degenerativediscdiseaseSymptoms.add("DECREASED FLEXIBILITY");
	        
	        

	        ArrayList<String> spinalstenosisSymptoms = new ArrayList<>();
	        spinalstenosisSymptoms.add("DIFFICULTY WITH BALANCE");
	        spinalstenosisSymptoms.add("LOWER BACK PAIN");
	        spinalstenosisSymptoms.add("DIFFICULTY WITH COORDINATION");
	        
	        ArrayList<String> musclestrainSymptoms = new ArrayList<>();
	        musclestrainSymptoms.add("STIFFNESS IN UPPER BACK");
	        musclestrainSymptoms.add("MUSCLE SPASMS");
	        
	       
	        ArrayList<String> thoracicdischerniationSymptoms = new ArrayList<>();
	        thoracicdischerniationSymptoms.add("NUMBNESS IN THE ABDOMEN");
	        thoracicdischerniationSymptoms.add("DIFFICULTY WITH BOWEL");
	        
	        

	        ArrayList<String> osteoarthritisSymptoms = new ArrayList<>();
	        osteoarthritisSymptoms.add("DECREASED RANGE OF MOTION");
	        osteoarthritisSymptoms.add("GRATING SENSATION DURIN MOVEMENT");
	        osteoarthritisSymptoms.add("PAIN IN THE UPPER BACK");
	        

	        tree.insert("Sinusitis", sinisitisSymptoms, "Sinusitis: Sinusitis refers to the inflammation of the sinuses, which are air-filled cavities located around the nose. It can be caused by a viral, bacterial, or fungal infection, or by allergies.");
	        tree.insert("Nasal Polyps", nasalpolypsSymptoms, "Nasal polyps: Nasal polyps are soft, noncancerous growths that develop on the lining of the nasal passages or sinuses. They can result from chronic inflammation, such as in allergic rhinitis or chronic sinusitis.");
	        tree.insert("Rhinits",rhinitsSymptoms ,"Rhinitis: It is the inflammation of the nasal passages and can be caused by allergies (allergic rhinitis) or non-allergic triggers (non-allergic rhinitis).");
	        tree.insert("Migraine", migraineSymptoms,"Symptoms: Severe, throbbing headache usually on one side of the head, sensitivity to light and sound, nausea, vomiting, visual disturbances (flashing lights, blind spots), and sometimes aura (visual or sensory disturbances before the headache).");
	        tree.insert("Sinusits", sinusitsSymptoms,"Symptoms: Pain and pressure in the forehead, cheeks, and around the eyes, blocked or stuffy nose, thick yellow or green nasal discharge, reduced sense of smell, cough, facial tenderness, fatigue, and occasionally fever.");
	        tree.insert("TemporomandibularJointDisorder(TJM)", temporomandibularJointDisorderSymptoms,"Symptoms: Jaw pain and stiffness, clicking or popping sounds in the jaw joint, difficulty or discomfort while chewing, facial pain, earache, headaches (often resembling tension headaches), and sometimes lockjaw (inability to open or close the mouth fully)");
	        tree.insert("Conjuctivits", ConjuctivitsSymptoms,"Symptoms: Redness and swelling of the conjunctiva (the thin, clear tissue covering the white part of the eye and the inner surface of the eyelids), itching or burning sensation in the eye, increased tear production, discharge (clear, white, yellow, or green), and crusty eyelashes upon waking.");
	        tree.insert("Glacoma", GlacomaSymptoms, "Symptoms: Gradual loss of peripheral vision, tunnel vision (seeing objects in a narrow field of view), blurred vision, eye pain or discomfort, headache, halos around lights, and sometimes nausea and vomiting. Acute angle-closure glaucoma may present with sudden severe eye pain, headache, blurred vision, redness, and halos around lights.");
	        tree.insert("Dry Eye Syndrome", dryeyesyndromeSymptoms,"Symptoms: Persistent dryness and grittiness in the eyes, itching or burning sensation, redness, sensitivity to light, blurred vision, eye fatigue, and the feeling of something in the eye. The eyes may also water excessively as a result of the irritation.");
	        tree.insert("Angina", anginaSymptoms,"Symptoms: Chest pain or discomfort, typically described as a squeezing, pressure, heaviness, or tightness sensation in the chest. The pain may radiate to the left arm, neck, jaw, or back. Shortness of breath, sweating, nausea, and lightheadedness may also occur.");
	        tree.insert("Costochondritis", costochondritisSymptoms, "Symptoms: Pain and tenderness in the chest wall, specifically in the area where the ribs attach to the breastbone (sternum). The pain may worsen with deep breathing, coughing, or physical activity. It can often mimic the symptoms of a heart attack.");
	        tree.insert("Pulmonaryembolism", pulmonaryembolismSymptoms,"Symptoms: Sudden onset of sharp chest pain, especially with deep breaths or coughing. Shortness of breath, rapid breathing, rapid heart rate, cough (may be bloody), lightheadedness, fainting, and sometimes leg swelling or tenderness (due to a blood clot in the leg).");
	        tree.insert("Pneumonia", pneumoniaSymptoms,"Symptoms: Cough (with phlegm that may be yellow, green, or bloody), chest pain that worsens with coughing or breathing, shortness of breath, rapid breathing, fever, chills, fatigue, sweating, and sometimes confusion (especially in older adults).");
	        tree.insert("Pleurisy", pleurisySymptoms, "Symptoms: Sharp or stabbing chest pain, particularly with breathing or coughing, shallow and rapid breathing, cough, fever, unexplained weight loss, and occasionally a dry cough.");
	        tree.insert("Gasreosophageal Reflux Disease", gasreosophagealrefluxdiseaseSymptoms,"Symptoms: Heartburn (burning sensation or discomfort in the chest), regurgitation (acidic or bitter-tasting fluid in the mouth), difficulty swallowing, chest pain that may mimic a heart attack, chronic cough, hoarseness, and feeling of a lump in the throat.");
	        tree.insert("Plantar Fasciitis", plantarfasciitisSymptoms,"Symptoms: Pain in the heel or bottom of the foot, especially when taking the first steps in the morning or after long periods of rest. The pain may subside during activity but worsen after prolonged standing or walking. Tenderness, inflammation, and aching in the arch of the foot may also be present.");
	        tree.insert("Athlete's Foot", athletesfootSymptoms, "Symptoms: Itching, burning, and stinging sensations between the toes or on the soles of the feet. The skin may appear red, scaly, and cracked. Blisters and ulcers can also develop. In severe cases, there may be pain, swelling, and a foul odor.");
	        tree.insert("GOUT", goutSymptoms,"Symptoms: Sudden, intense pain, often in the big toe but can affect other joints in the foot. The affected area may become swollen, red, warm, and extremely tender to the touch. Gout attacks typically occur at night and can last for several hours to a few days.");
	        
	        tree.insert("Patellofemoral Pain Syndrome", patellofemoralpainsyndromeSymptoms, "Symptoms: Dull, aching pain around or behind the kneecap, especially with activities that involve bending the knee or prolonged sitting with the knee bent. Pain may worsen when walking downhill or descending stairs. Swelling and a grinding or popping sensation may also be present.");
	        tree.insert("Patellar Tendinitis", patellartendinitisSymptoms,"Symptoms: Pain and tenderness below the kneecap, usually at the attachment point of the patellar tendon. Pain worsens with activities that involve jumping, running, or bending the knee against resistance. Stiffness, swelling, and aching in the knee may also be experienced.");
	        tree.insert("Chondromalacia Patellae", chondromalaciapatellaeSymptoms,"Symptoms: Pain and aching in the front of the knee, particularly behind the kneecap. Pain is typically aggravated by activities that involve bending the knee, such as squatting, kneeling, or climbing stairs. A grinding or cracking sensation when moving the knee may also be present.");
	        tree.insert("Hamstring Strain", hamstringstrainSymptoms,"Symptoms: Sudden sharp pain in the back of the thigh, often during physical activity. Swelling, tenderness, and bruising may develop. Walking, bending, or straightening the leg may be painful, and there may be a sensation of weakness or tightness in the hamstring muscles.");
	        tree.insert("Quadriceps Strain", quadricepsstrainSymptoms, "Symptoms: Sharp pain or a tearing sensation in the front of the thigh, typically during activities that involve running, jumping, or kicking. Swelling, tenderness, and bruising may occur. Walking, bending, or straightening the leg may be painful, and there may be difficulty in fully extending the knee.");
	        tree.insert("Femoral Hernia", femoralherniaSymptoms,"Symptoms: A bulge or lump in the upper thigh or groin area. Pain or discomfort may be present in the upper leg, groin, or lower abdomen, particularly during physical activity or when lifting heavy objects. The lump may disappear when lying down and reappear when standing or straining.");
	        tree.insert("Gastritis", gastritisSymptoms,"Symptoms: Abdominal pain or discomfort, often in the upper part of the abdomen, bloating, nausea, vomiting, loss of appetite, a feeling of fullness, and sometimes blood in the vomit or stool.");
	        tree.insert("Gastroesophegal Reflux Disease", gastroesophegalrefluxdiseaseSymptoms, "Symptoms: Heartburn, a burning sensation in the chest that often worsens after eating, regurgitation of stomach acid or food into the mouth, difficulty swallowing, sore throat, hoarseness, and coughing.");
	        tree.insert("Peptic Ulcer Disease", pepticulcerdiseaseSymptoms,"Symptoms: Burning or gnawing abdominal pain, often occurring between meals and during the night, feeling of fullness or bloating, belching, nausea, vomiting (which may contain blood), and unintended weight loss.");
	        tree.insert("Gallstones", gallstonesSymptoms,"Symptoms: Upper abdominal pain or discomfort, typically on the right side, that may radiate to the back or right shoulder. Pain can be severe and intermittent, often occurring after a meal. Other symptoms include nausea, vomiting, bloating, indigestion, and jaundice (yellowing of the skin and eyes).");
	        tree.insert("Gastroesophegal Reflux Disease", gastroesophegalRefluxdiseaseSymptoms, "Symptoms: Heartburn, a burning sensation in the chest that often worsens after eating, regurgitation of stomach acid or food into the mouth, difficulty swallowing, sore throat, hoarseness, and chronic coughing.");
	        tree.insert("Peptic Ulcer Disease", pepticUlcerdiseaseSymptoms,"Symptoms: Burning or gnawing pain in the upper abdomen, typically occurring between meals and during the night. The pain may improve temporarily with food or antacids. Other symptoms include nausea, vomiting (which may contain blood), feeling full quickly, bloating, and unintentional weight loss.");
	        tree.insert("Appendicitis", appendicitisSymptoms,"Symptoms: Pain that starts near the belly button and moves to the lower right side of the abdomen, tenderness and sharp pain in the lower right abdomen, loss of appetite, nausea, vomiting, low-grade fever, and sometimes constipation or diarrhea.");
	        tree.insert("Irritable Bowel Syndrome", irritablebowelsyndromeSymptoms, "Symptoms: Abdominal pain or discomfort, often in the lower abdomen, that may be relieved by bowel movements, changes in bowel habits (diarrhea, constipation, or a combination of both), bloating, excessive gas, mucus in the stool, and a feeling of incomplete bowel movement.");
	        tree.insert("Urinary Tract Infection", urinarytractinfectionSymptoms,"Symptoms: Lower abdominal pain or discomfort, frequent and urgent need to urinate, burning sensation during urination, cloudy or bloody urine, strong-smelling urine, and sometimes fever or chills. In severe cases, lower back pain may also be present.");
	        tree.insert("Lumbarstrain", lumbarstrainSymptoms,"Symptoms: Pain and stiffness in the lower back, usually caused by overstretching or tearing of the muscles and ligaments in the lower back. The pain may worsen with movement, bending, or lifting heavy objects. Muscle spasms and difficulty in maintaining certain postures may also occur.");
	        tree.insert("Kidney Stones", kidneystonesSymptoms, "Symptoms: Severe, cramp-like pain in the lower back or side, often radiating to the groin or abdomen. Painful urination, frequent urge to urinate, pink, red, or brown urine (due to blood in the urine), cloudy or foul-smelling urine, and occasionally nausea and vomiting.");
	        tree.insert("Herniated Disc", herniateddiscSymptoms,"Symptoms: Sharp or shooting pain in the lower back that may radiate down to the buttocks, hips, and legs (sciatica). Numbness or tingling sensation in the affected leg or foot, muscle weakness in the leg, difficulty in bending or straightening the back, and in severe cases, loss of bowel or bladder control.");
	        tree.insert("Sciatica", sciaticaSymptoms,"Symptoms: Radiating pain that starts in the lower back and travels down through the buttocks and one leg. The pain is often sharp, shooting, or burning in nature. Numbness, tingling, or weakness may also be present in the affected leg or foot.");
	        tree.insert("Degenerative Disc Disease", degenerativediscdiseaseSymptoms, "Symptoms: Chronic lower back pain that may worsen with sitting, bending, or lifting. Pain can range from mild to severe and may be accompanied by stiffness, muscle spasms, and decreased flexibility. In some cases, the pain may radiate to the buttocks and thighs.");
	        tree.insert("Spinal Stenosis", spinalstenosisSymptoms,"Symptoms: Gradual onset of lower back pain that worsens with walking or standing for long periods and improves with sitting or leaning forward. Numbness, tingling, or weakness in the legs may also occur. Some individuals may experience difficulty with balance and coordination.");
	        tree.insert("Muscle Strain", musclestrainSymptoms,"Symptoms: Sudden or gradual onset of pain and stiffness in the upper back region. The pain may worsen with movement, lifting, or certain postures. Muscle spasms and limited range of motion in the affected area may also occur.");
	        tree.insert("Thoracic Disc Herniation", thoracicdischerniationSymptoms, "Symptoms: Sharp or aching pain in the upper back that may radiate to the chest or abdomen. Numbness, tingling, or weakness in the chest, abdomen, or legs. In severe cases, difficulty with bowel or bladder control may be present.");
	        tree.insert("Osteoarthritis", osteoarthritisSymptoms,"Symptoms: Chronic, dull pain and stiffness in the upper back region. The pain may worsen with movement and may be accompanied by swelling or tenderness in the affected joints. Decreased range of motion and a crunching or grating sensation during movement are also common.");
	        
	    }
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == descBtn) {
			String selectedDisease = diseaseList.getSelectedValue();
			String diseaseDesc = tree.getDiseaseDescription(selectedDisease);
			DiseaseDetailsWindow ddw = new DiseaseDetailsWindow(diseaseDesc);
			ddw.setVisible(true);
			dispose();
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
