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

import com.curriculumVitae.cv.Entities.CvFormAreas_Of_Interest;
import com.curriculumVitae.cv.IManager.IManagerCvFormAreas_Of_Interest;

@RestController
@RequestMapping("/api/cvFromAreas_Of_Interest")
@CrossOrigin
public class ApiCvFormAreas_Of_Interest {
	private IManagerCvFormAreas_Of_Interest areas_Of_Interest;

	@Autowired
	public ApiCvFormAreas_Of_Interest(IManagerCvFormAreas_Of_Interest areas_Of_Interest) {
		this.areas_Of_Interest = areas_Of_Interest;
	}

	@GetMapping("/cvList")
	public List<CvFormAreas_Of_Interest> list(){
		return this.areas_Of_Interest.getAll();
	}
	
	@PostMapping("/cvSave")
	public void save(@RequestBody CvFormAreas_Of_Interest areas_Of_Interest) {
		this.areas_Of_Interest.add(areas_Of_Interest);
	}
	
	@PostMapping("/cvUpdate")
	public void update(@RequestBody CvFormAreas_Of_Interest areas_Of_Interest) {
		this.areas_Of_Interest.add(areas_Of_Interest);
	}
	
	@DeleteMapping("/cvDelete")
	public void delete(@RequestBody CvFormAreas_Of_Interest areas_Of_Interest) {
		this.areas_Of_Interest.delete(areas_Of_Interest);
	}

	@GetMapping("/cvGet/{id}")
	public Optional<CvFormAreas_Of_Interest> getById(@PathVariable int id){
		return this.areas_Of_Interest.getById(id);
	}
	
}
