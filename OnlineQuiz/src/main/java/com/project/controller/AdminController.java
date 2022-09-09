package com.project.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.entity.Admin;
import com.project.service.AdminService;

@RestController
@RequestMapping("/quizapi")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/login")
	public String adminLogin(@RequestBody Admin ad)
	{
		if(adminService.verifyAdmin(ad.getAdmin_mail(), ad.getAdmin_password()))
		{
			return " Admin Welcome to Quiz Portal";
		}
		else
		{
			return "Invalid Admin Credentials.";
		}
	}
	
	
	
	@PostMapping("/changePassword/{id}&{newPassword}")
	public String changePassword(@PathVariable int id, @PathVariable String newPassword)
	{
		adminService.changePassword(id, newPassword);
		return "Password Changed Successfully";
	}
}