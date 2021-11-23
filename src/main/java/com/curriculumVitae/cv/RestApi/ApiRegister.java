package com.curriculumVitae.cv.RestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curriculumVitae.cv.Entities.CvForm;
import com.curriculumVitae.cv.Entities.MemberTransactions;
import com.curriculumVitae.cv.IDataAccess.IDataPerson;
import com.curriculumVitae.cv.IManager.IManagerPerson;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
@RequestMapping("/api/person")
@CrossOrigin
public class ApiRegister {
	private IManagerPerson iManagerPerson;
	private IDataPerson accessPerson;

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	public ApiRegister(IManagerPerson iManagerPerson, IDataPerson accessPerson) {
		this.iManagerPerson = iManagerPerson;
		this.accessPerson = accessPerson;
	}

	@PostMapping("/save")
	public void add(@RequestBody MemberTransactions person) {
		this.iManagerPerson.save(person);
	}

	@GetMapping("/login")
	public ResponseEntity<List<MemberTransactions>> getPersonMailAndPass(@RequestParam String mail,
			@RequestParam String pass) {
		return new ResponseEntity<>(accessPerson.findByMailAndPass(mail, pass), HttpStatus.OK);
	}

	@GetMapping("/getId")
	public List<CvForm> findEndId() {
		return entityManager.createQuery("SELECT p FROM CvForm p ORDER BY p.id desc", CvForm.class).setMaxResults(1).getResultList();
	}
	
	@GetMapping("/getById/{id}")
	public Optional<MemberTransactions> getById(@PathVariable String id) {
		return this.accessPerson.findById(id);
	}

	@PostMapping("/update")
	public void update(@RequestBody MemberTransactions person) {
		this.iManagerPerson.update(person);
	}
	
}
