package com.curriculumVitae.cv.Business;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.curriculumVitae.cv.Entities.MemberTransactions;
import com.curriculumVitae.cv.IDataAccess.IDataPerson;
import com.curriculumVitae.cv.IManager.IManagerPerson;

@Service
public class BusinessPerson implements IManagerPerson {
	private IDataPerson accessPerson;
	private JavaMailSender javaMailSender;

	@Autowired
	public BusinessPerson(IDataPerson accessPerson, JavaMailSender javaMailSender) {
		this.accessPerson = accessPerson;
		this.javaMailSender = javaMailSender;
	}

	@Override
	public void save(MemberTransactions person) {
		accessPerson.save(person);
		sendMail(person.getMail());
	}

	public void sendMail(String mail) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setTo(mail);
		String title = "Hoşgeldiniz";
		simpleMailMessage.setSubject(title);
		String contents = "Sayfamıza kayıt olduğunuz için teşekkür ederiz, oluşturduğunuz özgeçmişler de bizimde faydamız olması dileğiyle iyi günler dileriz";
		simpleMailMessage.setText(contents);
		javaMailSender.send(simpleMailMessage);
	}

	@Override
	public Optional<MemberTransactions> getById(String id) {
		return this.accessPerson.findById(id);
	}

	@Override
	public void update(MemberTransactions person) {
		this.accessPerson.save(person);
		sendMail(person.getMail());
	}
}
