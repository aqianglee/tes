package cn.edu.qhu.tes.handler;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.qhu.tes.entities.User;

@Controller
public class UserLoginHandler {

	@RequestMapping("/frontLogin")
	public String frontLogin() {
		return "frontLogin";
	}

	@ModelAttribute
	public void getUser(Map<String, Object> map) {
		map.put("user", new User());
	}
}
