package com.learning.rest_demo.controller;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	public CloudVendor getCloudVendorDetails(String vendorId) {
		return null;
//		return cloudVendor;
//		return new CloudVendor("1", "Deepak", "4 gibson", "0422222222");
	}
	
	@PostMapping()
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		logInfo.info("in getCloudVendorDetails info ");
		logInfo.debug("in getCloudVendorDetails debug ");
//		this.cloudVendor = cloudVendor;
		return cloudVendorService.createCloudVendor(cloudVendor);
//		return "Cloud vendor created successfully";
	}
	
	@PutMapping()
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
//		this.cloudVendor = cloudVendor;
		return "Cloud vendor updated successfully";
	}

	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {
//		this.cloudVendor = null;
		return "Cloud vendor deleted successfully";
	}

}
