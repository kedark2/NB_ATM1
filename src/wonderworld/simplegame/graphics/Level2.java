/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wonderworld.simplegame.graphics;

import java.util.ArrayList;
import java.util.Collections;
import wonderworld.simplegame.QuizFormation;

/**
 *
 * @author kanel
 */
public class Level2 extends javax.swing.JFrame {

    /**
     * Creates new form Question2
     */
    public Level2() {
        initComponents();     
        settingElements("level2");
        this.scoreField.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        question1Buttons = new javax.swing.ButtonGroup();
        question2Buttons = new javax.swing.ButtonGroup();
        question3Buttons = new javax.swing.ButtonGroup();
        question4Buttons = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        scoreField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        stopButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        q3Button3 = new javax.swing.JRadioButton();
        q3Button4 = new javax.swing.JRadioButton();
        q3Button2 = new javax.swing.JRadioButton();
        questionLabel3 = new javax.swing.JLabel();
        q3Button1 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        q4Button3 = new javax.swing.JRadioButton();
        q4Button4 = new javax.swing.JRadioButton();
        q4Button2 = new javax.swing.JRadioButton();
        questionLabel4 = new javax.swing.JLabel();
        q4Button1 = new javax.swing.JRadioButton();
        nextButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        q2Button3 = new javax.swing.JRadioButton();
        q2Button4 = new javax.swing.JRadioButton();
        q2Button2 = new javax.swing.JRadioButton();
        questionLabel2 = new javax.swing.JLabel();
        q2Button1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        q1Button3 = new javax.swing.JRadioButton();
        q1Button4 = new javax.swing.JRadioButton();
        q1Button2 = new javax.swing.JRadioButton();
        question1Label = new javax.swing.JLabel();
        q1Button1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(819, 419));
        setResizable(false);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        scoreField.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        scoreField.setText("Score : ");
        scoreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreFieldActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Level 2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 0, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        q3Button3.setBackground(new java.awt.Color(0, 204, 204));
        question3Buttons.add(q3Button3);
        q3Button3.setText("Dili");

        q3Button4.setBackground(new java.awt.Color(0, 204, 204));
        question3Buttons.add(q3Button4);
        q3Button4.setText("Copenhagen");

        q3Button2.setBackground(new java.awt.Color(0, 204, 204));
        question3Buttons.add(q3Button2);
        q3Button2.setText("Havana");

        questionLabel3.setText("Q. 3. What is the Capital of Denmark?");

        q3Button1.setBackground(new java.awt.Color(0, 204, 204));
        question3Buttons.add(q3Button1);
        q3Button1.setText("Roseau");
        q3Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(q3Button1)
                        .addGap(18, 18, 18)
                        .addComponent(q3Button2)
                        .addGap(18, 18, 18)
                        .addComponent(q3Button3)
                        .addGap(18, 18, 18)
                        .addComponent(q3Button4))
                    .addComponent(questionLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q3Button1)
                    .addComponent(q3Button2)
                    .addComponent(q3Button3)
                    .addComponent(q3Button4))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        q4Button3.setBackground(new java.awt.Color(0, 204, 204));
        question4Buttons.add(q4Button3);
        q4Button3.setText("France");

        q4Button4.setBackground(new java.awt.Color(0, 204, 204));
        question4Buttons.add(q4Button4);
        q4Button4.setText("England");

        q4Button2.setBackground(new java.awt.Color(0, 204, 204));
        question4Buttons.add(q4Button2);
        q4Button2.setText("USA");

        questionLabel4.setText("Q. 4. The world famous tourist attraction \"Bolshoi Theatre\" is");

        q4Button1.setBackground(new java.awt.Color(0, 204, 204));
        question4Buttons.add(q4Button1);
        q4Button1.setText("Russia");
        q4Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q4Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questionLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(q4Button1)
                        .addGap(18, 18, 18)
                        .addComponent(q4Button2)
                        .addGap(18, 18, 18)
                        .addComponent(q4Button3)
                        .addGap(18, 18, 18)
                        .addComponent(q4Button4)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q4Button1)
                    .addComponent(q4Button2)
                    .addComponent(q4Button3)
                    .addComponent(q4Button4))
                .addContainerGap())
        );

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        q2Button3.setBackground(new java.awt.Color(0, 204, 204));
        question2Buttons.add(q2Button3);
        q2Button3.setText("Candela");

        q2Button4.setBackground(new java.awt.Color(0, 204, 204));
        question2Buttons.add(q2Button4);
        q2Button4.setText("Ampere");

        q2Button2.setBackground(new java.awt.Color(0, 204, 204));
        question2Buttons.add(q2Button2);
        q2Button2.setText("Steradian");

        questionLabel2.setText("Q. 2. What is the SI Unit of luminous intensity?");

        q2Button1.setBackground(new java.awt.Color(0, 204, 204));
        question2Buttons.add(q2Button1);
        q2Button1.setText("Mole");
        q2Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(q2Button1)
                        .addGap(18, 18, 18)
                        .addComponent(q2Button2)
                        .addGap(18, 18, 18)
                        .addComponent(q2Button3)
                        .addGap(18, 18, 18)
                        .addComponent(q2Button4))
                    .addComponent(questionLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q2Button1)
                    .addComponent(q2Button2)
                    .addComponent(q2Button3)
                    .addComponent(q2Button4))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        q1Button3.setBackground(new java.awt.Color(0, 204, 204));
        question1Buttons.add(q1Button3);
        q1Button3.setText("Calgary");

        q1Button4.setBackground(new java.awt.Color(0, 204, 204));
        question1Buttons.add(q1Button4);
        q1Button4.setText("Montreal");

        q1Button2.setBackground(new java.awt.Color(0, 204, 204));
        question1Buttons.add(q1Button2);
        q1Button2.setText("NewYork");

        question1Label.setText("Q. 1. The 2010 Winter Olympics were held in which city ? ");

        q1Button1.setBackground(new java.awt.Color(0, 204, 204));
        question1Buttons.add(q1Button1);
        q1Button1.setText("Vancover");
        q1Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(q1Button1)
                        .addGap(18, 18, 18)
                        .addComponent(q1Button2)
                        .addGap(18, 18, 18)
                        .addComponent(q1Button3)
                        .addGap(18, 18, 18)
                        .addComponent(q1Button4))
                    .addComponent(question1Label))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(question1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q1Button1)
                    .addComponent(q1Button2)
                    .addComponent(q1Button3)
                    .addComponent(q1Button4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(stopButton))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(scoreField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scoreField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed

        this.dispose();
    }//GEN-LAST:event_stopButtonActionPerformed

    private void q3Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3Button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q3Button1ActionPerformed

    private void q4Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q4Button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q4Button1ActionPerformed

    private void q2Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2Button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q2Button1ActionPerformed

    private void q1Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1Button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q1Button1ActionPerformed

    private void scoreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreFieldActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed

        checkingAnswers();
        Level3 level3 = new Level3();
        level3.setScore(this.score);
        this.setVisible(false);
        level3.setVisible(true);
    }//GEN-LAST:event_nextButtonActionPerformed
    public void setScore(int score){
        this.score  = score;
        this.scoreField.setText(this.scoreField.getText()+ score);    
    }
    public void checkingAnswers(){
        if(this.q1Button1.isSelected() && qf.checkAnswers(q1Button1.getText())){
            score += 5;
        }
        if(this.q1Button2.isSelected() && qf.checkAnswers(q1Button2.getText())){
            score += 5;
        }      
        if(this.q1Button3.isSelected() && qf.checkAnswers(q1Button3.getText())){
            score += 5;
        }   
        if(this.q1Button4.isSelected() && qf.checkAnswers(q1Button4.getText())){
            score += 5;
        }    
        if(this.q2Button1.isSelected() && qf.checkAnswers(q2Button1.getText())){
            score += 5;
        }   
        if(this.q2Button2.isSelected() && qf.checkAnswers(q2Button2.getText())){
            score += 5;
        }    
        if(this.q2Button3.isSelected() && qf.checkAnswers(q2Button3.getText())){
            score += 5;
        }    
        if(this.q2Button4.isSelected() && qf.checkAnswers(q2Button4.getText())){
            score += 5;
        }    
        if(this.q3Button1.isSelected() && qf.checkAnswers(q3Button1.getText())){
            score += 5;
        }    
        if(this.q3Button2.isSelected() && qf.checkAnswers(q3Button2.getText())){
            score += 5;
        }
        if(this.q3Button3.isSelected() && qf.checkAnswers(q3Button3.getText())){
            score += 5;
        }   
        if(this.q3Button4.isSelected() && qf.checkAnswers(q3Button4.getText())){
            score += 5;
        }   
        if(this.q4Button1.isSelected() && qf.checkAnswers(q4Button1.getText())){
            score += 5;
        }  
        if(this.q4Button2.isSelected() && qf.checkAnswers(q4Button2.getText())){
            score += 5;
        }  
        if(this.q4Button3.isSelected() && qf.checkAnswers(q4Button3.getText())){
            score += 5;
        }        
        if(this.q4Button4.isSelected() && qf.checkAnswers(q4Button4.getText())){
            score += 5;
        }    
    }
     private void settingElements(String level){
         
         ArrayList<Integer> magicNums = new ArrayList<>(); 
         for( int i = 1 ; i< 9; i++) 
             magicNums.add( new Integer (i) ); 
         Collections.shuffle(magicNums);
        
        qf.setLevel(level);
        qf.getQuestion(magicNums.get(1),question1Label,q1Button1,q1Button2,q1Button3,q1Button4);
        qf.getQuestion(magicNums.get(2),questionLabel2,q2Button1,q2Button2,q2Button3,q2Button4);        
        qf.getQuestion(magicNums.get(3),questionLabel3,q3Button1,q3Button2,q3Button3,q3Button4);
        qf.getQuestion(magicNums.get(4),questionLabel4,q4Button1,q4Button2,q4Button3,q4Button4);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton nextButton;
    private javax.swing.JRadioButton q1Button1;
    private javax.swing.JRadioButton q1Button2;
    private javax.swing.JRadioButton q1Button3;
    private javax.swing.JRadioButton q1Button4;
    private javax.swing.JRadioButton q2Button1;
    private javax.swing.JRadioButton q2Button2;
    private javax.swing.JRadioButton q2Button3;
    private javax.swing.JRadioButton q2Button4;
    private javax.swing.JRadioButton q3Button1;
    private javax.swing.JRadioButton q3Button2;
    private javax.swing.JRadioButton q3Button3;
    private javax.swing.JRadioButton q3Button4;
    private javax.swing.JRadioButton q4Button1;
    private javax.swing.JRadioButton q4Button2;
    private javax.swing.JRadioButton q4Button3;
    private javax.swing.JRadioButton q4Button4;
    private javax.swing.ButtonGroup question1Buttons;
    private javax.swing.JLabel question1Label;
    private javax.swing.ButtonGroup question2Buttons;
    private javax.swing.ButtonGroup question3Buttons;
    private javax.swing.ButtonGroup question4Buttons;
    private javax.swing.JLabel questionLabel2;
    private javax.swing.JLabel questionLabel3;
    private javax.swing.JLabel questionLabel4;
    private javax.swing.JTextField scoreField;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
    private int score = 0;
    private final QuizFormation qf = new QuizFormation();
 

}

