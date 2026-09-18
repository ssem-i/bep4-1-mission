package com.back.boundedContext.member.domain;

import com.back.global.jpa.entity.BaseIdAndTime;
import com.back.shared.member.domain.SourceMember;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Table(name = "MEMBER_MEMBER")
@Entity
@NoArgsConstructor
public class Member extends SourceMember {
    @Column(unique = true)
    private String username;
    private String password;
    private String nickname;
    private int activityScore;

    public Member(String username, String password, String nickname) {
        super(username, password, nickname);
    }
    public int increaseActivityScore(int amount) {
        setActivityScore(getActivityScore() + amount);

        return getActivityScore();
    }
}