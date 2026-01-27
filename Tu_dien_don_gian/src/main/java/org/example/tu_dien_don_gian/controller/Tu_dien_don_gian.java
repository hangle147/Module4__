package org.example.tu_dien_don_gian.controller;


import org.example.tu_dien_don_gian.model.Word;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Tu_dien_don_gian {
    private static final List<Word> dictionary = new ArrayList<>();

    static {
        dictionary.add(new Word("hello", "xin chào"));
        dictionary.add(new Word("world", "thế giới"));
        dictionary.add(new Word("book", "sách"));
        dictionary.add(new Word("computer", "máy tính"));
        dictionary.add(new Word("apple", "quả táo"));
        dictionary.add(new Word("love", "yêu"));
        dictionary.add(new Word("friend", "bạn bè"));
    }

    @GetMapping("/")
    public String showHome() {
        return "index";
    }

    @GetMapping("/lookup")
    public String lookupWord(
            @RequestParam("word") String word,
            Model model) {

        String searchWord = word.trim().toLowerCase();

        Word found = dictionary.stream()
                .filter(w -> w.getEnglish().equals(searchWord))
                .findFirst()
                .orElse(null);

        if (found != null) {
            model.addAttribute("english", found.getEnglish());
            model.addAttribute("vietnamese", found.getVietnamese());
        } else {
            model.addAttribute("notFound", true);
            model.addAttribute("searchWord", word);
        }

        return "result";
    }
}