package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootexampleApplication {

    private final UserRepository userRepository;

    BootexampleApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootexampleApplication.class, args);
		UserRepository userrepository = context.getBean(UserRepository.class);

		User ob = new User();
//		
		ob.setCity("East Champran");
		ob.setName("Radha");
		ob.setStatus("success");
//		
		userrepository.save(ob);
		System.out.println(ob);

		// now i want to store multiple record
//
//		User u1 = new User();
//		u1.setCity("motihari");
//		u1.setName("Kundan");
//		u1.setStatus("success");
//
//		User u2 = new User();
//		u1.setCity("Gaya");
//		u1.setName("Ranjan");
//		u1.setStatus("Engineer");
//
//		ArrayList<User> list = new ArrayList<User>();
//		list.add(u1);
//		list.add(u2);
//
//		// Already added two and
//
//		userrepository.saveAll(list);
		
		
		
//==================i want to update specific record===========
//		
//	Optional<User> optional=	userrepository.findById(52);
//	
//	User ob=optional.get();
//	
//	System.out.println("Available:"+ob);
//	
//	ob.setCity("East champran");
//	ob.setName("Ranjan Kumar");
//	
//	ob.setStatus("Success");
//	
//	User userupdate=userrepository.save(ob);
//	
//	System.out.println("Updated :"+userupdate);
//	
	
		
//==========================Custome Finder Method=========================================
		
//	List<User> list=userrepository.findByName("Ranjan");
//	
//	System.out.println("List by Name:"+list);
//	
//================================================	
	
//	
//	List<User> list1=userrepository.findByNameAndCity("Radha", "East Champran");
//	
//	System.out.println("List By  Name And City:"+list1);
	
	
	
//	=============================================
//	
//	
//		List<User> list2=userrepository.findByNameStartingWith("R");
//		System.out.println("User Details:"+list2);
	
		
//	============================
//		
//		
//	List<User>allauser=	userrepository.getAllUser();
//	
//	allauser.forEach(e->System.out.println(e.getCity()));
		
		
		

	}

}
