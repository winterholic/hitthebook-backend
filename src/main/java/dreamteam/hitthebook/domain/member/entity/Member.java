package dreamteam.hitthebook.domain.member.entity;

import dreamteam.hitthebook.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "is_deleted = false")
@SQLDelete(sql = "UPDATE Member SET is_deleted = true WHERE member_id = ?")
@Getter @Setter
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "email_id", unique = true)
    private String emailId;

    private String password;

//    @Column(name = "nickname", nullable = false, unique = true) //length = 20
    private String nickname;

    private LocalDateTime lastLoginedAt;

    @Column(name = "point")
    private int point = 0;

    private int level = 1;

    public Member (String emailId, String paassword, String nickname){
        this.emailId = emailId;
        this.password = paassword;
        this.nickname = nickname;
    }

//    public static Member createByRequestDto(LoginDto.JoinRequestDto joinRequestDto){
//        return new Member(joinRequestDto.emailId, joinRequestDto.password, joinRequestDto.nickname);
//    }

}