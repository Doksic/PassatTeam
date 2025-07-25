package com.Passat.Passat.controller;

import com.Passat.Passat.model.Weapon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/weapon")
public class WeaponController {
    private final List<Weapon> weapons = new ArrayList<>();

    @GetMapping("/list")
    public String listWeapons(Model model) {
        model.addAttribute("weapons", weapons);
        return "weapon";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("weapon", new Weapon());
        return "weapon";
    }

    @PostMapping("/add")
    public String addWeapon(@ModelAttribute Weapon weapon, Model model) {
        weapons.add(weapon);
        model.addAttribute("weapons", weapons);
        model.addAttribute("weapon", new Weapon());
        return "weapon";
    }

    @GetMapping("/edit/{serialNumber}")
    public String editWeapon(@PathVariable String serialNumber, Model model) {
        for (Weapon w : weapons) {
            if (w.getSerialNumber().equals(serialNumber)) {
                model.addAttribute("weapon", w);
                break;
            }
        }
        model.addAttribute("weapons", weapons);
        return "weapon";
    }

    @PostMapping("/update")
    public String updateWeapon(@ModelAttribute Weapon weapon, Model model) {
        for (int i = 0; i < weapons.size(); i++) {
            if (weapons.get(i).getSerialNumber().equals(weapon.getSerialNumber())) {
                weapons.set(i, weapon);
                break;
            }
        }
        model.addAttribute("weapons", weapons);
        model.addAttribute("weapon", new Weapon());
        return "weapon";
    }

    @GetMapping("/delete/{serialNumber}")
    public String deleteWeapon(@PathVariable String serialNumber, Model model) {
        Iterator<Weapon> iterator = weapons.iterator();
        while (iterator.hasNext()) {
            Weapon w = iterator.next();
            if (w.getSerialNumber().equals(serialNumber)) {
                iterator.remove();
                break;
            }
        }
        model.addAttribute("weapons", weapons);
        model.addAttribute("weapon", new Weapon());
        return "weapon";
    }
}
