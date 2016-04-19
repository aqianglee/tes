package cn.edu.qhu.tes.service;

import java.util.Date;
import java.util.List;

import cn.edu.qhu.tes.entities.ErrorMessage;

public interface ValidateService {

	public void validate(List<ErrorMessage> messages, String field,
			String fieldName, Object... args);

	public void validate(List<ErrorMessage> messages, Date field,
			String fieldName, Object... args);

	public void validate(List<ErrorMessage> messages, Object field,
			String fieldName, Object... args);

}
