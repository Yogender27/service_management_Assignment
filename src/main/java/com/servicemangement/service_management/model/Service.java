package com.servicemangement.service_management.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "services")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Service {

        @Id
        private String id;

        @NotBlank(message = "Service name is required")
        private String name;

        @NotBlank(message = "Service description is required")
        private String description;

        @Positive(message = "Price must be positive")
        private double price;

    }


