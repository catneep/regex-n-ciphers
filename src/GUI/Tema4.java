/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author havil
 */
public class Tema4 extends javax.swing.JPanel {

    /**
     * Creates new form Tema4
     */
    public Tema4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneInput = new javax.swing.JPanel();
        paneInputTitle = new javax.swing.JPanel();
        lblInputTitle = new javax.swing.JLabel();
        paneOptions = new javax.swing.JPanel();
        lblAlgo = new javax.swing.JLabel();
        cbAlgo = new javax.swing.JComboBox<>();
        lblKeyA = new javax.swing.JLabel();
        txtKey = new javax.swing.JTextField();
        paneInputTxt = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        paneCipher = new javax.swing.JPanel();
        btnCipher = new javax.swing.JButton();
        paneOutput = new javax.swing.JPanel();
        paneOutputTitle = new javax.swing.JPanel();
        lblInputTitle1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        paneOutputTxt = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(770, 470));
        setMinimumSize(new java.awt.Dimension(770, 470));
        setLayout(new java.awt.GridLayout(1, 2));

        paneInput.setMaximumSize(new java.awt.Dimension(385, 470));
        paneInput.setMinimumSize(new java.awt.Dimension(385, 470));
        paneInput.setPreferredSize(new java.awt.Dimension(385, 470));
        paneInput.setRequestFocusEnabled(false);
        paneInput.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        paneInputTitle.setMaximumSize(new java.awt.Dimension(385, 32));
        paneInputTitle.setMinimumSize(new java.awt.Dimension(385, 32));
        paneInputTitle.setPreferredSize(new java.awt.Dimension(385, 32));

        lblInputTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInputTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInputTitle.setText("Entrada");
        paneInputTitle.add(lblInputTitle);

        paneInput.add(paneInputTitle);

        paneOptions.setMaximumSize(new java.awt.Dimension(385, 60));
        paneOptions.setMinimumSize(new java.awt.Dimension(385, 60));
        paneOptions.setPreferredSize(new java.awt.Dimension(385, 60));
        paneOptions.setLayout(new java.awt.GridLayout(2, 2));

        lblAlgo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAlgo.setText("Algoritmo");
        lblAlgo.setPreferredSize(new java.awt.Dimension(54, 26));
        paneOptions.add(lblAlgo);

        cbAlgo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caesar", "Grupos", "Doble" }));
        cbAlgo.setPreferredSize(new java.awt.Dimension(72, 26));
        paneOptions.add(cbAlgo);

        lblKeyA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKeyA.setText("Clave");
        lblKeyA.setPreferredSize(new java.awt.Dimension(29, 26));
        paneOptions.add(lblKeyA);
        paneOptions.add(txtKey);

        paneInput.add(paneOptions);

        paneInputTxt.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        paneInputTxt.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        paneInputTxt.setMaximumSize(new java.awt.Dimension(385, 300));
        paneInputTxt.setMinimumSize(new java.awt.Dimension(385, 300));
        paneInputTxt.setPreferredSize(new java.awt.Dimension(385, 300));

        txtInput.setColumns(20);
        txtInput.setRows(5);
        txtInput.setMaximumSize(new java.awt.Dimension(385, 300));
        txtInput.setMinimumSize(new java.awt.Dimension(385, 300));
        txtInput.setPreferredSize(new java.awt.Dimension(385, 300));
        paneInputTxt.setViewportView(txtInput);

        paneInput.add(paneInputTxt);

        paneCipher.setMaximumSize(new java.awt.Dimension(385, 32));
        paneCipher.setMinimumSize(new java.awt.Dimension(385, 32));
        paneCipher.setPreferredSize(new java.awt.Dimension(385, 32));

        btnCipher.setText("Cifrar");
        btnCipher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCipherActionPerformed(evt);
            }
        });
        paneCipher.add(btnCipher);

        paneInput.add(paneCipher);

        add(paneInput);

        paneOutput.setMaximumSize(new java.awt.Dimension(385, 470));
        paneOutput.setMinimumSize(new java.awt.Dimension(385, 470));
        paneOutput.setPreferredSize(new java.awt.Dimension(385, 470));

        paneOutputTitle.setMaximumSize(new java.awt.Dimension(385, 32));
        paneOutputTitle.setMinimumSize(new java.awt.Dimension(385, 32));
        paneOutputTitle.setPreferredSize(new java.awt.Dimension(385, 32));

        lblInputTitle1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInputTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInputTitle1.setText("Salida");
        paneOutputTitle.add(lblInputTitle1);

        paneOutput.add(paneOutputTitle);

        jSeparator1.setEnabled(false);
        jSeparator1.setMaximumSize(new java.awt.Dimension(385, 58));
        jSeparator1.setMinimumSize(new java.awt.Dimension(385, 53));
        jSeparator1.setPreferredSize(new java.awt.Dimension(385, 53));
        paneOutput.add(jSeparator1);

        jSeparator2.setMaximumSize(new java.awt.Dimension(385, 2));
        jSeparator2.setMinimumSize(new java.awt.Dimension(385, 2));
        jSeparator2.setPreferredSize(new java.awt.Dimension(385, 2));
        paneOutput.add(jSeparator2);

        paneOutputTxt.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        paneOutputTxt.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        paneOutputTxt.setMaximumSize(new java.awt.Dimension(385, 300));
        paneOutputTxt.setMinimumSize(new java.awt.Dimension(385, 300));
        paneOutputTxt.setPreferredSize(new java.awt.Dimension(385, 300));

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        txtOutput.setMaximumSize(new java.awt.Dimension(385, 300));
        txtOutput.setMinimumSize(new java.awt.Dimension(385, 300));
        txtOutput.setPreferredSize(new java.awt.Dimension(385, 300));
        paneOutputTxt.setViewportView(txtOutput);

        paneOutput.add(paneOutputTxt);

        add(paneOutput);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCipherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCipherActionPerformed
        String txt = txtInput.getText();
        String key = txtKey.getText();
        
        if (txt.equals("") || key.equals(""))
            return;
        
        String cipher = "";
        switch(cbAlgo.getSelectedIndex()){
            case 0: //Caesar
                try{
                    int off = Integer.parseInt(key);
                    cipher = Logic.Tema4.Caesar(txt, off);
                } catch (NumberFormatException e){
                    cipher = "La llave en cifrado Cesar debe ser un número entero";
                } finally {
                    break;
                }
            case 1: //Grupos
                cipher = Logic.Tema4.Groups(txt, key);
                
                break;
            case 2: //Doble
                cipher = Logic.Tema4.DoubleTrans(txt, key, key);
                
                break;
            default:
                cipher = txt;
        }
        
        txtOutput.setText(cipher);
        
    }//GEN-LAST:event_btnCipherActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCipher;
    private javax.swing.JComboBox<String> cbAlgo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAlgo;
    private javax.swing.JLabel lblInputTitle;
    private javax.swing.JLabel lblInputTitle1;
    private javax.swing.JLabel lblKeyA;
    private javax.swing.JPanel paneCipher;
    private javax.swing.JPanel paneInput;
    private javax.swing.JPanel paneInputTitle;
    private javax.swing.JScrollPane paneInputTxt;
    private javax.swing.JPanel paneOptions;
    private javax.swing.JPanel paneOutput;
    private javax.swing.JPanel paneOutputTitle;
    private javax.swing.JScrollPane paneOutputTxt;
    private javax.swing.JTextArea txtInput;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
