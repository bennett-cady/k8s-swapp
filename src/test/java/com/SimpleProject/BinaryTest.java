package com.SimpleProject;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BinaryTest 
{
	
	@Test
	void edgesToBinTest() {
		assertThat(BinService.intToBin(0).equals("0")); assertThat(BinService.intToBin(1).equals("1")); assertThat(BinService.intToBin(-5).equals(""));
	}
	
	@Test 
	void toBinTest() 
	{
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(5, "101"); hm.put(1997, "11111001101"); hm.put(16, "10000"); hm.put(8, "1000");
		hm.put(11, "1011"); hm.put(67, "1000011"); hm.put(10, "1010"); hm.put(3, "11");
		for (Integer i: hm.keySet())
		{
			String bin=BinService.intToBin(i); String testCase=hm.get(i); 
			Assertions.assertEquals(bin.length(), testCase.length());
			for(int idx=0; idx<bin.length(); idx++) {
				Assertions.assertEquals(bin.charAt(idx), testCase.charAt(idx));
			}
		}
	}
	
	@Test
	void edgesToIntTest() {
		assertThat(BinService.binToInt("")==0); assertThat(BinService.binToInt("0")==0); assertThat(BinService.binToInt("1")==1);
	}
	
	
}
