package com.hyon.oct101.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestDAO {
	
	@Autowired
	private SqlSession ss;

	
	public void regTest(Test t, HttpServletRequest req) {

		try {
			String t_y = req.getParameter("t_y");
			int t_m = Integer.parseInt(req.getParameter("t_m"));
			int t_d = Integer.parseInt(req.getParameter("t_d"));
			String t_when2 = String.format("%s%02d%02d",t_y,t_m,t_d);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date t_when = sdf.parse(t_when2);
			t.setT_when(t_when);
			
			if(ss.getMapper(TestMapper.class).regTest(t) == 1) {
				req.setAttribute("r","시험날짜 등록 성공");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("r","시험날짜 등록 실패");
		}
	}
	
	public void getAllTest(HttpServletRequest req) {
		try {
			req.setAttribute("tests",ss.getMapper(TestMapper.class).getAllTest());
		}catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "시험날짜 조회 실패");
		}
	}	
}


   //cos.jar
   //1. req.getParameter() => mr.getParameter()를 써야!!
   //2. 실행되는 서버상에서 파일이 업로드가 되는 폴더 경로
   // webapp -> resources
   //String path = req.getSession().getServletContext().getRealPath("resources/img");
