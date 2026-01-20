package com.quxuecangjie.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;

@RestController
public class StaticResourceController {

    // 手动映射CSS文件，直接返回文件内容（修复TEXT_CSS_VALUE问题）
    @GetMapping(value = "/css/{filename}")
    public ResponseEntity<String> getCss(@PathVariable String filename) {
        try {
            // 直接指定CSS的MIME类型字符串，替代TEXT_CSS_VALUE
            ClassPathResource resource = new ClassPathResource("static/css/" + filename);
            String cssContent = Files.readString(resource.getFile().toPath());
            // 显式设置响应头为text/css
            return ResponseEntity.ok()
                    .header("Content-Type", "text/css; charset=UTF-8")
                    .body(cssContent);
        } catch (IOException e) {
            // 处理文件不存在的异常，返回404
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("/* CSS文件不存在 */");
        }
    }

    @GetMapping(value = "/js/{filename}")
    public ResponseEntity<String> getJs(@PathVariable String filename) {
        try {
            ClassPathResource resource = new ClassPathResource("static/js/" + filename);
            String jsContent = Files.readString(resource.getFile().toPath());
            // 设置JS的MIME类型：application/javascript
            return ResponseEntity.ok()
                    .header("Content-Type", "application/javascript; charset=UTF-8")
                    .body(jsContent);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("// JS文件不存在");
        }
    }
    // 手动映射图片文件（修复IMAGE_PNG_VALUE问题）
    @GetMapping(value = "/images/common/{filename}")
    public ResponseEntity<byte[]> getImage(@PathVariable String filename) {
        try {
            ClassPathResource resource = new ClassPathResource("static/images/common/" + filename);
            byte[] imageBytes = Files.readAllBytes(resource.getFile().toPath());
            // 显式设置响应头为image/png
            return ResponseEntity.ok()
                    .header("Content-Type", "image/png")
                    .body(imageBytes);
        } catch (IOException e) {
            // 处理图片不存在的异常，返回404
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    // 新增：手动映射视频文件（MP4格式）

}