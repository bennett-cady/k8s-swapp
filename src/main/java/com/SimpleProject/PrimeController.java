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
	
	@GetMapping("/nextPrime/{n}")
	public ResponseEntity<String> nextP(@PathVariable("n") int n){
		return ResponseEntity.status(200).body(String.valueOf(PrimeService.nextPrime(n)));
	}
	
	@GetMapping("/firstNPrimes/{n}")
	public ResponseEntity<String> firstN(@PathVariable("n") int n)
	{
		String result="The first "+String.valueOf(n)+" prime numbers: "+"\n";
		LinkedList ll = PrimeService.firstNPrimes(n);
		result+=ll.printList(ll);
		return ResponseEntity.status(200).body(result);
	}
	
	@GetMapping("/isGen/{p}/{g}")
	public ResponseEntity<String> generates(@PathVariable("p") int prime, @PathVariable("g") int gen ){
		String pStr = String.valueOf(prime);
		String gStr = String.valueOf(gen);
		if( PrimeService.isGenerator(prime, gen)!=true) {
			return ResponseEntity.status(200).body(gStr + " is NOT a generator for "+pStr);
		}
		return ResponseEntity.status(200).body(gStr + " IS a generator for "+pStr);
	}
	
	@GetMapping("/getGens/{p}")
	public ResponseEntity<String> getGens(@PathVariable("p") int prime){
		LinkedList gens = PrimeService.getGenerators(prime);
		return ResponseEntity.ok().body("Generators for "+String.valueOf(prime)+": "+gens.printList(gens));
	}
	
}
