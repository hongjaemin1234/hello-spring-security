package kr.ac.hansung.controller;

import kr.ac.hansung.dto.PasswordChangeDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/password")
    public String changePasswordForm(Model model) {
        model.addAttribute("passwordChangeDto", new PasswordChangeDto());
        return "user/password";
    }
}
