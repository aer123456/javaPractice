import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class zhurui implements ActionListener {
    JFrame jframe;
    JPanel jpanel;
    JButton jbutton;
    JTextArea jtext = null;
    JScrollPane jscrollPane;

    //界面定义
    public zhurui() {
        jframe = new JFrame("朱瑞又瘦又能吃哈哈哈~");
        Container contentPane = jframe.getContentPane();
        contentPane.setLayout(new BorderLayout());

        jtext = new JTextArea(10, 15);
        jtext.setTabSize(4);
        jtext.setFont(new Font("标楷体", Font.BOLD, 16));
        jtext.setLineWrap(true);// 激活自动换行功能
        jtext.setWrapStyleWord(true);// 激活断行不断字功能
        jtext.setBackground(Color.pink);

        jscrollPane = new JScrollPane(jtext);
        jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(1, 3));

        jbutton = new JButton("点点看下午吃了多少斤"); 
        jbutton.addActionListener(this);

        jpanel.add(jbutton);

        contentPane.add(jscrollPane, BorderLayout.CENTER);
        contentPane.add(jpanel, BorderLayout.SOUTH);

        jframe.setSize(400, 300);
        jframe.setLocation(400, 200);
        jframe.setVisible(true);

        //监听关闭事件
        jframe.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    //点击出文字
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbutton) {
            jtext.setText("下午又吃了99999999999斤，但是竟然长不胖，哼！");
        }
    }

    public static void main(String[] args) {
        new zhurui();
    }
}