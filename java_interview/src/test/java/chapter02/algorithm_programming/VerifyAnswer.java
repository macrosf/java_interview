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
