package com.niit.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	
	/*
	 * @RequestMapping(value = "/login") public String getlogin() { return
	 * "login"; }
	 */

	/*
	 * @RequestMapping(value = "/submit") public String submit() { return
	 * "index"; }/*
	 * 
	 * /*@RequestMapping(value = "/signup") public String signup() { return
	 * "index"; }
	 */
	@RequestMapping("/index")
	public String home() {
		return "index";
	}
	

	@RequestMapping(value = "/moto360")
	public String moto360() {
		return "moto360";
	}

	@RequestMapping(value = "/motobrand")
	public String motobrand() {
		return "motobrand";
	}

	@RequestMapping(value = "/sportwatch")
	public String sportwatch() {
		return "sportwatch";
	}

	@RequestMapping(value = "/huaweibrand")
	public String huaweibrand() {
		return "huaweibrand";
	}

	@RequestMapping(value = "/asusbrand")
	public String asusbrand() {
		return "asusbrand";
	}

	@RequestMapping(value = "/samsungbrand")
	public String samsungbrand() {
		return "samsungbrand";
	}

	@RequestMapping(value = "/intex")
	public String intex() {
		return "intex";
	}

	@RequestMapping(value = "/samsung")
	public String samsung() {
		return "samsung";
	}

	@RequestMapping(value = "/alcatel")
	public String alcatel() {
		return "alcatel";
	}

	@RequestMapping(value = "/apple")
	public String apple() {
		return "apple";
	}

	@RequestMapping(value = "/asus")
	public String asus() {
		return "asus";
	}

	@RequestMapping(value = "/sony")
	public String sony() {
		return "sony";
	}
}
