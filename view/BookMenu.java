package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	public void mainMenu() {
		System.out.println("==Welcome Kh Library");
		System.out.println("***메인 메뉴*****");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬*");
		System.out.println("9. 종료");
		int a= sc.nextInt(); sc.nextLine();
		switch(a) {
			case 1 : insertBook();
			case 2 : selectList();
			case 3 : searchBook();
			case 4 : deleteBook();
			case 5 : ascBook();
			case 9 : System.out.println("프로그램을 종료합니다"); mainMenu();
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요"); mainMenu();
		}
		
	}
	public void insertBook() {
		System.out.println("==새 도서 추가 ===");
		System.out.println("책 정보를 입력해주세요");
		System.out.print("도서명 : ");
		String a = sc.nextLine();
		System.out.print("저자명 : ");
		String b= sc.nextLine();
		System.out.println("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int c = sc.nextInt();
		String ctN = "";
		switch(c) {
			case 1 : ctN="인문";
			case 2 : ctN="자연과학";
			case 3 : ctN="의료";
			case 4 : ctN="기타";
			default : System.out.println("다시입력해주세요.");
		}
		System.out.println("가격 : ");
		int d= sc.nextInt();
		Book bo = new Book(a, b, ctN, d);
		bc.insertBook(bo);
		
	}
	public void selectList() {
		ArrayList<Book> list = bc.selectList();
		if(list==null) {
			System.out.println("존재하는 도서가 없습니다");
		}else {
			System.out.println("전체 도서 조회");
			for(int i = 0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}
	}
	public void searchBook() {
		System.out.println("검색할 도서명 : ");
		String keyword = sc.nextLine();
		ArrayList<Book> searchList = bc.searchBook(keyword);
		if(searchList==null)	{
			System.out.println("검색결과가 없습니다.");
			
		}else {
			System.out.println("검색결과");
			for(int i = 0; i <searchList.size();i++) {
				System.out.println(searchList.get(i));
			}
		}
	}
	public void deleteBook() {
		System.out.println("삭제할 도서명 : ");
		String title = sc.nextLine();
		System.out.println("삭제할 저자명 : ");
		String author = sc.nextLine();
		Book remove = bc.deleteBook(title, author);
		if(remove==null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
			
		}else {
			System.out.println("성공적으로 삭제되었습니다.");
		}
		
	}
	public void ascBook() {
		bc.ascBook();
	}
	
}
