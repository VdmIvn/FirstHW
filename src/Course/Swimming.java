package Course;

import Team.TeamMember;

public class Swimming extends Barrier {

    public Swimming(int barrierLvl) {
        super(barrierLvl);
    }

    public void startChallenge(TeamMember member) {
        member.swim(super.getBarrierLvl());
    }
}
