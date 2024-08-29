package com.learning.rest_demo.controller;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.rest_demo.model.CloudVendor;
import com.learning.rest_demo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	private static final org.slf4j.Logger logInfo = LoggerFactory.getLogger(CloudVendorController.class);
	
//	CloudVendor cloudVendor;
	
	CloudVendorService cloudVendorService;
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
		this.cloudVendorService = cloudVendorService;
	}

	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
		return cloudVendorService.getCloudVendor(vendorId);
	}
	
	@PostMapping()
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		return cloudVendorService.createCloudVendor(cloudVendor);
	}
	
	@PutMapping()
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		return cloudVendorService.updateCloudVendor(cloudVendor);
	}

	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable String vendorId) {
		System.out.println("vendorId");
		System.out.println(vendorId);
		return cloudVendorService.deleteCloudVendor(vendorId);
	}
	
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails() {
		return cloudVendorService.getAllCloudVendors();
	}

}
