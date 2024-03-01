package com.taahaagul.searchfilter.dto;

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
    "pageDto": {
        "pageNo": 0,
        "pageSize": 3,
        "sort": "ASC",
        "sortByColumn": "id"
    },
    "searchRequestDto": [
        {
        "column": "id",
        "value": "1",
        "joinTable": "address",
        "operation": "GREATER_THAN"
        }
    ]
}
 */
