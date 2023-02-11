package com.glpsns.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.glpsns.entity.Story;

public interface StoryRepository extends JpaRepository<Story, Long>, QuerydslPredicateExecutor<Story>, StoryRepositoryCustom {
	/*
	 * List<Story> findByNickname(String nickname);
	 * 
	 * List<Story> findByNicknameOrContent(String nickname, String content);
	 * 
	 * List<Story> findByEmail(String email);
	 * 
	 * List<Story> findByGameTag(String gameTag);
	 */
	
}
