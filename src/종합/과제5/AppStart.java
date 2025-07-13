package 종합.과제5;

import 종합.과제5.view.WaitingView;

public class AppStart {
    public static void main(String[] args) {
        // (4)최초의 출력메소드를 호출한다. -> view에 무한루프
        WaitingView.getInstance().index();
    }
}// class e


