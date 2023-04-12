package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView extends JFrame {

    private JFrame frame;
	private JTextField textTokens;
	private JTextField textBadges;
	private JTextField textRank;
    private JButton btnGame1;
    private JButton btnGame2;
    private JButton btnGame3;
    private JButton btnGame4;
    private JLabel lblTokens;
    private JLabel lblBadges;
    private JLabel lblRank;

    public MainView(){
       // frame = new JFrame();
		this.setBounds(100, 100, 568, 419);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

		JTextPane txtpnGameDemo = new JTextPane();
		txtpnGameDemo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtpnGameDemo.setText("Game Demo");
		txtpnGameDemo.setBounds(204, 45, 125, 31);
		this.getContentPane().add(txtpnGameDemo);

		btnGame1 = new JButton("Game 1");
		btnGame1.setBounds(41, 136, 117, 29);
		this.getContentPane().add(btnGame1);

		btnGame2 = new JButton("Game 2");
		btnGame2.setBounds(41, 188, 117, 29);
		this.getContentPane().add(btnGame2);

		lblTokens = new JLabel("Tokens");
		lblTokens.setBounds(302, 141, 61, 16);
		this.getContentPane().add(lblTokens);

		lblBadges = new JLabel("Badges");
		lblBadges.setBounds(302, 193, 61, 16);
		this.getContentPane().add(lblBadges);

		lblRank = new JLabel("Rank");
		lblRank.setBounds(302, 254, 61, 16);
		this.getContentPane().add(lblRank);

		textTokens = new JTextField();
		textTokens.setBounds(381, 136, 61, 26);
		this.getContentPane().add(textTokens);
		textTokens.setColumns(10);

		textBadges = new JTextField();
		textBadges.setColumns(10);
		textBadges.setBounds(381, 188, 61, 26);
		this.getContentPane().add(textBadges);

		textRank = new JTextField();
		textRank.setColumns(10);
		textRank.setBounds(381, 249, 61, 26);
		this.getContentPane().add(textRank);

         this.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JTextField getTextTokens() {
        return textTokens;
    }


    public void setTextTokens(int textTokens) {
        this.textTokens.setText(String.valueOf(textTokens));
    }

    public JTextField getTextBadges() {
        return textBadges;
    }

    public void setTextBadges(int textBadges) {
        this.textBadges.setText(String.valueOf(textBadges));
    }

    public JTextField getTextRank() {
        return textRank;
    }

    public void setTextRank(int textRank) {
        this.textRank.setText(String.valueOf(textRank));
    }

    public JButton getBtnGame1() {
        return btnGame1;
    }

    public void setBtnGame1(JButton btnGame1) {
        this.btnGame1 = btnGame1;
    }

    public JButton getBtnGame2() {
        return btnGame2;
    }

    public void setBtnGame2(JButton btnGame2) {
        this.btnGame2 = btnGame2;
    }

    public JLabel getLblTokens() {
        return lblTokens;
    }

    public void setLblTokens(JLabel lblTokens) {
        this.lblTokens = lblTokens;
    }

    public JLabel getLblBadges() {
        return lblBadges;
    }

    public void setLblBadges(JLabel lblBadges) {
        this.lblBadges = lblBadges;
    }

    public JLabel getLblRank() {
        return lblRank;
    }

    public void setLblRank(JLabel lblRank) {
        this.lblRank = lblRank;
    }

    public void addFromMainToG1( ActionListener action){
        btnGame1.addActionListener(action);
    }
    public void addFromMainToG2( ActionListener action){
        btnGame2.addActionListener(action);
    }
    public void showErrorRank( String message) {
        JOptionPane.showMessageDialog(this, message);

    }


}
