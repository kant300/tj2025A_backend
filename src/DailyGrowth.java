public class DailyGrowth {
    public static void main(String[] args) {
        TeamMember nina = new TeamMember("니나");

        nina.learn("자바 문법");
        nina.fixBug("문자열 오류");
        nina.reflect("팀워크에서의 교훈");
        nina.levelUp();

        nina.showStatus();
    }
}

class TeamDeveloper {
    String name;
    int level = 1;
    int bugsFixed = 0;
    int lessonsLearned = 0;

    public TeamDeveloper(String name){
        this.name = name;
        System.out.println(name + "님의 개발 여정이 시작됩니다.");
    }

    public void learn(String topic){
        System.out.println("\uD83D\uDCD8 학습한 내용 : " + topic);
        lessonsLearned++;
    }

    public void fixBug(String bug){
        System.out.println("\uD83E\uDDE0 해결한 오류 : " + bug);
       bugsFixed++;
    }

    public void reflect(String insight){
        System.out.println("\uD83E\uDDE0 오늘의 교훈 : " + insight);
        lessonsLearned++;
    }

    public void levelUp(){
        if(bugsFixed + lessonsLearned >= 3){
            level++;
            System.out.println("\uD83C\uDF89 레벨 업! 현재 레벨 : " + level);
        } else {
            System.out.println("\uD83D\uDCC8 아직 성장 중입니다... 조금만 더!");
        }
    }

    public void showStatus(){
        System.out.println("\n[" + name + "의 하루 요약]");
        System.out.println("레벨 : " + level);
        System.out.println("버그 해결 수 : " + bugsFixed);
        System.out.println("배운 교훈 수 : " + lessonsLearned);
        System.out.println("\uD83D\uDCAA 오늘도 한 걸음 더 성장했습니다.");
    }
}