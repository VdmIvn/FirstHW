package Course;

import Team.TeamMember;

public class Running extends Barrier {

    public Running(int barrierLvl) {
        super(barrierLvl);
    }

    public void startChallenge(TeamMember member) {
        member.run(super.getBarrierLvl());
    }

}
