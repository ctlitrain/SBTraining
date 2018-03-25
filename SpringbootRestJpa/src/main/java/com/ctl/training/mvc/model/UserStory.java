package com.ctl.training.mvc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Rajesh
 *
 */
@Entity
@Table(name = "USER_STORY")
public class UserStory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long storyId;
	
	@Column
	String name;
	
	@Column
	String owner;
	
	@Column
	String details;
	
	@Column
	int sprint;
	
	@Column
	Date createdDate;
	
	public Long getStoryId() {
		return storyId;
	}
	
	public void setStoryId(Long storyId) {
		this.storyId = storyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getSprint() {
		return sprint;
	}
	public void setSprint(int sprint) {
		this.sprint = sprint;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "UserStory [storyId=" + storyId + ", name=" + name + ", owner=" + owner + ", details=" + details
				+ ", sprint=" + sprint + ", createdDate=" + createdDate + "]";
	}

}
