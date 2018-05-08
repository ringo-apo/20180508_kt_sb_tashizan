package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.ui.Model

@Controller
@RequestMapping("")
class HelloController {

    @RequestMapping("")
    fun index(): String {
        return "index"
    }

    @RequestMapping("kekka")
    fun kekka(@RequestParam("textBox1") textBox1: String, @RequestParam("textBox2") textBox2: String, model: Model): String {
        val t1 = Integer.parseInt(textBox1)
        val t2 = Integer.parseInt(textBox2)
        val c = t1 + t2
        val cs = c.toString()
        model.addAttribute("total", cs)
        return "kekka"
    }

}