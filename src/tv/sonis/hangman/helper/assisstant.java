/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tv.sonis.hangman.helper;

/**
 *
 * @author skaviouz
 */
public class assisstant extends javax.swing.JFrame {

    /**
     * Creates new form assisstant
     */
    public assisstant() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CharCountSlider = new javax.swing.JSlider();
        CharCount = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        POSS = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SEGMENT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CHECK = new javax.swing.JButton();
        Characters = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NEGCharacters = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Filter = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DICTIONARY = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("How Many Characters (Zero is any)");

        CharCountSlider.setMaximum(20);
        CharCountSlider.setValue(5);
        CharCountSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CharCountSliderStateChanged(evt);
            }
        });

        CharCount.setText("5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(CharCountSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(CharCount, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CharCount)
                    .addComponent(CharCountSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)))
        );

        POSS.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Possibilities", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 12))); // NOI18N
        jScrollPane3.setViewportView(POSS);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("Contains (SEGMENT)");

        SEGMENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEGMENTActionPerformed(evt);
            }
        });
        SEGMENT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SEGMENTKeyReleased(evt);
            }
        });

        jLabel3.setText("Contains (Characters)");

        CHECK.setText("CHECK");
        CHECK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECKActionPerformed(evt);
            }
        });

        Characters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CharactersActionPerformed(evt);
            }
        });
        Characters.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CharactersKeyReleased(evt);
            }
        });

        jLabel4.setText("NOT CONTAIN (Characters)");

        NEGCharacters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEGCharactersActionPerformed(evt);
            }
        });
        NEGCharacters.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NEGCharactersKeyReleased(evt);
            }
        });

        jLabel5.setText("Filter");

        Filter.setText("-----");
        Filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Characters, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SEGMENT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NEGCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CHECK))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Filter)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SEGMENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Characters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(CHECK))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(NEGCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        DICTIONARY.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dictionary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 12))); // NOI18N
        DICTIONARY.setText("ABYSSAL\nADAMANTITE\nALKHARID\nARDOUGNE\nASGARNIA\nAVANTOE\nBASILISK\nBANSHEE\nBARROWS\nBLOODVELD\nBOBTHECAT\nBRIMHAVEN\nBURTHORPE\nCADANTINE\nCAMELOT\nCANIFIS\nCATHERBY\nCHAOSDRUID\nCHAOSDWARF\nCHOMPYBIRD\nCOCKATRICE\nCRANDOR\nCROMADIURE\nDAGANNOTH\nDORGESHUUN\nDRAGON\nDRAYNOR\nDUSTDEVIL\nDWARFWEED\nEDGEVILLE\nENTRANA\nFALADOR\nFELDIP\nFIREGIANT\nFREMENNIK\nGARGOYLE\nGOBLIN\nGRANDTREE\nGUAMLEAF\nGUTANOTH\nGUTHIX\nHILLGIANT\nHELLHOUND\nHIGHWAYMAN\nHOBGOBLIN\nICEGIANT\nICEQUEEN\nICEWARRIOR\nICEWOLF\nICETROLL\nIRITLEAF\nISAFDAR\nJOGRE\nKALPHITE\nKANDARIN\nKARAMJA\nKELDAGRIM\nKHAZARD\nKWUARM\nLANTADYME\nLLETYA\nLUMBRIDGE\nNECHRYAEL\nMARRENTILL\nMENAPHOS\nMISTHALIN\nMITHRIL\nMOGRE\nMORTTON\nMORYTANIA\nMOSSGIANT\nNIGHTSHADE\nPALADIN\nPHASMATYS\nPORTSARIM\nPRIFDDINAS\nPYREFIEND\nRANARRWEED\nRELLEKKA\nRIMMINGTON\nRUNESCAPE\nRUNITE\nSARADOMIN\nSKELETON\nSNAPDRAGON\nSNAPEGRASS\nSOPHANEM\nSOULLESS\nSPIRITTREE\nTARROMIN\nTAVERLEY\nTERRORBIRD\nTIRANNWN\nTOADFLAX\nTORSTOL\nUGTHANKI\nUNICORN\nVARROCK\nWHIP\nYANILLE\nZAMORAK");
        jScrollPane1.setViewportView(DICTIONARY);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CharCountSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CharCountSliderStateChanged
        CharCount.setText("" + CharCountSlider.getValue());
        UPDATED();
    }//GEN-LAST:event_CharCountSliderStateChanged

    private void SEGMENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEGMENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SEGMENTActionPerformed

    private void CHECKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECKActionPerformed
        UPDATED();
    }//GEN-LAST:event_CHECKActionPerformed

    private void SEGMENTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEGMENTKeyReleased
        UPDATED();
    }//GEN-LAST:event_SEGMENTKeyReleased

    private void CharactersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CharactersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CharactersActionPerformed

    private void NEGCharactersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEGCharactersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NEGCharactersActionPerformed

    private void CharactersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CharactersKeyReleased
        UPDATED();
    }//GEN-LAST:event_CharactersKeyReleased

    private void NEGCharactersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NEGCharactersKeyReleased
        UPDATED();
    }//GEN-LAST:event_NEGCharactersKeyReleased

    private void FilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterKeyReleased
        UPDATED();
    }//GEN-LAST:event_FilterKeyReleased

    public void UPDATED() {
        //SEGMENT - contains this segment
        //Characters - contains these characters
        //NEGCharacters - not contains these characters
        //DICTIONARY
        //POSS - possible answers
        //CharCountSlider - value of the character
        int tI1 = 0;
        int value = CharCountSlider.getValue();
        boolean AnyValue = (value == 0) ? true : false;
        String[] AllLines = DICTIONARY.getText().toLowerCase().split("\r\n|\r|\n");
        CountDictionary:
        {
            if (AnyValue) {
                tI1 = AllLines.length;
                break CountDictionary;
            }
            for (int i = 0; i < AllLines.length; i++) {
                if (AllLines[i].length() == value) {
                    tI1++;
                }
            }
        }
        if (AnyValue) {
            tI1 = AllLines.length;
        }
        String[] newPOSS = new String[tI1];
        int rI1 = 0;
        CountGoodies:
        {
            if (AnyValue) {
                newPOSS = AllLines;
                break CountGoodies;
            }
            for (int i = 0; i < AllLines.length; i++) {
                if (AllLines[i].length() == value) {
                    newPOSS[rI1] = AllLines[i].toLowerCase();
                    rI1++;
                }
            }
        }
        segment:
        {
            int CI1 = 0;
            for (int i = 0; i < newPOSS.length; i++) {
                if (newPOSS[i].contains(SEGMENT.getText())) {
                    CI1++;
                }
            }
            int RI1 = 0;
            String[] repPOSS = new String[CI1];
            for (int i = 0; i < newPOSS.length; i++) {
                if (newPOSS[i].contains(SEGMENT.getText())) {
                    repPOSS[RI1] = newPOSS[i];
                    RI1++;
                }
            }
            newPOSS = repPOSS;
        }
        Charact:
        {
            if (Characters.getText().length() >= 1) {
            } else {
                break Charact;
            }
            int CI1 = 0;
            for (int i = 0; i < newPOSS.length; i++) {
                if (DoesStringContainThese(newPOSS[i], Characters.getText())) {
                    CI1++;
                }
            }
            int RI1 = 0;
            String[] repPOSS = new String[CI1];
            for (int i = 0; i < newPOSS.length; i++) {
                if (DoesStringContainThese(newPOSS[i], Characters.getText())) {
                    repPOSS[RI1] = newPOSS[i];
                    RI1++;
                }
            }
            newPOSS = repPOSS;
        }
        NotCharact:
        {
            int CI1 = 0;
            for (int i = 0; i < newPOSS.length; i++) {
                if (DoesStringNotContainThese(newPOSS[i], NEGCharacters.getText())) {
                    CI1++;
                }
            }
            int RI1 = 0;
            String[] repPOSS = new String[CI1];
            for (int i = 0; i < newPOSS.length; i++) {
                if (DoesStringNotContainThese(newPOSS[i], NEGCharacters.getText())) {
                    repPOSS[RI1] = newPOSS[i];
                    RI1++;
                }
            }
            newPOSS = repPOSS;
        }
        filter:
        {
            if (Filter.getText().length() >= 1) {
            } else {
                break filter;
            }
            int CI1 = 0;
            for (int i = 0; i < newPOSS.length; i++) {
                if (DoesStringMatchFilter(newPOSS[i], Filter.getText())) {
                    CI1++;
                }
            }
            int RI1 = 0;
            String[] repPOSS = new String[CI1];
            for (int i = 0; i < newPOSS.length; i++) {
                if (DoesStringMatchFilter(newPOSS[i], Filter.getText())) {
                    repPOSS[RI1] = newPOSS[i];
                    RI1++;
                }
            }
            newPOSS = repPOSS;
        }
        Finalize:
        {
            String finished = "";
            for (int i = 0; i < newPOSS.length; i++) {
                finished = finished + "\n" + newPOSS[i];
            }
            POSS.setText(finished);
        }
    }

    /**
     * You have to check if it doesn't contain to make this easy
     *
     * @param src
     * @param chars
     * @return
     */
    public boolean DoesStringContainThese(String src, String chars) {
        for (int i = 0; i < chars.length(); i++) {
            if (src.contains(chars.substring(i, i + 1))) {
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * You have to check if it does contain any to make this easy
     *
     * @param src
     * @param chars
     * @return
     */
    public boolean DoesStringNotContainThese(String src, String chars) {
        for (int i = 0; i < chars.length(); i++) {
            if (src.contains(chars.substring(i, i + 1))) {
                return false;
            }
        }
        return true;
    }

    public boolean DoesStringMatchFilter(String src, String filter) {
        int FirstLoop = 0;
        String newfilter = filter;
        if (!(filter.length() > 0)) {
            //ignore filter
            return true;
        } else if (src.length() > filter.length()) {
            //apply filter to entirety of source
            FirstLoop = src.length() - filter.length();
        } else if (src.length() == filter.length()) {
            //apply filter once to entire string
            //this could still work above [src >= filter] { src-filter }
            //but I like to make different notes for this case.
            FirstLoop = 0;
        } else if (src.length() < filter.length()) {
            //apply filter stripping lleading characters
            newfilter = filter.substring(0, src.length());
            FirstLoop = 0;
        }
        int[] tCheck = new int[newfilter.length()];
        floop:
        for (int i = 0; i <= FirstLoop; i++) {
            sloop:
            for (int j = 0; j < newfilter.length(); j++) {
                String tSrc = src.substring(i + j, i + j + 1);
                String tFil = filter.substring(j, j + 1);
                if (tFil.equals("-")) {
                    System.out.println("EXEMPT " + tSrc + " and " + tFil);
                    tCheck[j] = 1;
                } else if (tSrc.equalsIgnoreCase(tFil)) {
                    System.out.println("SAME " + tSrc + " and " + tFil);
                    tCheck[j] = 1;
                } else {
                    System.out.println("FAILED " + tSrc + " and " + tFil);
                    tCheck[j] = 0;
                }
            }
            boolean Good = true;
            for (int j = 0; j < newfilter.length(); j++) {
                if (tCheck[j] == 0) {
                    Good = false;
                }
            }
            if (Good == true) {
                return true;
            }
        }
        return false;
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
            java.util.logging.Logger.getLogger(assisstant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(assisstant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(assisstant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(assisstant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new assisstant().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CHECK;
    private javax.swing.JLabel CharCount;
    private javax.swing.JSlider CharCountSlider;
    private javax.swing.JTextField Characters;
    private javax.swing.JTextPane DICTIONARY;
    private javax.swing.JTextField Filter;
    private javax.swing.JTextField NEGCharacters;
    private javax.swing.JTextPane POSS;
    private javax.swing.JTextField SEGMENT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
