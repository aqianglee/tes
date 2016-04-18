package cn.edu.qhu.tes.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.qhu.tes.dao.GenericDao;
import cn.edu.qhu.tes.dao.UserAction;
import cn.edu.qhu.tes.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private UserAction action;
	@Autowired
	private GenericDao dao;
}
