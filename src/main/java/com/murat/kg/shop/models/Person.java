package com.murat.kg.shop.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Person {
    private int id;
    @NonNull
    private int address_id;
    @NonNull
    private int phone_id;
    @NonNull
    private String name;

}
