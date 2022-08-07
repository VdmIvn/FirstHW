package Course;

import Team.TeamMember;

public class Riding extends Barrier    {

    public Riding(int barrierLvl) {
        super(barrierLvl);
    }

    public void startChallenge(TeamMember member) {
        member.ride(super.getBarrierLvl());
    }
}
