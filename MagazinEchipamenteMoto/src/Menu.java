public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        listaMenu = new javax.swing.JMenu();
        fileMenuIesire = new javax.swing.JMenuItem();
        jacheteMenu = new javax.swing.JMenu();
        jacheteMenuLista = new javax.swing.JMenuItem();
        castiMenu = new javax.swing.JMenu();
        castiMenuList = new javax.swing.JMenuItem();
        manusiMenu = new javax.swing.JMenu();
        manusiMenuList = new javax.swing.JMenuItem();
        gheteMenu = new javax.swing.JMenu();
        incaltaminteMenuList = new javax.swing.JMenuItem();
        intercomMenu = new javax.swing.JMenu();
        intercomMenuList = new javax.swing.JMenuItem();
        suportMenu = new javax.swing.JMenu();
        suportMenuList = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MagazinEchipamenteMoto");
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuBackground.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        listaMenu.setText("File");

        fileMenuIesire.setText("Exit");
        fileMenuIesire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuIesireActionPerformed(evt);
            }
        });
        listaMenu.add(fileMenuIesire);

        jMenuBar1.add(listaMenu);

        jacheteMenu.setText("Jachete");

        jacheteMenuLista.setText("Lista");
        jacheteMenuLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jacheteMenuListaActionPerformed(evt);
            }
        });
        jacheteMenu.add(jacheteMenuLista);

        jMenuBar1.add(jacheteMenu);

        castiMenu.setText("Casti");

        castiMenuList.setText("Lista");
        castiMenuList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                castiMenuListActionPerformed(evt);
            }
        });
        castiMenu.add(castiMenuList);

        jMenuBar1.add(castiMenu);

        manusiMenu.setText("Manusi");

        manusiMenuList.setText("Lista");
        manusiMenuList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manusiMenuListActionPerformed(evt);
            }
        });
        manusiMenu.add(manusiMenuList);

        jMenuBar1.add(manusiMenu);

        gheteMenu.setText("Incaltaminte");

        incaltaminteMenuList.setText("Lista");
        incaltaminteMenuList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incaltaminteMenuListActionPerformed(evt);
            }
        });
        gheteMenu.add(incaltaminteMenuList);

        jMenuBar1.add(gheteMenu);

        intercomMenu.setText("Intercom");

        intercomMenuList.setText("Lista");
        intercomMenuList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intercomMenuListActionPerformed(evt);
            }
        });
        intercomMenu.add(intercomMenuList);

        jMenuBar1.add(intercomMenu);

        suportMenu.setText("Suport Telefon");

        suportMenuList.setText("Lista");
        suportMenuList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suportMenuListActionPerformed(evt);
            }
        });
        suportMenu.add(suportMenuList);

        jMenuBar1.add(suportMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileMenuIesireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuIesireActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fileMenuIesireActionPerformed

    private void jacheteMenuListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jacheteMenuListaActionPerformed
        new JacketWindow().setVisible(true);
    }//GEN-LAST:event_jacheteMenuListaActionPerformed

    private void castiMenuListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_castiMenuListActionPerformed
        new HelmetWindow().setVisible(true);
    }//GEN-LAST:event_castiMenuListActionPerformed

    private void manusiMenuListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manusiMenuListActionPerformed
        new GloveWindow().setVisible(true);
    }//GEN-LAST:event_manusiMenuListActionPerformed

    private void incaltaminteMenuListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incaltaminteMenuListActionPerformed
        new BootsWindow().setVisible(true);
    }//GEN-LAST:event_incaltaminteMenuListActionPerformed

    private void intercomMenuListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intercomMenuListActionPerformed
        new IntercomWindow().setVisible(true);
    }//GEN-LAST:event_intercomMenuListActionPerformed

    private void suportMenuListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suportMenuListActionPerformed
        new MountWindow().setVisible(true);
    }//GEN-LAST:event_suportMenuListActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu castiMenu;
    private javax.swing.JMenuItem castiMenuList;
    private javax.swing.JMenuItem fileMenuIesire;
    private javax.swing.JMenu gheteMenu;
    private javax.swing.JMenuItem incaltaminteMenuList;
    private javax.swing.JMenu intercomMenu;
    private javax.swing.JMenuItem intercomMenuList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jacheteMenu;
    private javax.swing.JMenuItem jacheteMenuLista;
    private javax.swing.JMenu listaMenu;
    private javax.swing.JMenu manusiMenu;
    private javax.swing.JMenuItem manusiMenuList;
    private javax.swing.JMenu suportMenu;
    private javax.swing.JMenuItem suportMenuList;
    // End of variables declaration//GEN-END:variables
}
