package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.Entity.Employee;
import com.nt.dao.EmpDao;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmpDao dao;
	
	@RequestMapping( "/updateSalary" )
	public String updateSalary(Model model, @RequestParam int id, @RequestParam int sal) {
		 dao.updateSalary(id, sal);
		 model.addAttribute("successMsg", "Salary updated successfully");
		 return "result";
		
	}

	@RequestMapping( "/register" )
	public String register(@ModelAttribute Employee e, Model model) {
		dao.register(e);
		model.addAttribute("successMsg", "Record Added Successfully");
		return "result";		 
		
	}
	
	@RequestMapping( "/deleteRecord" )
	public String delete(@RequestParam int id, Model model) {
		dao.delete(id);
		model.addAttribute("successMsg", "Record Deleted Successfully");
		return "result";		 
		
	}
}
