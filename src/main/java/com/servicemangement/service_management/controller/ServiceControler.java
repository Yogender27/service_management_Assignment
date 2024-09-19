package com.servicemangement.service_management.controller;

import com.servicemangement.service_management.model.Service;
import com.servicemangement.service_management.service.ServiceForServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceControler {

    @Autowired
  private ServiceForServices serviceForServices;



    @PostMapping("/add")
    public Service addService( @RequestBody Service service){
        return serviceForServices.createService(service);
    }

    @GetMapping("/all")
    public List<Service>getAll(){
        return serviceForServices.getAllService();
    }

    @PutMapping("/update/{id}")
    public Service update(@RequestBody Service updatedService,@PathVariable String id) throws Exception {

        return serviceForServices.updateService(id,updatedService);

    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) throws Exception {
        return serviceForServices.deleteService(id);
    }
}
