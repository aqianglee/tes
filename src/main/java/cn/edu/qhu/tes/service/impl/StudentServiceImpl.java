package cn.edu.qhu.tes.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.qhu.tes.dao.GenericDao;
import cn.edu.qhu.tes.dao.UserAction;
import cn.edu.qhu.tes.entities.ErrorMessage;
import cn.edu.qhu.tes.entities.Student;
import cn.edu.qhu.tes.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private UserAction action;
	@Autowired
	private GenericDao dao;

	@Override
	public void validateStudent(List<ErrorMessage> messages, Student student) {

	}
}
