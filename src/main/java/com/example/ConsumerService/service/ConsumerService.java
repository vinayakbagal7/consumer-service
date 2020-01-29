package com.example.ConsumerService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ConsumerService.model.Consumer;
import com.example.ConsumerService.repository.ConsumerRepository;

@Service
public class ConsumerService {

	@Autowired
	ConsumerRepository consumerRepository;
	
	public List<Consumer> findAll(){
		return consumerRepository.findAll();
	}
	
	public Consumer getConsumer(long id) {
		return consumerRepository.getOne(id);
	}
	
	public Consumer getConsumerByName(String name) {
		return consumerRepository.findByName(name);
	}
	
	public void createConsumer(Consumer consumer) {
		consumerRepository.save(consumer);
	}
	
	public Consumer updateConsumer(Consumer consumer) {
		return consumerRepository.save(consumer);
	}
	
	public void deleteConsumer(long id) {
		consumerRepository.deleteById(id);
	}
}
