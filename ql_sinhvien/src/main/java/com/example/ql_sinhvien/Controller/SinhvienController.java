package com.example.ql_sinhvien.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("sinhvien")
public class SinhvienController {
    @GetMapping("minh")
    String index(){
        return "PageSV";
    }
    @GetMapping("")
    String getsv(){
        return "PageSV";
    }
}
