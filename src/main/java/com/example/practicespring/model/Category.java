//package com.example.practicespring.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="category")
//public class Category {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    @Column(name="category_id")
//    private Long id;
//    @Column(name="category_name")
//    private String categoryName;
//    @Column(name="image_url")
//    private String imageUrl;
//    private String description;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }
//
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//}
