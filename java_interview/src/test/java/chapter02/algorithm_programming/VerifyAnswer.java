package chapter02.algorithm_programming;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 * 编写一个程序，将a.txt文件中的单词与b.txt文件中的单词交替合并到c.txt文件中，
 * a.txt文件中的单词用回车符分隔，b.txt文件中用回车或空格进行分隔。
 * @author mlxia
 *
 */
public class VerifyAnswer {
	
	@Test
	public void verifyAnswer01() throws Exception {

		final String output = "src/test/resources/chapter02/algorithm_programming/c.txt";
		Question01 question01 = new Question01();
		question01.answer(output);
		
		//verify answer
		File f = new File(output);
		long len = f.length();
		Assert.assertEquals(192, len);		
	}
}
