package cn.edu.qhu.tes.handler;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrepareDataHandler {

	@RequestMapping("prepareData")
	public String prepareData() {
		try {
			
			return "1";
		} catch (Exception e) {
			return ExceptionUtils.getFullStackTrace(e);
		}
	}
}
