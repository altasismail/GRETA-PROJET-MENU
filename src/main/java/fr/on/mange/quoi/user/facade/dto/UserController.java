package fr.on.mange.quoi.user.facade.dto;

import fr.on.mange.quoi.generic.exception.ApplicationServiceException;
import fr.on.mange.quoi.user.facade.wrapper.UserRegistrationDTOWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController{
    @Autowired
    private UserRegistrationDTOWrapper wrapper;

    public String registerUser(@RequestParam UserRegistrationDTO userDTO){
        try{
            service.saveNewUser(wrapper.fromDTO(userDTO));
        }catch(ApplicationServiceException e){
            return "redirect:/?error";
        }
    }
}
