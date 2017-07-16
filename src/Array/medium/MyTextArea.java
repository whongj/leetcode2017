package Array.medium;

/**
 * Created by wanghongjie on 2017/6/6.
 */

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

    public class MyTextArea {

        private JFrame frame;
        private JTextArea textArea;

        /**
         * Launch the application.
         */
        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        
                        MyTextArea window = new MyTextArea();
                        window.frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        /**
         * Create the application.
         */
        public MyTextArea() {
            initialize();
        }

        /**
         * Initialize the contents of the frame.
         */
        private void initialize() {

            //创建一个对话框
            frame = new JFrame();
            //创建一个文本区
            textArea = new JTextArea();
            //将文本区添加到弹出框框
            frame.add(textArea);
            //设置弹出框框
            frame.setLocation(200,50);
            frame.setSize(620,660);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //给文本区设置显示值
            textArea.setText("汤老师好！");
            //获取文本区的值并打印到控制台
            System.out.println(textArea.getText());
        }

    }

