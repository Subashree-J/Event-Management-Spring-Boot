package mycom;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Event;
import com.service.EventService;

@Controller
@RequestMapping("/")
@ComponentScan("com")
public class AppController {
	
	@Autowired
	EventService service;
	
	public EventService getService() {
		return service;
	}

	public void setService(EventService service) {
		this.service = service;
	}
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String home(ModelMap model) {
		List<Event> events = service.getAllEvents();
		model.addAttribute("events", events);
        return "home";
    }
	
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
    public String newEvent(ModelMap model) {
        Event event = new Event();
        model.addAttribute("event", event);
        return "newevent";
    }
	
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String saveDonar(@Valid Event event, BindingResult result, ModelMap model) { 
		service.addEvent(event);
        model.addAttribute("success", "Event " + event.getEventName() + " added successfully");
        return "success";
    }

}