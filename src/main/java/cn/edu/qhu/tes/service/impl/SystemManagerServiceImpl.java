package cn.edu.qhu.tes.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.qhu.tes.dao.GenericDao;
import cn.edu.qhu.tes.dao.Order;
import cn.edu.qhu.tes.dao.Restrictions;
import cn.edu.qhu.tes.entities.ErrorMessage;
import cn.edu.qhu.tes.entities.SystemManager;
import cn.edu.qhu.tes.service.SystemManagerService;
import cn.edu.qhu.tes.service.ValidateService;

public class SystemManagerServiceImpl implements SystemManagerService {

	@Autowired
	private ValidateService validateService;
	@Autowired
	private GenericDao dao;

	@Override
	public SystemManager validateLoginInfo(List<ErrorMessage> messages,
			SystemManager systemManager) {
		validateService.validate(messages, systemManager.getUsername(),
				"username");
		validateService.validate(messages, systemManager.getPassword(),
				"password");
		if (messages.size() > 0) {
			return null;
		}
		if (messages.size() > 0) {
			return null;
		}
		return null;
	}

	@Override
	public SystemManager getSystemManagerByUsername(String username) {
		List<SystemManager> managers = dao.list(SystemManager.class,
				Arrays.asList(Restrictions.eq("username", username)),
				Order.asc("id"));
		return managers.isEmpty() ? null : managers.get(0);
	}

}
