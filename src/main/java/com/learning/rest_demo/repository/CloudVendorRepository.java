package com.learning.rest_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.rest_demo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
