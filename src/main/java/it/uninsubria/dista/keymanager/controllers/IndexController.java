package it.uninsubria.dista.keymanager.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@ResponseBody
	@RequestMapping(value = "/", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
	public String index(Model uiModel) throws JSONException {

		JSONObject output = new JSONObject();
		output.put("response", "test successful");
		
		return output.toString();
	}

	
}
