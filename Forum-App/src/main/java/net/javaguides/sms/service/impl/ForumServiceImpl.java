package net.javaguides.sms.service.impl;

import java.util.List;

import net.javaguides.sms.entity.Forum;
import org.springframework.stereotype.Service;

import net.javaguides.sms.repository.ForumRepository;
import net.javaguides.sms.service.ForumService;

@Service
public class ForumServiceImpl implements ForumService {

	private ForumRepository forumRepository;
	
	public ForumServiceImpl(ForumRepository forumRepository) {
		super();
		this.forumRepository = forumRepository;
	}

	@Override
	public List<Forum> getAllForums() {
		return forumRepository.findAll();
	}

	@Override
	public Forum saveForum(Forum forum) {
		return forumRepository.save(forum);
	}

	@Override
	public Forum getForumById(Long id) {
		return forumRepository.findById(id).get();
	}

	@Override
	public List<Forum> getForumsByName(String name) {
		return forumRepository.findByForumNameContainingIgnoreCase(name);
	}


	@Override
	public Forum updateForum(Forum forum) {
		return forumRepository.save(forum);
	}

	@Override
	public void deleteForumById(Long id) {
		forumRepository.deleteById(id);
	}

}
