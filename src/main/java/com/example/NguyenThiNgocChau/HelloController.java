package com.example.NguyenThiNgocChau;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/")
    public String index(){
        return "Hello World from Spring Boot!";
    }
    @PostMapping("/post")
    public String handlePostRequest(@RequestBody String requestBody) {
        return "Thông tin : " + requestBody;
    }
    @PutMapping("/update/{id}")
    public String handlePutRequest(
            @PathVariable String id,
            @RequestBody String requestBody
    ) {
        return "Cập nhật thông tin với ID: " + id + ", Dữ liệu: " + requestBody;
    }

    @DeleteMapping("/delete/{id}")
    public String handleDeleteRequest(@PathVariable String id) {
        return "Đã xóa thông tin với ID: " + id;
    }
}