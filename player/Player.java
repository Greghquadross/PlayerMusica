package player;

import entidades.Musica;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import playlist.NewPlay;
import playlist.PlaylistBase;

/**
 *
 * @author GreghQuadross
 */
public class Player extends javax.swing.JFrame implements InterfacePlayerBar {

    public Player() {
        initComponents();
        AdicionaPlaylists();
        listaDeMusicas();
        SelecionarMusicas();

    }
    ArrayList<NewPlay> playlists = new ArrayList();
    DefaultListModel<String> lista = new DefaultListModel<>();

    int listaMusica = 0;
    int musica = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeMusica = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        btnProxima = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        lblVolume = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstGeneros = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btnAumentaVolume = new javax.swing.JButton();
        btnDiminuiVolume = new javax.swing.JButton();
        lblNmrVolume = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeMusica.setBackground(new java.awt.Color(255, 255, 255));
        lblNomeMusica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNomeMusica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeMusica.setText("Nome da música - Autor (genero)");
        lblNomeMusica.setToolTipText("");

        btnPlay.setText("Play");
        btnPlay.setToolTipText("");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        btnProxima.setText("Próxima");
        btnProxima.setToolTipText("Próxima música");
        btnProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximaActionPerformed(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.setToolTipText("Voltar à música anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        lblVolume.setText("Volume");

        lstGeneros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstGenerosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstGeneros);

        jLabel2.setText("Playlists");

        btnAumentaVolume.setText("+");
        btnAumentaVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentaVolumeActionPerformed(evt);
            }
        });

        btnDiminuiVolume.setText("-");
        btnDiminuiVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiminuiVolumeActionPerformed(evt);
            }
        });

        lblNmrVolume.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNmrVolume.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel2))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnterior)
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDiminuiVolume)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblNmrVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAumentaVolume))
                                    .addComponent(btnPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProxima))
                    .addComponent(lblNomeMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblNomeMusica)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnProxima)
                            .addComponent(btnAnterior)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlay)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVolume)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDiminuiVolume)
                    .addComponent(btnAumentaVolume)
                    .addComponent(lblNmrVolume))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        if (btnPlay.getText() == "Play") {
            btnPlay.setText("Pause");
        } else if (btnPlay.getText() == "Pause") {
            btnPlay.setText("Play");
        }
    }//GEN-LAST:event_btnPlayActionPerformed
    private void btnAumentaVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentaVolumeActionPerformed
        int volume = Integer.parseInt(lblNmrVolume.getText());
        if (volume >= 10) {
            return;
        } else {
            volume += 1;
        }
        lblNmrVolume.setText(String.valueOf(volume));
    }//GEN-LAST:event_btnAumentaVolumeActionPerformed
    private void btnDiminuiVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiminuiVolumeActionPerformed
        int volume = Integer.parseInt(lblNmrVolume.getText());
        if (volume <= 0) {
            return;
        } else {
            volume -= 1;
        }
        lblNmrVolume.setText(String.valueOf(volume));
    }//GEN-LAST:event_btnDiminuiVolumeActionPerformed
    private void lstGenerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstGenerosMouseClicked
        listaMusica = lstGeneros.getSelectedIndex();
        musica = 0;
        SelecionarMusicas();
    }//GEN-LAST:event_lstGenerosMouseClicked

    private void btnProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximaActionPerformed
        MudarPlayEMusica(true);
    }//GEN-LAST:event_btnProximaActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        MudarPlayEMusica(false);
    }//GEN-LAST:event_btnAnteriorActionPerformed
    public void SelecionarMusicas() {
        Musica aux = playlists.get(listaMusica).getMusica(musica);
        lblNomeMusica.setText(aux.getNome() 
                    + " - " + aux.getAutor().getAutor() 
                      + "(" + aux.getGenero() 
                        + ")");
    }

    public void MudarPlayEMusica(boolean change) {
        if (change) {
            musica++;
        } else {
            musica--;
        }
        if (musica >= playlists.get(listaMusica).getSize()) {
            musica = 0;
            listaMusica++;
            if (listaMusica >= playlists.size()) {
                listaMusica = 0;
            }
        } else if (musica < 0) {
            listaMusica--;
            if (listaMusica < 0) {
                listaMusica = playlists.size() - 1;
            }
            musica = playlists.get(listaMusica).getSize() - 1;
        }
        SelecionarMusicas();
    }

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
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAumentaVolume;
    private javax.swing.JButton btnDiminuiVolume;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnProxima;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNmrVolume;
    private javax.swing.JLabel lblNomeMusica;
    private javax.swing.JLabel lblVolume;
    private javax.swing.JList<String> lstGeneros;
    // End of variables declaration//GEN-END:variables

    private void listaDeMusicas() {
        this.lstGeneros.setModel(lista);
        for (NewPlay n1 : playlists) {
            this.lista.addElement(n1.getNome() 
                          + "(" + n1.getGenero() 
                          + ")");
        }
    }

    public void AdicionaPlaylists() {
        playlist.NewPlay n1 = new NewPlay("POP", "Ed Sherran");
        playlist.NewPlay n2 = new NewPlay("Funk", "Mc Claudinho");
        playlist.NewPlay n3 = new NewPlay("Eletro", "Martin Garrix");

        n1.addMusica(new Musica("Perfect", "Ed Sherran", "POP"));
        n1.addMusica(new Musica("Photograf", "Ed Sherran", "POP"));
        n1.addMusica(new Musica("Beautiful People", "Ed Sherran", "POP"));
        playlists.add(n1);

        n2.addMusica(new Musica("Quando a Vontade Bater", "Mc Claudinho", "Funk"));
        n2.addMusica(new Musica("Patibum", "Mc Claudinho", "Funk"));
        n2.addMusica(new Musica("É Hoje", "Mc Claudinho", "Funk"));
        playlists.add(n2);

        n3.addMusica(new Musica("Name of Love", "Martin Garrix", "Eletro"));
        n3.addMusica(new Musica("Castle", "Martin Garrix", "Eletro"));
        n3.addMusica(new Musica("Access", "Martin Garrix", "Eletro"));
        playlists.add(n3);
    }

    @Override
    public Musica getMusicaAtual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean tocandoUltimaMusica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean tocandoPrimeiraMusica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Musica proximaMusica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Musica musicaAnterior() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPlaylist(PlaylistBase playlist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlaylistBase getPlaylist(int indice) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlaylistBase getPlaylist(PlaylistBase playlist) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
