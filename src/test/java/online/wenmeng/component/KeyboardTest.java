package online.wenmeng.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @Method: 键盘按键检测，GUI界面，打开界面可见文本框，鼠标选中文本框，按下按键会出现相应的按键提示
 */
public class KeyboardTest implements KeyListener {

    public static void main(String[] args) {
        KeyboardTest keyboardTest = new KeyboardTest();
        keyboardTest.init();
    }

     private void init(){
        //设置总面板
         JFrame jFrame = new JFrame("按键测试");
         //自定义布局
         jFrame.setLayout(null);
         //设定布局大小
         jFrame.setSize(300,300);
         //将窗口的位置设置在正中间
         jFrame.setLocationRelativeTo(null);
         //设置背景颜色
         jFrame.setBackground(new Color( 96, 160, 246));
         //设置左上角图标
         ImageIcon imageIcon=new ImageIcon("C:\\KeyboardTest.png");
         jFrame.setIconImage(imageIcon.getImage());
         //设置不可改变大小
         jFrame.setResizable(false);
         //添加关闭监听
         jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         //设定一个文本框
         JTextField jTextField = new JTextField();
         //给文本框添加按键监听
         jTextField.addKeyListener(this);
         //设置文本框大小
         jTextField.setBounds(0,0,300,50);
         //设置文本框颜色
         jTextField.setBackground(new Color(104, 136, 246));
         //设置文本框样式

         //将文本框添加入版面
         jFrame.add(jTextField);

         //设定面板
         JPanel jPanel = new JPanel();
         //面板布局为空，自定义
         jPanel.setLayout(null);
         //设置面板大小
         jPanel.setSize(300,400);

         jFrame.setVisible(true);
     }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
