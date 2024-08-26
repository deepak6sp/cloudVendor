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

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	private static final org.slf4j.Logger logInfo = LoggerFactory.getLogger(CloudVendorAPIService.class);
	
	CloudVendor cloudvendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {
		logInfo.info("in getCloudVendorDetails info ");
		logInfo.debug("in getCloudVendorDetails debug ");
		return cloudvendor;
//		return new CloudVendor("1", "Deepak", "4 gibson", "0422222222");
	}
	
	@PostMapping()
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
		this.cloudvendor = cloudvendor;
		return "Cloud vendor created successfully";
	}
	
	@PutMapping()
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
		this.cloudvendor = cloudvendor;
		return "Cloud vendor updated successfully";
	}

	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {
		this.cloudvendor = null;
		return "Cloud vendor deleted successfully";
	}

}
