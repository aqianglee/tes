package cn.edu.qhu.tes.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import cn.edu.qhu.tes.entities.ErrorMessage;

import com.edu.qhu.tes.CoreTest;

public class ValidateServiceImplTest extends CoreTest {
	@Test
	public void testValidateListOfErrorMessageStringStringObjectArray() {
		List<ErrorMessage> errorMessages = new ArrayList<ErrorMessage>();
		validateService.validate(errorMessages, "", "username");
		assert 1 == errorMessages.size();
		assert "missing.username".equals(errorMessages.get(0).getKey());
	}

	@Test
	public void testValidateListOfErrorMessageStringStringObjectArray2() {
		List<ErrorMessage> errorMessages = new ArrayList<ErrorMessage>();
		validateService.validate(errorMessages, "    ", "username");
		assert 1 == errorMessages.size();
		assert "missing.username".equals(errorMessages.get(0).getKey());
	}

	@Test
	public void testValidateListOfErrorMessageStringStringObjectArray3() {
		List<ErrorMessage> errorMessages = new ArrayList<ErrorMessage>();
		validateService.validate(errorMessages, "  aqiang  ", "username");
		assert 0 == errorMessages.size();
	}
}
