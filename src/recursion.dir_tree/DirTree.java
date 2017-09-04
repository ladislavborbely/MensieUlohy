package recursion;

import java.io.File;

public class DirTree {

	public static void showDirTree(String path) {
		File file = new File(path);
		File content[] = file.listFiles();
		if (content != null) {
			for (File item : content) {
				if (item.isDirectory()) {
					System.out.println("#Dir> " + item.getAbsoluteFile());
					showDirTree(item.getAbsolutePath()); //ak mame priecinok tak vstupujeme kym nebudu len subory					
				} else {
					System.out.println("      " + item.getName());
				}
			}
		}
	}
}
