import javax.swing.*; // সব GUI টুল একসাথে ইমপোর্ট করলাম

public class SimpleButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("বাটন প্রোগ্রাম");
        frame.setSize(300, 200);
        frame.setLayout(null); // আমরা আপাতত নিজেরাই পজিশন ঠিক করবো

        // ১. একটি লেবেল (লেখা) তৈরি
        JLabel label = new JLabel("HELLO! WHO ARE YOU?");
        label.setBounds(50, 20, 200, 30); // (x, y, প্রস্থ, উচ্চতা) সেট করা
        frame.add(label); // লেখাটি ফ্রেমে যোগ করলাম

        // ২. একটি বাটন তৈরি
        JButton button = new JButton("CLACK HEAR");
        button.setBounds(50, 60, 200, 30);
        frame.add(button); // বাটনটি ফ্রেমে যোগ করলাম

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}