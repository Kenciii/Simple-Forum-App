package net.javaguides.sms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "forums")
public class Forum {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "forum_name", nullable = false)
	@NotBlank(message = "Forum name is required")
	@Size(min = 3, max = 50, message = "Forum name must be between 3 and 50 characters")
	private String forumName;
	
	@Column(name = "text")
	@NotBlank(message = "Text is required")
	@Size(min = 10, max = 500, message = "Text must be between 10 and 500 characters")
	private String text;
	
	public Forum() {
		
	}
	
	public Forum(String forumName, String text) {
		super();
		this.forumName = forumName;
		this.text = text;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getForumName() {
		return forumName;
	}
	public void setForumName(String forumName) {
		this.forumName = forumName;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
