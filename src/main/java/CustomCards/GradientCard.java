/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CustomCards;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author REYMARK
 */
public class GradientCard extends javax.swing.JPanel {
    
    /**
     * Creates new form Card
     */

    private Color color1;
    private Color color2;
    
    public GradientCard() {
        initComponents();
        setOpaque(false);
        color1=Color.BLACK;
        color2=Color.WHITE;
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    
    public void setData(ModelCard data){
        cardIcon.setIcon(data.getIcon());
        cardTitle.setText(data.getTitle());
        cardValue.setText(data.getValues());
        cardDescription.setText(data.getDescription());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardIcon = new javax.swing.JLabel();
        cardTitle = new javax.swing.JLabel();
        cardValue = new javax.swing.JLabel();
        cardDescription = new javax.swing.JLabel();

        cardIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png"))); // NOI18N

        cardTitle.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cardTitle.setForeground(new java.awt.Color(255, 255, 255));
        cardTitle.setText("Title");

        cardValue.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        cardValue.setForeground(new java.awt.Color(255, 255, 255));
        cardValue.setText("Value");

        cardDescription.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cardDescription.setForeground(new java.awt.Color(255, 255, 255));
        cardDescription.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardDescription)
                    .addComponent(cardValue)
                    .addComponent(cardTitle)
                    .addComponent(cardIcon))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(cardIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardDescription)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D graphics = (Graphics2D) grphcs;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gradient = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        graphics.setPaint(gradient);
        graphics.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        graphics.setColor(new Color(255,255,255, 50));
        graphics.fillOval(getWidth()-(getHeight()/2), 10, getHeight(), getHeight());
        graphics.fillOval(getWidth()-(getHeight()/2)-20, getHeight()/2 + 20, getHeight(), getHeight());
        super.paintComponent(grphcs);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardDescription;
    private javax.swing.JLabel cardIcon;
    private javax.swing.JLabel cardTitle;
    private javax.swing.JLabel cardValue;
    // End of variables declaration//GEN-END:variables
}
