# makazipopote-api

# makazi-properties-api
This a real estate API. It is part of makaziproperties web appliaction

## Endpoints Sumamary

`GET https://makazipopote-api.herokuapp.com/api/v1/listings`

``` /api/v1/listings:
    get:
      summary: "GET api/v1/listings"
      operationId: "getAllListings"
      responses:
        "200":
          description: "OK"
```

`POST https://makazipopote-api.herokuapp.com/api/v1/listings`

``` /api/v1/listings:
    post:
      summary: "POST api/v1/listings"
      operationId: "addListing"
      responses:
        "200":
          description: "OK"
```

`GET https://makazipopote-api.herokuapp.com/api/v1/listings/{{id}}`

```  /api/v1/listings/{id}:
    get:
      summary: "GET api/v1/listings/{id}"
      operationId: "getListingById"
      parameters:
      - name: "id"
        in: "path"
        required: true
        schema:
          type: "string"
      responses:
        "200":
          description: "OK"
```

`PATCH https://makazipopote-api.herokuapp.com/api/v1/listings/{{id}}`

```  /api/v1/listings/{id}:
    patch:
      summary: "PATCH api/v1/listings/{id}"
      operationId: "updateListing"
      parameters:
      - name: "id"
        in: "path"
        required: true
        schema:
          type: "string"
      responses:
        "200":
          description: "OK"
```

`DELETE https://makazipopote-api.herokuapp.com/api/v1/listings/{{id}}`


```  /api/v1/listings/{id}:
    delete:
      summary: "DELETE api/v1/listings/{id}"
      operationId: "deleteListing"
      parameters:
      - name: "id"
        in: "path"
        required: true
        schema:
          type: "string"
      responses:
        "200":
          description: "OK"
```
