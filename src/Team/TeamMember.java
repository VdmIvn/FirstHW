package Team;

public class TeamMember {

    private boolean isBarrierPassed = false;
    private final String name;
    private final int strength;

    public TeamMember(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public boolean isBarrierPassed() {
        return isBarrierPassed;
    }

    public String getName() {
        return name;
    }

    public void run(int barrierDifficulty) {
        if (checkStrength(barrierDifficulty)) {
            System.out.println("Running distance was passed");
    }
        else {
            System.out.println("Running distance NOT passed");
    }
}

    public void swim(int barrierDifficulty) {
        if (checkStrength(barrierDifficulty)) {
            System.out.println("Swimming distance was passed");
        }
        else {
            System.out.println("Swimming distance was NOT passed");
        }
    }

    public void ride(int barrierDifficulty) {
        if (checkStrength(barrierDifficulty)) {
            System.out.println("Riding distance was passed");
        }
        else {
            System.out.println("Riding distance was NOT passed");
        }
    }

    private boolean checkStrength(int barrierDifficulty) {
        return strength > barrierDifficulty || strength == barrierDifficulty;
    }

/*    private void changeStatus(boolean isThisBarrierPassed) {
        isBarrierPassed = isThisBarrierPassed;*/
    }

