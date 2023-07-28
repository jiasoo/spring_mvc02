package com.ict.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExamController {
	
	@GetMapping("/exam01.do")
	public ModelAndView exec01(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("output");
		mv.addObject("name", "오천사");
		mv.addObject("age", 1004);
		mv.addObject("addr","천국");
		
		return mv;
	}
	@GetMapping("/exam02.do")
	public ModelAndView exec02(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("admin/output");
		List<String> dongName = new ArrayList<String>();
		dongName.add("바둑이");
		dongName.add("일땡이");
		dongName.add("이땡이");
		dongName.add("삼땡이");
		dongName.add("사땡이");
		
		mv.addObject("dongName", dongName);
		return mv;
	}
}
