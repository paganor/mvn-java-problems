package api;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.StringWriter;

public class Hello {
	
	private final String name;
	
	public Hello(String name) {
		this.name = name;
	}
	
	@SuppressWarnings("unchecked")
	public String toString() {
		String result = "hello " + name;
		JSONObject obj = new JSONObject();
		obj.put("result", result);
		StringWriter out = new StringWriter();
		try {
		obj.writeJSONString(out);
		} catch (IOException e) { }
		String jsonText = out.toString();
		return jsonText;
	}
}
