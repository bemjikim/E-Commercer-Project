package com.BumjinKim.projects.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class PurchaseResponse {

    // lombok @Data annotation은 final field 사용해야함 or @NonNull
    private final String orderTrackingNumber;
}
