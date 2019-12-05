package co.gc.APICapstone;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.gc.APICapstone.entity.Event;
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
		if (segmentName.equals("arts")) {
			segmentName = "arts%20&%20theatre";
		}

		EventResults response = rt.getForObject("https://app.ticketmaster.com/discovery/v2/events.json?&apikey=" + eventKey + "&postalCode=" + 
		postalCode + "&segmentName=" + segmentName + "&localDate=" +localDate, EventResults.class);
		
		
		//This would be to dig down into nested layers (would have to update return line to diggingDown)
		ArrayList<Event> diggingDown = null;
		try {
			diggingDown = response.getEmb().getEvents();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (diggingDown == null) {
			return new ModelAndView("no-results", "noresults", "There is no data for this search :(");
		}
		
		return new ModelAndView("landing-zone", "eventResults", diggingDown);

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
