package dreamteam.hitthebook.domain.member.repository;

import dreamteam.hitthebook.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmailIdAndPassword(String emailId, String password);
}
