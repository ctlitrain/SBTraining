package com.ctl.training.mvc.rest;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctl.training.mvc.model.UserStory;
import com.ctl.training.mvc.repo.UserStoryRepository;

@RestController
@RequestMapping("/story")
public class StoryController {

	
	private static Logger log =  LoggerFactory.getLogger(StoryController.class);
	
	@Autowired
	UserStoryRepository userStoryRepository;

	/**
	 * POST /create --> Create a new booking and save it in the database.
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes =  MediaType.APPLICATION_JSON_VALUE)
	public UserStory create(@RequestBody UserStory userstory) {
		
		log.info("Create call" + userstory.toString());
		userstory.setCreatedDate(new Date());
		return userStoryRepository.save(userstory);
	}

	/**
	 * GET /read --> Read a story by story id from the database.
	 */
	@RequestMapping("/read/{id}")
	public UserStory read(@PathVariable long id) {
		log.info("Find user story: " + id);
		return userStoryRepository.findByStoryId(id);
	}

	/**
	 * PUT /update --> Update a userstory record and save it in the database.
	 */
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public UserStory update(@RequestParam Long storyId, @RequestParam String details) {
		log.info("Updating user story: " + storyId);
		UserStory story = userStoryRepository.findByStoryId(storyId);
		story.setDetails(details);
		return userStoryRepository.save(story);
	}
	
	
	/**
	 * GET /read --> Read a story by story id from the database.
	 */
	@RequestMapping("/list")
	public List<UserStory> list() {
		log.info("Get All user story");
		return userStoryRepository.findAll();
	}


}
