package com.example.Services;

import com.example.Models.Characters;
import com.example.Repository.CharacterRepository;
import com.example.exceptions.InvalidCharacterException;
import org.springframework.stereotype.Component;

import java.util.Set;
@Component
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }

    public Characters getCharacters(String nickname) throws InvalidCharacterException{
        return characterRepository.getByNickName(nickname).orElseThrow(InvalidCharacterException::new);
    }

    public Set<Characters> getCharacters(){
        return characterRepository.allCharacters();
    }
}
