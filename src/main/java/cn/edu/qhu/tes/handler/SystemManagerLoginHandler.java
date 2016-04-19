package cn.edu.qhu.tes.handler;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.qhu.tes.entities.SystemManager;

@Controller
public class SystemManagerLoginHandler {
	@RequestMapping("/endLogin")
	public String endLogin() {
		return "endLogin";
	}

	@RequestMapping("systemManagerLogin")
	public String systemManagerLogin(HttpSession session, SystemManager manager) {
		System.out.println(manager.getUsername());
		System.out.println(manager.getPassword());
		return "redirect:systemManagerLoginSuccess";
	}

	@RequestMapping("systemManagerLoginSuccess")
	public String loginSuccess() {
		return "systemManagerDesktop";
	}

	@ModelAttribute
	public void getSystemManager(Map<String, Object> map) {
		map.put("systemManager", new SystemManager());
	}
}
