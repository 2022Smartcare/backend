package com.demoRestAPI.account.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserType {
    ADMIN("ROLE_ADMIN","관리자",1),
    NURSE("ROLE_NURSE","간호사",2),
    PATIENT("ROLE_PATIENT","환자",3);

    private final String key;
    private final String title;
    private final Integer roleId;
}
