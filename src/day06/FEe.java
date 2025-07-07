package day06;

public class FEe {
    public static void main(String[] args) {
        String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234" }; // 차량번호 배열초기화
        int[] usageMinutes = {65, 30, 140, 420};    // 주차시간 배열 초기화
        // 각 차량에 대한 주차요금 계산 및 출력
        for (int index = 0; index <= carNumbers.length - 1; index++) {  // 0부터 마지막 인덱스까지 반복
            String carNumber = carNumbers[index]; // index번째 차량번호 호출, 현재 차량번호 가져오기
            int minutes = usageMinutes[index];  // index번째 주차시간 호출
            int fee = parkingFee(minutes);    // 주차요금 계산 메소드 호출
            System.out.println(carNumber + " : " + minutes + " 분 주차 , 최종 요금 : " + fee + "원");
        } //    for e
    }   //main e
        /**
         * 주차 시간을 입력받아 요금을 계산하는 메서드
         * @param minutes 주차 시간 (분)
         * @return 최종 요금 (원)
         */
    public static int parkingFee( int minutes ){
        final int BASE_FEE = 1000;         // 기본 요금: 1,000원
        final int BASE_TIME = 30;          // 기본 요금 적용 시간: 30분
        final int EXTRA_UNIT_TIME = 10;    // 추가 요금 단위 시간: 10분마다
        final int EXTRA_UNIT_FEE = 500;    // 추가 요금 단위 금액: 500원
        final int MAX_DAILY_FEE = 20000;   // 일일 최대 요금: 20,000원

        int totalFee = 0; // 최종 주차 요그을 저장할 변수 초기화

        // 주차 시간이 기본시간(30분) 이하인 경우
        if ( minutes <= BASE_TIME ) { totalFee = BASE_FEE; } // 기본 요금만 부과
        else { // 주차 시간이 기본 시간을 초과하는 경우
            totalFee = BASE_FEE; // 일단 기본 요금 부과
            int excessMinutes = minutes - BASE_TIME; // 기본 시간을 초과한 시간 계산

            // 추가 요금 계산: 초과된 시간을 10분 단위로 올림하여 500원씩 추가
            // Math.ceil( (douvle) excessMinutes / EXTRA_UNIT_TIME )
            //   - 초과된 시간을 10분으로 나누고 소수점 이하를 올림 (예: 31분 -> 3.1 -> 4 : 40분 )
            //   - 이렇게 함으로써 1분이라도 초과하면 다음 10분 단위로 계산됨
            // (int) 형변환 : double 결과를 int로 변환
            totalFee += (int) Math.ceil( (double) excessMinutes / EXTRA_UNIT_TIME) * EXTRA_UNIT_FEE;
        }

        // 일일 최대 요금 적용: 계산된 요금이 20,000원을 초과하면 20,000원으로 조정
        if (totalFee > MAX_DAILY_FEE) {
            totalFee = MAX_DAILY_FEE;
        }
        return totalFee; // 최종 주차 요금 반환
    }   // parkingFee e
}   //class e


