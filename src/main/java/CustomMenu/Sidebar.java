/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CustomMenu;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author REYMARK
 */
public class Sidebar extends javax.swing.JPanel {

    /**
     * Creates new form Sidebar
     */
    public Sidebar() {
        setOpaque(false);
        initComponents();
        init();
    }
    
    private void init(){
        listMenu1.addItem(new ModelSidebar("images/1", "Dashboard", ModelSidebar.MenuType.MENU));
        listMenu1.addItem(new ModelSidebar("images/2", "Users", ModelSidebar.MenuType.MENU));
        listMenu1.addItem(new ModelSidebar("images/33", "Candidates", ModelSidebar.MenuType.MENU));
        listMenu1.addItem(new ModelSidebar("images/4", "Voting Results", ModelSidebar.MenuType.MENU));
        listMenu1.addItem(new ModelSidebar("images/5", "Settings", ModelSidebar.MenuType.MENU));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        listMenu1 = new CustomMenu.ListMenu<>();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("[ LOGO GOES HERE ]");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        listMenu1.setOpaque(false);
        add(listMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 290));
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D graphics = (Graphics2D) grphcs;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gradient = new GradientPaint(0, 0, Color.decode("#1C1C39"), 0, getHeight(), Color.decode("#1C1C39"));
        graphics.setPaint(gradient);
        graphics.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        graphics.fillRect(getWidth()-20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private CustomMenu.ListMenu<String> listMenu1;
    // End of variables declaration//GEN-END:variables
}