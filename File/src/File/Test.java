package File;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		
		File opo = new File (25,"cake");
		File picture = new File (300,"pie");
		File loop = new File (10,"cream");
		
		
		FileSystemObject [] files = {opo,picture,loop};
		Folder folder = new Folder (5, "cooking");
		folder.setFiles(files);
		File p = new File (25,"pancake");
		Folder fol = new Folder(3,"steps to make");
		folder.add(fol);
		folder.add(p);
		folder.print();
		System.out.println(folder.getSize());
		
		JFrame  f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,100,900,500);
		f.setVisible(true);
		f.setLayout(null);
		
		
		
		FileDraw fd = new FileDraw(folder);
		fd.setBounds(20,20,300,300);
		fd.setVisible(true);
		f.add(fd);
	}

}
