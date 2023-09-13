import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NoteBook extends JFrame implements ActionListener , WindowListener{
    JTextArea jta = new JTextArea();//creating out text area
    File fnameContainer; 

  //Creating the constructor
    public NoteBook(){
      //font of our text
      Font font = new Font("Arial",Font.PLAIN,15);

      //adding the containt pane
        Container con = getContentPane();
        JMenuBar jmb = new JMenuBar();//created the menubar
      //items in the menubar
        JMenu jmfile = new JMenu("File");
        JMenu jmedit = new JMenu("Edit");
        JMenu jmhelp=new JMenu("Help");
      //setting border for the menubar
        con.setLayout(new BorderLayout());
      //adding the scroll pane in the container frame 
        JScrollPane sbrtext = new JScrollPane(jta);
        sbrtext.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sbrtext.setVisible(true);
         jta.setFont(font);
         jta.setLineWrap(true);
         jta.setWrapStyleWord(true);
                       
         con.add(sbrtext);
         //options inside the File
         createMenuItem(jmfile,"New");
         createMenuItem(jmfile,"Open");
         createMenuItem(jmfile,"save");
         //options inside the Edit
         createMenuItem(jmedit,"cut");
         createMenuItem(jmedit,"copy");
         createMenuItem(jmedit,"paste");
         //option inside Help
         createMenuItem(jmhelp,"About");

      //Adding the menubar options to menubar
         jmb.add(jmfile);
         jmb.add(jmedit);
         jmb.add(jmhelp);
         
         setJMenuBar(jmb);
         
         setIconImage(Toolkit.getDefaultToolkit().getImage("notepad.gif"));
         addWindowListener(this);
         setSize(500,500);
         setTitle("Untitled.txt - NoteBook");
         setVisible(true);
    }
      
