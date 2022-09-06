package com.java.serv;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.java.serv1.Employee;

@RestController
public class Test {


	@RequestMapping(value="/getAllEmployees", method = RequestMethod.GET)
	public ModelAndView getAllEmployees(Model model) {
		Employee e=new Employee();
		Employee e1=new Employee();
		
		
		e.setId(1);
		e.setFirstName("Ram");
		e.setLastName("guna");
		e1.setId(2);
		e1.setFirstName("Dhinesh");
		e1.setLastName("k");

		model.addAttribute("employeeId", e.getId());
		model.addAttribute("employeeName", e.getFirstName());
		model.addAttribute("employeeSurname", e.getLastName());

		return new ModelAndView("NewFile");
	}
}
