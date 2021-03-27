package com.santander.desafio.controller;

import com.santander.desafio.model.UsuarioModel;
import com.santander.desafio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
public class UsuarioController{

    @Autowired
    private UsuarioService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<UsuarioModel> listUsers = service.listAll();
        model.addAttribute("listUsers", listUsers);
        return "index";
    }

    @RequestMapping("/new")
    public String showCreatingUserPage(Model model) {
        UsuarioModel usuario = new UsuarioModel();
        model.addAttribute("usuario", usuario);

        return "new_usuario";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("usuario") UsuarioModel usuario) {
        service.save(usuario);

        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditUserPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_user");
        UsuarioModel usuario = service.get(id);
        mav.addObject("usuario", usuario);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }


}
