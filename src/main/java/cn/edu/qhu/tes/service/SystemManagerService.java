package cn.edu.qhu.tes.service;

import java.util.List;

import cn.edu.qhu.tes.entities.ErrorMessage;
import cn.edu.qhu.tes.entities.SystemManager;

public interface SystemManagerService {
	public SystemManager validateLoginInfo(List<ErrorMessage> messages,
			SystemManager systemManager);

	public SystemManager getSystemManagerByUsername(String username);
}
