import javax.swing.JFrame; // উইন্ডো তৈরির লাইব্রেরি

public class MyFirstGUI {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame(); // ১. একটি ফ্রেম বা উইন্ডো তৈরি করলাম
        
       
     frame.setSize(600, 400); // ২. উইন্ডোটি কত বড় হবে (প্রস্থ ৪০০, উচ্চতা ৩০০)
         frame.setTitle("MD. SHORIF UDDIN"); // ৩. উইন্ডোর উপরে একটি নাম দিলাম
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ৪. ক্রস চিহ্ন চাপলে যেন প্রোগ্রাম বন্ধ হয়
        
        frame.setVisible(true); // ৫. উইন্ডোটিকে স্ক্রিনে দেখানোর জন্য এটি জরুরি
    }
}