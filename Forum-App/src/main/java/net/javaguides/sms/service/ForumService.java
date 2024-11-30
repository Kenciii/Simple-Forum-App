package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Forum;

public interface ForumService {
	List<Forum> getAllForums();
	
	Forum saveForum(Forum forum);
	
	Forum getForumById(Long id);
	
	Forum updateForum(Forum forum);
	
	void deleteForumById(Long id);
}
