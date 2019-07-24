package training.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import training.sample.dao.LoginDao;
import training.sample.model.LoginClass;

@Service
public class LoginService {

	@Autowired
	LoginDao Logindao;
	public void insertlog(LoginClass log) {
		
		 Logindao.insertlog(log);
	}

}
