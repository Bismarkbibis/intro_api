package org.BisDev.intro_api.repository;

import org.BisDev.intro_api.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepo extends JpaRepository<Member,Integer> {

@Query("SELECT M.email FROM Member M WHERE  M.email =:email")
    public Optional<Member> FindMemberByEmail (String email);
}
