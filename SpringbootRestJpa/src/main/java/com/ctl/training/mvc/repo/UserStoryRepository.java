package com.ctl.training.mvc.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ctl.training.mvc.model.UserStory;

@Transactional
public interface UserStoryRepository extends CrudRepository<UserStory, Long> {
 
 /**
    * This method will find UserStory by owner.
    */
	
   public List<UserStory> findByOwner(String owner);
   
   public UserStory findByStoryId(Long id);
   
   public List<UserStory> findAll();
   
}

