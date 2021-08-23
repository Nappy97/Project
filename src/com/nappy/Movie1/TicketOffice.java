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
        Search search = new Search();
        String mvName = "";
        String mvDir ="";


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
                        System.out.println("");
                        break;

                    case 2:
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

                    case 3:
                        System.out.println("예매를 취소하시겠습니까?");
                        System.out.println("1. 예");
                        System.out.println("2. 아니오");

                        int num = 0;

                        if(num == 1){
                            System.out.println("예매하신 영화관을 입력해주세요");

                            System.out.println("예매하신 자리를 입력해주세요");
                        } else if(num==2){
                            break;
                        } break;

                    case 4:
                        flag = false;
                        break;

                }

            }
        }
    }
}


                   /*
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
}*/