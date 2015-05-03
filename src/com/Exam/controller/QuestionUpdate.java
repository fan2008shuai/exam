/*
 * QuestionUpdate.java
 *
 * Created on 2008年8月11日, 下午2:44
 */

package com.Exam.controller;

import java.io.*;

import javax.swing.JOptionPane;

import com.Exam.bean.*;
import com.Exam.dao.FindQuestionDao;

/**
 *
 * @author  Administrator
 */
public class QuestionUpdate extends javax.swing.JFrame {// 修改试题

    /** Creates new form QuestionUpdate */
    public QuestionUpdate() {// 构造方法
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {// 初始化方法
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        idJLabel = new javax.swing.JLabel();
        idjTextField = new javax.swing.JTextField();
        nameJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjectjTextArea = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        answers = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        optionA = new javax.swing.JTextField();
        optionB = new javax.swing.JLabel();
        optionBJText = new javax.swing.JTextField();
        optionC = new javax.swing.JLabel();
        optionJText = new javax.swing.JTextField();
        optionD = new javax.swing.JLabel();
        optionDjText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        optionD1 = new javax.swing.JLabel();
        answerjTextField = new javax.swing.JTextField();
        remarkoption = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        updatejButton = new javax.swing.JButton();
        closejButton = new javax.swing.JButton();
        Question question = null;
    	try{
    		File file = new File("tableQuestionId.txt");
			FileInputStream in = new FileInputStream(file);		
			byte byt[] = new byte[1024];					
			int len = in.read(byt);				
			String strid = new String(byt,0,len);
			Question ques = new Question();
			ques.setId(Integer.parseInt(strid));
			FindQuestionDao findQues = new FindQuestionDao();
			question = findQues.getQuestion(ques);
			file.delete();
			in.close();							
		}catch (Exception e) {
			e.printStackTrace();							
		}

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        idJLabel.setText("试题编号：");

        idjTextField.setText(""+question.getId());
        idjTextField.setEditable(false);
        nameJLabel.setText("试题题目：");

        subjectjTextArea.setColumns(20);
        subjectjTextArea.setRows(5);
        jScrollPane1.setViewportView(subjectjTextArea);
        subjectjTextArea.setText(ChDeal.toChinese(question.getQ_subject()));
        answers.setText("备选答案部分：");

        jLabel1.setText("答案A：");
        if(question.getTypeid()== 3){
        	optionA.setEditable(false);
        	optionBJText.setEditable(false);
        	optionJText.setEditable(false);
        	optionDjText.setEditable(false);
        	index = 1;
        }
        optionA.setText(ChDeal.toChinese(question.getOptionA()));

        optionB.setText("答案B：");

        optionBJText.setText(ChDeal.toChinese(question.getOptionB()));
        setTitle("修改试题");
        optionC.setText("答案C：");

        optionJText.setText(ChDeal.toChinese(question.getOptionC()));

        optionD.setText("答案D：");

        optionDjText.setText(ChDeal.toChinese(question.getOptionD()));

        optionD1.setText(" 答案：");

        answerjTextField.setText(ChDeal.toChinese(question.getQ_answer()));

        remarkoption.setText(" 备注：");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);
        jTextArea2.setText(question.getNote());
        updatejButton.setText("修改");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        closejButton.setText("取消");
        closejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idjTextField))
                    .addComponent(answers, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(optionB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optionBJText))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optionA, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(optionC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optionJText))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(optionD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optionDjText))))
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(remarkoption)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(closejButton)
                                    .addComponent(updatejButton)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(optionD1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(answerjTextField)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idJLabel)
                    .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nameJLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(optionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionB)
                    .addComponent(optionBJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionC)
                    .addComponent(optionJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionD)
                    .addComponent(optionDjText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionD1)
                    .addComponent(answerjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(remarkoption)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(updatejButton)
                        .addGap(18, 18, 18)
                        .addComponent(closejButton)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }
private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {
	Question question = new Question();
	
	if(subjectjTextArea.getText() == null){
		JOptionPane.showConfirmDialog(this, "请确定要修改的问题的题目！", 
				"信息对话框",JOptionPane.WARNING_MESSAGE);
	
		return;
	}
	if(answerjTextField.getText() == null){
		JOptionPane.showConfirmDialog(this, "请确定要修改问题的答案！",
				"信息对话框",JOptionPane.WARNING_MESSAGE);
		
		return;
	}
	if(index == 0){
		if((optionA.getText() == null)||(optionBJText.getText() == null)
				||(optionJText.getText() == null)||(optionDjText.getText() == null)){
			JOptionPane.showConfirmDialog(this,"请将备选答案添加完整",
					"信息对话框",JOptionPane.WARNING_MESSAGE);
			
			return;
		}
		
		
	}
	question.setId(Integer.parseInt(idjTextField.getText()));
	question.setQ_subject(subjectjTextArea.getText());
	System.out.println(subjectjTextArea.getText());

	question.setQ_answer(answerjTextField.getText());
	System.out.println(subjectjTextArea.getText());

	question.setOptionA(optionA.getText());
	System.out.println(subjectjTextArea.getText());
	question.setOptionB(optionBJText.getText());
	question.setOptionC(optionJText.getText());
	question.setOptionD(optionDjText.getText());
	question.setNote(ChDeal.toISO(jTextArea2.getText()));
	FindQuestionDao findQuestionDao = new FindQuestionDao();
	boolean bool = findQuestionDao.updateQuestionDBbean(question);
	System.out.println(bool);
	if(bool == true){
		JOptionPane.showMessageDialog(this, "试题修改成功！", "信息对话框", JOptionPane.WARNING_MESSAGE);
	}
	else
	{
		JOptionPane.showMessageDialog(this, "试题修改没有成功！", "信息对话框", JOptionPane.WARNING_MESSAGE);
	}
	dispose();
	UpdateFrame up = new UpdateFrame();
	up.setBounds(200, 150, 630, 350);
	up.setVisible(true);
}
private void closejButtonActionPerformed(java.awt.event.ActionEvent evt) {
	dispose();
	UpdateFrame updateFrame = new UpdateFrame();
	updateFrame.setBounds(200, 150, 630, 350);
	updateFrame.setVisible(true);
}
   

    private javax.swing.JLabel answers;
    private javax.swing.JButton closejButton;
    private javax.swing.JLabel idJLabel;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea subjectjTextArea;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField answerjTextField;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField optionA;
    private javax.swing.JLabel optionB;
    private javax.swing.JTextField optionBJText;
    private javax.swing.JLabel optionC;
    private javax.swing.JLabel optionD;
    private javax.swing.JLabel optionD1;
    private javax.swing.JTextField optionDjText;
    private javax.swing.JTextField optionJText;
    private javax.swing.JLabel remarkoption;
    private javax.swing.JButton updatejButton;
    private int index = 0;
}
