package com.taahaagul.searchfilterspecification.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchRequestDto {

    String column;
    String value;
    Operation operation;
    String joinTable;
    private boolean formatDate;
    private boolean formatBoolean;

    public enum Operation{
        EQUAL,
        LIKE,
        IN,
        GREATER_THAN,
        LESS_THAN,
        BETWEEN,
        JOIN;
    }
}
