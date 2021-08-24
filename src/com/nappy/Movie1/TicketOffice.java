package com.nappy.Movie1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import com.nappy.Movie1.MovieMgrImpl;


public class TicketOffice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("어서오세요~ 아무 키나 입력하여 시작해주세요");
        String name = "";
        name = sc.nextLine();
        MovieMgrImpl mgr = new MovieMgrImpl();
        Theater theater = new Theater();
        Search search = new Search();
        String mvName = "";
        String mvDir = "";


        if (name.equals("cheong")) {
            System.out.println("영화관리프로그램");

            boolean flag = true;

            while (flag) {
                System.out.println("1. 상영관 등록");
                System.out.println("2. 영화 정보 등록");
                System.out.println("3. 영화 info");
                System.out.println("4. 영화 검색");
                System.out.println("5. 영화 삭제");
                System.out.println("6. 종료");

                int selectNum = sc.nextInt();
                sc.nextLine();
                switch (selectNum) {

                    case 1:
                        System.out.println("상영관등록");
                        mgr.addTheater();
                        break;

                    case 2:
                        sc.reset();
                        System.out.println("영화명 입력");
                        mvName = sc.nextLine();
                        System.out.println("감독명 입력");
                        mvDir = sc.nextLine();
                        System.out.println("등급 입력");
                        int mvGr1 = sc.nextInt();
                        System.out.println("요약 입력");
                        String mvSum = sc.next();
                        System.out.println("영화관 번호");
                        int theaterNum = sc.nextInt();
                        mgr.addMovie(mvName, mvDir, mvGr1, mvSum, theaterNum);
                        break;

                    case 3:
                        sc.reset();
                        for (int i = 0; i < mgr.index; i++) {
                            System.out.println(mgr.theaters[i] + "번 상영관의 영화는 " + mvName);
                        }
                        break;

                    case 4:
                        sc.reset();
                        System.out.println("1. 제목으로 검색");
                        System.out.println("2. 감독으로 검색");
                        System.out.println("3. 장르로 검색");

                        int selectNum1 = sc.nextInt();
                        sc.nextLine();
                        switch (selectNum1) {
                            case 1:
                                System.out.println("제목을 입력");
                                mvName = sc.next();
                                System.out.println(Arrays.toString(search.search(mvName)));
                                break;
                            case 2:
                                System.out.println("감독명 입력");
                                mvDir = sc.next();
                                System.out.println(Arrays.toString(search.searchDirector(mvDir)));
                                break;

                        }
                        break;

                    case 5:
                        System.out.println("삭제하고 하는 영화의 제목을 입력해주세요");
                        mvName = sc.next();
                        mgr.delete(mvName);
                        System.out.println("삭제완료");
                        break;

                    case 0:
                        flag = false;
                        break;


                }
            }
        } else {
            System.out.println("영화안내프로그램");

            boolean flag = true;

            while (flag) {
                System.out.println("1. 예매");
                System.out.println("2. 검색");
                System.out.println("3. 예매취소");
                System.out.println("4. 종료");

                int selectNum = sc.nextInt();
                sc.nextLine();
                switch (selectNum) {
                    case 1:
                        System.out.println("영화를 골라주세요");
                        for (int i = 0; i < mgr.index; i++) {
                            System.out.println(mgr.theaters[i] + "번 상영관의 영화는 " + mvName);
                            String name1 = mvName;
                            if (name1.equals(mvName)) {
                                System.out.println("고객님께서 선택하신 영화는 " + mvName + "입니다");

                                do {
                                    System.out.println();
                                    System.out.println("────────────────────────────────────SCREEN────────────────────────────────────");
                                    System.out.println();
                                    for (int k = 0; k < theater.seats.length; k++) {
                                        System.out.print(" [ " + (k + 1) + " ] ");
                                    }
                                    System.out.println(" [행] ");
                                    for (int o = 0; o < theater.seats.length; o++) {
                                        System.out.println();
                                        for (int j = 0; j < theater.seats[i].length; j++) {
                                            if (theater.seats[i][j] == 0) {
                                                System.out.print("[ □ ]");
                                            } else {
                                                System.out.print("[ ■ ]");
                                            }
                                        }
                                        System.out.println(" [ " + (char) (i + 65) + " ] 열");
                                    }
                                    System.out.print("───────────────────────────────────────────────────────────────────────────────");
                                    System.out.print("\n예약하실 좌석의 열을 입력해주세요 (예약종료는 exit) : ");
                                    theater.strColumn = sc.next();
                                    if (theater.strColumn.equals("exit")) {
                                        System.out.println("종료되었습니다");
                                        break;
                                    }
                                    theater.inputColumn = theater.strColumn.trim().charAt(0);
                                    System.out.println("입력한 열 : " + theater.inputColumn);
                                    if (theater.inputColumn < 65 || theater.inputColumn > 74) {
                                        System.out.println("선택할 수 없는 좌석입니다");
                                        continue;
                                    }
                                    int column = theater.inputColumn - 65;
                                    System.out.print("예약하실 좌석의 행 번호를 입력해주세요 : ");
                                    theater.rowNum = sc.nextInt();
                                    if (theater.rowNum < 1 || theater.rowNum > 10) {
                                        System.out.println("선택할 수 없는 행 번호입니다");
                                        continue;
                                    }
                                    System.out.println("선택하신 좌석은 : " + theater.inputColumn + " 열이고 " + theater.rowNum + " 행입니다");
                                    System.out.println("예약 완료 하시겠습니까 ? (Yes / No) : ");
                                    String s = sc.next();
                                    if (s.equals("y") || s.equals("Y")) {
                                        theater.seats[column][theater.rowNum - 1] = 1;
                                        System.out.println("예약이 완료되었습니다");
                                        for (int z = 0; z < theater.seats.length; z++)
                                            for (int x = 0; x < theater.seats[i].length; x++) {
                                                theater.reservedNumber[z][x] = (int) (Math.random() * 100000);
                                                System.out.println("고객님의 예매번호는 [%d-%d]입니다");
                                            }

                                    } else {
                                        System.out.println("취소되었습니다");
                                        theater.isRun = false;
                                    }
                                } while (theater.isRun);
                            }

                        }

                        break;

                    case 2:
                        sc.reset();
                        System.out.println("1. 제목으로 검색");
                        System.out.println("2. 감독으로 검색");

                        int selectNum1 = sc.nextInt();
                        sc.nextLine();
                        switch (selectNum1) {
                            case 1:
                                System.out.println("제목을 입력");
                                mvName = sc.next();
                                System.out.println(Arrays.toString(search.search(mvName)));
                                break;
                            case 2:
                                System.out.println("감독명 입력");
                                mvDir = sc.next();
                                System.out.println(Arrays.toString(search.searchDirector(mvDir)));
                                break;

                        }
                        break;

                    case 3:
                        System.out.println("예매 번호를 입력해주세요.");
                        int select1 = Integer.parseInt(sc.nextLine());

                        for (int i = 0; i < theater.seats.length; i++) {
                            for (int j = 0; j < theater.seats[i].length; j++) {
                                if (select1 == theater.reservedNumber[i][j]) {
                                    System.out.printf("고객님이 예매하신 좌석은 [%d-%d] 입니다.\n", i + 1, j + 1);
                                }
                            }
                        }

                        System.out.println("예매를 취소 하시겠습니까 ?");
                        System.out.println("네(1) , 아니오(2) 중 하나를 입력하세요.");
                        int select2 = (int) Integer.parseInt(sc.nextLine());
                        switch (select2) {
                            case 1:
                                for (int k = 0; k < theater.reservedNumber.length; k++) {
                                    for (int o = 0; o < theater.reservedNumber.length; o++) {
                                        if (theater.reservedNumber[k][o] == select1) {
                                            theater.seats[k][o] = Integer.parseInt((k + 1) + "-" + (o + 1));
                                            theater.reservedNumber[k][o] = 0;
                                            System.out.println("예매가 취소되었습니다.");
                                        }
                                    }
                                }

                                break;
                        }
                        break;

                    case 4:
                        flag = false;
                        break;

                }

            }
        }
    }
}

