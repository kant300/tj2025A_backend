public class FrustratingDay {
    public static void main(String[] args) {
        Developer nina = new Developer("니나");

        nina.startDay();
        nina.connectErgonomicKeyboard();
        nina.writeCode();
        nina.runCode();
        nina.makeMistake("실수 : 컴파일 오류");
        nina.learn("교훈: 오타 하나가 전체를 막는다");
        nina.endDay();
        nina.moveForward();
    }
}

class Developer {
    String name;
    boolean keyboardConnected =false;
    boolean codeCompiled = false;

    public Developer(String name){
        this.name = name;
    }

    public void startDay() {
        System.out.println("\uD83C\uDF05 " + name + "의 하루가 시작됩니다...");
    }

    public void connectErgonomicKeyboard() {
        System.out.println("⌨\uFE0F 인체공학 키보드 연결 시도 중...");
        if( !keyboardConnected){
            System.out.println("❌ 오류 : 키보드 연결 실패. 드라이버가 삐졌습니다.");
        }
    }

    public void writeCode() {
        System.out.println("\uD83D\uDCBB 코드 작성 중...");
    }

    public void runCode() {
        System.out.println("▶\uFE0F 코드 실행 시도...");
        if(!codeCompiled){
            System.out.println("❗컴파일 오류 발생 : \"symbol not found\", \"duplicat class\"... ");
            System.out.println("\uD83D\uDE24 오늘은 자바가 아니라 자바한테 혼나네...");
        }
    }

    public void makeMistake(String error){
        System.out.println("❌" + error);
    }

    public void learn(String lesson){
        System.out.println("\uD83D\uDCD8 배운 점 : + lesson");
    }

    public  void endDay(){
        System.out.println("\uD83C\uDF19 하루 종료... 감정 상태 : [혼란 / 짜증 / 의지 약간 남음]");
        System.out.println("\uD83E\uDDD8\u200D♀\uFE0F deep breath 하고 내일 다시 try {} 해보자...");
    }

    public void moveForward() {
        System.out.println("\uD83D\uDEB6\u200D♀\uFE0F 다시 앞으로 나아갑니다.");
    }

    public  void dailyLoop() {
        boolean 성공 = false;
        int 노력횟수 = 0;

        while (!성공 && 노력횟수 < 3 ) {
            try {
                노력();
                성장();
                노력횟수++;
                if ( 노력횟수 ==3 ) 성공 = true;
            } catch (Exception 짜증) {
                System.out.println("오늘도 한 땀 배웠다...");
            }
    }
        System.out.println("\uD83C\uDF89 마침내 작은 성취를 이뤘다! ");
    }

    public void 노력(){
        System.out.println("\uD83D\uDCAA 코드를 다시 점검 중...");
    }

    public void 성장() {
        System.out.println("\uD83C\uDF31 오늘도 한 줄, 더 이해했다.");
    }
}