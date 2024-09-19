package com.servicemangement.service_management.service;

import com.servicemangement.service_management.model.Service;

import java.util.List;

public interface ServiceForServices {
    public Service createService(Service service);
    public List<Service>getAllService();
    public Service updateService(String id,Service updatedService) throws Exception;
    public String deleteService(String id) throws Exception;
}
