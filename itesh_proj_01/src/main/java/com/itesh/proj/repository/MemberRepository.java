package com.itesh.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itesh.proj.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{

}
