package com.nappy.Movie1;

import java.util.Arrays;
import java.util.Scanner;


public class TicketOffice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("어서오세요~ 아무 키나 입력하여 시작해주세요");
        String name = "";
        name = sc.nextLine();


        if (name.equals("cheong")) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("영화관리프로그램");
            MovieMgrImpl movieMgr = MovieMgrImpl.getInstance();


            boolean flag = true;

            while (flag) {
                System.out.println("1. 영화 정보 입력");
                System.out.println("2. 영화 정보 전체 검색");
                System.out.println("3. 영화명 검색");
                System.out.println("4. 영화 감독별검색");
                System.out.println("5. 영화 장르별 검색");
                System.out.println("6. 영화 정보 삭제");
                System.out.println("7. 영화관 관리");
                System.out.println("8. 영화목록 확인");
                System.out.println("9. 회원 정보 보기");
                System.out.println("10. 종료");

                int selectNum = sc.nextInt();
                switch (selectNum) {
                    case 1:
                        System.out.println("영화명 입력");
                        String mvName = sc.next();
                        System.out.println("감독명 입력");
                        String mvDir = sc.next();
                        System.out.println("등급 입력");
                        String mvGr1 = sc.next();
                        System.out.println("요약 입력");
                        String mvSum = sc.next();
                        System.out.println("영화관을 지정해주세요");
                        if (com.nappy.Movie1.MovieMgrImpl.ans == true) {
                            System.out.println("영화관이 존재하지 않습니다");
                        } else {
                            System.out.println("영화관이 추가되었습니다");
                        }
                        break;
                    case 2:
                        System.out.println(Arrays.toString(movieMgr.search()));
                        break;

                    case 3:
                        System.out.println("제목을 입력");
                        mvName = sc.next();
                        System.out.println(Arrays.toString(movieMgr.search(mvName)));
                        break;
                    case 4:
                        System.out.println("찾고자하는 감독을 입력하세요 : ");
                        mvName = sc.next();
                        System.out.println(Arrays.toString(movieMgr.searchDirector(mvName)));
                        break;
                    case 5:
                        System.out.print("찾고자하는 등급을 입력하세요 : ");
                        sc.nextLine();
                        mvGr1 = sc.next();
                        System.out.println(Arrays.toString(movieMgr.searchGenre(mvGr1)));
                        break;
                    case 6:
                        System.out.print("삭제하고자하는 제목을 입력하세요 : ");
                        mvName = sc.next();
                        movieMgr.delete(mvName);
                        System.out.println("삭제완료");
                        break;

                    case 7:
                        System.out.println("1. 영화관 추가");
                        System.out.println("2. 영화관 삭제");
                        int num1 = sc.nextInt();
                        if (num1 == 1) {
                            System.out.println("몇 번 영화관을 추가하시겠습니까");
                            int thNum = sc.nextInt();
                            movieMgr.add(new Theater(thNum));
                            for (Theater t : MovieMgrImpl.getNum()) {
                                if (t != null) {
                                    System.out.println(t.getNum());
                                }
                            }

                        } else if ( num1 == 2){
                            System.out.println("몇번 영화관을 삭제하시겠습니까?");
                            int thNum = sc.nextInt();
                            movieMgr.delete(thNum);
                        }
                    case 8:
                        for (int i = 0; i < mvName.length(); i++)
                            System.out.println("이름: " + mvName[i]);
                        break;

                    case 0:
                        flag = false;
                        break;
                }
            }
        }
    }
}