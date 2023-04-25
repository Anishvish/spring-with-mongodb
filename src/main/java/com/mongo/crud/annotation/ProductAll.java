package com.mongo.crud.annotation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Operation(summary = "Returns product details", description = "To get the product details", tags = "product", responses = {
        //Success
        @ApiResponse(responseCode = "200", description = "OK", useReturnTypeSchema = true),
        //Failure
        @ApiResponse(responseCode = "400", description = "Issue with data")})
public @interface ProductAll {
}
