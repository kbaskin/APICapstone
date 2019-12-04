package co.gc.APICapstone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.gc.APICapstone.entity.EventResults;

@Controller
public class HomeController {
	
	RestTemplate rt = new RestTemplate();
	
	@Value("${events.key}")
	private String eventKey;
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
		
	}
	
	@RequestMapping("/landing-zone")
	public ModelAndView landing3(@RequestParam int postalCode, @RequestParam String localDate, @RequestParam String segmentName) {
		
		segmentName = segmentName.toLowerCase();

		EventResults response = rt.getForObject("https://app.ticketmaster.com/discovery/v2/events.json?&apikey=" + eventKey + "&postalCode=" + 
		postalCode + "&segmentName=" + segmentName + "&localDate=" +localDate, EventResults.class);
		
		
		//This would be to dig down into nested layers (would have to update return line to diggingDown)
//		ArrayList<Event> diggingDown = response.getEmb().getEvents();
		
		return new ModelAndView("landing-zone", "eventResults", response.getEmb().getEvents());

	}
	
	@RequestMapping("/landing-zone2")
	public ModelAndView landing2(@RequestParam int postalCode, @RequestParam String segmentName) {
		
		segmentName = segmentName.toLowerCase();

		EventResults response = rt.getForObject("https://app.ticketmaster.com/discovery/v2/events.json?countryCode=US&apikey=" + eventKey + "&postalCode=" + 
		postalCode + "&segmentName=" + segmentName, EventResults.class);
		
		
		//This would be to dig down into nested layers (would have to update return line to diggingDown)
//		ArrayList<Event> diggingDown = response.getEmb().getEvents();
		
		return new ModelAndView("landing-zone", "eventResults", response.getEmb().getEvents());
	
	}
	
}
