package Array.medium;

/**
 * Created by wanghongjie on 2017/6/6.
 */
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class acalculator implements ActionListener{
    String s="",s1;
    double d1,d2;
    JFrame frame = new JFrame("小计算器by Graduate") ;
    JTextField tf = new JTextField();


    //JFrame frame;

    public static void main(String[] args) {

        new acalculator().initialize();
///				window.frame.setVisible(true);


    }


    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
//        frame.getContentPane().setBackground(new Color(240, 240, 240));
//        frame.setBounds(100, 100, 469, 725);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().setLayout(null);
//


        tf.setCaretColor(Color.BLUE);
        tf.setSize(20,50);
        Container c = frame.getContentPane();
        tf.setHorizontalAlignment(JTextField.RIGHT);//文本框
        c.add(tf, "North");
        JPanel pn3 = new JPanel(new BorderLayout());
        c.add(pn3, "Center");
        JPanel pn2 = new JPanel();//功能键界面（清除键和关闭键）
        pn2.setLayout(new BorderLayout());
        JPanel pn1 = new JPanel();//运算界面
        pn1.setLayout(new GridLayout(4, 4));
        pn3.add(pn2, "North");
        pn3.add(pn1);
        //设置按钮
        JButton b = new JButton("CLEAR");
        b.setToolTipText("请按清除键!");//设置清零键
        b.setForeground(Color.RED);//设置字体颜色
        b.setBackground(Color.YELLOW);//设置背景色
        b.addActionListener(this);
        pn2.add(b, "Center");
        b = new JButton("OFF");
        b.setToolTipText("请按退出键!");//设置off键，点击退出应用程序b.addActionListener(this);
        b.setForeground(Color.RED);//字体颜色
        b.setBackground(Color.ORANGE);//背景色
        pn2.add(b, "East");




        JButton btnNewButton = new JButton(".");
        btnNewButton.setBackground(new Color(153, 153, 204));
        btnNewButton.setBounds(300, 597, 77, 87);
        btnNewButton.addActionListener(this::actionPerformed);
        frame.getContentPane().add(btnNewButton);


        JButton btnC = new JButton("C");
        btnC.setBackground(new Color(255, 0, 0));
        btnC.setBounds(0, 255, 151, 88);
        btnC.addActionListener(this::actionPerformed);
        frame.getContentPane().add(btnC);
//
        JButton button = new JButton("0");
        button.setBackground(new Color(153, 153, 204));
        button.setBounds(225, 597, 77, 87);
        button.addActionListener(this::actionPerformed);

        frame.getContentPane().add(button);

        JButton button_1 = new JButton("%");
		button_1.setBackground(new Color(153, 153, 204));
        button_1.setBackground(Color.YELLOW);
        button_1.addActionListener(this::actionPerformed);
        button_1.setBounds(150, 597, 77, 87);
        pn1.add(button_1);

        JButton btnTan = new JButton("tan");
        btnTan.setForeground(new Color(102, 255, 0));
        btnTan.setBackground(new Color(153, 153, 204));
        btnTan.setBounds(75, 597, 77, 87);
        frame.getContentPane().add(btnTan);

        JButton btnX_1 = new JButton("1/x");
        btnX_1.setForeground(new Color(102, 255, 0));
        btnX_1.setBackground(new Color(153, 153, 204));
        btnX_1.setBounds(0, 597, 77, 87);
        frame.getContentPane().add(btnX_1);
//
        JButton button_4 = new JButton("=");
        button_4.setBackground(Color.YELLOW);
        button_4.setBounds(375, 512, 77, 172);
        button_4.addActionListener(this::actionPerformed);
        frame.getContentPane().add(button_4);

        JButton btnX = new JButton("\u03C0");
        btnX.setForeground(new Color(102, 255, 0));
        btnX.setBackground(new Color(153, 153, 204));
        btnX.setBounds(0, 512, 77, 87);
        frame.getContentPane().add(btnX);

        JButton btnCos = new JButton("cos");
        btnCos.setForeground(new Color(102, 255, 0));
        btnCos.setBackground(new Color(153, 153, 204));
        btnCos.setBounds(75, 512, 77, 87);
        frame.getContentPane().add(btnCos);

        JButton button_7 = new JButton("1");
        button_7.setBackground(new Color(153, 153, 204));

        button_7.setBounds(150, 512, 77, 87);
        button_7.addActionListener(this::actionPerformed);
        frame.getContentPane().add(button_7);

        JButton button_8 = new JButton("2");
        button_8.setBackground(new Color(153, 153, 204));

        button_8.setBounds(225, 512, 77, 87);
        button_8.addActionListener(this::actionPerformed);
//        pn1.add(button_8);
        frame.getContentPane().add(button_8);


        JButton button_9 = new JButton("3");
        button_9.setBackground(new Color(153, 153, 204));
        button_9.setBounds(300, 512, 77, 87);
        button_9.addActionListener(this::actionPerformed);
        frame.getContentPane().add(button_9);

        JButton button_11 = new JButton("+");
        button_11.setForeground(new Color(204, 0, 0));
        button_11.setBackground(new Color(153, 153, 204));
        button_11.setBounds(375, 341, 77, 87);
        button_11.addActionListener(this::actionPerformed);
        frame.getContentPane().add(button_11);

        JButton button_12 = new JButton("6");
        button_12.setBackground(new Color(153, 153, 204));
        button_12.setBounds(300, 427, 77, 87);
        button_12.addActionListener(this::actionPerformed);
        frame.getContentPane().add(button_12);

        JButton button_13 = new JButton("5");
        button_13.setBackground(new Color(153, 153, 204));
        button_13.setBounds(225, 427, 77, 87);
        button_13.addActionListener(this::actionPerformed);
        frame.getContentPane().add(button_13);

        JButton button_14 = new JButton("4");
        button_14.setBackground(new Color(153, 153, 204));
        button_14.addActionListener(this::actionPerformed);
        button_14.setBounds(150, 427, 77, 87);
        frame.getContentPane().add(button_14);

        JButton btnSin = new JButton("sin");
        btnSin.setForeground(new Color(102, 255, 0));
        btnSin.setBackground(new Color(153, 153, 204));
        btnSin.setBounds(75, 427, 77, 87);
        btnSin.addActionListener(this);
        frame.getContentPane().add(btnSin);

        JButton btnSqrt = new JButton("sqrt");
        btnSqrt.setForeground(new Color(102, 255, 0));
        btnSqrt.setBackground(new Color(153, 153, 204));
        btnSqrt.addActionListener(this);
        btnSqrt.setBounds(0, 427, 77, 87);
        frame.getContentPane().add(btnSqrt);

        JButton button_17 = new JButton("7");
        button_17.setBackground(new Color(153, 153, 204));
        button_17.setBounds(150, 341, 77, 87);
        button_17.addActionListener(this::actionPerformed);
        frame.getContentPane().add(button_17);



        frame.getContentPane().add(button_17);

        JButton button_18 = new JButton("8");
        button_18.setBackground(new Color(153, 153, 204));
        button_18.setBounds(225, 341, 77, 87);
        button_18.addActionListener(this::actionPerformed);
        frame.getContentPane().add(button_18);

        JButton button_19 = new JButton("9");
        button_19.setBackground(new Color(153, 153, 204));
        button_19.setBounds(300, 341, 77, 87);
        button_19.addActionListener(this::actionPerformed);
        frame.getContentPane().add(button_19);

        JButton button_20 = new JButton("*");
        button_20.setForeground(new Color(204, 0, 0));
        button_20.setBackground(new Color(153, 153, 204));
        button_20.setBounds(375, 256, 77, 87);
        button_20.addActionListener(this::actionPerformed);
        frame.getContentPane().add(button_20);

        JButton btnLog = new JButton("log");
        btnLog.setForeground(new Color(102, 255, 0));
        btnLog.setBackground(new Color(153, 153, 204));
        btnLog.setBounds(75, 341, 77, 87);
        btnLog.addActionListener(this);
        frame.getContentPane().add(btnLog);

        JButton btnN = new JButton("n!");
        btnN.setForeground(new Color(102, 255, 0));
        btnN.setBackground(new Color(153, 153, 204));
        btnN.setBounds(0, 341, 77, 87);
        btnN.addActionListener(this);
        frame.getContentPane().add(btnN);

        JButton btnx = new JButton("x^2");
        btnx.setBackground(new Color(153, 153, 204));
        btnx.setBounds(150, 256, 77, 87);
        btnx.addActionListener(this);
        frame.getContentPane().add(btnx);

        JButton btnX_2 = new JButton("x^3");
        btnX_2.setBackground(new Color(153, 153, 204));
        btnX_2.addActionListener(this);
        btnX_2.setBounds(225, 256, 77, 87);
        frame.getContentPane().add(btnX_2);

        JButton button_26 = new JButton("/");
        button_26.setForeground(new Color(204, 0, 0));
        button_26.setBackground(new Color(153, 153, 204));
        button_26.setBounds(300, 256, 77, 87);
        button_26.addActionListener(this::actionPerformed);
        frame.getContentPane().add(button_26);

        JButton button_10 = new JButton("-");
        button_10.setForeground(new Color(204, 0, 0));
        button_10.setBackground(new Color(153, 153, 204));
        button_10.setBounds(375, 427, 77, 87);
        button_10.addActionListener(this::actionPerformed);
        frame.getContentPane().add(button_10);




        frame.setSize(300,300);//设置大小

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String command = e.getActionCommand();
        tf.setText(tf.getText()+command);
        if(command.equals("C")) //清零键 按下时返回初始状态
        {
            s1=null;
            s="";
            tf.setText("");//记录输入值的变量清空
        }
//        else if(command.equals("OFF")) System.exit(0);//off键 关闭应用程序 无OFF按键
        else if(!command.equals("*")&&!command.equals("\\")
                &&!command.equals("+")&&!command.equals("-")
                &&!command.equals("="))//判断输入是否为数字
        {
            if(s1==null)//判断输入是否为第一个
                s1 = command;
            else s1+=command;
            d1 = new Double(s1).doubleValue();//字符串型转换为双精度型,还原输入数字
            try
            {
                if(s.equals("+")) d1 = d1+d2;//加法运算
                else if(s.equals("-")) d1 = d2-d1;//减法运算
                else if(s.equals("*")) d1 = d1*d2;//乘法运算
                else if(s.equals("\\"))d1 = d2/d1;//除法运算
            }
            catch(Exception ex)
            {
                tf.setText("Error");//错误显示"Error"
                System.out.println(ex.getMessage());
            }
        }
        else if(!command.equals("=")) //判断输入是否为+ - * \
        {
            s = command;
            s1 = null;
            d2 = d1;
        }
        else//输入=时,显示运算结果
        {
            tf.setText(tf.getText()+d1);
        }


    }
}