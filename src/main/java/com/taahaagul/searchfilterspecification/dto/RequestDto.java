package com.taahaagul.searchfilterspecification.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RequestDto   {

    private List<SearchRequestDto> searchRequestDto;
    private GlobalOperator globalOperator;
    private PageRequestDto pageDto;

    public enum GlobalOperator{
        AND, OR;
    }
}

/*
This is the request body for the search filter. It contains the searchRequestDto, globalOperator and pageDto.
{
    "globalOperator": "AND",
    "pageRequestDto": {
        "pageNo": 0,
        "pageSize": 10,
        "sort": "ASC",
        "sortByColumn": "id"
    },
    "searchRequestDto": [
        {
        "column": "id",
        "value": "4",
        "joinTable": "car",
        "operation": "JOIN",
        "formatDate": false,
        "formatBoolean": false
        }
    ]
}
 */
