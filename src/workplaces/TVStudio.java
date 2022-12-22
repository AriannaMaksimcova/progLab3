package workplaces;

import characters.OwnerOfTVStudio;
import enums.Performance;
import characters.Showman;

public class TVStudio extends WorkPlace{
    private static boolean Dunno = false;
    private OwnerOfTVStudio owner;
    private Showman[] workersOfTVStudio;
    public TVStudio(OwnerOfTVStudio owner, Showman[] workersOfTVStudio){
        this.owner = owner;
        this.workersOfTVStudio = workersOfTVStudio;
        owner.setSalary(1000);
        for (Showman worker : workersOfTVStudio) {
            owner.assignSalary(worker, 50);
        }
    }
    public void showPerformance(){
        Performance performance;
        if (owner.isWasThreatened()){
            owner.toAsk("Почему вы не показываете представление "+ Performance.DUNNO_ON_THE_MOON +
                    "?", workersOfTVStudio[0]);
            workersOfTVStudio[0].getAngry();
            double needSalary = workersOfTVStudio[0].putForwardConditions(workersOfTVStudio[1], owner);
            int i = 100;
            boolean isAgreed;
            do{
                owner.toSay("Я предлагаю вам з/п в размере " + i);
                isAgreed = workersOfTVStudio[0].isAgreeWithConditions(owner, needSalary, i);
                i += 300;
            } while (!isAgreed);
            owner.agreeWithConditions(workersOfTVStudio[0]);
            owner.assignSalary(workersOfTVStudio[0], i);
            owner.assignSalary(workersOfTVStudio[1], i);
            Dunno = true;
        }
        if (!Dunno){
            performance = Performance.randomPerformance();
        } else{
            performance = Performance.DUNNO_ON_THE_MOON;
        }
        System.out.println("В эфире: " + performance + ".");
    }
}
