package com.example.Controllers;

import com.example.Models.Characters;
import com.example.Services.CharacterService;
import com.example.exceptions.InvalidCharacterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/characters")
@CrossOrigin("*")
public class CharacterController {

    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/")
    public Set<Characters> getCharacters(){
        return characterService.getCharacters();
    }

    @GetMapping("/{nickname}")
    public Characters getCharacter(@PathVariable("nickname") String nickname) throws InvalidCharacterException{
        return characterService.getCharacters(nickname);
    }

    @ExceptionHandler({InvalidCharacterException.class})
    public ResponseEntity<String> handleInvalidCharacter(){
        ResponseEntity<String> res = new ResponseEntity<>("Not a valid character", HttpStatus.NOT_FOUND);
        return res;
    }
}
