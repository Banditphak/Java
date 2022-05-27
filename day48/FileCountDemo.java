package day48;

public class FileCountDemo {
	public static void main(String[] args) {
		int count = FileCounter.countFiles("../sdet-java-b5/src");
		System.out.println("Number of files: " + count);
		
		FileCounter fileCount = new FileCounter();
		int numberOfFiles = fileCount.countFiles("C:\\Users\\bandi\\OneDrive");
		System.out.println("Number of file in my Desktop: " + numberOfFiles);
	}
}
