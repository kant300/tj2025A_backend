package 종합.과제5.model.dao;

import 종합.과제5.model.dto.WaitingDto;

public class WaitingDao {
    private WaitingDao(){}
    private static final WaitingDao dao = new WaitingDao();
    public static WaitingDao getInstance(){
        return dao;
    }
    WaitingDto[] waitingDB = new WaitingDto[100];

    public boolean addWaiting( String phone , int count ) {
        boolean result = false;
        WaitingDto waitingDto = new WaitingDto(phone, count);
        for (int i = 0; i < waitingDB.length; i++) {
            if (waitingDB[i] == null) {
                waitingDB[i] = waitingDto;
                result = true;
                break;
            }
        }
        return result;
    }
    public WaitingDto[] waitingPrint(){
        return waitingDB;
    }
}//class e
