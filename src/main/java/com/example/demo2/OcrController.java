package com.example.demo2;

import com.example.demo2.OcrService;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/ocr")
public class OcrController {
    @Autowired
    private OcrService ocrService;


    @GetMapping(path = "/test")
    public String test(){
        return "This is a test Hello !";
    }

    @PostMapping("/upload")
    public ResponseEntity<OcrResult> upload(@RequestParam("file") MultipartFile file) throws IOException, TesseractException {
        return ResponseEntity.ok(ocrService.ocr(file));
    }
}
