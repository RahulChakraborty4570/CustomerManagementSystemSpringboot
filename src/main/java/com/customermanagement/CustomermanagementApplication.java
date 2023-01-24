package com.customermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.customermanagement.model.Customer;
import com.customermanagement.repository.CustomerRepository;

@SpringBootApplication
public class CustomermanagementApplication implements CommandLineRunner{
	
	@Autowired
	private CustomerRepository customerRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(CustomermanagementApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.setFirstName("a");
		c.setLastName("b");
		c.setEmail("ss@gmail.com");
		c.setAddress("kolkata");
		c.setMobile(123L);
		
		Customer c1=new Customer();
		c1.setFirstName("aa");
		c1.setLastName("ba");
		c1.setEmail("sas@gmail.com");
		c1.setAddress("akolkata");
		c1.setMobile(1223L);
		
		Customer c2=new Customer();
		c2.setFirstName("dda");
		c2.setLastName("bcc");
		c2.setEmail("sds@gmail.com");
		c2.setAddress("sssskolkata");
		c2.setMobile(1237L);
		customerRepository.save(c);
		customerRepository.save(c1);
		customerRepository.save(c2);
		System.out.println("----------------all saved--------------");
		
		
	}

}
