/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sandbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author laurenritter
 */
public class ManualTwitterUI extends JFrame implements ActionListener{
    private JPanel tweetPanel;
    private JLabel enterTweet;
    private JTextArea tweet;
    private JButton enterButton;
    private TwitterCntl theTwitterCntl;
    
    public ManualTwitterUI(TwitterCntl parentTwitterCntl){
        theTwitterCntl = parentTwitterCntl;
        initCustomComponents();
    }
    
    public void initCustomComponents(){
        setVisible(true);
        
        tweetPanel = new JPanel();
        enterTweet = new JLabel("Get Timeline");
        tweet = new JTextArea();
        enterButton = new JButton("Enter");
        
        enterButton.addActionListener(this);
        
        tweetPanel.add(enterTweet);
        tweetPanel.add(tweet);
        tweetPanel.add(enterButton, SwingConstants.SOUTH_WEST);
        
        tweetPanel.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        enterButtonActionPerformed(e);
    }
    
    public void enterButtonActionPerformed(ActionEvent e){
        
    }
}
