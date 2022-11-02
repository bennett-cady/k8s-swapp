package com.SimpleProject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/binary")
public class BinController 
{
	
	@GetMapping("/toBinary/{n}")
	public ResponseEntity<String> toBinary(@PathVariable("n") int n)
	{
		String bin = BinService.intToBin(n);
		return ResponseEntity.status(200).body(bin);
	}
	
	@GetMapping("/toInteger/{bin}")
	public ResponseEntity<String> toInteger(@PathVariable("bin") String bin)
	{
		int n=BinService.binToInt(bin);
		return ResponseEntity.status(200).body(String.valueOf(n));
	}

}
