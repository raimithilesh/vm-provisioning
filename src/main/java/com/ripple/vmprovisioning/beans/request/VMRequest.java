package com.ripple.vmprovisioning.beans.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Getter
@Setter
public class VMRequest {
    @NotBlank
    @Size(max = 20)
    private String os;

    @NotBlank
    @Size(max = 15)
    private String ram;

    @NotBlank
    @Size(max = 20)
    private String hardDisk;

    @NotBlank
    @Size(max = 20)
    private String cpu;
}
