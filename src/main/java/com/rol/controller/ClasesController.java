package com.rol.controller;

import com.rol.model.ClasesDTO;
import com.rol.service.ClasesService;
import com.rol.util.WebUtils;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/clasess")
public class ClasesController {

    private final ClasesService clasesService;

    public ClasesController(final ClasesService clasesService) {
        this.clasesService = clasesService;
    }

    @GetMapping
    public String list(final Model model) {
        model.addAttribute("clasess", clasesService.findAll());
        return "clases/list";
    }

    @GetMapping("/add")
    public String add(@ModelAttribute("clases") final ClasesDTO clasesDTO) {
        return "clases/add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("clases") @Valid final ClasesDTO clasesDTO,
            final BindingResult bindingResult, final RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "clases/add";
        }
        clasesService.create(clasesDTO);
        redirectAttributes.addFlashAttribute(WebUtils.MSG_SUCCESS, WebUtils.getMessage("clases.create.success"));
        return "redirect:/clasess";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable final Long id, final Model model) {
        model.addAttribute("clases", clasesService.get(id));
        return "clases/edit";
    }

    @PostMapping("/edit/{id}")
    public String edit(@PathVariable final Long id,
            @ModelAttribute("clases") @Valid final ClasesDTO clasesDTO,
            final BindingResult bindingResult, final RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "clases/edit";
        }
        clasesService.update(id, clasesDTO);
        redirectAttributes.addFlashAttribute(WebUtils.MSG_SUCCESS, WebUtils.getMessage("clases.update.success"));
        return "redirect:/clasess";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable final Long id, final RedirectAttributes redirectAttributes) {
        clasesService.delete(id);
        redirectAttributes.addFlashAttribute(WebUtils.MSG_INFO, WebUtils.getMessage("clases.delete.success"));
        return "redirect:/clasess";
    }

}
