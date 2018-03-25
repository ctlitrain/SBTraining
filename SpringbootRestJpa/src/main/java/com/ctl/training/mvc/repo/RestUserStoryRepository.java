package com.ctl.training.mvc.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ctl.training.mvc.model.UserStory;

@RepositoryRestResource(collectionResourceRel = "userstory", path = "userstory")
public interface RestUserStoryRepository extends PagingAndSortingRepository<UserStory, Long>  {
	

}
