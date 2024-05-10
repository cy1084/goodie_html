package com.min.edu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("user");
		// form에서 입력한 데이터가 넘어와(name이 user인 애) id 변수에 저장
		String pw = req.getParameter("pw");

		System.out.printf("화면에서 전달받은 요청 값: %s, %s\n", id, pw);
	}

	private static final long serialVersionUID = 2448390258084251231L;

}
