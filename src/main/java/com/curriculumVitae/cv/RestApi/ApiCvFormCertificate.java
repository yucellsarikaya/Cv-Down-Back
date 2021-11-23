package com.curriculumVitae.cv.RestApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curriculumVitae.cv.Entities.CvFormCertificate;
import com.curriculumVitae.cv.IManager.IManagerCvFormCertificate;

@RestController
@RequestMapping("/api/cvCertificate")
@CrossOrigin
public class ApiCvFormCertificate {
	private IManagerCvFormCertificate certificate;

	@Autowired
	public ApiCvFormCertificate(IManagerCvFormCertificate certificate) {
		this.certificate = certificate;
	}

	@GetMapping("/cvList")
	public List<CvFormCertificate> list() {
		return this.certificate.getAll();
	}

	@PostMapping("/cvSave")
	public void save(@RequestBody CvFormCertificate certificate) {
		this.certificate.add(certificate);
	}

	@PostMapping("/cvUpdate")
	public void update(@RequestBody CvFormCertificate certificate) {
		this.certificate.update(certificate);
	}

	@DeleteMapping("/cvDelete")
	public void delete(@RequestBody CvFormCertificate certificate) {
		this.certificate.delete(certificate);
	}

	@GetMapping("/cvGet/{id}")
	public Optional<CvFormCertificate> getById(@PathVariable int id) {
		return this.certificate.getById(id);
	}
}
