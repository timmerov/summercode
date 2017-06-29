import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EssayReader extends JFrame{
	  private JTextArea original, words;
	  private JButton go;
	  
	  public EssayReader()
	  {
	    super("Lipogrammer");

	    //setJMenuBar(new LipogrammerMenu(this));
	    setupGui();
	    
	    original.setText("Type or paste your text here or load it from a file. Hit enter in the banned letter box in order to get the program to refresh.");
	  }

	  private void setupGui()
	  {
	    original = new JTextArea(10, 20);
	    original.setLineWrap(true);
	    original.setWrapStyleWord(true);
	    //original.addCaretListener(this);
	    JScrollPane originalPane = new JScrollPane(original,
	              ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
	              ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);


	    words = new JTextArea(10, 10);
	    words.setEditable(false);
	    words.setBackground(Color.LIGHT_GRAY);
	    JScrollPane wordsPane = new JScrollPane(words,
	              ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
	              ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

	    go = new JButton("Refresh");
	    //go.addActionListener(this);
	    
	    

	    Box box1 = Box.createVerticalBox();
	    box1.add(Box.createVerticalStrut(10));
	    box1.add(originalPane);
	    box1.add(Box.createVerticalStrut(10));
	    box1.add(Box.createVerticalStrut(5));
	    box1.add(Box.createHorizontalStrut(5));
	    Box box2 = Box.createVerticalBox();
	    box2.add(Box.createVerticalStrut(10));
	    box2.add(wordsPane);
	    box2.add(Box.createVerticalStrut(40));
	    Box box3 = Box.createHorizontalBox();
	    box3.add(box1);
	    box3.add(Box.createHorizontalStrut(20));
	    box3.add(box2);
	    box3.add(Box.createHorizontalStrut(10));
	    
	    Container c = getContentPane();
	    c.setLayout (new FlowLayout());
	    c.add(box3);
	  }
	  
	 public static void main(String[] args)
	  {
	    EssayReader w = new EssayReader();
	    w.setBounds(100, 100, 480, 480);
	    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    w.setVisible(true);
	  }
}
