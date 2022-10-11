package com.SimpleProject;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PrimesTests 
{
	
	@Test
	void isPrimeTest() 
	{
		int[] notPrime = {-5, 20, 1, 0, 57, 100, 39}; int[] primes = {2, 3, 19, 47, 41};
		for(int z: notPrime) {
			assertThat(PrimeService.isPrime(z)==false);
		}
		for(int y: primes) {
			assertThat(PrimeService.isPrime(y)==true);
		}
	}
	
	
	@Test
	void isGenTest() 
	{
		assertThat(PrimeService.isGenerator(5, 2)==true); assertThat(PrimeService.isGenerator(5, 3)==true);
		assertThat(PrimeService.isGenerator(6, 2)==false); assertThat(PrimeService.isGenerator(5, 4)==false);
	}
	
	
}
