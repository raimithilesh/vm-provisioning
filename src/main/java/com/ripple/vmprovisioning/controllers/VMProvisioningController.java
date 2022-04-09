package com.ripple.vmprovisioning.controllers;

import com.ripple.vmprovisioning.beans.request.VMRequest;
import com.ripple.vmprovisioning.beans.response.MessageResponse;
import com.ripple.vmprovisioning.models.VMDetails;
import com.ripple.vmprovisioning.repository.VMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/vmprovisioning")
public class VMProvisioningController {
    @Autowired
    VMRepository vmRepository;

    @GetMapping("/all")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public String getAllVMs() {
        return "All VMs";
    }

    @PostMapping("/createvm")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<?> createVM(@Valid @RequestBody VMRequest vmRequest) {

        VMDetails vmDetails = new VMDetails(vmRequest.getOs(), vmRequest.getRam(), vmRequest.getCpu(), vmRequest.getCpu());

        vmRepository.save(vmDetails);
        return ResponseEntity.ok(new MessageResponse("Virtual Machine Ordered successfully!"));
    }
}
