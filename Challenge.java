public class Challenge {
    /*
        The code structure below is adapted from the following source:
        https://stackoverflow.com/questions/4280727/java-creating-an-array-of-methods
        In effect, it creates an "array of methods" such that I can call startChallenges (below)
        by passing an index to the startChallenge method.
     */
    interface StartChallenge {
        double startChallenge();
    }

    private StartChallenge[] startChallenges = new StartChallenge[]{
            new StartChallenge() {
                public double startChallenge() {
                    return dragOnATemptation();
                }
            }
    };

    public double startChallenge(int index) {
        return startChallenges[index].startChallenge();
    }

    public double dragOnATemptation() {
        System.out.println("Drag on a Temptation!");
        return 0.0;
    }
}

