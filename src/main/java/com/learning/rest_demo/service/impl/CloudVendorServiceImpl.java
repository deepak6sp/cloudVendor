package com.learning.rest_demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.rest_demo.model.CloudVendor;
import com.learning.rest_demo.repository.CloudVendorRepository;
import com.learning.rest_demo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
	
	CloudVendorRepository cloudVendorRepository;

	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		// TODO Auto-generated method stub
		return "Cloud vendor created successfully in database";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		// TODO Auto-generated method stub
		return null;
	}


}
