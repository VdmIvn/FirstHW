package Course;

import Team.TeamMember;

public abstract class Barrier {

    private final int barrierLvl;

    public Barrier(int barrierLvl) {
        this.barrierLvl = barrierLvl;
    }

    public int getBarrierLvl() {
        return barrierLvl;
    }

    public void startChallenge(TeamMember member) {
    }
}
