package com.edu.qhu.tes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;

import cn.edu.qhu.tes.dao.GenericDao;
import cn.edu.qhu.tes.dao.UserAction;
import cn.edu.qhu.tes.service.SystemManagerService;
import cn.edu.qhu.tes.service.ValidateService;

@ContextConfiguration(locations = { "classpath:beans.xml",
		"classpath:beans-jpa-h2.xml" })
public class CoreTest extends AbstractTransactionalTestNGSpringContextTests {

	@Autowired
	protected ValidateService validateService;
	@Autowired
	protected SystemManagerService systemManagerService;
	@Autowired
	protected GenericDao dao;
	@Autowired
	protected UserAction action;

}
