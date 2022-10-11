package com.SimpleProject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AbstractDataTypes.LinkedList;


@RestController
@RequestMapping("/primes")
public class PrimeController {

	@GetMapping("/isPrime/{n}")
	public ResponseEntity<String> primeChecker(@PathVariable("n") int n)
	{
		String nStr=String.valueOf(n);
		if(PrimeService.isPrime(n)) {
			return ResponseEntity.status(200).body(nStr+" is prime");
		}
		return ResponseEntity.status(200).body(nStr+" is not prime");
	}
	
	@GetMapping("/firstNPrimes/{n}")
	public ResponseEntity<String> firstN(@PathVariable("n") int n)
	{
		String result="The first "+String.valueOf(n)+" prime numbers: "+"\n";
		LinkedList ll = PrimeService.firstNPrimes(n);
		result+=ll.printList(ll);
		return ResponseEntity.status(200).body(result);
	}
	
	
}
