package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import java.awt.event.ActionListener;

public class View extends JFrame {

    private JFrame frame;
    private JPanel panel;
    private JTextField polinom1;
    private JTextField polinom2;
    private JTextField rez;
    private JLabel nrPoli1;
    private JLabel nrPoli2;
    private JLabel titlu;
    private JLabel rezultat;
    private JButton add;
    private JButton sub;
    private JButton multiply;
    private JButton division;
    private JButton derivative;
    private JButton integration;
    private JButton clear;

    public View() {
        setTitle("Calculator Polinoame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 400);

        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);

        titlu = new JLabel("CALCULATOR DE POLINOAME");
        titlu.setBounds(70, 2, 200, 60);
        titlu.setForeground(Color.BLUE);
        panel.add(titlu);

        nrPoli1 = new JLabel("Polinom 1:");
        nrPoli1.setBounds(10, 55, 60, 23);
        panel.add(nrPoli1);

        polinom1 = new JTextField();
        polinom1.setBounds(72, 55, 150, 23);
        panel.add(polinom1);
        polinom1.setColumns(10);

        nrPoli2 = new JLabel("Polinom 2:");
        nrPoli2.setBounds(10, 90, 60, 23);
        panel.add(nrPoli2);

        polinom2 = new JTextField();
        polinom2.setBounds(72, 85, 150, 23);
        panel.add(polinom2);
        polinom2.setColumns(10);

        add = new JButton("Adunare");
        add.setBounds(100, 150, 90, 23);
        panel.add(add);

        sub = new JButton("Scadere");
        sub.setBounds(100, 180, 90, 23);
        panel.add(sub);

        multiply = new JButton("Inmultire");
        multiply.setBounds(100, 210, 90, 23);
        panel.add(multiply);

        division = new JButton("Impartire");
        division.setBounds(100, 240, 90, 23);
        panel.add(division);

        clear = new JButton("Clear");
        clear.setBounds(100, 270, 90, 23);
        panel.add(clear);

        derivative = new JButton("Derivare");
        derivative.setBounds(200, 195, 90, 23);
        panel.add(derivative);

        integration = new JButton("Integrare");
        integration.setBounds(200, 235, 90, 23);
        panel.add(integration);

        rezultat = new JLabel("REZULTAT");
        rezultat.setBounds(55, 290, 150, 60);
        rezultat.setForeground(Color.BLUE);
        panel.add(rezultat);

        rez = new JTextField();
        rez.setBounds(135, 308, 180, 23);
        panel.add(rez);

    }

    public  String getPolinom1Input() {
        return this.polinom1.getText();
    }

    public String getPolinom2Input() {
        return this.polinom2.getText();
    }

    public void clearButtonListener(ActionListener actionListener) {
        this.clear.addActionListener(actionListener);
    }

    public void clearALL() {
        polinom1.setText(null);
        polinom2.setText(null);
        rez.setText(null);
    }

    public void setResultLabel(String input)
    {
        this.rez.setText(input);
    }

    public void addButtonListener(ActionListener actionListener) {
        this.add.addActionListener(actionListener);
    }

    public void subButtonListener(ActionListener actionListener) {
        this.sub.addActionListener(actionListener);
    }

    public void multiplyButtonListener(ActionListener actionListener) {
        this.multiply.addActionListener(actionListener);
    }

    public void divisionButtonListener(ActionListener actionListener) {
        this.division.addActionListener(actionListener);
    }

    public void derivativeButtonListener(ActionListener actionListener) {
        this.derivative.addActionListener(actionListener);
    }

    public void integrationButtonListener(ActionListener actionListener) {
        this.integration.addActionListener(actionListener);
    }


}
