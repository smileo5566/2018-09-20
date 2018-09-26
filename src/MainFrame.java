import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private java.awt.Container Cp;
    private JPasswordField Pwfield = new JPasswordField();
    private JLabel Jlb1 = new JLabel(" ");
    private JPanel Jpn1 = new JPanel(new GridLayout(4,3,3,3));
    private JButton Jbtn0 = new JButton("0");
    private JButton Jbtn1 = new JButton("1");
    private JButton Jbtn2 = new JButton("2");
    private JButton Jbtn3 = new JButton("3");
    private JButton Jbtn4 = new JButton("4");
    private JButton Jbtn5 = new JButton("5");
    private JButton Jbtn6 = new JButton("6");
    private JButton Jbtn7 = new JButton("7");
    private JButton Jbtn8 = new JButton("8");
    private JButton Jbtn9 = new JButton("9");
    private JButton JbtnSub = new JButton("Sub");
    private JButton JbtnEx = new JButton("Ex");



    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(200,200,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Cp = this.getContentPane();
        Cp.setLayout(new BorderLayout(3,3));
        Cp.add(Pwfield, BorderLayout.NORTH);
        Cp.add(Jlb1, BorderLayout.SOUTH);
        Cp.add(Jpn1,BorderLayout.CENTER);
        Pwfield.setFont(new Font(null,Font.BOLD,50));
        Jlb1.setFont(new Font(null, Font.PLAIN,50));
        Jbtn0.setFont(new Font(null, Font.PLAIN,70));
        Jbtn1.setFont(new Font(null, Font.PLAIN,70));
        Jbtn2.setFont(new Font(null, Font.PLAIN,70));
        Jbtn3.setFont(new Font(null, Font.PLAIN,70));
        Jbtn4.setFont(new Font(null, Font.PLAIN,70));
        Jbtn5.setFont(new Font(null, Font.PLAIN,70));
        Jbtn6.setFont(new Font(null, Font.PLAIN,70));
        Jbtn7.setFont(new Font(null, Font.PLAIN,70));
        Jbtn8.setFont(new Font(null, Font.PLAIN,70));
        Jbtn9.setFont(new Font(null, Font.PLAIN,70));
        JbtnSub.setFont(new Font(null, Font.PLAIN,70));
        JbtnEx.setFont(new Font(null, Font.PLAIN,70));
        Jpn1.add(Jbtn7);
        Jpn1.add(Jbtn8);
        Jpn1.add(Jbtn9);
        Jpn1.add(Jbtn4);
        Jpn1.add(Jbtn5);
        Jpn1.add(Jbtn6);
        Jpn1.add(Jbtn1);
        Jpn1.add(Jbtn2);
        Jpn1.add(Jbtn3);
        Jpn1.add(Jbtn0);
        Jpn1.add(JbtnSub);
        Jpn1.add(JbtnEx);
        JbtnEx.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Jbtn0.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Pwfield.setText(Pwfield.getText()+"0");
            }
        });
        Jbtn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Pwfield.setText(Pwfield.getText()+"1");
            }
        });
        Jbtn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Pwfield.setText(Pwfield.getText()+"2");
            }
        });
        Jbtn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Pwfield.setText(Pwfield.getText()+"3");
            }
        });
        Jbtn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Pwfield.setText(Pwfield.getText()+"4");
            }
        });
        Jbtn5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Pwfield.setText(Pwfield.getText()+"5");
            }
        });
        Jbtn6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Pwfield.setText(Pwfield.getText()+"6");
            }
        });
        Jbtn7.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Pwfield.setText(Pwfield.getText()+"7");
            }
        });
        Jbtn8.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Pwfield.setText(Pwfield.getText()+"8");
            }
        });
        Jbtn9.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Pwfield.setText(Pwfield.getText()+"9");
            }
        });
        JbtnSub.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Pwfield.getText().equals("5487487")){
                    Jlb1.setText("Success!");
                }else {
                    Jlb1.setText("Fail!");
                }
            }
        });



    }
}

