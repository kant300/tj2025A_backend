package 종합.과제9.controller;

public class MaketController {
    // (*)싱글톤
    private MaketController(){}
    private static final MaketController instance = new MaketController();
    public static MaketController getInstance(){
        return instance;
    }
} //class e
