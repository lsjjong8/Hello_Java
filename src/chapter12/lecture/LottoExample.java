package chapter12.lecture;

import java.util.*;

public class LottoExample {
    public static void main(String[] args) {

        Random rand = new Random();
        // 45개 중 6개 번호 일치
        Set lottoNumbers = new HashSet();

        while(lottoNumbers.size() < 6) {
            int lottoNumer = 1 + rand.nextInt(45);
            lottoNumbers.add(lottoNumer);
        }

        System.out.println("Set : " + lottoNumbers);

        List<Integer> lottoList = new ArrayList<Integer>(lottoNumbers);
        Collections.sort(lottoList);

        System.out.println("Sorted List : " + lottoList);
    }
}
