package com.hrms.backend.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.backend.hrms.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer> {

}
