package com.itransition.form.controller;

import com.itransition.form.dto.FeedbackFormDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/feedback_form")
public class FeedbackFormController {

    @GetMapping
    public String getFeedbackForm() {
        return "feedback_form";
    }

    @PostMapping
    public String addFeedbackForm(@Valid FeedbackFormDto feedbackFormDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return null;
        }
        return "feedback_form";
    }
}
