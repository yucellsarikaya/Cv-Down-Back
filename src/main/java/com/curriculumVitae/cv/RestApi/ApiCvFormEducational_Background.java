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

import com.curriculumVitae.cv.Entities.CvFormEducational_Background;
import com.curriculumVitae.cv.IManager.IManagerCvFormEducational_Background;

@RestController
@RequestMapping("/api/cvEducational_Background")
@CrossOrigin
public class ApiCvFormEducational_Background {
	private IManagerCvFormEducational_Background educational_Background;

	@Autowired
	public ApiCvFormEducational_Background(IManagerCvFormEducational_Background educational_Background) {
		this.educational_Background = educational_Background;
	}

	@GetMapping("/cvList")
	public List<CvFormEducational_Background> list() {
		return this.educational_Background.getAll();
	}

	@PostMapping("/cvSave")
	public void save(@RequestBody CvFormEducational_Background cvEducational_Background) {
		this.educational_Background.add(cvEducational_Background);
	}

	@PostMapping("/cvUpdate")
	public void update(@RequestBody CvFormEducational_Background cvEducational_Background) {
		this.educational_Background.update(cvEducational_Background);
	}

	@DeleteMapping("/cvDelete")
	public void delete(@RequestBody CvFormEducational_Background cvEducational_Background) {
		this.educational_Background.delete(cvEducational_Background);
	}

	@GetMapping("/cvGet/{id}")
	public Optional<CvFormEducational_Background> getById(@PathVariable int id) {
		return this.educational_Background.getById(id);
	}

}
