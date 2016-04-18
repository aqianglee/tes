package cn.edu.qhu.tes.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeHandler {

	@RequestMapping("/frontLogin")
	public String frontLogin() {
		System.out.println("123");
		return "frontLogin";
	}

	@RequestMapping("/endLogin")
	public String endLogin() {
		System.out.println("456");
		return "endLogin";
	}

}
