public class LifeTrial {
    public static void main(String[] args) {
        DreamChaser nina = new DreamChaser("니나");
        nina.injury("발가락 골절");
        nina.faceObstacle("몸이 불편하니 움직임 줄어듦");
        nina.reflect();
        nina.chooseToContinue();
    }
}
class DreamChaser {
    String name;
    boolean discouraged = false;

    public DreamChaser (String name){
        this.name = name;
    }

    public void injury(String cause){
        System.out.println("\uD83D\uDCA5" + cause + "발생! 몸이 아프다...");
    }

    public void faceObstacle(String  situation) {
        System.out.println("걸림돌 : " + situation);
        discouraged = true;
    }

    public void reflect() {
        if (discouraged) {
            System.out.println("\uD83E\uDDE0 생각 : '꿈을 향한 길에 장애물이 생기면 포기해야 하나?'");
        }
    }

    public void chooseToContinue() {
        System.out.println("\uD83D\uDD25 결단 : '나는 잠시 멈출 수는 있어도, 포기하지는 않아.'");
        discouraged = false;
        System.out.println("\uD83D\uDEB6 다시 한 걸음 내딛는다...");
    }
}


