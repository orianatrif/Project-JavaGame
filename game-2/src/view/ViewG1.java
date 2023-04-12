package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ViewG1 extends JFrame {

    private JButton btnBack;
    private JButton check ;
	private JTextField textR1;
	private JTextField textR2;
	private JTextField textR21;
	private JTextField textR22;
	private JTextField textR23;
	private JTextField textR3;

    public ViewG1() {
        this.setBounds(100, 100, 450, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        btnBack = new JButton("back");
        btnBack.setBounds(341, 19, 90, 29);
        this.getContentPane().add(btnBack);

        JLabel lblCerinta = new JLabel("Complete the series:");
        lblCerinta.setBounds(19, 52, 137, 16);
        this.getContentPane().add(lblCerinta);

        JLabel Cerinta1 = new JLabel("7, 10, 8, 11, 9, 12, ..");
        Cerinta1.setBounds(40, 93, 137, 16);
        this.getContentPane().add(Cerinta1);

        textR1 = new JTextField();
        textR1.setBounds(180, 88, 29, 26);
        this.getContentPane().add(textR1);
        textR1.setColumns(10);

        textR2 = new JTextField();
        textR2.setColumns(10);
        textR2.setBounds(221, 88, 29, 26);
        this.getContentPane().add(textR2);

        JLabel Cerinta2 = new JLabel("CMM,   EOO,   GQQ ");
        Cerinta2.setBounds(40, 138, 123, 16);
        this.getContentPane().add(Cerinta2);

        textR21 = new JTextField();
        textR21.setColumns(10);
        textR21.setBounds(165, 133, 29, 26);
        this.getContentPane().add(textR21);

        textR22 = new JTextField();
        textR22.setColumns(10);
        textR22.setBounds(201, 133, 29, 26);
        this.getContentPane().add(textR22);

        textR23 = new JTextField();
        textR23.setColumns(10);
        textR23.setBounds(231, 133, 29, 26);
        this.getContentPane().add(textR23);

        JLabel lblKuu = new JLabel(", KUU");
        lblKuu.setBounds(268, 138, 44, 16);
        this.getContentPane().add(lblKuu);

        JLabel Cerinta1_1 = new JLabel("2, 6, 18, 54, ...");
        Cerinta1_1.setBounds(40, 182, 104, 16);
        this.getContentPane().add(Cerinta1_1);

        textR3 = new JTextField();
        textR3.setColumns(10);
        textR3.setBounds(145, 177, 40, 26);
        this.getContentPane().add(textR3);

        check = new JButton("CHECK");
        check.setBounds(275, 214, 117, 29);
        this.getContentPane().add(check);
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }

    public int getTextR1() {
       return Integer.parseInt(textR1.getText());
    }

    public void setTextR1(JTextField textR1) {
        this.textR1 = textR1;
    }

    public int getTextR2() {
       return Integer.parseInt(textR2.getText());
    }

    public void setTextR2(JTextField textR2) {
        this.textR2 = textR2;
    }

    public String getTextR21() {
        return textR21.getText();
    }

    public void setTextR21(JTextField textR21) {
        this.textR21 = textR21;
    }

    public String getTextR22() {
        return textR22.getText();
    }

    public void setTextR22(JTextField textR22) {
        this.textR22 = textR22;
    }

    public String getTextR23() {
       return textR23.getText();
    }

    public void setTextR23(JTextField textR23) {
        this.textR23 = textR23;
    }

    public int getTextR3() {
        return Integer.parseInt(textR3.getText());
    }

    public void setTextR3(JTextField textR3) {
        this.textR3 = textR3;
    }


    public void addG1toMain( ActionListener action){
        btnBack.addActionListener(action);
    }

    public void addcheckG1( ActionListener action){
        check.addActionListener(action);
    }

    public void showValidationMessage( String message) {
        JOptionPane.showMessageDialog(this, message);
        refreshEx1();
    }

    public void refreshEx1(){
        textR1.setText(null);
        textR2.setText(null);
        textR21.setText(null);
        textR22.setText(null);
        textR23.setText(null);
        textR3.setText(null);
    }
}
