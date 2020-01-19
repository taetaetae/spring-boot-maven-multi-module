package com.taetaetae.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taetaetae.MathUtils;

@RestController
public class ApiController {

	@GetMapping("/plus")
	public int plus(int num1, int num2) {
		return MathUtils.plus(num1, num2);
	}

	@GetMapping("/minus")
	public int minus(int num1, int num2) {
		return MathUtils.minus(num1, num2);
	}
}
