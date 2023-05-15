package com.duckrace;

import java.util.List;

class DuckRacerTest {

    public static void main(String[] args) {
        DuckRacer racer10 = new DuckRacer(10, "Kevin");
        System.out.println(racer10);

        // make it "win" a few times
        racer10.win(Reward.DEBIT_CARD);
        racer10.win(Reward.PRIZES);
        racer10.win(Reward.PRIZES);
        System.out.println(racer10);

        /*
        // "cheat" by getting rewards list and calling add() from here
        List<Reward> rewardsList = racer10.getRewards();
        rewardsList.add(Reward.DEBIT_CARD);
        rewardsList.add(Reward.DEBIT_CARD);
        rewardsList.add(Reward.DEBIT_CARD);
        System.out.println(racer10);
         */

        // retrieve a read-only view of rewards list
        List<Reward> rewardsList = racer10.getRewards();
        System.out.println(rewardsList);
        // make it win again, notice how rewardsList reflects the change
        racer10.win(Reward.DEBIT_CARD);
        System.out.println(rewardsList);
    }
}