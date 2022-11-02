package com.SimpleProject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/primes")
public class PrimeController {

	@GetMapping("/isPrime/{n}")
	public ResponseEntity<String> primeChecker(@PathVariable("n") int n)
	{
		String nStr=String.valueOf(n);
		if(PrimeService.isPrime(n)) 
		{
			return ResponseEntity.status(200).body(nStr+" is prime");
		}
		return ResponseEntity.status(200).body(nStr+" is not prime");
	}
	
	@GetMapping("/firstNPrimes/{n}")
	public ResponseEntity<String> firstNPrimes(@PathVariable("n") int n)
	{
		if(n<=0) {
			n=0;
		}
		return ResponseEntity.status(200).body(String.valueOf(PrimeService.firstNPrimes(n)));
	}
	
	@GetMapping("/nextPrime/{n}")
	public ResponseEntity<String> Next(@PathVariable("n") int n)
	{
		if(n<=1) {
			n=2;
		}
		return ResponseEntity.status(200).body(String.valueOf(PrimeService.nextPrime(n)));
	}
}
