package SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SonucController {
	
	
	//bu yazım ilkel
//	@RequestMapping("submit")
//	public String islemYap(HttpServletRequest req) {
//		int s1 = Integer.parseInt(req.getParameter("sayi1"));
//		int s2 = Integer.parseInt(req.getParameter("sayi2"));
//		int toplam = s1 + s2;
//		int carpim = s1 * s2;
//		HttpSession session = req.getSession();
//		session.setAttribute("sayilarinToplami", toplam);
//		session.setAttribute("sayilarinCarpimi", carpim);
//		return "sonuc";
//	}
	
	@RequestMapping("submit") //buradaki submit ile index.jsp deki form un içi (submit) aynı olmalı
	public String Calculate(@RequestParam("number1") double num1, @RequestParam("number2") double num2, Model m) { 
	
		m.addAttribute("sum", num1+num2);
		
		if(num1>num2) {
			m.addAttribute("subtract", num1-num2);
		}else m.addAttribute("subtract", num2-num1);
		
		
		
		m.addAttribute("multiply", num1*num2);
		
		
		if(num1>num2) {
			m.addAttribute("divide", num1/num2);
		}else m.addAttribute("divide", num2/num1);;
		
		return "result";                            
	}
	
	
	
	
	
	
}