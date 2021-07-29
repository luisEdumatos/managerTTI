package com.managertti.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.managertti.enums.DeviceStatusCondition;
import com.managertti.enums.DeviceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@Entity
public class Workstation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonIgnore
    private Client client;

    @Column(nullable = false)
    private String deviceLocalization;

    @Column(nullable = false)
    private String deviceOwnerUserName;

    @Column(nullable = false)
    private String deviceTag;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DeviceType deviceType;

    @Column(nullable = false)
    private String deviceBrand;

    @Column(nullable = false)
    private String deviceModel;

    @Column(nullable = false)
    private String deviceSO;

    @Column(nullable = false)
    private boolean deviceSOLicensed;

    @Column(nullable = false)
    private boolean deviceOfficeLicensed;

    @Column(nullable = false)
    private boolean deviceAntivirusLicensed;

    @Column(nullable = false)
    private String deviceProcessor;

    @Column(nullable = false)
    private String deviceProcessorGeneration;

    @Column(nullable = false)
    private String deviceProcessorGHZ;

    @Column(nullable = false)
    private String deviceRAM;

    @Column(nullable = false)
    private String deviceHD;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DeviceStatusCondition deviceStatusCondition;

    @Column(nullable = false)
    private String deviceSwapPrediction;
}
