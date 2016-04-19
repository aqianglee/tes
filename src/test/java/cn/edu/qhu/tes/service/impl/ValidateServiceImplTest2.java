package cn.edu.qhu.tes.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.testng.annotations.Test;

import cn.edu.qhu.tes.entities.ErrorMessage;

import com.edu.qhu.tes.CoreTest;

public class ValidateServiceImplTest2 extends CoreTest {

	@Test
	public void testValidateListOfErrorMessageDateStringObjectArray() {
		List<ErrorMessage> errorMessages = new ArrayList<ErrorMessage>();
		validateService.validate(errorMessages, new Date(), "registerDate");
		assert 0 == errorMessages.size();
	}

	@Test
	public void testValidateListOfErrorMessageDateStringObjectArray2() {
		Date date = null;
		List<ErrorMessage> errorMessages = new ArrayList<ErrorMessage>();
		validateService.validate(errorMessages, date, "registerDate");
		assert 1 == errorMessages.size();
		assert "missing.registerDate".equals(errorMessages.get(0).getKey());
	}

}
