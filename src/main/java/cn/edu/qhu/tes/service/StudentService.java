package cn.edu.qhu.tes.service;

import java.util.List;

import cn.edu.qhu.tes.entities.ErrorMessage;
import cn.edu.qhu.tes.entities.Student;

public interface StudentService {

	public void validateStudent(List<ErrorMessage> messages, Student student);

}
