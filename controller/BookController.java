package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;
import com.kh.practice.list.library.view.BookMenu;

public class BookController {
	private List list = new ArrayList<Book>();
	public BookController() {
		list.add(new Book("자바의 정석","남궁 성","기타",20000));
		list.add(new Book("쉽게 배우는 알고리즘","문병로","기타",15000));
		list.add(new Book("대화의 기술","강보람","인문",17500));
		list.add(new Book("암 정복기","박신우","의료",21000));
	}
	public void insertBook(Book bk) {
		list.add(bk);
	}
	public ArrayList selectList() {
		ArrayList<Book> list = new ArrayList<Book>();
		list.addAll(this.list);
		return list;
	}
	public ArrayList searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>()	;
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).toString().indexOf(keyword)>=1) {
				searchList.add(null);//여기서 계속 오류남 모르겠음
			}
		}
		return searchList;
	}
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(int i = 0; i< list.size(); i++) {
			if(list.get(i).)
		}
	}
	public int ascBook() {
		return 0;
	}
	public void insertBook(String a, String b, int c, int d) {
		// TODO Auto-generated method stub
		
	}
}
