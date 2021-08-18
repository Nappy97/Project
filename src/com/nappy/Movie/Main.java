/*
package com.nappy.Movie;

import com.nappy.Movie.Movie;
import com.nappy.Movie.Theater;
import com.nappy.Movie1.MovieCustomer;
import com.nappy.Movie1.MovieMgrImpl;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static String MvNames;

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String name1 = "";
        System.out.println("이름을 입력하세요 : ");
        name1 = sc1.nextLine();
        System.out.println("name1 = " + name1);
        int size = MvNames.length;


        if (name1.equals("cheong")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("영화관리프로그램");
            MovieMgrImpl movieMgr = MovieMgrImpl.getInstance();
            int num1;


            boolean flag = true;

            while (flag) {
                System.out.println("1. 영화 정보 입력");
                System.out.println("2. 영화 정보 전체 검색");
                System.out.println("3. 영화명 검색");
                System.out.println("4. 영화 감독별 검색");
                System.out.println("5. 영화 장르별 검색");
                System.out.println("6. 영화 정보 삭제");
                System.out.println("7. 영화관 관리");
                System.out.println("8. 영화목록확인");
                System.out.println("9. 종료");

                int selectNum = sc.nextInt();
                switch (selectNum) {
                    case 1:
                        System.out.println("영화명을 입력해주세요:");
                        String mvName = sc.next();
                        System.out.print("감독 명을 입력해주세요 : ");
                        String mvDir = sc.next();
                        System.out.print("등급을 입력해주세요 : ");
                        int mvGr = sc.nextInt();
                        System.out.print("장르를 입력해주세요 : ");
                        String mvGre = sc.next();
                        System.out.print("요약을 입력해주세요 : ");
                        String mvSum = sc.next();
                        System.out.println("영화관을 지정해주세요 : ");

                        movieMgr.add(new Movie(mvName, mvDir, mvGr, mvGre, mvSum));
                        System.out.println("성공적으로 추가되었습니다.");
                        break;
                    case 2:
                        System.out.println(Arrays.toString(movieMgr.search()));
                        break;
                    case 3:
                        System.out.println("찾고자하는 제목을 입력하세요 : ");
                        mvName = sc.next();
                        System.out.println(Arrays.toString(movieMgr.search(mvName)));
                        break;
                    case 4:
                        System.out.println("찾고자하는 감독을 입력하세요 : ");
                        mvName = sc.next();
                        System.out.println(Arrays.toString(movieMgr.searchDirector(mvName)));
                        break;
                    case 5:
                        System.out.print("찾고자하는 장르를 입력하세요 : ");
                        sc.nextLine();
                        mvGre = sc.next();
                        System.out.println(Arrays.toString(movieMgr.searchGenre(mvGre)));
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
                        num1 = sc.nextInt();
                        if (num1 == 1) {
                            System.out.println("몇번 영화관을 추가하시겠습니까?");
                            int thNum = sc.nextInt();
                            movieMgr.add(new Theater(thNum));
                            for (com.nappy.Movie.Theater t : movieMgr.getTheater()) {
                                if (t != null) {
                                    System.out.println(t.getNum());
                                }
                            }
                        } else if (num1 == 2) {
                            System.out.println("몇번 영화관을 삭제하시겠습니까?");
                            int thNum = sc.nextInt();
                            movieMgr.delete(thNum);
                            for (Theater t : movieMgr.getTheater()) {
                                if (t != null) {
                                    System.out.println(t.getNum());
                                }
                            }
                        }

                        break;
                    case 8:
                        for (int i = 0; i < size; i++)
                            System.out.println("이름: " + MvNames[i]);
                        break;
                    case 0:
                        flag = false;
                        break;
                }
            }


        } else {
            MovieCusImple movieCusImple = new MovieCusImple();
            movieCusImple.ssSet();
            movieCusImple.aaSet();
            movieCusImple.bbSet();

            Cancle cc = new Cancle();
            Scanner sc = new Scanner(System.in);
            int num, num2, num3;

            boolean flag = true;

            while (flag) {
                System.out.println("1. 검색하기");
                System.out.println("2. 예매하기");
                System.out.println("3. 예매취소");
                System.out.println("4. 회원가입");
                System.out.println("5. 프로그램 종료");

                int selectNum = sc.nextInt();
                String mvName = sc.next();
                String mvGre = sc.next();
                switch (selectNum) {
                    case 1:
                        System.out.println("1. 영화명 검색");
                        System.out.println("2. 감독 명 검색");
                        System.out.println("3. 등급으로 검색");
                        System.out.println("4. 장르로 검색");
                        System.out.println("5. 종료");
                        int selectNum1 = sc.nextInt();
                        break;

                    switch (selectNum1) {
                        case 1:
                            System.out.println("찾고자하는 제목을 입력하세요 : ");
                            mvName = sc.next();
                            System.out.println(Arrays.toString(com.nappy.Movie1.MovieCustomer.search(mvName)));
                            break;
                        case 2:
                            System.out.println("찾고자하는 감독을 입력하세요 : ");
                            mvName = sc.next();
                            System.out.println(Arrays.toString(com.nappy.Movie1.MovieCustomer.searchDirector(mvName)));
                            break;
                        case 3:
                            System.out.print("찾고자하는 장르를 입력하세요 : ");
                            sc.nextLine();
                            mvGre = sc.next();
                            System.out.println(Arrays.toString(MovieCustomer.searchGenre(mvGre)));
                            break;
                        case 0:
                            flag = false;
                            break;
                    }
                    case 2:
                        for (int i = 0; i < size; i++)
                            System.out.println("이름: " + MvNames[i]);
                        do {
                            System.out.println("자리예약을 원하시면 1번 아니면 0번을 눌러주세요");
                            num = sc.nextInt();
                            if (num == 1) {
                                System.out.println("좌석구분 S<1>, A<2>, B<3>>>");
                                num2 = sc.nextInt();
                                if (num2 == 1) {
                                    MovieCusImple.ss();
                                } else if (num2 == 2) {
                                    MovieCusImple.aa();
                                } else if (num2 == 3) {
                                    MovieCusImple.bb();
                                }
                            }

                        } while (num != 4);
                        break;

                    case 3:
                        System.out.println("좌석구분 S<1>, A<2>, B<3>");
                        num2 = sc.nextInt();
                        if (num2 == 1) {
                            cc.ss();
                        } else if (num2 == 2) {
                            cc.aa();
                        } else if (num2 == 3) {
                            cc.bb();
                        }
                        break;

                    case 0:
                        flag = false;
                        break;


                }
            }
        }
    }
}
*/
