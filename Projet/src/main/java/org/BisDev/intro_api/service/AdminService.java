package org.BisDev.intro_api.service;

import org.BisDev.intro_api.model.Member;
import org.BisDev.intro_api.repository.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private MemberRepo memberRepo;

    public Member creatMember(String name, String firstName, Date dateBirth,String email,String pwd,String numTel,String adress,String city,String ptd,double point){

        HashMap<String,String> mistake = new HashMap<>();
        Optional<Member> emailExist = memberRepo.FindMemberByEmail(email);
        if (emailExist.isPresent()){
            mistake.put("email present","the account is already");
        }


        return null;
    }
}
