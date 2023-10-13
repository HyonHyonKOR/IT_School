package com.hyon.oct131;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hyon.oct131.error.ErrorDAO;


@Controller
public class HomeController {
	
	private final ErrorDAO errorDao;
	
	@Autowired
	public HomeController(ErrorDAO errorDao) {
      this.errorDao = errorDao;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		errorDao.getAllErrors(req);
		return "index2";
	}
	
}
