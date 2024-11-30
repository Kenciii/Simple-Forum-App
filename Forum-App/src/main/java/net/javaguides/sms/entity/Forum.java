package net.javaguides.sms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "forums")
public class Forum {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "forum_name", nullable = false)
	private String forumName;
	
	@Column(name = "text")
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
