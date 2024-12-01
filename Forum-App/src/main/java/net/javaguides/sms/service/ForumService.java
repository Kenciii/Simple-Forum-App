package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Forum;

public interface ForumService {
	List<Forum> getAllForums();
	
	Forum saveForum(Forum forum);
	
	Forum getForumById(Long id);

	List<Forum> getForumsByName(String name);


	Forum updateForum(Forum forum);
	
	void deleteForumById(Long id);
}
