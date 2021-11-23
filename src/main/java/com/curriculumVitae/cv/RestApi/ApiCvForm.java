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

import com.curriculumVitae.cv.Entities.CvForm;
import com.curriculumVitae.cv.IManager.IManagerCvForm;

@RestController
@RequestMapping("/api/cvForm")
@CrossOrigin
public class ApiCvForm {
	private IManagerCvForm cvForm;

	@Autowired
	public ApiCvForm(IManagerCvForm cvForm) {
		this.cvForm = cvForm;
	}

	@GetMapping("/cvList")
	public List<CvForm> list(){
		return this.cvForm.getAll();
	}
	
	@PostMapping("/cvSave")
	public void save(@RequestBody CvForm cvForm) {
		this.cvForm.add(cvForm);
	}
	
	@PostMapping("/cvUpdate")
	public void update(@RequestBody CvForm cvForm) {
		this.cvForm.update(cvForm);
	}
	
	@DeleteMapping("/cvDelete")
	public void delete(@RequestBody CvForm cvForm) {
		this.cvForm.delete(cvForm);
	}
	
	@GetMapping("/cvGet/{id}")
	public Optional<CvForm> getById(@PathVariable int id){
		return this.cvForm.getById(id);
	}
}
