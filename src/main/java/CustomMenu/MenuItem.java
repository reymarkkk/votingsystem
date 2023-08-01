/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CustomMenu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author REYMARK
 */
public class MenuItem extends javax.swing.JPanel {
    
    private boolean selected;
    /**
     * Creates new form MenuItem
     * @param data
     */
    public MenuItem(ModelSidebar data) {
        initComponents();
        if(null==data.getType()) {
            menuName.setText(" ");
        } else switch (data.getType()) {
            case MENU -> {
                iconLabel.setIcon(data.toIcon());
                menuName.setText(data.getName());
            }
            case TITLE -> {
                iconLabel.setText(data.getName());
                iconLabel.setFont(new Font("Poppins", 1, 12));
                menuName.setVisible(false);
            }
            case EMPTY -> {
            }
            default -> menuName.setText(" ");
        }
    }
    
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconLabel = new javax.swing.JLabel();
        menuName = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(175, 45));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(iconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 45));

        menuName.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        menuName.setForeground(new java.awt.Color(255, 255, 255));
        add(menuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 140, 45));
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        if(selected){
            Graphics2D graphics = (Graphics2D) grphcs;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            graphics.setColor(new Color(255, 255, 255, 80));
            graphics.fillRoundRect(10, 0, getWidth()-20, getHeight(), 5, 5);
        }
        super.paintChildren(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel menuName;
    // End of variables declaration//GEN-END:variables
}
