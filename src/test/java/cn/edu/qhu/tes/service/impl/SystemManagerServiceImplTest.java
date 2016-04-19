package cn.edu.qhu.tes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.qhu.tes.entities.SystemManager;

import com.edu.qhu.tes.CoreTest;

public class SystemManagerServiceImplTest extends CoreTest {

	@Autowired
	public void test() {
		String username = "aqiang";
		SystemManager systemManager = new SystemManager();
		systemManager.setUsername("aqiang");
		systemManager.setPassword("123");
		action.sync(systemManager);
		SystemManager systemManager2 = systemManagerService
				.getSystemManagerByUsername(username);
		assert systemManager2 != null;
	}
}
