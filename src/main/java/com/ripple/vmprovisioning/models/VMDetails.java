package com.ripple.vmprovisioning.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(	name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        })
@NoArgsConstructor
@Getter
@Setter
public class VMDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public VMDetails(String os, String ram, String hardDisk, String cpu) {
        this.os = os;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.cpu = cpu;
    }
}
