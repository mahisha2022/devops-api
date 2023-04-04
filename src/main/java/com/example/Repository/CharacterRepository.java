package com.example.Repository;

import com.example.Models.Characters;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
@Component
public class CharacterRepository {

    private final Set<Characters> characters;

    public  CharacterRepository(){
        this.characters = new HashSet<>();
        Characters c = new Characters(1, "SpongeBob", "SquarePants", "SpongeBob", "Sea Sponge", "");
        characters.add(c);
         c = new Characters(2, "Patrick", "Star", "Patrick", "Starfish", "");
        characters.add(c);
         c = new Characters(3, "Squiward", "Tentacles", "Squidard", "Pacific Octopus", "");
        characters.add(c);
         c = new Characters(4, "Eugen", "Krabs", "Plankton", "Copepod", "");
        characters.add(c);
        c = new Characters(5, "SpongeBob", "SquarePants", "SpongeBob", "Sea Sponge", "");
        characters.add(c);
        c = new Characters(6, "Sandy", "Cheeks", "Sandy", "Squirrel", "");
        characters.add(c);
    }

    public Optional<Characters> getByNickName(String nickname){
        return  characters.stream()
                .filter(character -> character.getNickName().equals(nickname))
                .findFirst();
    }

    public Set<Characters> allCharacters(){
        return  characters;
    }
}
