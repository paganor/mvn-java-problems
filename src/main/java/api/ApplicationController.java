package api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ApplicationController {

	@RequestMapping("/hello")
	public String hello(@RequestParam(value="name", defaultValue="rob") String name) {
		return new Hello(name).toString();
	}
	
	@RequestMapping("/api/plate-calculator")
	public PlateCalculator pc(@RequestParam(value="totalWeight", required=true) int totalWeight,
							 @RequestParam(value="barWeight", required=true) int barWeight) {
		return new PlateCalculator(totalWeight, barWeight);
	}
}
