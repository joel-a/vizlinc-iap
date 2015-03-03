package edu.mit.ll.vizlinc.ui.options;

import java.awt.Color;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import org.openide.util.NbPreferences;

/**
 * Displays VizLinc configuration parameters
 */
final public class VizLincPanel extends javax.swing.JPanel
{

    private final VizLincOptionsPanelController controller;
    private JFileChooser dirChooser;
    private JFileChooser fileChooser;
    public final static String PREF_DB_LOCATION = "dbLocation";
    public final static String PREF_INDEX_LOCATION = "indexLocation";
    public final static String PREF_GRAPH_LOCATION = "graphLocation";
    public final static String PREF_TILES_LOCATION_FILE = "tilesLocationFile";
    public final static String PREF_TILES_LOCATION_URL = "tilesLocationURL";
    

    VizLincPanel(VizLincOptionsPanelController controller)
    {
        System.err.println("VizLincPanel(controller)");
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
        
        //Custom
        dirChooser = new JFileChooser();
        dirChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        fileChooser = new JFileChooser();  // FILES_ONLY, by default.
    }

    public VizLincPanel(boolean showTextLabel)
    {
        this(null);
        System.err.println("VizLincPanel(boolean)");
        textLabel.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mapButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        dbLocTextBox = new javax.swing.JTextField();
        dbLocBrowseButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        indexLocTextBox = new javax.swing.JTextField();
        indexLocBrowseButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tilesLocTextBox = new javax.swing.JTextField();
        tilesLocBrowseButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        graphLocTextBox = new javax.swing.JTextField();
        graphLocBrowseButton = new javax.swing.JButton();
        textLabel = new javax.swing.JLabel();
        fileSystemBtn = new javax.swing.JRadioButton();
        serverURLBtn = new javax.swing.JRadioButton();
        urlTextBox = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.jLabel1.text")); // NOI18N

        dbLocTextBox.setEditable(false);
        dbLocTextBox.setText(org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.dbLocTextBox.text")); // NOI18N
        dbLocTextBox.setMinimumSize(new java.awt.Dimension(200, 20));
        dbLocTextBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                dbLocTextBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(dbLocBrowseButton, org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.dbLocBrowseButton.text")); // NOI18N
        dbLocBrowseButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                dbLocBrowseButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.jLabel2.text")); // NOI18N

        indexLocTextBox.setEditable(false);
        indexLocTextBox.setText(org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.indexLocTextBox.text")); // NOI18N
        indexLocTextBox.setMinimumSize(new java.awt.Dimension(50, 20));
        indexLocTextBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                indexLocTextBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(indexLocBrowseButton, org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.indexLocBrowseButton.text")); // NOI18N
        indexLocBrowseButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                indexLocBrowseButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.jLabel3.text")); // NOI18N

        tilesLocTextBox.setEditable(false);
        tilesLocTextBox.setText(org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.tilesLocTextBox.text")); // NOI18N
        tilesLocTextBox.setMinimumSize(new java.awt.Dimension(50, 20));

        org.openide.awt.Mnemonics.setLocalizedText(tilesLocBrowseButton, org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.tilesLocBrowseButton.text")); // NOI18N
        tilesLocBrowseButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tilesLocBrowseButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.jLabel4.text")); // NOI18N

        graphLocTextBox.setEditable(false);
        graphLocTextBox.setText(org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.graphLocTextBox.text")); // NOI18N
        graphLocTextBox.setMinimumSize(new java.awt.Dimension(50, 20));
        graphLocTextBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                graphLocTextBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(graphLocBrowseButton, org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.graphLocBrowseButton.text")); // NOI18N
        graphLocBrowseButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                graphLocBrowseButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(textLabel, org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.textLabel.text")); // NOI18N

        mapButtonGroup.add(fileSystemBtn);
        fileSystemBtn.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(fileSystemBtn, org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.fileSystemBtn.text")); // NOI18N
        fileSystemBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fileSystemBtnActionPerformed(evt);
            }
        });

        mapButtonGroup.add(serverURLBtn);
        org.openide.awt.Mnemonics.setLocalizedText(serverURLBtn, org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.serverURLBtn.text")); // NOI18N
        serverURLBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                serverURLBtnActionPerformed(evt);
            }
        });

        urlTextBox.setText(org.openide.util.NbBundle.getMessage(VizLincPanel.class, "VizLincPanel.urlTextBox.text")); // NOI18N
        urlTextBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                urlTextBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(indexLocTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dbLocTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(graphLocTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dbLocBrowseButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(indexLocBrowseButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(graphLocBrowseButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(tilesLocTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(serverURLBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addComponent(fileSystemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tilesLocBrowseButton)
                                .addComponent(urlTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textLabel)
                        .addGap(0, 109, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dbLocTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dbLocBrowseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indexLocTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexLocBrowseButton)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graphLocBrowseButton)
                    .addComponent(graphLocTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tilesLocTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileSystemBtn)
                    .addComponent(tilesLocBrowseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverURLBtn)
                    .addComponent(urlTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(textLabel)
                .addContainerGap(209, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dbLocTextBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dbLocTextBoxActionPerformed
    {//GEN-HEADEREND:event_dbLocTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dbLocTextBoxActionPerformed

    private void dbLocBrowseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dbLocBrowseButtonActionPerformed
    {//GEN-HEADEREND:event_dbLocBrowseButtonActionPerformed
        chooseFile((JButton)evt.getSource(), dirChooser);
    }//GEN-LAST:event_dbLocBrowseButtonActionPerformed

    private void indexLocBrowseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_indexLocBrowseButtonActionPerformed
    {//GEN-HEADEREND:event_indexLocBrowseButtonActionPerformed
        chooseFile((JButton)evt.getSource(), dirChooser);
    }//GEN-LAST:event_indexLocBrowseButtonActionPerformed

    private void indexLocTextBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_indexLocTextBoxActionPerformed
    {//GEN-HEADEREND:event_indexLocTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indexLocTextBoxActionPerformed

    private void tilesLocBrowseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tilesLocBrowseButtonActionPerformed
    {//GEN-HEADEREND:event_tilesLocBrowseButtonActionPerformed
        chooseFile((JButton)evt.getSource(), dirChooser);
    }//GEN-LAST:event_tilesLocBrowseButtonActionPerformed

    private void graphLocTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphLocTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graphLocTextBoxActionPerformed

    private void graphLocBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphLocBrowseButtonActionPerformed
        chooseFile((JButton)evt.getSource(), fileChooser);
    }//GEN-LAST:event_graphLocBrowseButtonActionPerformed

    private void serverURLBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_serverURLBtnActionPerformed
    {//GEN-HEADEREND:event_serverURLBtnActionPerformed
        if(serverURLBtn.isEnabled())
        {
            urlTextBox.setEnabled(true);
            tilesLocBrowseButton.setEnabled(false);
        }
    }//GEN-LAST:event_serverURLBtnActionPerformed

    private void fileSystemBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fileSystemBtnActionPerformed
    {//GEN-HEADEREND:event_fileSystemBtnActionPerformed
        if(fileSystemBtn.isEnabled())
        {
            tilesLocBrowseButton.setEnabled(true);
            urlTextBox.setEnabled(false);
        }
    }//GEN-LAST:event_fileSystemBtnActionPerformed

    private void urlTextBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_urlTextBoxActionPerformed
    {//GEN-HEADEREND:event_urlTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlTextBoxActionPerformed

    private void chooseFile(JButton source, JFileChooser chooser)
    {
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            File file = chooser.getSelectedFile();
            String absolutePath = file.getAbsolutePath();
            if(source == dbLocBrowseButton)
            {
                this.dbLocTextBox.setForeground(Color.black);
                this.dbLocTextBox.setText(absolutePath);
            }
            else if (source == indexLocBrowseButton)
            {
                this.indexLocTextBox.setForeground(Color.black);
                this.indexLocTextBox.setText(absolutePath);
            }
            else if (source == graphLocBrowseButton)
            {
                this.graphLocTextBox.setForeground(Color.black);
                this.graphLocTextBox.setText(absolutePath);
            }
            else if (source == tilesLocBrowseButton)
            { 
                this.tilesLocTextBox.setForeground(Color.black);
                this.tilesLocTextBox.setText(absolutePath);
            }
        }
    }
    
    void load()
    {
        // TODO read settings and initialize GUI
        // Example:        
        // someCheckBox.setSelected(Preferences.userNodeForPackage(VizLincPanel.class).getBoolean("someFlag", false));
        // or for org.openide.util with API spec. version >= 7.4:
        // someCheckBox.setSelected(NbPreferences.forModule(VizLincPanel.class).getBoolean("someFlag", false));
        // or:
        // someTextField.setText(SomeSystemOption.getDefault().getSomeStringProperty());
        dbLocTextBox.setText(NbPreferences.forModule(VizLincPanel.class).get(PREF_DB_LOCATION,""));
        indexLocTextBox.setText(NbPreferences.forModule(VizLincPanel.class).get(PREF_INDEX_LOCATION,""));
        graphLocTextBox.setText(NbPreferences.forModule(VizLincPanel.class).get(PREF_GRAPH_LOCATION,""));
        String tilesLoc = NbPreferences.forModule(VizLincPanel.class).get(PREF_TILES_LOCATION_FILE,"");
        tilesLocTextBox.setText(tilesLoc);
        if(tilesLoc.isEmpty())
        {
            tilesLoc = NbPreferences.forModule(VizLincPanel.class).get(PREF_TILES_LOCATION_URL,"");
            urlTextBox.setText(tilesLoc);
            serverURLBtn.setSelected(true);
            fileSystemBtn.setSelected(false);
        }
        else
        {
            serverURLBtn.setSelected(false);
            fileSystemBtn.setSelected(true);
        }
        
    }

    public void store()
    {
        // TODO store modified settings
        // Example:
        // Preferences.userNodeForPackage(VizLincPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or for org.openide.util with API spec. version >= 7.4:
        // NbPreferences.forModule(VizLincPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or:
        // SomeSystemOption.getDefault().setSomeStringProperty(someTextField.getText());
        NbPreferences.forModule(VizLincPanel.class).put(PREF_DB_LOCATION, dbLocTextBox.getText());
        NbPreferences.forModule(VizLincPanel.class).put(PREF_INDEX_LOCATION, indexLocTextBox.getText());
        NbPreferences.forModule(VizLincPanel.class).put(PREF_GRAPH_LOCATION, graphLocTextBox.getText());
        if(fileSystemBtn.isSelected())
        {
           NbPreferences.forModule(VizLincPanel.class).put(PREF_TILES_LOCATION_FILE, tilesLocTextBox.getText());
           NbPreferences.forModule(VizLincPanel.class).put(PREF_TILES_LOCATION_URL, "");
        }
        else
        {
            NbPreferences.forModule(VizLincPanel.class).put(PREF_TILES_LOCATION_URL, urlTextBox.getText());
            NbPreferences.forModule(VizLincPanel.class).put(PREF_TILES_LOCATION_FILE, "");
        }
    }

    public boolean valid()
    {
        System.err.println("Validating data configuration.");
        boolean allValid = true;
        
        boolean db = nonEmpty(dbLocTextBox);
        if(!db)
        {
            setWarningMessage(dbLocTextBox);
            allValid = false;
        }
        boolean index = nonEmpty(indexLocTextBox);
        if(!index)
        {
            setWarningMessage(indexLocTextBox);
           allValid = false;
        }
        boolean graph = nonEmpty(graphLocTextBox);
        if(!graph)
        {
            setWarningMessage(graphLocTextBox);
            allValid = false;
        }
        boolean tiles = false;
        JTextField box = null;
        if(fileSystemBtn.isSelected())
        {
            tiles = nonEmpty(tilesLocTextBox);
            box = tilesLocTextBox;
        }
        else
        {
            tiles = nonEmpty(urlTextBox);
            box = urlTextBox;
        }
        if(!tiles)
        {
           setWarningMessage(box);
           allValid = false;
        }
        
        return allValid;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dbLocBrowseButton;
    private javax.swing.JTextField dbLocTextBox;
    private javax.swing.JRadioButton fileSystemBtn;
    private javax.swing.JButton graphLocBrowseButton;
    private javax.swing.JTextField graphLocTextBox;
    private javax.swing.JButton indexLocBrowseButton;
    private javax.swing.JTextField indexLocTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.ButtonGroup mapButtonGroup;
    private javax.swing.JRadioButton serverURLBtn;
    private javax.swing.JLabel textLabel;
    private javax.swing.JButton tilesLocBrowseButton;
    private javax.swing.JTextField tilesLocTextBox;
    private javax.swing.JTextField urlTextBox;
    // End of variables declaration//GEN-END:variables

    private boolean nonEmpty(JTextField dbLocTextBox)
    {
        return !dbLocTextBox.getText().isEmpty();
    }

    private void setWarningMessage(JTextField tb)
    {
        tb.setForeground(Color.red);
        tb.setText("Please specify");
        
    }
}
