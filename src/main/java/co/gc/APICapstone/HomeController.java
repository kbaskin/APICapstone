package co.gc.APICapstone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
//		HttpHeaders headers = new HttpHeaders();
//		headers.add(HttpHeaders.USER_AGENT, "Testing!");
//		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
//		HttpEntity<String> entity = new HttpEntity<>("parameters", headers); 
		String url = "https://app.ticketmaster.com/discovery/v2/events?apikey=os6UnKvE5d7uqNVEhHKDGL9ReGhTHcRB&locale=*";
		EventResults eventResults = rt.getForObject(url, EventResults.class);
		
//		String response = rt.getForObject("https://app.ticketmaster.com/discovery/v2/events.json?size=1&apikey=" + eventKey, String.class);
//		System.out.println(response);

		return new ModelAndView("index", "eventResults", eventResults);
	}
	
	
}
