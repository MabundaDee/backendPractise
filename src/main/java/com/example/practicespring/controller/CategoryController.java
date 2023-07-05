//package com.example.practicespring.controller;
//
//import com.example.practicespring.model.Category;
//import com.example.practicespring.security.service.CategoryService;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.media.Content;
//import io.swagger.v3.oas.annotations.media.Schema;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@Tag(name="Practice",description = "This is for practice")
//@RestController
//@RequestMapping("/category")
//public class CategoryController {
//    @Autowired
//    CategoryService categoryService;
//
//    @PostMapping("/create")
//    public String createCategory(@RequestBody Category category) {
//        categoryService.createCategory(category);
//        return "success";
//    }
//
//    @Operation(
//            summary = "Retrieve a Tutorial by Id",
//            description = "Get a Tutorial object by specifying its id. The response is Tutorial object with id, title, description and published status.",
//            tags = {"tutorials", "get"})
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = Category.class), mediaType = "application/json")}),
//            @ApiResponse(responseCode = "404", content = {@Content(schema = @Schema())}),
//            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
//    @GetMapping("/list")
//    public ResponseEntity<Category> getAllCategory(@RequestParam(required = false) String title) {
//
////    @GetMapping("/list")
////    public List<Category> listCategory () {
////        return categoryService.listCategory();
//
//
//        return null;
//    }
//}
