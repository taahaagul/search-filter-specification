## Description
This service provides dynamic query creation for filtering and searching operations with Spring Data JPA. It allows users to build complex queries with various operators and JOIN capabilities.

## USAGE

You have to send a POST request to the endpoint with the following JSON body:

```json
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
        "joinTable": "subject",
        "operation": "JOIN",
        "formatDate": false,
        "formatBoolean": false
        }
    ]
}
```

## FEATURES

- Supports various filter operators: EQUAL, LIKE, IN, GREATER_THAN, LESS_THAN, BETWEEN, JOIN
- Allows combining multiple filters with AND or OR operators
- Handles date formatting for GREATER_THAN and LESS_THAN operators with DateTimeFormatter

## BENEFITS

- Dynamic query creation based on user input
- Flexible and powerful filtering capabilities
- Easy to use and integrate with Spring Data JPA
