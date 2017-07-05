package Array.hard;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wanghongjie on 2017/6/6.
 */
public class hahhahahah {
    String s="",s1;
    double d1,d2;
    JFrame jf = new JFrame("小计算器by Graduate") ;
    JTextField tf = new JTextField("你妈卖批");
    public void init()//实现计算器界面
    {
        tf.setCaretColor(Color.BLUE);
        Container c = jf.getContentPane();
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
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new hahhahahah().init();
    }
}
