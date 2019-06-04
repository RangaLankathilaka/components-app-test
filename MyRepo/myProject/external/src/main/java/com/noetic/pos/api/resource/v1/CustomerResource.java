package com.noetic.pos.api.resource.v1;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.noetic.pos.dto.CustomerDTO;
import com.noetic.pos.dto.common.ResponseDTO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping(value = "/v1/test")
public interface CustomerResource {
	
	 // Customer CRUD Operations
    @ApiOperation(value = "Create Customer request", nickname = "Create Customer",
            response = ResponseDTO.class, responseContainer = "ResponseDTO",
            responseReference = "response")
    
    
    @ApiResponses({
        @ApiResponse(code = 200, message = "Found"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Internal Server Error")
})
    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    public ResponseDTO<?> createCustomer(@RequestBody CustomerDTO customerDTO,
                                        HttpServletResponse httpServletResponse);
    
  //==============================================================================================
    
    @ApiOperation(value = "Read Customer request", nickname = "Read Customer",
            response = ResponseDTO.class, responseContainer = "ResponseDTO",
            responseReference = "response")

    @ApiResponses({
            @ApiResponse(code = 200, message = "Found"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ResponseDTO<?> readCustomer(@RequestParam String id, HttpServletResponse httpServletResponse);
    
    
    //==============================================================================================

    @ApiOperation(value = "Read Customer List request", nickname = "Read Customer List",
            response = ResponseDTO.class, responseContainer = "ResponseDTO",
            responseReference = "response")

    @ApiResponses({
            @ApiResponse(code = 200, message = "Found"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public ResponseDTO<?> readCustomerList(@RequestParam("page") int page, @RequestParam("size") int size,
                                          HttpServletResponse httpServletResponse);
    
    //==============================================================================================

    @ApiOperation(value = "Update Customer request", nickname = "Update Customer",
            response = ResponseDTO.class, responseContainer = "ResponseDTO",
            responseReference = "response")

    @ApiResponses({
            @ApiResponse(code = 200, message = "Found"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })

    @RequestMapping(value = "/customer", method = RequestMethod.PUT)
    public ResponseDTO<?> updateCustomer(@RequestBody CustomerDTO customerDTO, HttpServletResponse httpServletResponse);

    //==============================================================================================
    
    @ApiOperation(value = "Delete Customer request", nickname = "Delete Customer",
            response = ResponseDTO.class, responseContainer = "ResponseDTO",
            responseReference = "response")

    @ApiResponses({
            @ApiResponse(code = 200, message = "Found"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
    public ResponseDTO<?> deleteCustomer(@PathVariable String id, HttpServletResponse httpServletResponse);

    //==============================================================================================




}
