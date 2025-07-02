public class TeamProject {
    public static void main(String[] args) {
        TeamMember nina = new TeamMember("나나" , true , true);
        TeamMember teammate = new TeamMember("팀원A" , false , false);

        Advisor 강사 = new Advisor("강사님");

        Project project = new Project( nina , teammate , 강사 );
        project.run();
    } //main end
} //class end

class TeamMember {
    String name;
    boolean listensToAdvice;
    boolean takesResponsibility;

    public TeamMember(String name, boolean listensToAdvice, boolean takesResponsibility){
        this.name = name;
        this.listensToAdvice = listensToAdvice;
        this.takesResponsibility = takesResponsibility;
    }

    public boolean isGoodTeammate(){
        return listensToAdvice && takesResponsibility;
    }
}

class Advisor {
    String name;

    public Advisor(String name){
        this.name = name;
    }

    public String giveAdvice() {
        return "로직을 개선하려면 이 방향으로 가는 게 좋겠습니다. ";
    }
}

class Project{
    TeamMember d1 , d2;
    Advisor advisor;

    public Project(TeamMember d1 , TeamMember d2 , Advisor advisor) {
        this.d1 = d1;
        this.d2 = d2;
        this.advisor = advisor;
    }

    public void run() {
        System.out.println(advisor.name + "조언 : " + advisor.giveAdvice());

        if(!d2.listensToAdvice){
            System.out.println(d2.name + "는 조언을 무시했습니다...");
            System.out.println("⚠\uFE0F 경고 : 프로젝트 품질 저하 예상");
        }

        if ( !d2.takesResponsibility ){
            System.out.println(d2.name + "는 결과에 책임지지 않습니다...");
            System.out.println("\uD83E\uDDE8 위기 : 니나 혼자 고군분투 중");
        }

        if( d1.isGoodTeammate()){
            System.out.println(d1.name + "는 끝까지 최선을 다했습니다. \uD83D\uDC4D");
        }
        System.out.println("\uD83D\uDCCC 교훈 : 사람은 코드보다 더 중요하다.");
    }

}