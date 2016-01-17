package chapter02.algorithm_programming;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 * ��дһ�����򣬽�a.txt�ļ��еĵ�����b.txt�ļ��еĵ��ʽ���ϲ���c.txt�ļ��У�
 * a.txt�ļ��еĵ����ûس����ָ���b.txt�ļ����ûس���ո���зָ���
 * @author mlxia
 *
 */
public class VerifyAnswer {

//	public static void main(String args[]) throws Exception {
//		FileManager a = new FileManager("src/test/resources/chapter02/algorithm_programming/a.txt", new char[]{'\n'});
//		FileManager b = new FileManager("src/test/resources/chapter02/algorithm_programming/b.txt", new char[]{'\n', ' '});
//		FileWriter c = new FileWriter("src/test/resources/chapter02/algorithm_programming/c.txt");
//		String aWord = null;
//		String bWord = null;
//		while((aWord=a.nextWord())!=null) {
//			c.write(aWord+"\n");
//			bWord=b.nextWord();
//			if(bWord!=null)
//				c.write(bWord+"\n");
//		}
//		
//		while((bWord=b.nextWord())!=null) {
//			c.write(bWord+"\n");
//		}
//		
//		c.close();
//	}
	
	@Test
	public void verifyAnswer01() throws Exception {

		final String output = "src/test/resources/chapter02/algorithm_programming/c.txt";
		Question01 question01 = new Question01();
		question01.answer01(output);
		
		//verify answer
		File f = new File(output);
		long len = f.length();
		Assert.assertEquals(10, len);		
	}
}

//class FileManager {
//	String[] words = null;
//	int pos = 0;
//	
//	public FileManager(String filename, char[] seperators) throws Exception {
//		File f = new File(filename);
//		FileReader reader = new FileReader(filename);
//		char[] buf = new char[(int) f.length()];
//		int len = reader.read(buf);
//		reader.close();
//		String results = new String(buf, 0, len);
//		String regex = null;
//		if(seperators.length>1) {
//			regex = "" + seperators[0] + "|" + seperators[1];
//		}
//		else {
//			regex = "" + seperators[0];
//		}
//		
//		words = results.split(regex);
//	}
//	
//	public String nextWord() {
//		if(pos==words.length)
//			return null;
//		else
//			return words[pos++];
//	}
//}