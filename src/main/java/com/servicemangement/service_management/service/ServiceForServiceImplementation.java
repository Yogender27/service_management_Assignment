package com.servicemangement.service_management.service;
import com.servicemangement.service_management.model.Service;
import com.servicemangement.service_management.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceForServiceImplementation implements ServiceForServices{
    @Autowired
    private ServiceRepository serviceRepository;


    @Override
    public Service createService(Service service) {

        return serviceRepository.save(service);
    }

    @Override
    public List<Service> getAllService() {
        List<Service>allServices =serviceRepository.findAll();
        return allServices;
    }

    @Override
    public Service updateService(String id, Service updatedService) throws Exception {

        Optional<Service> service = serviceRepository.findById(id);
        if (service.isPresent()) {
            Service existingService = service.get();
            if (updatedService.getName() != null && !updatedService.getName().isEmpty()) {
                existingService.setName(updatedService.getName());
            }
            if (updatedService.getDescription() != null && !updatedService.getDescription().isEmpty()) {
                existingService.setDescription(updatedService.getDescription());
            }
            if (updatedService.getPrice() > 0) {
                existingService.setPrice(updatedService.getPrice());
            }
            return serviceRepository.save(existingService);

        } else {
            throw new Exception("service is not Exist");

        }

    }

    @Override
    public String deleteService(String id) throws Exception {
        boolean isExist = serviceRepository.existsById(id);
        if (isExist){
            serviceRepository.deleteById(id);
            return "deleted SucessFully";
        }
        else {
            throw new Exception("service is not exist");
        }

    }
}
