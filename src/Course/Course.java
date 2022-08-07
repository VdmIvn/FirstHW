package Course;

import Team.Team;
import Team.TeamMember;

public class Course {
    private Barrier[] barriers;

    public Course(Barrier... barriers) {
        this.barriers = barriers;
    }
    
    public void doIt(Team team) {
        for (TeamMember member : team.getMembers()) {
            for (Barrier barrier : barriers) {
                barrier.startChallenge(member);
                if (member.isBarrierPassed() == false) {
                    break;
                }
            }
        }
    }
}
