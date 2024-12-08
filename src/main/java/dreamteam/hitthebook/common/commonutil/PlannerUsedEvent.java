package dreamteam.hitthebook.common.commonutil;

import dreamteam.hitthebook.domain.member.entity.Member;
import dreamteam.hitthebook.domain.plannerschedule.entity.PlannerSchedule;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PlannerUsedEvent {
    private final Member member;
    private final PlannerSchedule plannerSchedule;
}
