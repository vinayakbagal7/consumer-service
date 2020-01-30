package com.example.ConsumerService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ConsumerService.model.Consumer;
import com.example.ConsumerService.service.ConsumerService;

@RestController
public class ConsumerController {

	@Autowired
	ConsumerService consumerService;

	@RequestMapping("/consumer")
	public List<Consumer> getAllConsumer(){
		System.out.println("get all customers");
		return consumerService.findAll();
	}
	
	@RequestMapping("/consumer/{id}")
	public Consumer getConsumer(@PathVariable("id") Long id){
		return consumerService.getConsumer(id);
	}
	
	@RequestMapping(value = "/consumer", method = RequestMethod.POST)
	public void addConsumer(@RequestBody Consumer consumer){
		consumerService.createConsumer(consumer);
	}

	@RequestMapping(value = "/consumer/{id}", method = RequestMethod.PUT)
	public Consumer updateConsumer(@PathVariable("id")Long id, @RequestBody Consumer consumer){
		Consumer con = consumerService.getConsumer(id);
		con.setName(consumer.getName());
		con.setContact(consumer.getContact());
		con.setCity(consumer.getCity());
		return consumerService.updateConsumer(con);
	}
	
	@RequestMapping(value = "/consumer/{id}", method = RequestMethod.DELETE)
	public Consumer deleteConsumer(@PathVariable("id")Long id){
		Consumer con = consumerService.getConsumer(id);
		consumerService.deleteConsumer(id);
		return con;
	}
}
