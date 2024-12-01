package net.javaguides.sms.repository;

import net.javaguides.sms.entity.Forum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ForumRepository extends JpaRepository<Forum, Long>{

    List<Forum> findByForumNameContainingIgnoreCase(String name);
}
