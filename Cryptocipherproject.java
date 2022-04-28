package cryptopro;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import cryptopro.Newceaser;
public class Cryptocipherproject {
public static void main(String a[]){
    //Set frame f1(Farhan Crypt tool)
    JFrame f1 = new JFrame("Farhan Crypt tool");
    f1.setBounds(0,0,700,500);
    f1.setVisible(true);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setLayout(null);

    //Add label
    JLabel l1 = new JLabel("Hello Farhan welcome to the Your crypt tool! ");
    l1.setBounds(200,5,300,100);
    l1.setVisible(true);
    f1.add(l1);
/*
    //Add Text area plain text
   /* JTextArea area=new JTextArea("Enter your text here");
    area.setBounds(200,250,300,100);
    f1.add(area);
    area.setVisible(true);



    //Add list of ciphering technique

    DefaultListModel<String> list1 = new DefaultListModel<>();
    list1.addElement("Caesar cipher");
    list1.addElement("Affine cipher");
    list1.addElement("Atbash cipher");
    list1.addElement("Rot 13");
    JList<String> list = new JList<>(list1);
    f1.add(list);
    list.setBounds(150,100,200,100);

     */

    //Add bittons on techniques
    JButton b1 = new JButton("CEASER CIPHER");
    JButton b2 = new JButton("ATBASH CIPHER");
    JButton b3 = new JButton("VIGNERE CIPHER");
    JButton b4 = new JButton("AFFINE CIPHER");
    JButton b5 = new JButton("ROT13 CIPHER");
    f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);f1.add(b5);
    b1.setBounds(230,80,150,30);
    b2.setBounds(230,120,150,30);
    b3.setBounds(230,160,150,30);
    b4.setBounds(230,200,150,30);
    b5.setBounds(230,240,150,30);
    b1.setVisible(true);b2.setVisible(true);b3.setVisible(true);b4.setVisible(true);b5.setVisible(true);
/*
    JTextField t1 = new JTextField();
    f1.add(t1);
    t1.setVisible(true);
    t1.setBounds(230,300,200,30);


 */
    //Add action listener
    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Hello you are in ceaser class!");
            JFrame fc = new JFrame("CEASER");
            fc.setVisible(true);
            fc.setLayout(null);
            fc.setBounds(700,0,500,500);
            JLabel cl = new JLabel("Enter plain text = ");
            fc.add(cl);
            cl.setVisible(true);
            cl.setBounds(50,10,100,20);
            JTextField plaintext = new JTextField();
            fc.add(plaintext);
            plaintext.setVisible(true);
            plaintext.setBounds(200,10,100,20);
            JLabel ck = new JLabel("Enter key = ");
            ck.setVisible(true);
            ck.setBounds(50,70,100,20);
            fc.add(ck);
            JTextField ceaserkey = new JTextField();
            ceaserkey.setVisible(true);
            ceaserkey.setBounds(200,70,100,20);
            fc.add(ceaserkey);
            JTextField tf = new JTextField();
            tf.setVisible(true);
            tf.setBounds(50,100,100,20);
            fc.add(tf);
            JButton b=new JButton("Click Here");
            fc.add(b);
            b.setVisible(true);
            b.setBounds(50,140,100,30);
            b.addActionListener(new ActionListener() {
                public void actionPerformed (ActionEvent e) {
                    int ckey = Integer.parseInt (ceaserkey.getText());
                    String ptext = plaintext.getText ();
                    StringBuffer result= new StringBuffer();
                    for (int i=0; i<ptext.length(); i++)
                    {
                            if (Character.isUpperCase(ptext.charAt(i)))
                            {
                                char ch = (char)(((int)ptext.charAt(i) +
                                        ckey - 65) % 26 + 65);
                                result.append(ch);
                            }
                            else
                            {
                                char ch = (char)(((int)ptext.charAt(i) +
                                        ckey - 97) % 26 + 97);
                                result.append(ch);
                            }
                    }
                    tf.setText(String.valueOf(result));
                }
            });
        }});

    b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent d) {
                JFrame fat = new JFrame("ATBASH");
                fat.setLayout(null);
                fat.setVisible(true);
                fat.setBounds(1200,0,500,500);
            System.out.println("Hello you are in ATBASH class!");
                JLabel cl = new JLabel("Enter plain text = ");
                fat.add(cl);
                cl.setVisible(true);
                cl.setBounds(50,10,100,20);
// TEXTFIELD
                JTextField ptext = new JTextField();
                fat.add(ptext);
                ptext.setVisible(true);
                ptext.setBounds(200,10,100,20);
//TEXTFIELD
                JTextField ans = new JTextField("AAA");
                ans.setVisible(true);
                ans.setBounds(50,100,100,20);
                fat.add(ans);
                JButton b=new JButton("Click Here");
                fat.add(b);
                b.setVisible(true);
                b.setBounds(50,140,100,30);
                b.addActionListener(new ActionListener() {
                public void actionPerformed (ActionEvent e) {
                    String ps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    String rs = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
                    String ptext1 = ptext.getText ();
                    ptext1 = ptext1.toUpperCase();
                    String encryptText = "";
                    for (int i = 0; i<ptext1.length(); i++)
                    {
                        if(ptext1.charAt(i) == (char)32)
                        {
                            encryptText += " ";
                        }
                        else
                        {
                            int count = 0;
                            for (int j = 0; j<ps.length(); j++)
                            {
                                if (ptext1.charAt(i) == ps.charAt(j))
                                {
                                    encryptText += rs.charAt(j);
                                    break;
                                }
                            }
                        }
                    }
                    ans.setText(encryptText);
                }});
                //Write code here
            }});
    b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent d) {
            JFrame fv = new JFrame("VIGENERE");
            fv.setVisible(true);
            fv.setBounds(0,500,500,500);
            fv.setLayout(null);
            System.out.println("Hello you are in VIGENERE class!");
            //ADD plain text
            JLabel vl = new JLabel("Enter plain text = ");
            fv.add(vl);
            vl.setVisible(true);
            vl.setBounds(50,10,100,20);
            JTextField plaintext = new JTextField();
            fv.add(plaintext);
            plaintext.setVisible(true);
            plaintext.setBounds(200,10,100,20);
            //ADD enter key
            JLabel vk = new JLabel("Enter keyword = ");
            vk.setVisible(true);
            vk.setBounds(50,70,100,20);
            fv.add(vk);
            JTextField vikey = new JTextField();
            vikey.setVisible(true);
            vikey.setBounds(200,70,100,20);
            fv.add(vikey);
            //ADD RESULT TEXTFIELD
            JTextField tf = new JTextField();
            tf.setVisible(true);
            tf.setBounds(50,100,100,20);
            fv.add(tf);
            //ADD BUTTON
            JButton b=new JButton("Click Here");
            fv.add(b);
            b.setVisible(true);
            b.setBounds(50,140,100,30);
            //Write code here
            b.addActionListener(new ActionListener() {
                public void actionPerformed (ActionEvent e) {
                    String Keyword = vikey.getText();
                    String plain_text = plaintext.getText ();
                    StringBuffer result= new StringBuffer();
                    //new code
                    //String plain_text = "ABABAB";
                    //String Keyword = "BBB";

                    //CONVERT PLAIN TEXT STRING TO UPPER
                    StringBuffer vp =new StringBuffer(plain_text);
                    for(int i = 0; i < plain_text.length(); i++)
                    {
                        if(Character.isLowerCase(plain_text.charAt(i)))
                        {
                            vp.setCharAt(i, Character.toUpperCase(plain_text.charAt(i)));
                        }
                    }
                    plain_text = vp.toString();
                    System.out.println(plain_text);
                    StringBuffer o =new StringBuffer(Keyword);
                    for(int i = 0; i < Keyword.length(); i++)
                    {
                        if(Character.isLowerCase(Keyword.charAt(i)))
                        {
                            o.setCharAt(i, Character.toUpperCase(Keyword.charAt(i)));
                        }
                    }
                    Keyword = o.toString();
                    System.out.println(Keyword);
                    // GENERATE KEY
                    int x = plain_text.length();

                    for (int i = 0; ; i++)
                    {
                        if (x == i)
                            i = 0;
                        if (Keyword.length() == plain_text.length())
                            break;
                        Keyword+=(Keyword.charAt(i));
                    }
                    System.out.println(Keyword);
                    //GENERATE CIPHER TEXT
                    String cipher_text="";

                    for (int i = 0; i < plain_text.length(); i++)
                    {
                        // converting in range 0-25
                        int y = (plain_text.charAt(i) + Keyword.charAt(i)) %26;
                        // convert into alphabets(ASCII)
                        y += 'A';

                        cipher_text+=(char)(y);
                    }
                    //System.out.println(cipher_text);
                    //Insert result to tf
                    tf.setText(String.valueOf(cipher_text));
                }
            });

        }});
    b4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent d) {
            JFrame fa = new JFrame("AFFINE");
            fa.setVisible(true);
            fa.setBounds(500,500,500,500);
            fa.setLayout(null);
            System.out.println("Hello you are in AFFINE class!");
            JLabel cl = new JLabel("Enter plain text = ");
            fa.add(cl);
            cl.setVisible(true);
            cl.setBounds(50,10,100,20);
            JTextField plaintext = new JTextField();
            fa.add(plaintext);
            plaintext.setVisible(true);
            plaintext.setBounds(200,10,100,20);
            JLabel ck = new JLabel("Enter key A = ");
            ck.setVisible(true);
            ck.setBounds(50,70,100,20);
            fa.add(ck);
            JTextField affkey1 = new JTextField();
            affkey1.setVisible(true);
            affkey1.setBounds(200,70,100,20);
            fa.add(affkey1);
            JLabel ck2 = new JLabel("Enter key B = ");
            ck2.setVisible(true);
            ck2.setBounds(50,100,100,20);
            fa.add(ck2);
            JTextField affkey2 = new JTextField();
            affkey2.setVisible(true);
            affkey2.setBounds(200,100,100,20);
            fa.add(affkey2);
            JTextField tf = new JTextField();
            tf.setVisible(true);
            tf.setBounds(50,200,100,20);
            fa.add(tf);
            JButton b=new JButton("Click Here");
            fa.add(b);
            b.setVisible(true);
            b.setBounds(50,140,100,30);
            //Write code here
            b.addActionListener(new ActionListener() {
                public void actionPerformed (ActionEvent e) {
                    int a = Integer.parseInt (affkey1.getText());
                    int b = Integer.parseInt (affkey2.getText());
                    String msg1 = plaintext.getText ();
                    char[] msg =msg1.toCharArray();
                    StringBuffer result= new StringBuffer();
                    //String msg = "AFFINE CIPHER";
                    //char[] = msg ;
                    //int a = 17;
                    //int b = 20;
                    /// Cipher Text initially empty
                    String cipher = "";
                    for (int i = 0; i < msg.length; i++)
                    {
                        if (msg[i] != ' ')
                        {
                            cipher = cipher
                                    + (char) ((((a * (msg[i] - 'A')) + b) % 26) + 'A');
                        } else // else simply append space character
                        {
                            cipher += msg[i];
                        }
                    }
                    tf.setText(String.valueOf(cipher));
                }
            });

        }
    });
    b5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent d) {
            JFrame fc = new JFrame("ROT13");
            fc.setVisible(true);
            fc.setBounds(1000,500,500,500);
            fc.setLayout(null);
            System.out.println("Hello you are in ROT13 class!");
            JLabel cl = new JLabel("Enter plain text = ");
            fc.add(cl);
            cl.setVisible(true);
            cl.setBounds(50,10,100,20);
            JTextField plaintext = new JTextField();
            fc.add(plaintext);
            plaintext.setVisible(true);
            plaintext.setBounds(200,10,100,20);
            JLabel ck = new JLabel("Enter key = ");
            ck.setVisible(false);
            ck.setBounds(50,70,100,20);
            fc.add(ck);
            JTextField ceaserkey = new JTextField();
            ceaserkey.setVisible(false);
            ceaserkey.setBounds(200,70,100,20);
            fc.add(ceaserkey);
            JTextField tf = new JTextField();
            tf.setVisible(true);
            tf.setBounds(50,100,100,20);
            fc.add(tf);
            JButton b=new JButton("Click Here");
            fc.add(b);
            b.setVisible(true);
            b.setBounds(50,140,100,30);
            b.addActionListener(new ActionListener() {
                public void actionPerformed (ActionEvent e) {
                    // int ckey = Integer.parseInt (ceaserkey.getText());
                    int ckey = 13;
                    String ptext = plaintext.getText ();
                    StringBuffer result= new StringBuffer();
                    for (int i=0; i<ptext.length(); i++)
                    {
                        if (Character.isUpperCase(ptext.charAt(i)))
                        {
                            char ch = (char)(((int)ptext.charAt(i) +
                                    ckey - 65) % 26 + 65);
                            result.append(ch);
                        }
                        else
                        {
                            char ch = (char)(((int)ptext.charAt(i) +
                                    ckey - 97) % 26 + 97);
                            result.append(ch);
                        }
                    }
                    tf.setText(String.valueOf(result));
                }
            });

            //Write code here
        }
    });

}
}
