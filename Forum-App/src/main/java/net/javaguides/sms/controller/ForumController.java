package net.javaguides.sms.controller;

import net.javaguides.sms.entity.Forum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Forum;
import net.javaguides.sms.service.ForumService;

@Controller
public class ForumController {
	
	private ForumService forumService;

	public ForumController(ForumService forumService) {
		super();
		this.forumService = forumService;
	}
	

	@GetMapping("/forum")
	public String listForums(Model model) {
		model.addAttribute("forum", forumService.getAllForums());
		return "forum";
	}
	
	@GetMapping("/forum/new")
	public String createForumForm(Model model) {
		
		// create student object to hold student form data
		Forum forum = new Forum();
		model.addAttribute("forum", forum);
		return "create_forum";
		
	}
	
	@PostMapping("/forum")
	public String saveForum(@ModelAttribute("forum") Forum forum) {
		forumService.saveForum(forum);
		return "redirect:/forum";
	}
	
	@GetMapping("/forum/edit/{id}")
	public String editForumForm(@PathVariable Long id, Model model) {
		model.addAttribute("forum", forumService.getForumById(id));
		return "edit_forum";
	}

	@PostMapping("/forum/{id}")
	public String updateForum(@PathVariable Long id,
			@ModelAttribute("forum") Forum forum, Model model) {
		
		// get student from database by id
		Forum existingForum = forumService.getForumById(id);
		existingForum.setId(id);
		existingForum.setForumName(forum.getForumName());
		existingForum.setText(forum.getText());
		
		// save updated student object
		forumService.updateForum(existingForum);
		return "redirect:/forum";
	}
	

	@GetMapping("/forum/{id}")
	public String deleteForum(@PathVariable Long id) {
		forumService.deleteForumById(id);
		return "redirect:/forum";
	}
	
}
