package cn.edu.qhu.tes.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cn.edu.qhu.tes.entities.ErrorMessage;
import cn.edu.qhu.tes.service.ValidateService;

@Service
public class ValidateServiceImpl implements ValidateService {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ValidateServiceImpl.class);

	@Override
	public void validate(List<ErrorMessage> errorMessages, String field,
			String fieldName, Object... args) {
		LOGGER.info("validate with parameter string");
		if (StringUtils.isBlank(field)) {
			errorMessages.add(new ErrorMessage("missing." + fieldName, args));
		}
	}

	@Override
	public void validate(List<ErrorMessage> errorMessages, Date field,
			String fieldName, Object... args) {
		LOGGER.info("validate with parameter Date");
		if (field == null) {
			errorMessages.add(new ErrorMessage("missing." + fieldName, args));
		}
	}

	@Override
	public void validate(List<ErrorMessage> errorMessages, Object field,
			String fieldName, Object... args) {
		LOGGER.info("validate with parameter object");
		if (field == null) {
			errorMessages.add(new ErrorMessage("missing." + fieldName, args));
		}
	}

}
